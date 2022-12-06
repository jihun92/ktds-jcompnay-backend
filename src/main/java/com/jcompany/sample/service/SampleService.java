package com.jcompany.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jcompany.sample.mapper.SampleMapper;

@Service
public class SampleService {
	
	@Autowired
	private SampleMapper sampleMapper;
	
	public String selectTest() {
		return sampleMapper.selectTest();
	}

}