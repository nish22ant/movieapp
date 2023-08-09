package com.movie.reviews.dao;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.movie.reviews.entity.Movie;

@Repository
public interface MovieDao extends MongoRepository<Movie, ObjectId> {
	Optional<Movie> findMovieByImdbId(String imdbId);
}
