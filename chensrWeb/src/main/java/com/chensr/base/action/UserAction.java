package com.chensr.base.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;

import com.chensr.base.service.IUserService;

@ParentPackage("basePackage")
@Namespace("/")
@Action(value="userAction")
public class UserAction {
	@Autowired
	public IUserService userService;
	
	

	public void save(){
	
		userService.save();
	}
	

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	
	
	
	
}
