package kr.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.board.dao.BoardMyBatisDAO;
import kr.board.dao.BoardVO;

public class BoardUpdateController implements Controller{

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//BoardDAO dao = new BoardDAO();
		BoardMyBatisDAO dao = new BoardMyBatisDAO();

		int idx = Integer.parseInt(request.getParameter("idx"));
		
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		BoardVO vo = new BoardVO();
		vo.setIdx(idx);
		vo.setTitle(title);
		vo.setContent(content);
		
		
		dao.boardUpdate(vo);
		
		
		return null; // client 에서 화면안바뀌고 첫화면으로 돌아가는 거니까 null이다
	}

}
