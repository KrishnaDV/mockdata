package com.example.mock.util;

import org.springframework.stereotype.Component;

@Component
public class CpuUsage {

	private long timestamp;

	private double usage;

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public double getUsage() {
		return usage;
	}

	public void setUsage(double usage) {
		this.usage = usage;
	}

	@Override
	public String toString() {
		return "[timestamp=" + timestamp + ", usage=" + usage + "]";
	}

}
