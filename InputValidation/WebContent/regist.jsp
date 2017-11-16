<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>注册界面</title>
</head>
<body>
     <s:debug></s:debug>
	<s:form action="book" method="post" theme="simple">
  书名: <s:textfield name="bookname" label="书名" labelpostition="top"></s:textfield>
		<br>
		<p><font color="#DC143C"><s:fielderror >
			   <s:param> bookname</s:param>
		</s:fielderror> </font></p>
		<br>
  作者: <s:textfield name="author"></s:textfield>
  <p><font color="#DC143C"><s:fielderror >
			   <s:param>author</s:param>
		</s:fielderror> </font></p>
    书号:<s:textfield name="isbn"></s:textfield>
    出版社:<s:textfield name="publisher"></s:textfield>
 		<p><font color="#DC143C"><s:fielderror >
			   <s:param>publish</s:param>
		</s:fielderror> </font></p>
  出版日期:<s:textfield name="date"></s:textfield>
  <p><font color="#DC143C"><s:fielderror >
			   <s:param>date</s:param>
		</s:fielderror> </font></p>
     价格:<s:textfield name="price" ></s:textfield>
 		<p><font color="#DC143C"><s:fielderror >
			   <s:param>price</s:param>
		</s:fielderror></font></p>
   库存:<s:textfield name="stock" ></s:textfield> 
      <p><font color="#DC143C"><s:fielderror >
		  <s:param>stock</s:param>
		</s:fielderror> </font></p>
	<s:submit value="提交"></s:submit>
 	</s:form>
</body>
</html>