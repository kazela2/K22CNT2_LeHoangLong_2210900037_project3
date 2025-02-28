<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Project 3</title>
<style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f9f9f9;
            color: #333;
        }
        .header {
            background-color: #007bff;
            color: white;
            padding: 20px;
            text-align: center;
        }
        .header h1 {
            margin: 0;
            font-size: 24px;
        }
        .content {
            padding: 20px;
            text-align: center;
        }
        .content p {
            font-size: 18px;
            color: #555;
        }
        a {
            display: inline-block;
            margin: 20px auto;
            padding: 10px 20px;
            background-color: #28a745;
            color: white;
            text-decoration: none;
            border-radius: 5px;
            font-size: 16px;
        }
        a:hover {
            background-color: #218838;
        }
        .footer {
            background-color: #f1f1f1;
            text-align: center;
            padding: 10px 0;
            position: fixed;
            bottom: 0;
            width: 100%;
            font-size: 14px;
            color: #555;
        }
    </style>
</head>
<body>
    <div class="header">
        <h1>Xin Chao Nguoi Anh Em</h1>
    </div>
    <div class="content">
        <% 
            // Xử lý mã Java
            String message = "Hello, Bro!";
            out.print("<p>" + message + "</p>");
        %>
       
        <a href="viewsanpham">Den Trang San Pham</a>
        <a href="viewkhachhang">Den Trang khach hang</a>
        <a href="viewsanpham">Den Trang San Pham</a>
    </div>
    <div class="footer">
        <p>&copy; 2210900037 Le Hoang Long</p>
    </div>
</body>
</html>