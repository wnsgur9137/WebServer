package com.junhyeok.persistence;

import java.util.List;

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

}
