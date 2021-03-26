package com.rthm.erp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rthm.erp.GroupIndex;
import com.rthm.erp.repository.GroupIndexRepo;

@Service
public class GroupIndexService {
	
	@Autowired
	private GroupIndexRepo groupIndexRepo;
	
	public void addGroup(GroupIndex groupIndex)
	{
		groupIndexRepo.save(groupIndex);
	}

}
