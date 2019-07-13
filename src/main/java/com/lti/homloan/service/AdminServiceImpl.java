package com.lti.homloan.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.lti.homloan.dao.AdminDAO;
import com.lti.homloan.model.Admin;


@Service
public class AdminServiceImpl implements AdminService {
    
	@Autowired
	private AdminDAO adminDAO;
	
	@Transactional
	public Admin checkUser(Admin theUser) {
		// TODO Auto-generated method stub
		return adminDAO.checkUser(theUser);
	}

}