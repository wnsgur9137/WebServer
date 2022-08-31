package com.junhyeok.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.junhyeok.domain.MedicineListVO;

@Repository
public class MedicineListDAOImpl implements MedicineListDAO {

	@Inject
	private SqlSession session;
	
	private static String namespace = "com.junhyeok.mapper.MedicineListMapper";
	
	@Override
	public MedicineListVO read(String medicineName) throws Exception {
		return session.selectOne(namespace + ".read", medicineName);
	}
	
	@Override
	public List<MedicineListVO> readList(String medicineName) throws Exception {
		return session.selectList(namespace + ".readList", medicineName);
	}

	@Override
	public List<MedicineListVO> readParam(String medicineShape, String printFront, String colorClass, String lineFront)
			throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("medicineShape", medicineShape);
		paramMap.put("printFront", printFront);
		paramMap.put("colorClass", colorClass);
		paramMap.put("lineFront", lineFront);
		
		System.out.print("paramMap: ");
		System.out.println(paramMap);
		System.out.println(session.selectList(namespace + ".readParam", paramMap));
		return session.selectList(namespace + ".readParam", paramMap) ;
	}

}
