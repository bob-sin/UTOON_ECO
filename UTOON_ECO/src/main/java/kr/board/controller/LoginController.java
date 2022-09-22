package kr.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.board.dao.BoardMyBatisDAO;
import kr.board.dao.MemberVO;

public class LoginController implements Controller {

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//파라메터 수집(memId, memPwd)
		String memId=request.getParameter("memId");
		String memPwd=request.getParameter("memPwd");
		MemberVO vo = new MemberVO();
		vo.setMemId(memId);
		vo.setMemPwd(memPwd);
		BoardMyBatisDAO dao = new BoardMyBatisDAO();
		MemberVO mvo = dao.memberLogin(vo);
		if(mvo != null) { //로그인 성공 => [세션을 만들어 준다]
			HttpSession session =request.getSession(); //JSESIONID=100
			// 객체바인딩 세션에 객체 바인딩 하는 이유 모든 JSP들이 회원인증을 알아야 하기 때문에 세션을 이용해 바인딩한다, REQUST 는 하나의 뷰만 알 수 있기 때문
			session.setAttribute("mvo", mvo);
		}
		
		return "redirect:/boardList.do";
	}

}
