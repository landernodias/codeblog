package com.blog.codeblob.service;

import com.blog.codeblob.model.Post;

import java.util.List;

public interface CodeblogService {

    List<Post> findAll();
    Post findById(Long id);
    Post save(Post post);

}