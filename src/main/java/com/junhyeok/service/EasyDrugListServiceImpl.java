package com.junhyeok.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.junhyeok.domain.EasyDrugListVO;
import com.junhyeok.persistence.EasyDrugListDAO;

@Service
public class EasyDrugListServiceImpl implements EasyDrugListService {
	
	@Inject
	private EasyDrugListDAO dao;
	
	@Override
	public EasyDrugListVO read(String drugName) throws Exception {
		return dao.read(drugName);
	}

	@Override
	public List<EasyDrugListVO> readList(String drugName) throws Exception {
		return dao.readlist(drugName);
	}

	
}
