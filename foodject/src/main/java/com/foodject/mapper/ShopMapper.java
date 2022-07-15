package com.foodject.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.foodject.vo.ShopVO;

@Repository
@Mapper
public interface ShopMapper {

	public void insert(ShopVO obj) throws Exception;
	public void update(ShopVO obj) throws Exception;
	public void delete(int id) throws Exception;
	public ShopVO select(int id) throws Exception;
	public List<ShopVO> selectall() throws Exception;

	public void updateSts(ShopVO obj) throws Exception;
	public List<ShopVO> select_bySts(int status) throws Exception;
}




