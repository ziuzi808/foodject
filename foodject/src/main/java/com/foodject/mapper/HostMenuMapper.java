package com.foodject.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.foodject.vo.HostMenuVO;


@Repository
@Mapper
public interface HostMenuMapper {

	public void insert(HostMenuVO obj) throws Exception;
	public void delete(int obj) throws Exception;
	public void update(HostMenuVO obj) throws Exception;
	public void updateLine(HostMenuVO obj) throws Exception;
	public HostMenuVO select(int obj) throws Exception;
	public List<HostMenuVO> selectall() throws Exception;
	
	public List<HostMenuVO> select_byShop(int sid) throws Exception;
}
