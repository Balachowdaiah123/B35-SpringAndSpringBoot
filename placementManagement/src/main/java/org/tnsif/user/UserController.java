package org.tnsif.user;

import java.util.List;


import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	//restful API
	@PostMapping("/user")
	public void add(@RequestBody User s)
	{
		service.create(s);
	}
	@DeleteMapping("/uder/{id}")
	public void remove(@PathVariable Integer id)
	{
		service.delete(id);
	}
	@GetMapping("/user")
	public List<User>list()
	{
		return service.listAll();
		
	}
	//Retrieve with specific id
	@GetMapping("/user/{id}")
	public ResponseEntity<User>get(@PathVariable Integer id)
	{
		try {
		User s=service.retrieve(id);
		return new ResponseEntity<User>(s,HttpStatus.OK);
		
	}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
	}
	
	//updation
	//@PutMapping("/user/{id}")
	public ResponseEntity<User> ubdate(@RequestBody User s, @PathVariable Integer id)
	{
		try {
		@SuppressWarnings("unused")
		User s1=service.retrieve(id);
		service.create(s);
		return new ResponseEntity<User>(s,HttpStatus.OK);
		
	}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
	}

}
