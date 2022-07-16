package com.foodject.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.foodject.vo.UserMenuVO;


@Repository
@Mapper
public interface UserMenuMapper {

	public void insert(UserMenuVO obj) throws Exception;
	public void delete(int obj) throws Exception;
	public void update(UserMenuVO obj) throws Exception;
	public void updateLine(UserMenuVO obj) throws Exception;
	public UserMenuVO select(int obj) throws Exception;
	public List<UserMenuVO> selectall() throws Exception;
}
