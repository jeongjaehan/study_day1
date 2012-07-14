package com.study;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.service.NumberServiceImpl;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/context.xml")
public class StudyMain {
	public Logger logger  = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	NumberServiceImpl numberService;
	
	@Test
	public void test(){
		String test_msg = numberService.testAdd();
		assertThat(test_msg, is("test"));
		
	}

}
