package com.blog.codeblob.utils;

import com.blog.codeblob.model.Post;
import com.blog.codeblob.repository.CodeBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {
    @Autowired
    private CodeBlogRepository repository;

    //já foi gerado os registros no banco de dados caso contrario descomente o @Postconstruct
    //@PostConstruct //executa conforme aplicação sobe
    public void savePost() {

        List<Post> postList = new ArrayList<>();
        Post post1 = new Post();
        post1.setAuthor("Nelcione Valério Dias");
        post1.setDate(LocalDate.now());
        post1.setTitle("Angular 14");
        post1.setContent("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.");

        Post post2 = new Post();
        post2.setAuthor("Anna Claudia Castro Dias");
        post2.setDate(LocalDate.now());
        post2.setTitle("API REST");
        post2.setContent("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.");

        postList.add(post1);
        postList.add(post2);

        for(Post post: postList) { // salva post por post
            Post postSaved = repository.save(post);
            System.out.println(postSaved.getId());
        }
    }
}
