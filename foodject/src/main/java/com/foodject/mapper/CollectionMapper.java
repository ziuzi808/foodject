package com.foodject.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.foodject.vo.CollectionVO;

@Repository
@Mapper
public interface CollectionMapper {

	public void insert(CollectionVO obj) throws Exception;
	public void delete(int obj) throws Exception;
	public void update(CollectionVO obj) throws Exception;
	public void updateLine(CollectionVO obj) throws Exception;
	public CollectionVO select(int obj) throws Exception;
	public List<CollectionVO> selectall() throws Exception;
}
