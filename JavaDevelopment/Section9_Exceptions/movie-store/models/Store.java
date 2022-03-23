package models;

import java.util.ArrayList;

public class Store {
    ArrayList<Movie> movies;

    public Store(){
        this.movies=new ArrayList<Movie>();
    }

    public Movie getMovie(int index) {
        return new Movie(this.movies.get(index));
    }

    public void setMovie(int index, Movie movie){
        this.movies.set(index, new Movie(movie));
    }

    public void addMovie(Movie movie){
        this.movies.add(new Movie(movie));
    }

    public void sellMovie(String name){
        for (int i = 0; i < this.movies.size(); i++) {
            if(this.movies.get(i).getName().equals(name)){
                this.movies.remove(i);
            }
        }
    }

    public void rentMovie(String name){
        for (int i = 0; i < this.movies.size(); i++) {
            if(this.movies.get(i).getName().equals(name)){
                this.movies.remove(i);
            }
        }
    }

    public String toString(){
        String temp ="";
        for (int i = 0; i < this.movies.size(); i++) {
            temp += movies.get(i).getName();
        }
        return temp;
    }
}
