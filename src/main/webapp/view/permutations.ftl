<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>Перестановки</title>
    <link rel="stylesheet" href="view/style.css">
</head>
<body>
<form method="post">
    <input name="n" type="number" placeholder="Введите n"/>
    <br>
    <br>
    <input type="text" id="input" placeholder="Введите n1 n2..">
    <p style="color: white; font-family: Arial">Если необходимо, через пробел</p>
    <br>
    <button class="glow-on-hover" type="submit">Посчитать</button>
    <p style="color: white; font-family: Arial">Ответ: ${message!''}</p>
    <a href="/CombinatoricsCalculator">
        <button class="glow-on-hover" type="button">Назад</button>
    </a>
</form>
</body>
</html>