package com.foodject.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.foodject.shop.vo.ManagerVO;
import com.foodject.shop.vo.ShopVO;

@Repository
@Mapper
public interface ManagerMapper {

	public void insert(ManagerVO obj) throws Exception;
	public void updatests(ManagerVO obj) throws Exception;
	public void update(ManagerVO obj) throws Exception;
	public ManagerVO select(String id) throws Exception;
	public List<ManagerVO> selectall() throws Exception;
}
