package com.foodject.frame;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

public interface SerchBizFrame<K,V> {
	@Transactional
	public List<V> getAll(K k) throws Exception;
	public List<V> getTitle(K k) throws Exception;
	public List<V> getWriter(K k) throws Exception;
	public List<V> getPub(K k) throws Exception;
}
