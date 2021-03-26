package com.rthm.erp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rthm.erp.GroupIndex;
import com.rthm.erp.service.GroupIndexService;

@RestController
public class GroupIndexController {
	
	@Autowired
	private GroupIndexService groupIndexService;
	
	
	@RequestMapping(method=RequestMethod.POST, value="/saveGroup")
	public void addGroup(@RequestBody GroupIndex groupIndex)
	{
		groupIndexService.addGroup(groupIndex);
	}

}
