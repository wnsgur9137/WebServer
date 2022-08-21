package com.junhyeok.persistence;

import java.util.List;

import com.junhyeok.domain.EasyDrugListVO;

public interface EasyDrugListDAO {
	
	public EasyDrugListVO read(String drugName) throws Exception;
	
	public List<EasyDrugListVO> readlist(String drugName) throws Exception;
	

}
