package com.foodject.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodject.frame.Biz;
import com.foodject.mapper.UserCollectionMapper;
import com.foodject.vo.UserCollectionVO;


@Service
public class UserCollectionBiz implements Biz<Integer, UserCollectionVO> {

	@Autowired
	UserCollectionMapper dao;
	
	@Override
	public void register(UserCollectionVO v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void modify(UserCollectionVO v) throws Exception {
		dao.update(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
	}

	@Override
	public UserCollectionVO get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<UserCollectionVO> get() throws Exception {
		return dao.selectall();
	}
	
	public void modifyLine(UserCollectionVO v) throws Exception {
		dao.updateLine(v);
	}

}
