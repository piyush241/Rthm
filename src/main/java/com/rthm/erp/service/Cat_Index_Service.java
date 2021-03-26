package com.rthm.erp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rthm.erp.Cat_Index;
import com.rthm.erp.repository.Cat_Index_Repo;

@Service
public class Cat_Index_Service {
	
	@Autowired
	private Cat_Index_Repo repo;

	public List<Cat_Index> getCat_Index() {
		List<Cat_Index> groups = new ArrayList<>();
		repo.findAll().forEach(groups::add);;
		return groups;
	}
	
	public Cat_Index getCat_IndexById(String id)   
	{  
	return repo.findById(id).get();  
	}  
	
	public void delete(String id)   
	   {  
	   repo.deleteById(id);  
	   }  
	
	public void saveOrUpdate(Cat_Index catindex)   
	{  
	repo.save(catindex);  
	}  
	
	public void update(Cat_Index catindex,String catindexid)   
	{  
	repo.save(catindex);  
	}  

}
