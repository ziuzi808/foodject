package com.foodject.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.foodject.admin.vo.MainVO;

@Repository
@Mapper
public interface MainMapper {

	public void insert(MainVO obj) throws Exception;
	public void delete(int obj) throws Exception;
	public void update(MainVO obj) throws Exception;
	public MainVO select(int obj) throws Exception;
	public List<MainVO> selectall() throws Exception;
	public List<MainVO> serchall(String obj) throws Exception;
}
