package com.foodject.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.foodject.vo.ShopVO;

@Repository
@Mapper
public interface MainMapper {

	public void insert(ShopVO obj) throws Exception;
	public void delete(int obj) throws Exception;
	public void update(ShopVO obj) throws Exception;
	public ShopVO select(int obj) throws Exception;
	public List<ShopVO> selectall() throws Exception;
	public List<ShopVO> serchall(String obj) throws Exception;
}
