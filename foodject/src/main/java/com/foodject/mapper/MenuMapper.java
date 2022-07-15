package com.foodject.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.foodject.vo.MenuVO;

@Repository
@Mapper
public interface MenuMapper {

	public void insert(MenuVO obj) throws Exception;
	public void delete(int obj) throws Exception;
	public void update(MenuVO obj) throws Exception;
	public void updateLine(MenuVO obj) throws Exception;
	public MenuVO select(int obj) throws Exception;
	public List<MenuVO> selectall() throws Exception;
}
