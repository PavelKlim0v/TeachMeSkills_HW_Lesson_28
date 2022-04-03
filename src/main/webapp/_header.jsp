<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Header</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
          crossorigin="anonymous">
</head>
<body>

    <nav class="navbar navbar-expand-lg navbar-black bg-black">
        <div class="container-fluid">

            <a class="navbar-brand" href="">Navbar</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
                    aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <c:if test="${user == null}">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="/authorization">Authorization</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/registration">Registration</a>
                        </li>
                    </c:if>
                    <c:if test="${user != null}">
                        <li class="nav-item">
                            <a class="nav-link" href="/history">History</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/calc">Calc</a>
                        </li>
                    </c:if>
                </ul>
            </div>
        </div>
    </nav>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous">
    </script>

</body>
</html>
