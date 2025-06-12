package com.JobFinder.joblisting.repository;

import com.JobFinder.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}
