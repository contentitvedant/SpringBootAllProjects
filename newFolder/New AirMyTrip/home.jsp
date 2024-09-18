<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/js/all.min.js"
        integrity="sha512-6sSYJqDreZRZGkJ3b+YfdhB3MzmuP9R7X1QZ6g5aIXhRvR1Y/N/P47jmnkENm7YL3oqsmI6AK+V6AD99uWDnIw=="
        crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <title>Home Page</title>
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100..900;1,100..900&display=swap');

        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: "Montserrat", sans-serif;
            list-style-type: none;
        }

        html, body {
            width: 100%;
            height: 100vh;
            background-image: linear-gradient(120deg, #a1c4fd 0%, #c2e9fb 100%);
        }

        section {
            padding: 20px 6%;
        }

        nav {
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        nav h1 {
            font-weight: 600;
        }

        ul>li {
            display: inline-block;
            margin: 0 20px;
            font-weight: 500;
            font-size: 12px;
            transition: all .2s;
            cursor: pointer;
        }

        ul>li:hover {
            transform: scale(1.1);
            color: #055ebe;
        }

        nav>button {
            padding: 10px 20px;
            border-radius: 20px;
            border: none;
            font-weight: 500;
            background-color: #055ebe;
            color: #fff;
            transition: all .2s;
        }

        .dashboard {
            display: flex;
            justify-content: space-between;
            align-items: center;
            gap: 40px;
            margin-top: 15%;
        }

        .dash-text {
            padding: 0 20px;
            width: auto;
            max-width: 300px;
            display: flex;
            flex-direction: column;
            text-align: center;
            gap: 50px;
        }

        .dash-main {
            position: relative;
            display: flex;
            flex-direction: column;
            align-items: center;
            gap: 20px;
        }

        .image1 {
            position: relative;
            width: 400px;
            height: 250px;
            border-radius: 20px;
            z-index: 1;
            box-shadow: rgba(0, 0, 0, 0.1) 0px 10px 15px -3px, rgba(0, 0, 0, 0.05) 0px 4px 6px -2px;
        }

        .image2 {
            width: auto;
            height: 280px;
            position: absolute;
            transform: translate(-10%, -40%);
            z-index: 2;
        }

        a {
            text-decoration: none;
            color: #000;
        }

        .dash-main button {
            padding: 15px 20px;
            font-size: 1rem;
            font-weight: 500;
            border: 0;
            border-radius: 30px;
            transition: all .3s;
            z-index: 2;
            cursor: pointer;
        }

        button:hover {
            transform: scale(1.1);
            background-color: #3d495d;
            color: #fff;
            box-shadow: rgba(0, 0, 0, .3) 2px 8px 8px -5px;
            transform: translate3d(0, -2px, 0);
        }

        .button:focus {
            box-shadow: rgba(0, 0, 0, .3) 2px 8px 4px -6px;
        }

        .fa-bluesky {
            margin-right: 10px;
        }

        .dash-text p {
            padding: 20px;
            background-color: #f5f9fa;
            border-radius: 10px;
            font-size: 14px;
        }
    </style>
</head>

<body>
    <section>
        <!-- navbar  -->
        <nav>
            <h1>AirMyTrip</h1>
            <ul>
                <li>About</li>
                <li>Contact Us</li>
                <li>Feedback</li>
            </ul>
            <button>Book</button>
        </nav>
        <!-- Dashboard  -->
        <div class="dashboard">
            <div class="dash-text">
                <h2>24/7 Support</h2>
                <i class="fa-solid fa-arrow-down-long"></i>
                <p>A customer experiences a flight delay while abroad and is worried about missing their connecting flight</p>
            </div>
            <div class="dash-main">
                <img class="image2" src="airplane.png" alt="">
                <img class="image1" src="bg-image.jpg" alt="">
                <a href="/flightReservationPage"><button><i class="fa-brands fa-bluesky"></i>Book A Trip</button></a>
            </div>
            <div class="dash-text">
                <h2> Personalized Travel</h2>
                <i class="fa-solid fa-arrow-down-long"></i>
                <p>A frequent traveler receives personalized recommendations for a long weekend getaway</p>
            </div>
        </div>
    </section>

</body>

</html>
