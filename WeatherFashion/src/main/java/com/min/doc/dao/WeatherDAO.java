package com.min.doc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.min.doc.dto.WeatherVO;


public interface WeatherDAO {
	static final Logger logger = LoggerFactory.getLogger(WeatherDAO.class);

	//WeatherVO weatherDao(String tem, String hum);
	List<WeatherVO> weatherDao(@Param("tem")String tem);
	//public WeatherVO weatherDao(String tem, String hum);


}
