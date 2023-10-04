<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>Урновая модель</title>
    <link rel="stylesheet" href="view/style.css">
</head>
<body>
<form method="post">
    <input name="n" type="number" placeholder="Введите n" value="${n!''}" required/>
    <br>
    <br>
    <input name="m" type="number" placeholder="Введите m" value="${m!''}" required/>
    <br>
    <br>
    <input name="k" type="number" placeholder="Введите k" value="${k!''}" required/>
    <br>
    <br>
    <input name="r" id="r" type="text" placeholder="Введите r" value="${r!''}">
    <label style="color: white; font-family: Arial; float:right" for="r">Если необходимо</label>
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