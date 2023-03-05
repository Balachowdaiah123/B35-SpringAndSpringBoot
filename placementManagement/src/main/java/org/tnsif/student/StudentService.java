package org.tnsif.student;

import java.util.List;




import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StudentService {
	
	
	@Autowired
	private StudentRepositary repo;
	
	
	//to retrieve all the data student class
	public List<Student> listAll()
	{
		return repo.findAll();
	}

	//insert/create a data
	public void create(Student s)
	{
		repo.save(s);
	}
	//to retrieve a single record
	public Student retrieve(Integer id)
	{
		return repo.findById(id).get();
	}
	//to delete a data
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}
}
