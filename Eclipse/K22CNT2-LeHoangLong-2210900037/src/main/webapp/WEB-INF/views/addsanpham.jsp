<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<style>
body {
	font-family: Arial, sans-serif;
	margin: 0;
	padding: 0;
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	height: 100vh;
	background-color: #f9f9f9;
}

h1 {
	margin-bottom: 20px;
	color: #333;
}

table {
	border-collapse: collapse;
	background-color: white;
	padding: 20px;
	box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.1);
	border-radius: 8px;
}

td {
	padding: 10px;
	text-align: left;
}

td:first-child {
	font-weight: bold;
	color: #555;
}

form:input {
	width: 100%;
	padding: 8px;
	margin: 5px 0;
	box-sizing: border-box;
	border: 1px solid #ddd;
	border-radius: 4px;
}

input[type="submit"] {
	background-color: #007BFF;
	color: white;
	border: none;
	padding: 10px 15px;
	font-size: 14px;
	cursor: pointer;
	border-radius: 5px;
	transition: background-color 0.3s;
}

input[type="submit"]:hover {
	background-color: #0056b3;
}

input[type="submit"]:active {
	background-color: #003f7f;
}
</style>
<h1>Them San Pham</h1>

<form:form method="POST" action="/K22CNT2-LeHoangLong-2210900037/luu"
	modelAttribute="sanpham" enctype="multipart/form-data">
	<table>
		<tr>
			<td>Ten san pham:</td>
			<td><form:input path="lhl_tensp" /></td>
		</tr>
		<tr>
			<td>Danh Muc:</td>
			<td><form:textarea path="lhl_danhmuc" /></td>
		</tr>
		<tr>
			<td>Mo ta:</td>
			<td><form:textarea path="lhl_mota" /></td>
		</tr>
		<tr>
			<td>Gia:</td>
			<td><form:input path="lhl_gia" type="number" /></td>
		</tr>
		<tr>
			<td>Hinh anh:</td>
			<td><input type="file" name="file" /></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="luu" /></td>
		</tr>
	</table>
</form:form>

<br />
<a href="viewsanpham">Quay Lai</a>
