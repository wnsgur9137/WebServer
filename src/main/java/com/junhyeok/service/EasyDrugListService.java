package com.junhyeok.service;

import java.util.List;

import com.junhyeok.domain.EasyDrugListVO;

public interface EasyDrugListService {
	
	public EasyDrugListVO read(String drugName) throws Exception;

	public List<EasyDrugListVO> readList(String drugName) throws Exception;
}
