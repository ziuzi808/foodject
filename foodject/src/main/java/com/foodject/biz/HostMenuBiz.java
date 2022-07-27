package com.foodject.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodject.frame.Biz;
import com.foodject.mapper.HostMenuMapper;
import com.foodject.vo.HostMenuVO;

@Service
public class HostMenuBiz implements Biz<Integer, HostMenuVO>{

	@Autowired
	HostMenuMapper dao;
	
	@Override
	public void register(HostMenuVO v) throws Exception {
		dao.insert(v);
		
	}

	@Override
	public void modify(HostMenuVO v) throws Exception {
		dao.update(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
		
	}

	@Override
	public HostMenuVO get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<HostMenuVO> get() throws Exception {
		return dao.selectall();
	}
	public void modifyLine(HostMenuVO v) throws Exception {
		dao.updateLine(v);
	}
	
	public List<HostMenuVO> get_byShop(int sid) throws Exception {
		return dao.select_byShop(sid);
	}
	
}
