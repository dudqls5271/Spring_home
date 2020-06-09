package com.my.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.my.spring.domain.BoardVO;
import com.my.spring.mapper.BoardMapper;

public class BoardService implements BoardMapper {
	
	@Autowired
    private BoardMapper mapper;
	
	@Override
	public List<BoardVO> viewAll() {
		
		return mapper.viewAll();
	}
	
}
