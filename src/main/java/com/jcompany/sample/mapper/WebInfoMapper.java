package com.jcompany.sample.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WebInfoMapper {
	String selectWebServerVer();
}