package src.main.models;

import java.util.ArrayList;

public class Store {
    ArrayList<Movie> movies;

    public Store() {
        this.movies = new ArrayList<Movie>();
    }

    public Movie getMovie(int index) {
        return new Movie(this.movies.get(index));
    }

    public void setMovie(int index, Movie movie) {
        this.movies.set(index, new Movie(movie));
    }

    public void addMovie(Movie movie){
           this.movies.add(new Movie(movie)); 
    }

    public void sellMovie(String name){
        if(!(this.movies.get(0).isAvailable())){
            throw new IllegalStateException("Can not sell Rented movie");
        }
        this.movies.removeIf((movie)-> movie.getName().equals(name));
    }

    public void rentMovie(String name){
        for (int i = 0; i < this.movies.size(); i++) {
            if(this.movies.get(i).getName().equals(name)){
                this.movies.get(i).setAvailable(false);
            }
        }
    }

    public Boolean contains(Movie movie){
        return this.movies.contains(movie);
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.movies.size(); i++) {
            temp += this.movies.get(i).toString();
            temp += "\n\n";
        }
        return temp;
    }

}
