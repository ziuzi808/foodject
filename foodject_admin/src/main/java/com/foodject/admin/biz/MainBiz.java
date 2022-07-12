package com.foodject.admin.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodject.admin.frame.Biz;
import com.foodject.admin.mapper.MainMapper;
import com.foodject.admin.vo.MainVO;


@Service
public class MainBiz implements Biz<Integer, MainVO> {

	@Autowired
	MainMapper dao;

	
	@Override
	public void register(MainVO v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void modify(MainVO v) throws Exception {
		dao.update(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
	}

	@Override
	public MainVO get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<MainVO> get() throws Exception {
		return dao.selectall();
	}
	
	public List<MainVO> serchall(String obj) throws Exception{
		return dao.serchall(obj);
	}

}
