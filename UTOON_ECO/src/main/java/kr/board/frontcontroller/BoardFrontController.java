package kr.board.frontcontroller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.board.controller.BoardDeleteController;
import kr.board.controller.BoardDetailController;
import kr.board.controller.BoardListController;
import kr.board.controller.BoardUpdateController;
import kr.board.controller.BoardWriteController;
import kr.board.controller.Controller;
import kr.board.dao.BoardVO;
@WebServlet("*.do")
public class BoardFrontController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		// 1. 어떤요청인지 파악하는 것!! (command 구하기 !!)
		String reqPath = request.getRequestURI();
		//System.out.println(reqPath);
		
		String cPath = request.getContextPath();
		//System.out.println(cPath); //  /MVC02
		
		String command = reqPath.substring(cPath.length()); //substring(잘라낼 단어 길이)
		//이걸구하는게 1 번이다 !!! 
		System.out.println(command);
		
		// 2. command에 따른 처리(if ~ else) 
		String nextPath =null;
		Controller controller = null; // controller 상위에서 선언하기
		
		//HandlerMapping
		HandlerMapping mappings = new HandlerMapping();
		controller=mappings.getController(command);
		nextPath=controller.requestHandler(request, response);
	
		// 3. 다음페이지로 이동하기(forward, redirect) 밑에서 별도로 하자!!! 
		if(nextPath!=null) {
			if(nextPath.indexOf("redirect:")==-1) {
				//forward
				RequestDispatcher rd= request.getRequestDispatcher(ViewResolver.makeView(nextPath));
				//viewResolver - 내가 경로 주소 완성시켜주는 클래스를 만들어 주었다! 객체임
				rd.forward(request, response);
			}else {
				//re direct
				response.sendRedirect(cPath+nextPath.split(":")[1]); 
				// /MVC02/boardList.do, redirect:를 잘라주는것 다썼으니까
			}
		}
		
	}

}
