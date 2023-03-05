package org.tnsif.admin;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional

public class AdminService {
	@Autowired
	private AdminRepository repo;
	
	//to retrieve all the data user class
		public List<Admin> listAll()
		{
			return repo.findAll();
		}

		//insert/create a data
		public void create (Admin s)
		{
			 repo.save(s);
		}
		//to retrieve a single record
		public Admin retrieve(Integer id)
		{
			return repo.findById(id).get();
		}
		//to delete a data
		public void delete(Integer id) {
			repo.deleteById(id);
		}

}
