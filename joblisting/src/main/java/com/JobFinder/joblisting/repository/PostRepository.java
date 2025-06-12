package com.JobFinder.joblisting.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.JobFinder.joblisting.model.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}
