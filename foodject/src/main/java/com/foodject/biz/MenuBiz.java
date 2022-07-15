package com.foodject.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodject.frame.Biz;
import com.foodject.mapper.MenuMapper;
import com.foodject.vo.MenuVO;

@Service
public class MenuBiz implements Biz<Integer, MenuVO> {

	@Autowired
	MenuMapper dao;
	
	@Override
	public void register(MenuVO v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void modify(MenuVO v) throws Exception {
		dao.update(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
	}

	@Override
	public MenuVO get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<MenuVO> get() throws Exception {
		return dao.selectall();
	}
	
	public void modifyLine(MenuVO v) throws Exception {
		dao.updateLine(v);
	}

}
