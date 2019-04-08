<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>


  <link rel="shortcut icon"
        href="${pageContext.request.contextPath}/images/favicon.ico">
  <link href="${pageContext.request.contextPath}/css/font-awesome.css"
        rel="stylesheet">
  <link href="${pageContext.request.contextPath}/css/base.css" rel="stylesheet">
  <link href="${pageContext.request.contextPath}/css/index.css"
        rel="stylesheet">
  <link href="${pageContext.request.contextPath}/css/m.css" rel="stylesheet">
  <script
          src="https://hm.baidu.com/hm.js?f655f558c510211e38805f6b586e6b15"></script>
  <script
          src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
  <script src="${pageContext.request.contextPath}/js/comm.js"></script>
  <style>
    * {
      cursor: url('${pageContext.request.contextPath}/images/ani/a.cur'), auto;
    }

    a {
      cursor: url('${pageContext.request.contextPath}/images/ani/b.cur'), auto;
    }
  </style>





  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/index/css/normalize.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/index/css/font-awesome/css/font-awesome.min.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/index/elegant_font/style.css" />
  <!--[if lte IE 7]><script src="elegant_font/lte-ie7.js"></script><![endif]-->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/index/css/magnific-popup.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/index/css/slider-pro.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/index/css/owl.carousel.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/index/css/owl.theme.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/index/css/owl.transitions.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/index/css/animate.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/index/elegant_font/style.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/index/css/style.css">

  <!--[if lt IE 9]>
  <script src="${pageContext.request.contextPath}/js/index/js/html5shiv.min.js"></script>
  <script src="${pageContext.request.contextPath}/js/index/js/hrespond.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/index/js/selectivizr.js"></script>
  <![endif]-->




  <style type="text/css">

    .mmm{
      background-color: #150f14
    }


    img.wp-smiley,
    img.emoji {
      display: inline !important;
      border: none !important;
      box-shadow: none !important;
      height: 1em !important;
      width: 1em !important;
      margin: 0 .07em !important;
      vertical-align: -0.1em !important;
      background: none !important;
      padding: 0 !important;
    }
  </style>

  <!--<link rel='stylesheet' id='sydney-fonts-css'  href='https://fonts.googleapis.com/css?family=Source+Sans+Pro%3A400%2C400italic%2C600%7CRaleway%3A400%2C500%2C600' type='text/css' media='all' />-->
  <!--<link rel='stylesheet' id='siteorigin-panels-front-css'  href='{% static 'css/index/style.css/front-flex.css?ver=2.5.4' %}' type='text/css' media='all' />-->
  <link rel='stylesheet' id='sydney-bootstrap-css'  href="${pageContext.request.contextPath}/css/bootstrap.min.css" type='text/css' media='all' />
  <link rel='stylesheet' id='contact-form-7-css'  href="${pageContext.request.contextPath}/css/index/styles.css" type='text/css' media='all' />
  <link rel='stylesheet' id='cf7cf-style-css'  href="${pageContext.request.contextPath}/css/index/style.css" type='text/css' media='all' />


  <link rel='stylesheet' id='sydney-style-css'  href="${pageContext.request.contextPath}/css/index/style2.css" type='text/css' media='all' />
  <style id='sydney-style-inline-css' type='text/css'>
    .site-title { font-size:32px; }
    .site-description { font-size:16px; }
    #mainnav ul li a { font-size:14px; }
    h1 { font-size:52px; }
    h2 { font-size:42px; }
    h3 { font-size:32px; }
    h4 { font-size:25px; }
    h5 { font-size:20px; }
    h6 { font-size:18px; }
    body { font-size:14px; }
    .header-image { background-size:cover;}
    .header-image { height:300px; }
    .widget-area .widget_fp_social a,#mainnav ul li a:hover, .sydney_contact_info_widget span, .roll-team .team-content .name,.roll-team .team-item .team-pop .team-social li:hover a,.roll-infomation li.address:before,.roll-infomation li.phone:before,.roll-infomation li.email:before,.roll-testimonials .name,.roll-button.border,.roll-button:hover,.roll-icon-list .icon i,.roll-icon-list .content h3 a:hover,.roll-icon-box.white .content h3 a,.roll-icon-box .icon i,.roll-icon-box .content h3 a:hover,.switcher-container .switcher-icon a:focus,.go-top:hover,.hentry .meta-post a:hover,#mainnav > ul > li > a.active, #mainnav > ul > li > a:hover, button:hover, input[type="button"]:hover, input[type="reset"]:hover, input[type="submit"]:hover, .text-color, .social-menu-widget a, .social-menu-widget a:hover, .archive .team-social li a, a, h1 a, h2 a, h3 a, h4 a, h5 a, h6 a { color:#08aba6}
    .project-filter li a.active, .project-filter li a:hover,.preloader .pre-bounce1, .preloader .pre-bounce2,.roll-team .team-item .team-pop,.roll-progress .progress-animate,.roll-socials li a:hover,.roll-project .project-item .project-pop,.roll-project .project-filter li.active,.roll-project .project-filter li:hover,.roll-button.light:hover,.roll-button.border:hover,.roll-button,.roll-icon-box.white .icon,.owl-theme .owl-controls .owl-page.active span,.owl-theme .owl-controls.clickable .owl-page:hover span,.go-top,.bottom .socials li:hover a,.sidebar .widget:before,.blog-pagination ul li.active,.blog-pagination ul li:hover a,.content-area .hentry:after,.text-slider .maintitle:after,.error-wrap #search-submit:hover,#mainnav .sub-menu li:hover > a,#mainnav ul li ul:after, button, input[type="button"], input[type="reset"], input[type="submit"], .panel-grid-cell .widget-title:after { background-color:#08aba6}
    .roll-socials li a:hover,.roll-socials li a,.roll-button.light:hover,.roll-button.border,.roll-button,.roll-icon-list .icon,.roll-icon-box .icon,.owl-theme .owl-controls .owl-page span,.comment .comment-detail,.widget-tags .tag-list a:hover,.blog-pagination ul li,.hentry blockquote,.error-wrap #search-submit:hover,textarea:focus,input[type="text"]:focus,input[type="password"]:focus,input[type="datetime"]:focus,input[type="datetime-local"]:focus,input[type="date"]:focus,input[type="month"]:focus,input[type="time"]:focus,input[type="week"]:focus,input[type="number"]:focus,input[type="email"]:focus,input[type="url"]:focus,input[type="search"]:focus,input[type="tel"]:focus,input[type="color"]:focus, button, input[type="button"], input[type="reset"], input[type="submit"], .archive .team-social li a { border-color:#08aba6}
    .site-header.float-header { background-color:rgba(0,0,0,0.9);}
    @media only screen and (max-width: 1024px) { .site-header { background-color:#000000;}}
    .site-title a, .site-title a:hover { color:#ffffff}
    .site-description { color:#ffffff}
    #mainnav ul li a, #mainnav ul li::before { color:#ffffff}
    #mainnav .sub-menu li a { color:#ffffff}
    #mainnav .sub-menu li a { background:#1c1c1c}
    .text-slider .maintitle, .text-slider .subtitle { color:#ffffff}
    body { color:#767676}
    #secondary { background-color:#ffffff}
    #secondary, #secondary a, #secondary .widget-title { color:#767676}
    .footer-widgets { background-color:#252525}
    .btn-menu { color:#ffffff}
    #mainnav ul li a:hover { color:#08aba6}
    .site-footer { background-color:#1c1c1c}
    .site-footer,.site-footer a { color:#666666}
    .overlay { background-color:#000000}
    .page-wrap { padding-top:83px;}
    .page-wrap { padding-bottom:100px;}
    @media only screen and (max-width: 1025px) {
      .mobile-slide {
        display: block;
      }
      .slide-item {
        background-image: none !important;
      }
      .header-slider {
      }
      .slide-item {
        height: auto !important;
      }
      .slide-inner {
        min-height: initial;
      }
    }

  </style>
  <link rel='stylesheet' id='sydney-font-awesome-css'  href="${pageContext.request.contextPath}/css/index/font-awesome.min.css"  type='text/css' media='all' />
  <!--[if lte IE 9]
  <link rel='stylesheet' id='sydney-ie9-css'  href='{% static 'css/index/ie9.css' %}ie9.css?ver=4.9.6' type='text/css' media='all' />

  [endif]
  <link rel='stylesheet' id='gem-base-css'  href="${pageContext.request.contextPath}/css/index/gem.min.cs"  type='text/css' media='all' />-->
  <script type='text/javascript' src='http://litta.co/wp-includes/js/jquery/jquery.js?ver=1.12.4'></script>
  <script type='text/javascript' src='http://litta.co/wp-includes/js/jquery/jquery-migrate.min.js?ver=1.4.1'></script>


  <style type="text/css">.recentcomments a{display:inline !important;padding:0 !important;margin:0 !important;}</style>































</head>

<div class="preloader">
  <div class="spinner">
    <div class="pre-bounce1"></div>
    <div class="pre-bounce2"></div>
  </div>
</div>

<div id="page" class="hfeed site">
  <a class="skip-link screen-reader-text" href="#content">Skip to content</a>


  <header id="masthead" class="site-header" role="banner">
    <div class="header-wrap">
      <div class="container">
        <div class="row">
          <div class="col-md-3 col-sm-8 col-xs-12">
            <!--a里面可以放图标-->
            <a href="http://litta.co/" title="London Waste Collection &#8211; Litta App"></a>
          </div>
          <div class="col-md-9 col-sm-4 col-xs-12">
            <div class="btn-menu"></div>
            <nav id="mainnav" class="mainnav" role="navigation">
              <div class="menu-primary-menu-container"><ul id="menu-primary-menu" class="menu"><li id="menu-item-581" class="scrollable menu-item menu-item-type-custom menu-item-object-custom menu-item-581"><a href="my">    联系我们</a></li>
                <li id="menu-item-169" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-169"><a href="">热门微视频</a>
                  <ul class="sub-menu">
                    <li id="menu-item-359" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-359"><a href="/courseVideo/?id=1&v=1">python基础</a></li>
                    <li id="menu-item-443" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-443"><a href="/courseVideo/?id=2&v=1">爬虫</a></li>
                    <li id="menu-item-442" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-442"><a href="/courseVideo/?id=3&v=1">Django</a></li>
                    <li id="menu-item-441" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-441"><a href="/courseVideo/?id=3&v=1">Tornado</a></li>
                    <li id="menu-item-441" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-441"><a href="/courseVideo/?id=3&v=1">Spring</a></li>
                    <li id="menu-item-440" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-440"><a href="/courseVideo/?id=1&v=1">Other Items</a></li>
                  </ul>
                </li>
                <li id="menu-item-322" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-322"><a href="remen">热门文章</a></li>
                <li id="menu-item-582" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-582"><a href="articleAdd">添加文章</a></li><!--
<li id="menu-item-237" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-237"><a href="">待定</a></li>
<li id="menu-item-166" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-166"><a href="">待定</a></li>-->
                <li id="menu-item-589" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-589"><a href="">文档查看</a>
                  <ul class="sub-menu">
                    <li id="menu-item-365" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-359"><a href="course/?id=1&v=1">python</a></li>
                    <li id="menu-item-451" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-443"><a href="course/?id=1&v=2">Django</a></li>

                  </ul>

                </li>
                <li id="menu-item-749" class="get-the-app menu-item menu-item-type-custom menu-item-object-custom menu-item-749"><a href="login">用户登陆</a></li>
                <li id="menu-item-745" class="get-the-app menu-item menu-item-type-custom menu-item-object-custom menu-item-745"><a href="admin">管理员登陆</a></li>
                <li id="menu-item-763" class="get-the-app menu-item menu-item-type-custom menu-item-object-custom menu-item-763">Hi {{username}}</li>
              </ul></div>					</nav><!-- #site-navigation -->
          </div>
        </div>
      </div>
    </div>
  </header><!-- #masthead -->


  <div class="sydney-hero-area">

    <div id="slideshow" class="header-slider" data-speed="4000" data-mobileslider="responsive">
      <div class="slides-container">

        <div class="slide-item" style="background-image:url('../images/background5.jpg');">
          <img class="mobile-slide preserve" src="../images/background5.jpg"/>
          <div class="slide-inner">
            <div class="contain animated fadeInRightBig text-slider">
              <h2 class="maintitle">from rookie to great god</h2>
              <p class="subtitle">welcome</p>
            </div>
            <a href="###"  class="roll-button button-slider ">python</a>                    </div>
        </div>
        <div class="slide-item" style="background-image:url('../images/background3.jpg');">
          <img class="mobile-slide preserve" src="../images/background3.jpg"/>
          <div class="slide-inner">
            <div class="contain animated fadeInRightBig text-slider">
              <h2 class="maintitle">Step by Step</h2>
              <p class="subtitle">......</p>
            </div>
            <a href="###"  class="roll-button button-slider">java</a>                    </div>
        </div>

      </div>
    </div>


</div>
</div>

