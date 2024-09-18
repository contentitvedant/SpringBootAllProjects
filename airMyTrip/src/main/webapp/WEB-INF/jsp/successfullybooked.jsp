<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
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
            color: darkslategray;
        }
        h1 {
            font-size: 48px;
            opacity: 0;
            transform: translateY(50px);
            animation: fadeInUp 2s ease forwards;
        }

        @keyframes fadeInUp {
            0% {
                opacity: 0;
                transform: translateY(50px);
            }
            100% {
                opacity: 1;
                transform: translateY(0);
            }
        }
    </style>
</head>
<body>
    <h1>Successfully booked...</h1>
</body>