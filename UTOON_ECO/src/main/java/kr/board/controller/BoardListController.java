package kr.board.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.board.dao.BoardMyBatisDAO;
import kr.board.dao.BoardVO;
//POJO --- 인터페이스가 등장하게 되었다 !!! 추상 은 규격을 만들기 좋다!!! 
public class BoardListController implements Controller{   // 엄청 중요한 개념임 interface 를 상속받아 controller 형식을 규격화 할 수 있다 
	// 프론트컨트롤러의 요청을 처리해주는 컨트롤러
	public String requestHandler(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//BoardDAO dao = new BoardDAO();
		BoardMyBatisDAO dao = new BoardMyBatisDAO();
		List<BoardVO> list = dao.allList();
		request.setAttribute("list", list);
		return "boardList"; // nextPath
		
	}

}
