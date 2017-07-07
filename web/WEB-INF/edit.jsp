<%--
  Created by link.
  User: Administrator
  Date: 2017/4/6
  Time: 10:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>修改</title>
    <meta  http-equiv="Pragma" content="no-cache">
    <meta  http-equiv="Cache-Control" content="no-cache">
    <meta  http-equiv="Expires" content="0">
</head>
<body>
   <s:form action="/emp_update.action" method="POST" theme="simple">
       <!-- 修改操作：隐藏域保存主键值 -->
       <s:hidden id="id" name="id" value="%{id}"></s:hidden>
       <table border="1" cellpadding="5" cellspacing="0" align="center">
           <tr>
               <td>员工姓名</td>
               <td>
                   <s:textfield name="empName" id="empName"></s:textfield>
               </td>
           </tr>
           <tr>
               <td>员工薪水</td>
               <td>
                   <s:textfield name="salary" id="salary"></s:textfield>
               </td>
           </tr>

           <tr>
               <td>选择部门</td>
               <td>
                   <s:select name="deptId"
                              headerKey="-1"
                              headerValue="请选择"
                              list="#request.listDept"
                              listKey="id"
                              listValue="name"
                              value="dept.id">

                   </s:select>
               </td>
           </tr>

           <tr>
               <td colspan="2">
                   <s:submit value="修改员工"></s:submit>
               </td>
           </tr>
       </table>
   </s:form>
</body>
</html>
