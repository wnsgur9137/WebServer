package com.junhyeok.persistence;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.junhyeok.domain.EasyDrugListVO;

@Repository
public class EasyDrugListDAOImpl implements EasyDrugListDAO {
	
	@Inject
	private SqlSession session;
	
	private static String namespace = "com.junhyeok.mapper.EasyDrugListMapper";
	
	@Override
	public EasyDrugListVO read(String drugName) throws Exception {
		return session.selectOne(namespace + ".read", drugName);
	}

	@Override
	public List<EasyDrugListVO> readlist(String drugName) throws Exception {
		return session.selectList(namespace + ".readList", drugName);
	}

}
