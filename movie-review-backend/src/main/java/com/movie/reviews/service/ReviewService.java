package com.movie.reviews.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.movie.reviews.dao.ReviewDao;
import com.movie.reviews.entity.Movie;
import com.movie.reviews.entity.Review;

@Service
public class ReviewService {

	@Autowired
	private ReviewDao reviewDao;

	@Autowired
	private MongoTemplate mongoTemplate;

	public Review createReview(String reviewBody, String imdbId) {
		Review review = reviewDao.insert(new Review(reviewBody, LocalDateTime.now(), LocalDateTime.now()));
		mongoTemplate.update(Movie.class)
			.matching(Criteria.where("imdbId").is(imdbId))
			.apply(new Update().push("reviews").value(review)).first();
		
		return review;
	}
}
