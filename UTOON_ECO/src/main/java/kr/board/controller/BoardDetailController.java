package kr.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.board.dao.BoardMyBatisDAO;
import kr.board.dao.BoardVO;

public class BoardDetailController implements Controller {

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//BoardDAO dao = new BoardDAO();
		BoardMyBatisDAO dao = new BoardMyBatisDAO();
		int idx = Integer.parseInt(request.getParameter("idx"));
		BoardVO vo = dao.getByIdx(idx);
		dao.countUpdate(idx); // 조회수 누적
		request.setAttribute("vo", vo);
		
		return "boardDetail";
	}

}
