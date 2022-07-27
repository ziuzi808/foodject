package com.foodject.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.foodject.vo.UserOptVO;

@Repository
@Mapper
public interface UserOptMapper {

	public void insert(UserOptVO obj) throws Exception;
	public void update(UserOptVO obj) throws Exception;
	public void delete(int id) throws Exception;
	public UserOptVO select(int id) throws Exception;
	public List<UserOptVO> selectall() throws Exception;

	public List<UserOptVO> select_byShop(int sid) throws Exception;
	public List<UserOptVO> select_byMenu(int mnid) throws Exception;
}




