package com.movie.reviews.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.reviews.dao.MovieDao;
import com.movie.reviews.entity.Movie;

@Service
public class MovieService {
	
	@Autowired
	private MovieDao movieDao;
	
	public List<Movie> allMovies() {
		return movieDao.findAll();
	}
	
	
	public Optional<Movie> singleMovie(String imdbId) {
		return movieDao.findMovieByImdbId(imdbId);
	}
}
