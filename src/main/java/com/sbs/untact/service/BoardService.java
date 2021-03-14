package com.sbs.untact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbs.untact.dao.BoardDao;
import com.sbs.untact.dto.Board;

@Service
public class BoardService {
	@Autowired
	private BoardDao boardDao;

	public List<Board> getForPrintBoards(int boardId) {
		return boardDao.getForPrintBoards(boardId);
	}

}
