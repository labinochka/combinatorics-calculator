<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>Перестановки</title>
    <link rel="stylesheet" href="view/style.css">
</head>
<body>
<form method="post">
    <input name="n" type="number" placeholder="Введите n" value="${n!''}" required/>
    <br>
    <br>
    <input name="repetitions" id="repetitions" type="text" placeholder="Введите n1 n2 n3.." value="${repetitions!''}">
    <label style="color: white; font-family: Arial; float:right" for="repetitions">Если необходимо, через пробел</label>
    <br>
    <br>
    <button class="glow-on-hover" type="submit">Посчитать</button>
    <p style="color: white; font-family: Arial">Ответ: ${message!''}</p>
    <a href="/CombinatoricsCalculator">
        <button class="glow-on-hover" type="button">Назад</button>
    </a>
</form>
</body>
</html>