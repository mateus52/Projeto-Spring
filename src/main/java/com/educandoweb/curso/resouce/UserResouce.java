package com.educandoweb.curso.resouce;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.curso.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResouce {

	@GetMapping
	public ResponseEntity<User> findAll() {
		
		User u = new User(1L, "Mateus", "mateusdossantos52@gmail.com", "91818519", "12345");
		return ResponseEntity.ok().body(u);
	}
}
