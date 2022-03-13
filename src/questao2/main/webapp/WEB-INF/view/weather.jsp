
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html style="color: slategrey">
<head>
    <title>Login</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
</head>
<body >
    <div class = "container" style="text-align-all: center">
        <div class="two-column-summary">
            <div >
                <form action="api/weather/json" method="POST" accept-charset="ISO-8859-1">
                    <div class="form-group">
                        <hr color="silver">
                        <h2>Preview: Json</h2>
                    </div>
                    <div class="form-group">
                        <label>Cidade: </label>
                        <input type="text" class="form-control" name="city" placeholder="Digite cidade" required>
                    </div>
                    <div class="form-group">
                        <label>Dias de previsão: </label>
                        <input type="text" class="form-control" name="days" placeholder="Quantos dias quer saber de previsão?" required>
                    </div>

                    <div class="form-group">
                        <hr color="silver">
                        <button type="submit" class="btn btn-success">Register</button>
                    </div>
                </form>
                <form action="api/weather/html" method="POST" accept-charset="ISO-8859-1">
                    <div class="form-group">
                        <hr color="silver">
                        <h2>Preview: Html</h2>
                    </div>
                    <div class="form-group">
                        <label>Cidade: </label>
                        <input type="text" class="form-control" name="city" placeholder="Digite cidade" required>
                    </div>
                    <div class="form-group">
                        <label>Dias de previsão: </label>
                        <input type="text" class="form-control" name="days" placeholder="Quantos dias quer saber de previsão?" required>
                    </div>
                    <div class="form-group">
                        <hr color="silver">
                        <button type="submit" class="btn btn-success">Register</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>
</html>
