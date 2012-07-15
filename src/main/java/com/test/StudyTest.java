package com.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.service.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/context.xml")
public class StudyTest {
	public Logger logger  = LoggerFactory.getLogger(this.getClass());
	
	@Inject
	AccountService accountService;
	
	@Test
	public void accountSizeTest(){
		int accountSize = accountService.getAccountSize();
		assertThat(accountSize, is(3));
	}

}
