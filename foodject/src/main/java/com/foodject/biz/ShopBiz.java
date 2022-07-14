package com.foodject.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodject.frame.Biz;
import com.foodject.mapper.ShopMapper;
import com.foodject.vo.ShopVO;

@Service
public class ShopBiz implements Biz<Integer, ShopVO> {

	@Autowired
	ShopMapper dao;
	
	@Override
	public void register(ShopVO v) throws Exception {
		dao.insert(v);	
	}

	@Override
	public void modify(ShopVO v) throws Exception {
		dao.update(v);		
	}

	@Override
	public void remove(Integer k) throws Exception {
				
	}

	@Override
	public ShopVO get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<ShopVO> get() throws Exception {
		return dao.selectall();
	}
	
	public void remove(ShopVO v) throws Exception {
		dao.updateSts(v);
	}
	

}
