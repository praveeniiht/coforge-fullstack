package com.coforge.microservices.postservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.microservices.postservice.model.CommentsDto;
import com.coforge.microservices.postservice.model.Post;
import com.coforge.microservices.postservice.service.PostServiceImpl;

@RestController
@RequestMapping("/posts")
public class PostController {

	@Autowired
	PostServiceImpl service;

	@GetMapping("/all")
	public List<Post> findAllPosts() {
		return service.findAllPosts();
	}

	@GetMapping("/test")
	public String test() {
		return "Hello Welcome";
	}

	@GetMapping("/comments/{postId}")
	public List<CommentsDto> findCommentsByPostId(@PathVariable("postId") int postId) {
		return service.findCommentsByPostId(postId);
	}

	@GetMapping("/author/{postId}")
			public String findAuthor(@PathVariable("postId") int postId){
				return service.findAuthorByPostId(postId);
			}
	
	@GetMapping("/comments/port")
	public String getCommentAppPort() {
		return service.getCommentsAppPort();
	}

}
