package com.foodject.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodject.frame.Biz;
import com.foodject.mapper.UserMenuMapper;
import com.foodject.vo.UserMenuVO;

@Service
public class UserMenuBiz implements Biz<Integer, UserMenuVO> {

	@Autowired
	UserMenuMapper dao;
	
	@Override
	public void register(UserMenuVO v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void modify(UserMenuVO v) throws Exception {
		dao.update(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
	}

	@Override
	public UserMenuVO get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<UserMenuVO> get() throws Exception {
		return dao.selectall();
	}
	
	public void modifyLine(UserMenuVO v) throws Exception {
		dao.updateLine(v);
	}
	
	public List<UserMenuVO> get_byShop(int sid) throws Exception {
		return dao.select_byShop(sid);
	}

}
