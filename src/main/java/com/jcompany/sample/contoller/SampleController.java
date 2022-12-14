package com.jcompany.sample.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jcompany.sample.service.SampleService;

@Controller
public class SampleController {
	
	@Autowired
	private SampleService sampleService;
	
	@RequestMapping(value="/index", method = {RequestMethod.POST, RequestMethod.GET})
	public String index() {
		System.out.println("인덱스 페이지 호출");
		String test = sampleService.selectTest();
		System.out.println("조회 테스트 : "+test);
		return "index";
	}
}