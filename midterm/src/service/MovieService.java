package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import datamodel.Movie;

public class MovieService {
	public List<Movie> read() throws IOException {
		String line = null;
		String splitBy = ",";
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\rojin\\Desktop\\Epita\\Java\\Java Files\\midterm\\movie.csv"));
		List<Movie> movieList = new ArrayList<>();
		int count = 0;
		while ((line = br.readLine()) != null) {
			if (count != 0) {
				String[] movies = line.split(splitBy);

				Movie movie = new Movie();
				movie.setMovieId(movies[0].trim());
				System.out.println(movies[0].trim());
				movie.setMovieName(movies[1].trim());
				double rate;
				if (movies[2].trim() == null || movies[2].trim() == "" || Double.parseDouble(movies[2].trim()) == 0) { // if its not null,empty or 0
					rate = 0;
					System.out.print(true);
				} else {
					rate = Double.parseDouble(movies[2].trim());
				}
				movie.setRating(rate);
				String av = movies[3].trim();
				if (av=="not available" && rate >= 4.5) { // change
					av = "HouseFull";
				}
				movie.setAvailability(av);
				double price = Double.parseDouble(movies[4].trim());
				movie.setPrice(price);
				movie.setTiming(movies[5].trim());
				
				movieList.add(movie);
			}
			count++;
			// System.out.println(count);
		}
		br.close();
		movieList.sort(Comparator.comparing(Movie::getRating)); //method 1 of sorting
		return movieList;
	}	
	public void sortByRating(List<Movie> movies) throws IOException {	//method 2 of sorting
		Collections.sort(movies, (m1, m2) -> Double.valueOf(m1.getRating()).compareTo(Double.valueOf(m2.getRating())));
	}
	
	public void displayAvailability(List<Movie> movies){ // only show the movies that are available
		System.out.println("ID"+"	Name	" + "	Rating	" + "	Price	"+"	Timing");
		for (Movie movie : movies) {
			if (movie.getAvailability() == "available") {
				System.out.println(movie.getMovieId()+"		"+movie.getMovieName()+"		"+movie.getRating()+"		"+movie.getPrice()+"		"+movie.getTiming());
			}
		}
		
		
	}
	
}
