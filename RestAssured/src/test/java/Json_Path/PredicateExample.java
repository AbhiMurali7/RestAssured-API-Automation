package Json_Path;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import static com.jayway.jsonpath.Criteria.*;
import static com.jayway.jsonpath.Filter.*;
import static com.jayway.jsonpath.JsonPath.parse;

import com.jayway.jsonpath.Criteria;
import com.jayway.jsonpath.Filter;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Predicate;

public class PredicateExample {

	public void inlinePredicate() throws IOException {

		File jsonFile = new File("src/test/resources/bookstore.json");

		// Price <10

		List<Object> result = JsonPath.parse(jsonFile).read("$.store.book[?(@.price < 10)].price");

		System.out.println(result);

		// Price <10 and Category = Fiction

		List<Object> result1 = JsonPath.parse(jsonFile)
				.read("$.store.book[?(@.price < 10 && @.category == 'fiction')]");

		System.out.println(result1);

		// Price > 10 or Category=reference

		List<Object> result2 = JsonPath.parse(jsonFile)
				.read("$.store.book[?(@.category == 'reference' || @.price > 10)]");

		System.out.println(result2);

		// negate a predicate

		List<Object> result3 = JsonPath.parse(jsonFile)
				.read("$.store.book[?(!(@.price < 10 && @.category == 'fiction'))]");

		System.out.println(result3);

	}

	// Price >10

	public void filterAPIPredicate() throws IOException {

		File jsonFile = new File("src/test/resources/bookstore.json");

		Filter Filter1 = Filter.filter(Criteria.where("price").lt(10));

		List<Object> result = JsonPath.parse(jsonFile).read("$.store.book[?]", Filter1);

		System.out.println(result);

	}

	// Price > 10 and Category = Fiction

	public void secondFilter() throws IOException {

		File jsonFile = new File("src/test/resources/bookstore.json");

		Filter Filter2 = Filter.filter(Criteria.where("price").lt(10).and("category").is("fiction"));

		List<Object> result1 = JsonPath.parse(jsonFile).read("$.store.book[?]", Filter2);

		System.out.println(result1.get(0));

	}

	// Price < 10 or Category=fiction

	public void thirdFilter() throws IOException {

		File jsonFile = new File("src/test/resources/bookstore.json");

		Filter Filter3 = filter(where("price").gt(10).and("category").is("fiction"));

		List<Object> result2 = parse(jsonFile).read("$.store.book[?]", Filter3);

		System.out.println(result2);

	}

	public void customPredicate() throws IOException {
		

		File jsonFile = new File("src/test/resources/bookstore.json");
		
		/*Predicate booksWithISBN = new Predicate() {

			@Override
			public boolean apply(PredicateContext ctx) {
				boolean predicate = ctx.item(Map.class).containsKey("isbn");
				return predicate;
			}
		};*/
		
		//Lambda expressions
		
		Predicate booksWithISBN = ctx->ctx.item(Map.class).containsKey("isbn");
		
		List<Map<String, Object>> books = parse(jsonFile)
				.read("$.store.book[?].isbn", List.class, booksWithISBN);

		System.out.println(books);
	}

	public static void main(String[] args) throws IOException {
		PredicateExample example = new PredicateExample();
		// example.inlinePredicate();
		// example.filterAPIPredicate();
		// example.secondFilter();
		// example.thirdFilter();
		example.customPredicate();

	}
}
