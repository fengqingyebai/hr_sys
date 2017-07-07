<%--
  Created by link.
  Date: 2017/4/6
  Time: 9:11
  --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>添加</title>
    <meta http-equiv="Pragma" content="no-cache">
    <meta http-equiv="Cache-Control" content="no-cache">
    <meta http-equiv="Expires" content="0">
</head>
<body>
    <s:form action="/emp_save.action" method="POST" theme="simple">
        <table border="1" cellspacing="0" cellpadding="5" align="center">
            <tr>
                <td>员工姓名</td>
                <td>
                    <s:textfield name="empName" id="empName" value=""></s:textfield>
                </td>
            </tr>
            <tr>
                <td>员工薪水</td>
                <td>
                    <s:textfield name="salary" id="salary" value=""></s:textfield>
                </td>
            </tr>

            <tr>
                <td>选择部门</td>
                <td>
                    <!-- 传统的html标签
  	 			<select name="deptId">
  	 				<option value="-1">请选择</option>
  	 				<option value="1">开发部</option> 循环迭代  s:iterator value="#request.listDept"
  	 			</select>
  	 			 -->
                <!--
                    Struts下拉列表标签：
                        name="deptId"  下拉列表标签的名称(服务器根据这个名称获取选择的项的实际的值value值)
                        headerKey   默认选择项的实际的值
                        headerValue  默认下拉列表显示的内容
                        list      下拉列表显示数据的集合
                        listKey    集合对象的哪个属性作为下拉列表的实例的值，即value值
                        listValue  集合对象的哪个属性作为下拉列表显示的值
                        value      默认选择的项的设置
                 -->


                    <s:select
                            name="deptId"
                            headerKey="-1"
                            headerValue="请选择"
                            list="#request.listDept"
                            listKey="id"
                            listValue="name"
                            value="-1"
                    ></s:select>


                </td>
            </tr>

            <tr>
                <td colspan="2">
                    <s:submit value="添加员工"></s:submit>
                </td>
            </tr>
        </table>
    </s:form>
</body>
</html>
