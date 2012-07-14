package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.Mapper;

@Service("numberService")
public class NumberServiceImpl implements NumberService {
	@Autowired
	private Mapper dao;
	
	public String sum() {
		return this.dao.getTestQuery();
	}

	public String testAdd() {
		return "test";
	}

}
