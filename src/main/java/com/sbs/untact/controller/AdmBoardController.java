package com.sbs.untact.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sbs.untact.dto.Article;
import com.sbs.untact.dto.Board;
import com.sbs.untact.service.ArticleService;
import com.sbs.untact.service.BoardService;

@Controller
public class AdmBoardController extends BaseController {
	@Autowired
	private ArticleService articleService;
	@Autowired
	private BoardService boardService;

	@RequestMapping("/adm/board/list")
	public String showList(HttpServletRequest req, Integer boardId) {
		
		Board board = articleService.getBoard(boardId);

		req.setAttribute("board", board);

		if (board == null) {
			return msgAndBack(req, "존재하지 않는 게시판 입니다.");
		}

		List<Board> Foundboard = boardService.getForPrintBoards((int)boardId);

		req.setAttribute("boards", Foundboard);

		return "adm/board/list";
	}
}
