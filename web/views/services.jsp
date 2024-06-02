<%@ page contentType="text/html; charset = UTF-8" language="java" %>
<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>javaLab</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">


    <!-- Bootstrap core CSS -->

    <!-- Favicons -->
    <link rel="apple-touch-icon" href="/docs/5.0/assets/img/favicons/apple-touch-icon.png" sizes="180x180">
    <link rel="icon" href="/docs/5.0/assets/img/favicons/favicon-32x32.png" sizes="32x32" type="image/png">
    <link rel="icon" href="/docs/5.0/assets/img/favicons/favicon-16x16.png" sizes="16x16" type="image/png">
    <link rel="manifest" href="/docs/5.0/assets/img/favicons/manifest.json">
    <link rel="mask-icon" href="/docs/5.0/assets/img/favicons/safari-pinned-tab.svg" color="#7952b3">
    <link rel="icon" href="/docs/5.0/assets/img/favicons/favicon.ico">
    <meta name="theme-color" content="#7952b3">


    <style>
        .bd-placeholder-img {
            font-size: 1.125rem;
            text-anchor: middle;
            -webkit-user-select: none;
            -moz-user-select: none;
            user-select: none;
        }

        @media (min-width: 768px) {
            .bd-placeholder-img-lg {
                font-size: 3.5rem;
            }
        }
    </style>


</head>
<body>

<main>
    <div class="container py-4">
        <div class="container">
            <header class="d-flex flex-wrap justify-content-center py-3 mb-4 border-bottom">
                <a onclick="location.href='/index.html'" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto link-body-emphasis text-decoration-none">
                    <svg class="bi me-2" width="40" height="32"><use xlink:href="#bootstrap"></use></svg>
                    <span class="fs-4">ТКАНИ</span>
                </a>

                <ul class="nav nav-pills">
                    <!--                    <li class="nav-item"><a href="#" class="nav-link active" aria-current="page">Home</a></li>-->
                    <!--                    <li class="nav-item"><a href="#" class="nav-link">Features</a></li>-->
                    <!--                    <li class="nav-item"><a href="#" class="nav-link">Pricing</a></li>-->
                    <!--                    <li class="nav-item"><a href="#" class="nav-link">FAQs</a></li>-->
                    <!--                    <li class="nav-item"><a href="#" class="nav-link">About</a></li>-->

                    <li class="nav-item"><a onclick="location.href='/services'" class="nav-link">Каталог</a></li>
                    <li class="nav-item"><a  onclick="location.href='/contacts'" class="nav-link">Контакты</a></li>
                    <li class="nav-item"><a onclick="location.href='/aboutUs'" class="nav-link">О нас</a></li>
                    <li class="nav-item"><a onclick="location.href='/feedback'" class="nav-link">Обратная связь</a></li>
                </ul>
            </header>
        </div>
    <div class="container-fluid py-5">
        <div class="textiled mb-3" style="margin-bottom: 10px;">
            <div class="row g-0" >
                <div class="col-md-4" style=" background-image: url(/img/1.png);background-size: cover; overflow: hidden; ">
                    <%--<img src="/img/1.png" class="img-fluid rounded-start" alt="..." style="height: 300px;">--%>
                </div>
                <div class="col-md-8">
                    <div class="textiled-body">
                        <h5 class="textiled-title">Хлопчато-бумажная</h5>
                        <p class="textiled-text">Смотреть!</p>
                    </div>
                </div>
            </div>
        </div>
        <div class="textiled mb-3" style="margin-bottom: 10px;">
            <div class="row g-0">
                <div class="col-md-4" style=" background-image: url(/img/2.jpg);background-size: cover; overflow: hidden; ">
                    <%--<img src="/img/1.png" class="img-fluid rounded-start" alt="..." style="height: 300px;">--%>
                </div>
                <div class="col-md-8">
                    <div class="textiled-body">
                        <h5 class="textiled-title">Джинсовая</h5>
                        <p class="textiled-text">Смотреть!</p>
                    </div>
                </div>
            </div>
        </div>
        <div class="textiled mb-3" style="margin-bottom: 10px;">
            <div class="row g-0">
                <div class="col-md-4" style=" background-image: url(/img/3.jpg);background-size: cover; overflow: hidden; ">
                    <%--<img src="/img/1.png" class="img-fluid rounded-start" alt="..." style="height: 300px;">--%>
                </div>
                <div class="col-md-8">
                    <div class="textiled-body">
                        <h5 class="textiled-title">Костюмная</h5>
                        <p class="textiled-text">Смотреть!</p>
                    </div>
                </div>
            </div>
        </div>
        <div class="spinner-border" role="status" style="margin-left: auto; margin-right: auto">
            <span class="visually-hidden">Loading...</span>
        </div>
        <footer class="pt-3 mt-4 text-muted border-top">
            Сорокина ПИН-222
        </footer>
    </div>
    </div>

</main>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>