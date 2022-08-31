package com.junhyeok.service;

import java.util.List;

import com.junhyeok.domain.MedicineListVO;

public interface MedicineListService {
	
	public MedicineListVO read(String medicineName) throws Exception;
	
	public List<MedicineListVO> readList(String medicineName) throws Exception;

	public List<MedicineListVO> readParam(String medicineShape, String printFront, String colorClass, String lineFront) throws Exception;
}
