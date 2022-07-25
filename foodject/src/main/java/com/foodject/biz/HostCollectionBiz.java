package com.foodject.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodject.frame.Biz;
import com.foodject.mapper.HostCollectionMapper;
import com.foodject.vo.HostCollectionVO;


@Service
public class HostCollectionBiz implements Biz<Integer, HostCollectionVO> {

	@Autowired
	HostCollectionMapper dao;
	
	
	
	@Override
	public void register(HostCollectionVO v) throws Exception {
		dao.insert(v);
		
	}

	@Override
	public void modify(HostCollectionVO v) throws Exception {
		dao.update(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
		
	}

	@Override
	public HostCollectionVO get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<HostCollectionVO> get() throws Exception {
		return dao.selectall();
	}
	public void modifyLine(HostCollectionVO v) throws Exception {
		dao.updateLine(v);
	}
	
	public List<HostCollectionVO> get_byShop(int k) throws Exception{
		return dao.select_byShop(k);
	}

}
