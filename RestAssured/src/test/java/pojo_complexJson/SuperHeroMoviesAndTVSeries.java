package pojo_complexJson;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter	
@Setter
public class SuperHeroMoviesAndTVSeries {
	
	private String category;
	private List<String> acceptedFranchises;
	private List<String> genres;
	private List<Movies> Movies;
	private List<TVSeries> tvSeries;
	private OtherDetails otherDetails;
	
}
