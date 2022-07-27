package com.foodject.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodject.frame.Biz;
import com.foodject.mapper.UserOptMapper;
import com.foodject.vo.UserOptVO;

@Service
public class UserOptBiz implements Biz<Integer, UserOptVO> {

	@Autowired
	UserOptMapper dao;
	
	@Override
	public void register(UserOptVO v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void modify(UserOptVO v) throws Exception {
		dao.update(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
	}

	@Override
	public UserOptVO get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<UserOptVO> get() throws Exception {
		return dao.selectall();
	}
	
	public List<UserOptVO> get_byShop(int sid) throws Exception {
		return dao.select_byShop(sid);
	}
	
	public List<UserOptVO> get_byMenu(int mnid) throws Exception {
		return dao.select_byMenu(mnid);
	}

}
