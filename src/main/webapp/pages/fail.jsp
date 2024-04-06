<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Booking Confirmation</title>
    <style>
      
        body
        {
            background-color: grey;
            margin-top: 15%;

        }
        .confirmation {
            background-color: #fff;
            color: #fff;
            padding: 15px;
            text-align: center;
            border-radius: 5px;
            margin: 20px auto;
            margin-bottom:5vh;
            max-width: 309px;

        }
        p{
            color: black;
            font-size: 18px;
            font-family: Verdana, Geneva, Tahoma, sans-serif;
        }
        h2{
            color: black;
            font-size: 30px;
            justify-content: center;
            
        }
        button
        {
           width: 150px;
           height: 40px;
           border-radius: 10px;
           background-color: red;
           color :#fff;
           border-color: red;
           margin-bottom: 20px;
           margin-top: 10px;
          
        }
        img
        {
            width: 20%;
        }
    </style>
</head>
<body>
    <div class="confirmation">
        <img src="images/remove.png">
        <h2>Failed!</h1>
        <p> The room you have booked for is unavailable in this particular date</p>
        <p>Please try again in later date</p>
        <button onclick="window.location.href='index.jsp'">OK</button>
    </div>


    </script>
</body>
</html>
    