<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Flight Reservation</title>
    <link rel="stylesheet" href="styles.css"> <!-- Link to an external CSS file if needed -->
   <style>
        @import url('https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100..900;1,100..900&display=swap');

        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: "Montserrat", sans-serif;
            list-style-type: none;
        }

        html,
        body {
            width: 100%;
            height: 100vh;
            background-image: linear-gradient(120deg, #a1c4fd 0%, #c2e9fb 100%);
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .form-container {
            width: 500px;
            border-radius: 20px;
            background-color: #f2f2f2;
            padding: 30px;
            box-shadow: rgba(0, 0, 0, 0.04) 0px 3px 5px;
        }

        .form-container h2 {
            text-align: center;
            padding: 20px;
            color: #4582a0;
        }

        input[type=text],
        input[type=time],
        input[type=date],
        input[type=number] {
            font-size: 12px;
            width: 100%;
            padding: 12px 20px;
            border: 0;
            border-radius: 20px;
            box-sizing: border-box;
            margin-top: 6px;
            margin-bottom: 16px;
            resize: vertical;
            outline: none;
            box-shadow: rgba(0, 0, 0, 0.05) 0px 0px 0px 1px;
        }

        input[type=submit] {
            font-size: 12px;
            width: 100%;
            background-color: #63a4b8;
            color: white;
            padding: 12px 20px;
            border: none;
            border-radius: 20px;
            cursor: pointer;
            transition: all .2s;
            box-shadow: rgba(0, 0, 0, 0.05) 0px 0px 0px 1px;
        }

        input[type=submit]:hover {
            background-color: #4582a0;
            transform: scale(1.02) translateY(-2px);
        }
    </style>
</head>
<body>
  <div class="form-container">
        <h2>Flight Reservation</h2>
        <form action="/booked">
            <input type="text" id="passengerName" name="passengerName" placeholder="Passenger Name">

            <input type="text" id="departureTime" name="departureTime" placeholder="Departure Time"
                onfocus="(this.type='time')" onblur="(this.type='text')">

            <input type="text" id="arrivalTime" name="arrivalTime" placeholder="Arrival Time"
                onfocus="(this.type='time')" onblur="(this.type='text')">

            <input type="text" id="departureDate" name="departureDate" placeholder="Departure Date"
                onfocus="(this.type='date')" onblur="(this.type='text')">

            <input type="text" id="arrivalDate" name="arrivalDate" placeholder="Arrival Date"
                onfocus="(this.type='date')" onblur="(this.type='text')">

            <input type="number" id="passengerContact" name="arrivalTime" placeholder="Passenger Contact">

            <input type="submit" value="Submit">
        </form>
    </div>
</body>
</html>
