<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>采购入库</title>
<style type="text/css">
input[type=text] {
	width: 170px;
	border: 1px solid #FEDBDD;
	background-color: #FFF3F3;
	border-radius: 5px;
}

input[type=date] {
	width: 170px;
	border: 1px solid #FEDBDD;
	background-color: #FFF3F3;
	border-radius: 5px;
}

div {
	width: 740px;
	border: 1px solid blue;
	margin-left: 300px;
	margin-top: 50px;
}

#p1 {
	background-color: blue;
	margin-top: 0px;
}

table {
	width: 600px;
	height: 300px;
	margin-left: 70px;
}

textarea {
	border: 1px solid #FEDBDD;
	border-radius: 5px;
}

p input {
	background-color: white;
	border: 2px solid silver;
	border-radius: 5px;
}
</style>
</head>
<body>
	<form action="" method="post">
		<div>
			<p id="p1">
				<strong>采购入库</strong>
			</p>
			<p></p>
			<p></p>
			<table>
				<tr>
					<td>单据编号：</td>
					<td><input type="text" name="" value=""></td>
					<td>单据日期：</td>
					<td><input type="date" name="" value=""></td>
				</tr>
				<tr>
					<td>供应商：</td>
					<td><input type="text" name="" value=""></td>
					<td>供应商地址：</td>
					<td><input type="text" name="" value=""></td>
				</tr>
				<tr>
					<td>部门：</td>
					<td><input type="text" name="" value=""></td>
					<td>仓库：</td>
					<td><input type="text" name="" value=""></td>
				</tr>
				<tr>
					<td>采购人员：</td>
					<td><input type="text" name="" value=""></td>
					<td>制单人员：</td>
					<td><input type="text" name="" value=""></td>
				</tr>
				<tr>
					<td>入库明细：</td>
					<td colspan="3"><textarea rows="6" cols="63"></textarea></td>
				</tr>
			</table>
			<p>
				<input type="button" value="加载测试数据" onclick=""> <input
					type="button" value="加载服务端数据" onclick=""> <input
					type="button" value="保存" onclick=""> <input type="reset"
					value="清空" onclick="">
			</p>
		</div>
	</form>

</body>
</html>