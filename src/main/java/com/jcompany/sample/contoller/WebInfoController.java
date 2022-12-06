package com.jcompany.sample.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jcompany.sample.service.WebInfoService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("api/wasVer")
public class WebInfoController {
	
	@Autowired
	private WebInfoService webInfoService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String getWebServerVer() {
		System.out.println("WAS ver 호출!");
		String ver = webInfoService.selectWebServerVer();
		System.out.println("WAS ver : " + ver);
		return ver;
	}

}