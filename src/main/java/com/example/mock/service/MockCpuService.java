package com.example.mock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mock.util.CpuUsage;
import com.example.mock.util.CpuUtil;

@Service
public class MockCpuService {

	@Autowired
	CpuUtil cutil;

	public CpuUsage getMetrics() {

		return cutil.getMetrics();

	}
}
