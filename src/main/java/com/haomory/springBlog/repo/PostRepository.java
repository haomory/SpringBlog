package com.haomory.springBlog.repo;

import com.haomory.springBlog.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {}
