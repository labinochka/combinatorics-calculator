<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>Размещения</title>
    <link rel="stylesheet" href="view/style.css">
</head>
<body>
<form method="post">
    <input name="n" type="number" placeholder="Введите n" value="${n!''}" required/>
    <br>
    <br>
    <input name="k" type="number" placeholder="Введите k" value="${k!''}" required/>
    <br>
    <br>
    <input type="checkbox" id="checkbox" name="checkbox" value="true"/>
    <label style="color: white; font-family: Arial" for="checkbox">С повторениями</label>
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