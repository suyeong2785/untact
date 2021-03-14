package com.sbs.untact.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sbs.untact.dto.Article;
import com.sbs.untact.dto.Board;

@Mapper
public interface BoardDao {

	List<Board> getForPrintBoards(@Param("boardId") int boardId );

	Board getBoard(@Param("id") int id);

	
}
