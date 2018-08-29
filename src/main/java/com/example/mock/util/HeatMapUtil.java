package com.example.mock.util;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.mock.bean.HeatMap;

@Component
public class HeatMapUtil {

	private static final int rowCount = 100;

	private static final int columnCount = 100;

	public List<HeatMap> getData() {

		List<HeatMap> heatMapList = new LinkedList<>();

		for (int i = 0; i < rowCount; i++) {

			for (int j = 0; j < columnCount; j++) {

				HeatMap heatMap = new HeatMap();

				heatMap.setRowid(String.valueOf(i));

				heatMap.setColumnid(String.valueOf(j));

				heatMapList.add(heatMap);

			}

		}

		return heatMapList;
	}

}