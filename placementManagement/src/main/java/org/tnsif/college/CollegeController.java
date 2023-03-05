package org.tnsif.college;

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
public class CollegeController {
	
	@Autowired
	private CollegeService service;
	//Restful API
	//creation
	@PostMapping("/college")
	public void add(@RequestBody College s)
	{
		service.create(s);
	}
	@DeleteMapping("/college/{id}")
	public void remove(@PathVariable Integer id)
	{
		service.delete(id);
	}
	@GetMapping("/college")
	public List<College>list()
	{
		return service.listall();
		
	}
	//Retrieve with specific id
	@GetMapping("/college/{id}")
	public ResponseEntity<College>get(@PathVariable Integer id)
	{
		try {
		College s=service.retrieve(id);
		return new ResponseEntity<College>(s,HttpStatus.OK);
		
	}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
		}
	}
	
	//updation
	@PutMapping("/college/{id}")
	public ResponseEntity<College> ubdate(@RequestBody College s, @PathVariable Integer id)
	{
		try {
		@SuppressWarnings("unused")
		College s1=service.retrieve(id);
		service.create(s);
		return new ResponseEntity<College>(s,HttpStatus.OK);
		
	}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
		}
	}


}
