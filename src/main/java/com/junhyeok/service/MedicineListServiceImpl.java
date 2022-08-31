package com.junhyeok.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.junhyeok.domain.MedicineListVO;
import com.junhyeok.persistence.MedicineListDAO;

@Service
public class MedicineListServiceImpl implements MedicineListService {

	@Inject
	private MedicineListDAO dao;
	
	@Override
	public MedicineListVO read(String medicineName) throws Exception {
		return dao.read(medicineName);
	}
	
	@Override
	public List<MedicineListVO> readList(String medicineName) throws Exception {
		return dao.readList(medicineName);
	}

	@Override
	public List<MedicineListVO> readParam(String medicineShape, String printFront, String colorClass, String lineFront)
			throws Exception {
		return dao.readParam(medicineShape, printFront, colorClass, lineFront);
	}
	
	
}
