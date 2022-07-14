package com.foodject.shop.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodject.shop.frame.Biz;
import com.foodject.shop.mapper.ManagerMapper;
import com.foodject.shop.vo.ManagerVO;
@Service
public class ManagerBiz implements Biz<String, ManagerVO> {

	@Autowired
	ManagerMapper dao;
	
	@Override
	public void register(ManagerVO v) throws Exception {
		dao.insert(v);
		
	}

	@Override
	public void modify(ManagerVO v) throws Exception {
		dao.update(v);
		
	}

	@Override
	public void remove(String k) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ManagerVO get(String k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<ManagerVO> get() throws Exception {
		return dao.selectall();
	}
	public void modifysts(ManagerVO v) throws Exception {
		dao.updatests(v);
	}

}
