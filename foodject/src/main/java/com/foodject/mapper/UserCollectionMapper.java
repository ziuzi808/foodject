package com.foodject.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.foodject.vo.UserCollectionVO;


@Repository
@Mapper
public interface UserCollectionMapper {

	public void insert(UserCollectionVO obj) throws Exception;
	public void delete(int obj) throws Exception;
	public void update(UserCollectionVO obj) throws Exception;
	public void updateLine(UserCollectionVO obj) throws Exception;
	public UserCollectionVO select(int obj) throws Exception;
	public List<UserCollectionVO> selectall() throws Exception;
}
