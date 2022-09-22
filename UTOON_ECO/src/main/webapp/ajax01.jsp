<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function go() {
		//alert("클릭했습니다.")
		var su1=document.getElementById("su1").value;
		var su2=document.getElementById("su2").value;
		var msg=document.getElementById("msg");
		var sum=parseInt(su1)+parseInt(su2);
		let num1=parseInt(su1)
		let num2=parseInt(su2)
		let total=0;
		for(let i =num1; i<=num2;i++ ){
			total+=i
		}
		msg.innerHTML="<font color='red'>"+total+"</font>";
	}

</script>
</head>
<body>
<input type="text" id="su1"/>+<input type="text" id="su2"/>
<input type="button" value="계산" onclick="go()"/>
<div id = "msg"></div>
</body>
</html>