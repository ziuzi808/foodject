package com.foodject.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.foodject.vo.HostShopVO;

@Repository
@Mapper
public interface HostMainMapper {

	public void insert(HostShopVO obj) throws Exception;
	public void delete(int obj) throws Exception;
	public void update(HostShopVO obj) throws Exception;
	public HostShopVO select(int obj) throws Exception;
	public List<HostShopVO> selectall() throws Exception;
	public List<HostShopVO> serchall(String obj) throws Exception;
}
