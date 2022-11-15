package com.blog.codeblob.repository;

import com.blog.codeblob.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeBlogRepository extends JpaRepository<Post, Long> {
}
