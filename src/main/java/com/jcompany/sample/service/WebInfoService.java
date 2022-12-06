package com.jcompany.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jcompany.sample.mapper.WebInfoMapper;

@Service
public class WebInfoService {
	
	@Autowired
	private WebInfoMapper webInfoMapper;
	
	public String selectWebServerVer() {
		return webInfoMapper.selectWebServerVer();
	}

}