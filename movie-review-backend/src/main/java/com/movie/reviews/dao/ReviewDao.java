 package com.movie.reviews.dao;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.movie.reviews.entity.Review;

@Repository
public interface ReviewDao extends MongoRepository<Review, ObjectId> {

}
