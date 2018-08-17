package com.example.mock.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CpuUtil {
	
	
	Logger log = LoggerFactory.getLogger(CpuUtil.class);

	@Autowired
	CpuUsage cu;

	public CpuUsage getMetrics() {

		double rangeMin = 0.1;

		double rangeMax = 1.0;

		Random r = new Random();

		double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
		
		double usage = BigDecimal.valueOf(randomValue).setScale(4, RoundingMode.HALF_UP).doubleValue();

		log.info("Current Usage "+usage);

		cu.setTimestamp(System.currentTimeMillis());

		cu.setUsage(usage);
		
		return cu;
	}
}