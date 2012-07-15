package com.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.dao.AccountMapper;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Inject
	private AccountMapper accoutMapper;
	
	public int getAccountSize() {
		return this.accoutMapper.getAccountSize();
	}
}
