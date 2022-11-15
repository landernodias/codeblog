package com.blog.codeblob.service.serviceImpl;

import com.blog.codeblob.model.Post;
import com.blog.codeblob.repository.CodeBlogRepository;
import com.blog.codeblob.service.CodeblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CodeblogServiceImpl implements CodeblogService {

    final CodeBlogRepository repository;

    public CodeblogServiceImpl(CodeBlogRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Post> findAll() {
        return repository.findAll();
    }

    @Override
    public Post findById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    @Transactional
    public Post save(Post post) {
        return repository.save(post);
    }
}
