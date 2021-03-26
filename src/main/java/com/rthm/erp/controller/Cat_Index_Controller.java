package com.rthm.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rthm.erp.Cat_Index;
import com.rthm.erp.service.Cat_Index_Service;

@RestController
public class Cat_Index_Controller {

	@Autowired
	Cat_Index_Service cat_index_service;
	
	 @RequestMapping(method=RequestMethod.GET, value = "/cat_index")
	   public List<Cat_Index> getCat_Index() {
	      return cat_index_service.getCat_Index();
	   }
	   
	   @GetMapping("/cat_index/{catindexid}")  
	   private Cat_Index getCat_Index(@PathVariable("catindexid") String catindexid)   
	   {  
	   return cat_index_service.getCat_IndexById(catindexid);
	   }  
	   
	   @DeleteMapping("/cat_index/delete/{catindexid}")  
	   private void deleteBook(@PathVariable("catindexid") String catindexid)   
	   {  
		   cat_index_service.delete(catindexid);  
	   }  
	  
	   @RequestMapping(method=RequestMethod.POST,value="/cat_index/save")  
	   @ResponseBody
	   private void savecatindex(@RequestBody Cat_Index cat_index)   
	   {  
	   cat_index_service.saveOrUpdate(cat_index);  
	   }  
	   
	   @PutMapping("/cat_index/save")  
	   private void update(@RequestBody Cat_Index cat_index)   
	   {  
	   cat_index_service.saveOrUpdate(cat_index); 
	   }  
}
