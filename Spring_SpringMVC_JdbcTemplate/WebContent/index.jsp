<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>学生管理系统</title>
<script type="text/javascript" src="../js/jquery.1.4.2-min.js"></script>
<script type="text/javascript" src="../js/search.js"></script>
<style type="text/css">
a{
	text-decoration:none;
}

a:HOVER{
	text-decoration:underline;
	color:green;	
}

*{margin:0;padding:0;list-style-type:none;}
a,img{border:0;}
body{font:12px/180% Arial, Helvetica, sans-serif，"新宋体";}
/* searchbox */
.searchbox{background:#3366cc;height:28px;width:720px;margin:20px auto;padding:7px 0 0 10px;width:380px;}
#keyword{float:left;height:21px;line-height:21px;border:none;padding:0px;}
#searchsort{float:left;position:relative;display:none;width:66px;overflow:hidden;height:21px;background-color:#fff;font-size:12px;}
#searchsort .selectedsort{height:17px;padding-top:4px;color:#555;line-height:1;text-align:center;white-space:nowrap;}
#searchsort .searchsortlist{position:absolute;text-align:left;width:64px;display:none;background-color:#fff;box-shadow:1px 1px 1px rgba(0,0,0,0.3);left:1px;top:21px;border:1px solid #ccc;border-top:none;color:#555;}
#searchsort .sortico{width:7px;height:4px;display:inline-block;font-size:0px;vertical-align:middle;margin-left:3px;background:url(images/searchIco.png) no-repeat;}
#searchsort .searchItem{height:21px;line-height:21px;padding-left:4px;cursor:pointer;}
#searchbtn{float:left;display:inline;margin:0px 0px 0px 3px;width:62px;height:23px;border:none;cursor:pointer;padding:0px;background:url(images/kwbtn.jpg) no-repeat;}  
</style>
</head>
<body>
<!--演示内容开始-->
<font color="blue" size="3">
<p align="right">欢迎
${Admin.a_name}
管理员</p>
</font>
<form action="${pageContext.request.contextPath}/find/findById.action" method="post" >
<div class="searchbox">
	<input id="keyword" type="text" style="width:228px" placeholder="条件查询" name="stu_id"/>
	<div id="searchsort" style="width:0px;">
		<div class="selectedsort">
			<span class="itemName" id="itemName" name="itemName">全部</span>
			<span class="sortico"></span>
		</div>
		<div class="searchsortlist">
			<div class="searchItem on">全部</div>
			<div class="searchItem">按ID查</div>
			<div class="searchItem">按复杂条件查</div>
		</div>
	</div>
	<input type="submit" id="searchbtn" value="" />
</div>
</form>
<br/><br/>
<center>
<!-- 学生管理系统 -->
<a href="${pageContext.request.contextPath}/find/findAll.action"><font color="slateblue" face="楷体" size="4">查询所有学生信息</font></a>
</center>
<br/>
<center>
<a href="${pageContext.request.contextPath}/jsp/add/insert.jsp"><font color="slateblue" face="楷体" size="4">添加学生信息</font></a>
</center>
<br/>
<center>
<a href="${pageContext.request.contextPath}/preDelete.action"><font color="slateblue" face="楷体" size="4">删除学生信息</font></a>
</center>
<br/>
<center>
<a href="${pageContext.request.contextPath}/jsp/update/update.jsp"><font color="slateblue" face="楷体" size="4">修改学生信息</font></a>
</center>
<script type="text/javascript">nipicIndexSearch();</script>
<!--演示内容结束-->
<div style="text-align:center;clear:both"><br>	<br>	<br>	<br>	<br>	<br>	<br>	<br>	<br>	<br>	
<br>	
<p>来源：<a href="#">学生管理系统</a></p>
</div>
</body>
</html>