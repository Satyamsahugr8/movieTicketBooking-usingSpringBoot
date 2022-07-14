package com.springBoot.movieTicketApplicationusingSpringBoot.service;

import java.time.LocalDate;
import java.util.List;

import com.springBoot.movieTicketApplicationusingSpringBoot.Entity.Movie;
import com.springBoot.movieTicketApplicationusingSpringBoot.exception.MovieNotFoundException;



public interface IMovieService {
	public Movie addMovie(Movie movie);
	public Movie removeMovie(int movieid) throws MovieNotFoundException;
	public Movie updateMovie(Movie movie) throws MovieNotFoundException;
	public Movie viewMovie(int movieid) throws MovieNotFoundException;
	public List<Movie> viewMovieList();
	public List<Movie> viewMovieList(int theatreid);
	public List<Movie> viewMovieList(LocalDate date);
	
}
