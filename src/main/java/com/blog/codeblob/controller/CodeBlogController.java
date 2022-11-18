package com.blog.codeblob.controller;

import com.blog.codeblob.model.Post;
import com.blog.codeblob.service.CodeblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CodeBlogController {

    @Autowired
    CodeblogService codeblogService;

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public ModelAndView getposts() {
        ModelAndView mv = new ModelAndView("posts");
        List<Post> posts = codeblogService.findAll();
        mv.addObject("posts", posts);
        return mv;
    }

    @RequestMapping(value = "/posts/{id}", method = RequestMethod.GET)
    public ModelAndView getpostsDetails(@PathVariable("id") Long id) {
        ModelAndView mv = new ModelAndView("postsDatails");
        Post post = codeblogService.findById(id);
        mv.addObject("post", post);
        return mv;
    }

}
