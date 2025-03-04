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

form {
    background-color: white;
    padding: 20px;
    box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.1);
    border-radius: 8px;
}

table {
    width: 100%;
}

td {
    padding: 10px;
}

td:first-child {
    font-weight: bold;
    color: #555;
}

form:input, form:textarea, input[type="file"] {
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

a {
    display: inline-block;
    margin-top: 15px;
    text-decoration: none;
    color: #007BFF;
    padding: 8px 12px;
    border: 1px solid #007BFF;
    border-radius: 5px;
    transition: 0.3s;
}

a:hover {
    background-color: #007BFF;
    color: white;
}
</style>

<h1>Them San Pham</h1>
<c:if test="${not empty errorMessage}">
    <div style="color: red; font-weight: bold;">
        ${errorMessage}
    </div>
</c:if>

<form:form method="POST" action="them" modelAttribute="user" enctype="multipart/form-data">
    <table>
        <tr>
            <td>Ten san pham:</td>
            <td><form:input path="lhl_tensp" /></td>
        </tr>
        <tr>
            <td>Danh muc:</td>
            <td><form:input path="lhl_danhmuc" /></td>
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
            <td></td>
            <td><input type="submit" value="Luu" /></td>
        </tr>
    </table>
</form:form>

<a href="viewsanpham">Quay Lai</a>
