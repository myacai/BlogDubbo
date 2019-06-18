<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="baidu-site-verification" content="Eg9tVrHSEK" />
		<title>浮动区块</title>                                  
		
		<script type="text/javascript"  src="${pageContext.request.contextPath}/js/base.js"></script>
		<link rel="stylesheet"  href="${pageContext.request.contextPath}/css/demo.css">
		<link rel="stylesheet"  href="${pageContext.request.contextPath}/css/content.css">
	</head>
	<body>
		<div id="container">
			<div id= "head">
				<div id="one">
						<a  href="#"><img src="../images/logo.png"></img></a>
				</div>
				
				<div id= "two">
				
				</div>
				
				<div id= "three">
				
				</div>
				<div class="t"></div>
				<div id="four">
					<ul>
						<li><a href="#home">Home</a></li>
						<li><a href="#news">News</a></li>
						<li><a href="#contact">Contact</a></li>
						<li><a href="#about">About</a></li>
						<div class="dropdown">
							<a href="#" class="dropbtn">下拉菜单</a>
							<div class="dropdown-content">
								<a href="#">链接 1</a>
								<a href="#">链接 2</a>
								<a href="#">链接 3</a>
							</div>
						</div>
					</ul>
				</div>
			</div>
			
			<div class="t"></div>
			
			<div id="content">
				<div class="main">
					<div class="left">
						
						<img id="myImg" src="../images/1.jpg" alt="文本描述信息" width="300" height="180">
 
						<!-- 弹窗 -->
						<div id="myModal" class="modal">
 
						<!-- 关闭按钮 -->
						<span class="close" onclick="document.getElementById('myModal').style.display='none'">&times;</span>
 
						<!-- 弹窗内容 -->
						<img class="modal-content" id="img01">
 
						<!-- 文本描述 -->
						<div id="caption"></div>
					</div>
						
						
					</div>
					
					<div class="right">
					
					</div>
				
					<div class="t"></div>
				
					<div class="left">
					
					</div>
					
					<div class="right">
					
					</div>
					
					
				</div>
				
				<div class="barside barside_h1">
				
				</div>
				
				<div class="t"></div>
				
				<div class="ad1">
					<ul class="pagination modal-1">
						<li><a href="#" class="prev">
							
							Previous
								</a>
						</li>
						<li><a href="#">1</a></li>
						<li> <a href="#">2</a></li>
						<li> <a href="#">3</a></li>
						<li> <a href="#">4</a></li>
						<li> <a href="#" class="active">5</a></li>
						<li> <a href="#">6</a></li>
						<li> <a href="#">7</a></li>
						<li><a href="#" class="next"> Next 
							</a></li>
					</ul>
				</div>
				
				
				<div class="t"></div>
				
				<div class="main">
					<div class="left">
					
					</div>
					
					<div class="right">
					
					</div>
				
					<div class="t"></div>
				
					<div class="left">
					
					</div>
					
					<div class="right">
					
					</div>
					
					<div class="t"></div>
					
					<div class="left">
					
					</div>
					
					<div class="right">
					
					</div>
				</div>
				
				<div class="barside barside_h2">
				
				</div>
				
				<div class="t"></div>
				
				<div class="ad2"></div>
				
			</div>
			
			<div class="t"></div>
			
			<div id="foot">
			
			</div>
			
		</div>
	</body>
</html>
