<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="cpath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.1.min.js"></script> <!-- CDN 방식으로 외부 네트워크로 jQuery 쓰는 주소  -->
<script type="text/javascript">
	$(document).ready(function (){ /* jQuery 기본 문법 형태 */
		
		$("#btn").click(function (){
			//$("#msg").empty();
			var su1 = $("#su1").val();
			var su2 = $("#su2").val();
			// server(Flask)와 통신 => calc.do : CalcController
			$.ajax({
				url : "${cpath}/calc.do", //<-- 이건 우리네 톰캣//"http://127.0.0.1:5000/calc.do" <-- 나중에 flask 
				type : "get",
				data : {"su1":su1,"su2":su2},
				success : result,
				error : function () {alert("error");} // < == 콜백 함수
				
				
			}); /* 서버 통신을 위한 함수 이 함수만 쓸수 있음 그만이야 ~~~  */
		}); /* $() : 셀렉터 */
		
	});
	function result(data){ 
		$("#msg").html(data);
	}
	

</script>
</head>
<body>
<input type="text" id="su1"/>+<input type="text" id="su2"/>
<input type="button" value="클릭" id="btn"/>
<div id="msg"></div>
</body>
</html>