package pojo_complexJson;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serializer {
	

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		SuperHeroMoviesAndTVSeries heroMoviesAndTVSeries 
		= new SuperHeroMoviesAndTVSeries();
		
		heroMoviesAndTVSeries.setCategory("Super Hero Movies & TV Series");
		
		List<String> acceptedFranchises = new ArrayList<String>();
		acceptedFranchises.add("DC");
		acceptedFranchises.add("Marvel");
		
		heroMoviesAndTVSeries.setAcceptedFranchises(acceptedFranchises);
		
		List<String> genres = new ArrayList<String>();
		genres.add("Action");
		genres.add("Adventure");
		genres.add("Heroic");
		genres.add("Dark");
		genres.add("Funny");
		
		heroMoviesAndTVSeries.setGenres(genres);
		
		List<Movies> allMovies = new ArrayList<Movies>();
		List<TVSeries> allTVSeries = new ArrayList<TVSeries>();
		
		Movies batman = new Movies();
		batman.setTitle("Batman: The Dark Knight");
		batman.setYear(2008);
		
		List<String> batmanCast =  new ArrayList<String>();
		batmanCast.add("Christian Bale");
		batmanCast.add("Heath Ledger");
		batman.setCast(batmanCast);
		allMovies.add(batman);
		
		Movies jl = new Movies();
		jl.setTitle("Justice League: Snyder Cut");
		jl.setYear(2021);
		
		List<String> jlCast =  new ArrayList<String>();
		jlCast.add("Henry Cavil");
		jlCast.add("Gal Gadot");
		jl.setCast(jlCast);
		allMovies.add(jl);
		
		Movies avengersAOU = new Movies();
		avengersAOU.setTitle("Avengers: Age of Ultron");
		avengersAOU.setYear(2015);
		
		List<String> aouCast =  new ArrayList<String>();
		aouCast.add("Robert Downey, Jr.");
		aouCast.add("Chris Evans");
		avengersAOU.setCast(aouCast);
		allMovies.add(avengersAOU);
		
		Movies avengers = new Movies();
		avengers.setTitle("The Avengers");
		avengers.setYear(2012);
		
		List<String> avengersCast =  new ArrayList<String>();
		avengersCast.add("Chris Evans");
		avengersCast.add("Chris Hemesworth");
		avengers.setCast(avengersCast);
		allMovies.add(avengers);
		
		heroMoviesAndTVSeries.setMovies(allMovies);
		
		TVSeries flash = new TVSeries();
		
		flash.setTitle("Flash");
		flash.setYear(2014);
		allTVSeries.add(flash);
		
		TVSeries arrow = new TVSeries();
		
		arrow.setTitle("Arrow");
		arrow.setYear(2012);
		allTVSeries.add(arrow);
		
		TVSeries superGirl = new TVSeries();
		
		superGirl.setTitle("SuperGirl");
		superGirl.setYear(2015);
		allTVSeries.add(superGirl);
		
		heroMoviesAndTVSeries.setTvSeries(allTVSeries);
		
		OtherDetails otherDetails = new OtherDetails();
		
		otherDetails.setCountry("USA");
		otherDetails.setLanguage("English");
		
		
		heroMoviesAndTVSeries.setOtherDetails(otherDetails);
		
		ObjectMapper mapper = new ObjectMapper();
		
		File superJson = new File("complex.json");
		
		mapper.writerWithDefaultPrettyPrinter()
		.writeValue(superJson, heroMoviesAndTVSeries);
		
	}

}
