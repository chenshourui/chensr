package com.chensr.base.service.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.chensr.base.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Override
	public void save() {
		Logger logger = Logger.getLogger(UserServiceImpl.class);
        logger.info("呵呵");
        logger.error("哈哈");
        logger.debug("嘿嘿");
		
	}

}
