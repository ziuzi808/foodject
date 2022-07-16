package com.foodject.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.foodject.vo.UserShopVO;

@Repository
@Mapper
public interface UserMainMapper {

	public void insert(UserShopVO obj) throws Exception;
	public void delete(int obj) throws Exception;
	public void update(UserShopVO obj) throws Exception;
	public UserShopVO select(int obj) throws Exception;
	public List<UserShopVO> selectall() throws Exception;
	public List<UserShopVO> serchall(String obj) throws Exception;
}
