package launcher;

import java.io.IOException;

import service.MovieService;

public class Main {

	public static void main(String[] args) throws IOException{
		MovieService temp = new MovieService();
		var movieList = temp.read();
		System.out.print(movieList);
		temp.displayAvailability(movieList);


	}

}
