package com.foodject.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.foodject.vo.HostCollectionVO;


@Repository
@Mapper
public interface HostCollectionMapper {

	public void insert(HostCollectionVO obj) throws Exception;
	public void delete(int obj) throws Exception;
	public void update(HostCollectionVO obj) throws Exception;
	public void updateLine(HostCollectionVO obj) throws Exception;
	public HostCollectionVO select(int obj) throws Exception;
	public List<HostCollectionVO> selectall() throws Exception;
	
	public List<HostCollectionVO> select_byShop(int obj) throws Exception;
	public List<HostCollectionVO> selectcol(int obj) throws Exception;
}
