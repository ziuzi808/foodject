package com.foodject.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodject.frame.Biz;
import com.foodject.mapper.UserMarkerMapper;
import com.foodject.vo.MarkerVO;

@Service
public class UserMarkerBiz implements Biz<Integer, MarkerVO> {

	@Autowired
	UserMarkerMapper dao;
	
	@Override
	public void register(MarkerVO v) throws Exception {
		dao.insert(v);	
	}

	@Override
	public void modify(MarkerVO v) throws Exception {
		dao.update(v);		
	}

	@Override
	public MarkerVO get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<MarkerVO> get() throws Exception {
		return dao.selectall();
	}

	@Override
	public void remove(Integer k) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
