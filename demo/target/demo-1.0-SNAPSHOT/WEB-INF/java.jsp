<%--
  Created by IntelliJ IDEA.
  User: bala-pt6120
  Date: 21-10-2022
  Time: 13:48
  To change this template use File | Settings | File Templates.
--%>
<html>
<body>
<jsp:useBean id="students" class="com.example.demo.bean">
    <jsp:setProperty name ="students" property=
            "name" value="Bala"/>
    <jsp:setProperty name="students" property ="age" value="19"/>
</jsp:useBean>
<p>
    <jsp:getProperty name="students" property="name"/>
</p>
<p>
    <jsp:getProperty name="students" property="age"/>
</p>
</body>
<html>


