package org.tnsif.placement;

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
public class PlacementController {
	
	@Autowired
	private PlacementService service;
	
	//RESTful API
	//creation
	@PostMapping("/placement")
	public void add(@RequestBody Placement s)
	{
		service.create(s);
	}
	
	//deletion
	@DeleteMapping("/placement/{id}")
	public void remove(@PathVariable Integer id)
	{
		service.delete(id);
	}
	
	//Retrieve with all records
	@GetMapping("/placement")
	public List<Placement>list()
	{
		return service.listAll();
		
	}
	//Retrieve with specific id
	@GetMapping("/placement/{id}")
	public ResponseEntity<Placement>get(@PathVariable Integer id)
	{
		try {
		Placement s=service.retrieve(id);
		return new ResponseEntity<Placement>(s,HttpStatus.OK);
		
	}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
		}
	}
	
	//updation
	@PutMapping("/placement/{id}")
	public ResponseEntity<Placement> ubdate(@RequestBody Placement s, @PathVariable Integer id)
	{
		try {
		@SuppressWarnings("unused")
		Placement s1=service.retrieve(id);
		service.create(s);
		return new ResponseEntity<Placement>(s,HttpStatus.OK);
		
	}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
		}
	}


}
