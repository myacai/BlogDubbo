<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\3\30 0030
  Time: 19:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html lang="zh" >
<head>
    <meta charset="UTF-8">
    <meta content="text/html; charset=utf-8" http-equiv="Content-Type">
    <title>${courseVideo.title}</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="description" content="">
    <meta name="generator" content="GitBook 3.2.3">
    <meta name="author" content="Germey">



    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/coure/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/coure/plugin.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/coure/website.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/coure/search.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/coure/website2.css">

    <meta name="HandheldFriendly" content="true"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <!--
    <link rel="apple-touch-icon-precomposed" sizes="152x152" href="gitbook/images/apple-touch-icon-precomposed-152.png">
    <link rel="shortcut icon" href="gitbook/images/favicon.ico" type="image/x-icon">
-->

    <link rel="next" href="" />


    <link rel="prev" href="" />




    <link href="${pageContext.request.contextPath}/css/coureVideo/video-js.min.css" rel="stylesheet">
    <style>
        body{background-color: #191919}
        .m{ width: 740px; height: 400px; margin-left: auto; margin-right: auto; margin-top: 100px; }
    </style>


</head>
<body>

<div class="book">
    <div class="book-summary">


        <div id="book-search-input" role="search">
            <input type="text" placeholder="輸入並搜尋" />
        </div>


        <nav role="navigation">



            <ul class="summary">


                <li>
                    <a href="/"class="custom-link">首页</a>
                </li>
                <!--{{ courseVideoTitle.title }}-->
                <li>
                    <a href="" target="_blank" class="custom-link">${courseVideo.title}</a>
                </li>




                <li class="divider"></li>








                <c:forEach items="${courseVideoLists}" var="course">

                    <li class="chapter " data-level="1.2" data-path="0-目录.html">

                        <a href="/courseVideo?id=${course.coursevideoTitleId}&v=${course.courseOrder}" onclick="setTimeout(function () {window.location.reload();}, 1000);">


                                ${course.catalog}

                        </a>



                    </li>


                </c:forEach>


                <li class="divider"></li>

                <li>
                    <a href="https://www.gitbook.com" target="blank" class="gitbook-link">
                        本書使用 GitBook 釋出
                    </a>
                </li>
            </ul>


        </nav>


    </div>

    <div class="book-body">

        <div class="body-inner">



            <div class="book-header" role="navigation">


                <!-- Title
                <h1>
                    <i class="fa fa-circle-o-notch fa-spin"></i>
                    <a href="." >1.2.5-PhantomJS的安装</a>
                </h1>-->
            </div>




            <div class="page-wrapper" tabindex="-1" role="main">
                <div class="page-inner">

                    <div id="book-search-results">
                        <div class="search-noresults">

                            <section class="normal markdown-section">




                                <div class="m">
                                    <video id="my-video" class="video-js" controls preload="auto" width="740" height="400"
                                           data-setup="{}" src="${pageContext.request.contextPath}/mp4/python/第一个python程序与数据存储02.mp4">
                                        <source src="${pageContext.request.contextPath}/mp4/python/第一个python程序与数据存储02.mp4" type="video/mp4">
                                        <p class="vjs-no-js">
                                            To view this video please enable JavaScript, and consider upgrading to a web browser that
                                            <a href="${pageContext.request.contextPath}/mp4/python/第一个python程序与数据存储02.mp4" target="_blank">supports HTML5 video</a>
                                        </p>
                                    </video>


                                    <div class="commentstitle"><h3 id="comments"><span class="commentsnumber">only 1 comment</span> untill now</h3></div>

                                    <script src="${pageContext.request.contextPath}/js/coureVideo/video.min.js"></script>
                                    <script type="text/javascript">
                                        var myPlayer = videojs('my-video');
                                        videojs("my-video").ready(function(){
                                            var myPlayer = this;
                                            myPlayer.play();
                                        });
                                    </script>
                                </div>










                            </section>

                        </div>
                        <div class="search-results">
                            <div class="has-results">

                                <h1 class="search-results-title"><span class='search-results-count'></span> results matching "<span class='search-query'></span>"</h1>
                                <ul class="search-results-list"></ul>

                            </div>
                            <div class="no-results">

                                <h1 class="search-results-title">No results matching "<span class='search-query'></span>"</h1>

                            </div>
                        </div>
                    </div>

                </div>
            </div>

        </div>



        <a href="1.2.4-GeckoDriver的安装.html" class="navigation navigation-prev " aria-label="Previous page: 1.2.4-GeckoDriver的安装">
            <i class="fa fa-angle-left"></i>
        </a>


        <a href="1.2.6-Aiohttp的安装.html" class="navigation navigation-next " aria-label="Next page: 1.2.6-Aiohttp的安装">
            <i class="fa fa-angle-right"></i>
        </a>



    </div>

    <script>
        var gitbook = gitbook || [];
        gitbook.push(function() {
            gitbook.page.hasChanged({"page":{"title":"1.2.5-PhantomJS的安装","level":"1.10","depth":1,"next":{"title":"1.2.6-Aiohttp的安装","level":"1.11","depth":1,"path":"1.2.6-Aiohttp的安装.md","ref":"1.2.6-Aiohttp的安装.md","articles":[]},"previous":{"title":"1.2.4-GeckoDriver的安装","level":"1.9","depth":1,"path":"1.2.4-GeckoDriver的安装.md","ref":"1.2.4-GeckoDriver的安装.md","articles":[]},"dir":"ltr"},"config":{"plugins":["comment"],"styles":{"website":"styles/website.css","pdf":"styles/pdf.css","epub":"styles/epub.css","mobi":"styles/mobi.css","ebook":"styles/ebook.css","print":"styles/print.css"},"pluginsConfig":{"comment":{"highlightCommented":true},"highlight":{},"search":{},"lunr":{"maxIndexSize":1000000,"ignoreSpecialCharacters":false},"sharing":{"facebook":true,"twitter":true,"google":false,"weibo":false,"instapaper":false,"vk":false,"all":["facebook","google","twitter","weibo","instapaper"]},"fontsettings":{"theme":"white","family":"sans","size":2},"theme-default":{"styles":{"website":"styles/website.css","pdf":"styles/pdf.css","epub":"styles/epub.css","mobi":"styles/mobi.css","ebook":"styles/ebook.css","print":"styles/print.css"},"showLevel":false}},"github":"Germey/Python3WebSpider","theme":"default","author":"Germey","pdf":{"pageNumbers":true,"fontSize":16,"fontFamily":"Arial","paperSize":"a4","chapterMark":"pagebreak","pageBreaksBefore":"/","margin":{"right":62,"left":62,"top":56,"bottom":56}},"structure":{"langs":"LANGS.md","readme":"README.md","glossary":"GLOSSARY.md","summary":"SUMMARY.md"},"variables":{},"title":"Python3网络爬虫开发实战","language":"zh","links":{"sidebar":{"Python3网络爬虫开发实战":"https://legacy.gitbook.com/book/germey/python3webspider"},"gitbook":true},"gitbook":"*","description":"本书通过大量实战案例详细介绍了Python3网络爬虫的要点。"},"file":{"path":"1.2.5-PhantomJS的安装.md","mtime":"2018-04-14T15:42:38.000Z","type":"markdown"},"gitbook":{"version":"3.2.3","time":"2018-04-14T16:04:31.732Z"},"basePath":".","book":{"language":""}});
        });
    </script>
</div>


<script src="${pageContext.request.contextPath}/js/coure/gitbook.js"></script>
<script src="${pageContext.request.contextPath}/js/coure/theme.js"></script>


<script src="${pageContext.request.contextPath}/js/coure/plugin.js"></script>



<script src="${pageContext.request.contextPath}/js/coure/search-engine.js"></script>



<script src="${pageContext.request.contextPath}/js/coure/search.js"></script>



<script src="${pageContext.request.contextPath}/js/coure/lunr.min.js"></script>



<script src="${pageContext.request.contextPath}/js/coure/search-lunr.js"></script>



<script src="${pageContext.request.contextPath}/js/coure/buttons.js"></script>



<script src="${pageContext.request.contextPath}/js/coure/fontsettings.js"></script>




<div><script style="display: none;" type="application/javascript">
    (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
        (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
            m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
    })(window,document,'script','https://www.google-analytics.com/analytics.js','ga');

    ga('create', 'UA-57505611-7', 'auto', {name: 'microcdn'});
    ga('microcdn.send', 'pageview');

    var _cdn_prev_loc = window.location.pathname;
    window.setInterval(function () {
        if (window.location.pathname !== _cdn_prev_loc) {
            _cdn_prev_loc = window.location.pathname;
            ga('microcdn.send', 'pageview');
        }
    }, 100);

</script></div>
</body>
</html>

