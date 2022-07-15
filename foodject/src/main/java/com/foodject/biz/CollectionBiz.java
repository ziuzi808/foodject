package com.foodject.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodject.frame.Biz;
import com.foodject.mapper.CollectionMapper;
import com.foodject.vo.CollectionVO;

@Service
public class CollectionBiz implements Biz<Integer, CollectionVO> {

	@Autowired
	CollectionMapper dao;
	
	@Override
	public void register(CollectionVO v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void modify(CollectionVO v) throws Exception {
		dao.update(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
	}

	@Override
	public CollectionVO get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<CollectionVO> get() throws Exception {
		return dao.selectall();
	}
	
	public void modifyLine(CollectionVO v) throws Exception {
		dao.updateLine(v);
	}

}
