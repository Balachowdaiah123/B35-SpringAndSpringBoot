package org.tnsif.certificate;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CertificateService {
	
	@Autowired
	private CertificateRepository repo;
	
	//to retrieve all the data user class
	public List<Certificate> listAll()
	{
		return repo.findAll();
	}

	//insert/create a data
	public void create (Certificate s)
	{
		 repo.save(s);
	}
	//to retrieve a single record
	public Certificate retrieve(Integer id)
	{
		return repo.findById(id).get();
	}
	//to delete a data
	public void delete(Integer id) {
		repo.deleteById(id);
	}

}
