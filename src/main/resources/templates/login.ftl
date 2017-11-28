<!doctype html>
<html>
<head>
    <title>登录</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/common.css">
    <link rel="stylesheet" href="css/login.css">

</head>
<body>
    <#include "header.ftl">

    <div class="container">
        <form class="login-win" action="/user/login" method="post">
            <div class="title">
                <span>登录</span>
            </div>
            <div class="content">
                <div class="input-group">
                    <label for="email">邮箱地址</label>
                    <input id="email" name="email" type="text" placeholder="请输入邮箱地址"/>
                </div>
                <div class="input-group">
                    <label for="pwd">密码</label>
                    <input id="pwd" name="pwd" type="text" placeholder="请输入登录密码"/>
                </div>

                <button>登录</button>
                <div class="tips">
                    <span>还没有账号？</span>
                    <a href="/register">立即注册</a>
                </div>
            </div>


        </form>

    </div>


</body>

</html>