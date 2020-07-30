<%--
  Created by IntelliJ IDEA.
  User: 25072
  Date: 2020/7/28
  Time: 17:27
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>newCustomer</title>
    <link rel="stylesheet" href="layui/css/layui.css"  media="all">
</head>
<body>
<%--@elvariable id="customer" type="com.ted.pojo.Customer"--%>
<f:form action="SaveCustomer" method="post" modelAttribute="customer" class="layui-form">
    <div class="layui-form-item">
        <label class="layui-form-label">用户名</label>
        <div class="layui-input-block">
                <f:input path="username" type="text" placeholder="请输入名称" class="layui-input"/>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">密码</label>
        <div class="layui-input-block">
            <f:input path="password" type="password" placeholder="请输入密码" class="layui-input"/>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">公司名称</label>
        <div class="layui-input-block">
            <f:input path="nickname" type="text" placeholder="请输入名称" class="layui-input"/>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">账户余额</label>
        <div class="layui-input-block">
            <f:input path="money" type="number" placeholder="请输入余额" class="layui-input"/>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">地址</label>
        <div class="layui-input-block">
            <f:input path="address" type="text" placeholder="请输入地址" class="layui-input"/>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">状态</label>
        <div class="layui-input-block">
            <f:input path="state" type="number" placeholder="请输入状态" class="layui-input"/>
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button type="submit" class="layui-btn">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
<%--    password:<f:input path="password" type="password"/></p>--%>
<%--    nickname:<f:input path="nickname" type="text"/></p>--%>
<%--    money:<f:input path="money" type="number"/></p>--%>
<%--    address:<f:input path="address" type="text"/></p>--%>
<%--    state:<f:input path="state" type="number"/></p>--%>
</f:form>

<script src="layui/layui.js"></script>


</body>
</html>
