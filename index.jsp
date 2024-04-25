<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        .container {
            background-color: #fff;
            max-width: 400px;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ddd;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            margin-top: 100px;
        }

        h2 {
            text-align: center;
            margin-bottom: 20px;
        }

        .form-group {
            margin-bottom: 20px;
        }

        label {
            display: block;
            font-weight: bold;
        }

        input[type="text"],
        input[type="email"],
        input[type="password"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        .btn {
            background-color: #007BFF;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        .btn:hover {
            background-color: #0056b3;
        }
</style>
<body>
<div class="container">
        <h2>Registration Form</h2>
        <form action="savedata" method="POST">
            <div class="form-group">
                <label for="name">Name:</label>
                <input type="text"  name="aname" placeholder="Enter name" required>
            </div>
           
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="text"  name="aemail" placeholder="Enter email" required>
            </div>
            
             
             <div class="form-group">
                <label for="email">Password:</label>
                <input type="text"  name="apass" placeholder="Enter password" required>
            </div>
            
            <button type="submit" class="btn">Register</button>
           
</form>
</div> 


</body>
</html>