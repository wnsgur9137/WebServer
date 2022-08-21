package com.junhyeok.persistence;

import java.util.List;

import com.junhyeok.domain.MedicineListVO;

public interface MedicineListDAO {
	
	public MedicineListVO read(String medicineName) throws Exception;
	
	public List<MedicineListVO> readList(String medicineName) throws Exception;

}
