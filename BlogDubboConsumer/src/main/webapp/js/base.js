function setTime() {
	var today= new  Date();
	var h= today.getHours();
	var m= today.getMinutes();
	var s= today.getSeconds();
	m= checkTime(m);
	s= checkTime(s);
	document.getElementById('three').innerHTML = h+ ":" +m+ ":" + s;
	t= setTimeout(function() {setTime()},500);
	
}

function checkTime(i) {
	if( i< 10) {
		i= "0"+ i;
	}
	return i;
}

window.onload= function() {
	setTime();
}








// 获取弹窗
var modal = document.getElementById('myModal');
 
// 获取图片插入到弹窗 - 使用 "alt" 属性作为文本部分的内容
var img = document.getElementById('myImg');
var modalImg = document.getElementById("img01");
var captionText = document.getElementById("caption");
img.onclick = function(){
    modal.style.display = "block";
    modalImg.src = this.src;
    captionText.innerHTML = this.alt;
}
 
// 获取 <span> 元素，设置关闭按钮
var span = document.getElementsByClassName("close")[0];
 
// 当点击 (x), 关闭弹窗
span.onclick = function() { 
  modal.style.display = "none";
}