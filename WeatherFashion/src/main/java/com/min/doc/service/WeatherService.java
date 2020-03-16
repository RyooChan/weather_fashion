package com.min.doc.service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.ibatis.annotations.Param;

import com.min.doc.dto.WeatherVO;


public interface WeatherService {
	static final Logger logger = LoggerFactory.getLogger(WeatherService.class);

		
	//WeatherVO weatherDao(String tem, String hum);
	List<WeatherVO> weatherDao(@Param("tem")String tem);
	//public WeatherVO weatherDao(String tem, String hum);

		
	
}
