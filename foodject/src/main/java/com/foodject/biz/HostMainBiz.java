package com.foodject.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodject.frame.Biz;
import com.foodject.mapper.HostMainMapper;
import com.foodject.vo.HostShopVO;


@Service
public class HostMainBiz implements Biz<Integer, HostShopVO> {

	@Autowired
	HostMainMapper dao;

	
	@Override
	public void register(HostShopVO v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void modify(HostShopVO v) throws Exception {
		dao.update(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
	}

	@Override
	public HostShopVO get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<HostShopVO> get() throws Exception {
		return dao.selectall();
	}
	
	public List<HostShopVO> serchall(String obj) throws Exception{
		return dao.serchall(obj);
	}

}
