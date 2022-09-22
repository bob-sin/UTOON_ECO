<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
			let total=0;
			for(let i =parseInt(su1); i<=parseInt(su2);i++ ){
				total+=i
			}
			$("#msg").html("<font color='red'>"+total+"</font>"); /* .text(그대로 문자열만 출력 펑션 안먹힘), .append(계속추가 ~~~ )) */
		}); /* $() : 셀렉터 */
		
	});
	
	

</script>
</head>
<body>
<input type="text" id="su1"/>+<input type="text" id="su2"/>
<input type="button" value="클릭" id="btn"/>
<div id="msg"></div>
</body>
</html>