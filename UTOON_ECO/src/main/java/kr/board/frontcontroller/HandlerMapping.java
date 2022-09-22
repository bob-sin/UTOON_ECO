package kr.board.frontcontroller;

import java.util.HashMap;

import kr.board.controller.BoardCountUpdateController;
import kr.board.controller.BoardDeleteController;
import kr.board.controller.BoardDetailController;
import kr.board.controller.BoardListAjaxController;
import kr.board.controller.BoardListController;
import kr.board.controller.BoardUpdateController;
import kr.board.controller.BoardWriteController;
import kr.board.controller.CalcController;
import kr.board.controller.Controller;
import kr.board.controller.LoginController;
import kr.board.controller.LogoutController;

public class HandlerMapping {
	private HashMap<String, Controller> mappings;
	public HandlerMapping() {
		mappings=new HashMap<String, Controller>();
		mappings.put("/boardList.do", new BoardListController());
		mappings.put("/boardListAjax.do", new BoardListAjaxController());
		mappings.put("/boardWrite.do", new BoardWriteController());
		mappings.put("/boardDetail.do", new BoardDetailController());
		mappings.put("/boardDelete.do", new BoardDeleteController());
		mappings.put("/boardUpdate.do",  new BoardUpdateController());
		mappings.put("/boardCountUpdate.do",  new BoardCountUpdateController());
		mappings.put("/login.do", new LoginController());
		mappings.put("/logout.do", new LogoutController());
		mappings.put("/calc.do", new CalcController());
	}
	public Controller getController(String key) {
		return mappings.get(key);
	}
}
// HashMap 자료구조 Key : Vlaue !  String : Controller ---- 이렇게 저장하면 보기 편하다!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
/*
 * 	if(command.equals("/boardList.do")) {
			//BoardListController가 원래 하던일
			controller = new BoardListController();
			nextPath=controller.requestHandler(request, response);
			
		}else if(command.equals("/boardWriteForm.do")) {
			controller = new BoardWriteFormController();
			nextPath=controller.requestHandler(request, response);
			
		}else if(command.equals("/boardWrite.do")) {
			controller = new BoardWriteController();
			nextPath=controller.requestHandler(request, response);
			
		}else if(command.equals("/boardDetail.do")) {
			controller = new BoardDetailController();
			nextPath=controller.requestHandler(request, response);
			
		}else if(command.equals("/boardDelete.do")) {
			controller = new BoardDeleteController();
			nextPath=controller.requestHandler(request, response);
			
		}else if(command.equals("/boardUpdateForm.do")) {
			controller = new BoardUpdateFormController();
			nextPath=controller.requestHandler(request, response);
			
			
		}else if(command.equals("/boardUpdate.do")) {
			controller = new BoardUpdateController();
			nextPath=controller.requestHandler(request, response);
			
		}
 */