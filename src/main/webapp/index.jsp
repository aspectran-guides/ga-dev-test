<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html class="no-js" lang="ko">
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Development Testing</title>
<link rel="stylesheet" type="text/css" href="http://www.aspectran.com/assets/css/styles_aspectran.css" />
<script>
	WebFontConfig = {
		google : {
			families : [ 'Open+Sans:400,700,400italic:latin' ]
		}
	};
	(function() {
		var wf = document.createElement('script');
		wf.src = ('https:' == document.location.protocol ? 'https' : 'http')
				+ '://ajax.googleapis.com/ajax/libs/webfont/1/webfont.js';
		wf.type = 'text/javascript';
		wf.async = 'true';
		var s = document.getElementsByTagName('script')[0];
		s.parentNode.insertBefore(wf, s);
	})();
</script>
<noscript>
	<link href='http://fonts.googleapis.com/css?family=Lato:400,700,400italic|Volkhov' rel='stylesheet' type='text/css' />
</noscript>
<script src="http://www.aspectran.com/assets/js/modernizr.js"></script>
<script src="http://www.aspectran.com/assets/js/jquery.js"></script>
<script src="http://www.aspectran.com/assets/js/fastclick.js"></script>
<meta name="description" content="개발 과정에서 기능의 검증을 위해 실시하는 테스트 URL을 모아 둔 페이지입니다." />
<link rel="icon" sizes="32x32" href="http://www.aspectran.com/assets/img/favicon-32x32.png" />
<link rel="icon" sizes="192x192" href="http://www.aspectran.com/assets/img/touch-icon-192x192.png" />
<link rel="apple-touch-icon-precomposed" sizes="180x180" href="http://www.aspectran.com/assets/img/apple-touch-icon-180x180-precomposed.png" />
<link rel="apple-touch-icon-precomposed" sizes="152x152" href="http://www.aspectran.com/assets/img/apple-touch-icon-152x152-precomposed.png" />
<link rel="apple-touch-icon-precomposed" sizes="144x144" href="http://www.aspectran.com/assets/img/apple-touch-icon-144x144-precomposed.png" />
<link rel="apple-touch-icon-precomposed" sizes="120x120" href="http://www.aspectran.com/assets/img/apple-touch-icon-120x120-precomposed.png" />
<link rel="apple-touch-icon-precomposed" sizes="114x114" href="http://www.aspectran.com/assets/img/apple-touch-icon-114x114-precomposed.png" />
<link rel="apple-touch-icon-precomposed" sizes="76x76" href="http://www.aspectran.com/assets/img/apple-touch-icon-76x76-precomposed.png" />
<link rel="apple-touch-icon-precomposed" sizes="72x72" href="http://www.aspectran.com/assets/img/apple-touch-icon-72x72-precomposed.png" />
<link rel="apple-touch-icon-precomposed" href="http://www.aspectran.com/assets/img/apple-touch-icon-precomposed.png" />
<meta name="msapplication-TileImage" content="http://www.aspectran.com/assets/img/msapplication_tileimage.png" />
<meta name="msapplication-TileColor" content="#fabb00" />
<meta property="og:locale" content="ko_KR" />
<meta property="og:type" content="website" />
<meta property="og:title" content="Overview" />
<meta property="og:description" content="Aspectran은 엔터프라이즈급 자바 웹 응용 프로그램을 구축하기 위한 가볍고 확장 가능한 프레임워크입니다. Apache 2.0 License에 의거하여 무료로 사용할 수 있습니다." />
<meta property="og:url" content="http://www.aspectran.com/getting-started/overview/" />
<meta property="og:site_name" content="Aspectran" />
<link type="text/plain" rel="author" href="http://www.aspectran.com/humans.txt" />
</head>
<body id="top-of-page" class="plate solid">
	<nav id="navigation" class="no-js">
		<div class="title-bar" data-responsive-toggle="dropdownmenu" data-hide-for="medium">
			<div class="title-bar-left">
				<button class="menu-icon" type="button" data-toggle></button>
			</div>
			<div class="title-bar-center">
				<a href="/" title="Aspectran"><img src="http://www.aspectran.com/assets/img/aspectran-icon.png" alt="Aspectran" /></a>
			</div>
			<div class="title-bar-right" data-toggle></div>
		</div>
		<div class="top-bar" id="dropdownmenu">
			<div class="row">
				<div class="top-bar-logo" data-hide-for="medium">
					<a href="http://www.aspectran.com/" title="Aspectran"><img src="http://www.aspectran.com/assets/img/aspectran-icon.png" alt="Aspectran" /></a>
				</div>
				<div class="top-bar-left">
					<ul class="dropdown menu" data-dropdown-menu>
						<li>
							<a>Aspectran Guides</a>
						</li>
					</ul>
				</div>
				<div class="top-bar-right">
				</div>
			</div>
		</div>
	</nav>

	<div id="forkme-ribbon">
		<a href="https://github.com/aspectran/aspectran" target="_blank">
			<img src="http://aral.github.com/fork-me-on-github-retina-ribbons/right-white@2x.png" width="149" height="149" alt="Fork me on GitHub"></a>
	</div>

	<div id="masthead" class="masthead-no-image-header">
		<div class="row">
			<div class="columns">
				<header>
					<span itemprop="name">
						<p class="subheadline">Development Testing</p>
						<h1>개발 테스트</h1>
					</span>
					<p class="teaser" itemprop="description">개발 과정에서 기능의 검증을 위해 실시하는 테스트 URL을 모아 둔 페이지입니다.</p>
				</header>
			</div>
		</div>
		<div class="row breadcrumbs-bar">
			<div class="columns">
				<nav role="navigation" aria-label="You are here:">
					<ul class="breadcrumbs">
						<li><a href="/getting-started/">Aspectran Guides</a></li>
						<li><span class="show-for-sr">Current: </span> <span class="current">RESTful Web Service</span></li>
					</ul>
				</nav>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="columns">
			<div class="row content">
				<div class="xlarge-10 xlarge-offset-1 columns">
	<!-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ -->

	<div class="row">
		<div class="columns t30">
			<div class="input-group link-box">
				<span class="input-group-label" style="white-space: nowrap;">Test</span>
				<input class="input-group-field" value="" type="text">
				<div class="input-group-button">
					<a href="" class="button">Go</a>
				</div>
			</div>
		</div>
	</div>
	
	<script>
		var urls = [
			"/ga-dev-test/hello",
			"/ga-dev-test/hello2",
			"/ga-dev-test/hello3",
			"/ga-dev-test/hello4",
			"/ga-dev-test/sample/countTo10ext.xml",
			"/ga-dev-test/sample/countTo10twice",
			"/ga-dev-test/sample/countTo10twice.xml",
			"/ga-dev-test/sample/applyTheAdvice.xml",
			"/ga-dev-test/echo?param1=111111&param2=2222222222",
			"/ga-dev-test/echoParameters?param1=111111&param2=2222222222",
			"/ga-dev-test/sample/sampleBean.txt",
			"/ga-dev-test/forward?param1=1&param2=2&param3=3&param4=4",
			"/ga-dev-test/goNaver",
			"/ga-dev-test/scheduler/hello.job",
			"/ga-dev-test/scheduler/countTo10ext.job",
			"/ga-dev-test/test/explicit.xml?param1=Explicit",
			"/ga-dev-test/test/implicit.xml?param1=Implicit",
			"/ga-dev-test/property1",
			"/ga-dev-test/environment-test"
		];
	
		var lb = $(".link-box:eq(0)");
		urls.forEach(function(url) {
			lb.find("input").val(url);
			lb.find("a").attr("href", url);
			lb.find("input").change(function() {
				$(this).parent().find("a").attr("href", $(this).val());
			});
			lb.appendTo($(".link-box:eq(0)").parent());
			lb = $(".link-box:eq(0)").clone()
		});
	</script>

	<!-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ -->
				</div>
			</div>
		</div>
	</div>

	<div id="up-to-top" class="row">
		<div class="small-12 columns" style="text-align: right;">
			<a class="iconfont" href="#top-of-page">&#xf108;</a>
		</div>
	</div>
	<footer id="footer-content">
		<div id="footer">
			<div class="row">
				<div class="medium-2 large-1 columns hide-for-small-only t5">
					<h5>
						<a href="http://www.aspectran.com/" title="Aspectran"><img src="http://www.aspectran.com/assets/img/aspectran-logo-grey-x100.png" width="100" height="100" title="Aspectran" /></a>
					</h5>
				</div>
				<div class="medium-4 large-4 columns">
					<h5>About Aspectran</h5>
					<p>
						Aspectran은 엔터프라이즈급 자바 웹 응용 프로그램을 구축하기 위한 가볍고 확장 가능한 프레임워크입니다.
						Apache 2.0 License에 의거하여 무료로 사용할 수 있습니다. <a href="http://www.aspectran.com/info/">자세히 보기</a>
					</p>
				</div>
				<div class="small-6 medium-3 large-3 large-offset-1 columns">
					<h5>Navigation</h5>
					<ul class="no-bullet">
						<li><a href="" title=""></a></li>
						<li class=""><a href="http://www.aspectran.com/getting-started/" title="">Getting-Started</a></li>
						<li class=""><a href="http://www.aspectran.com/docs/" title="">Documentation</a></li>
						<li class=""><a href="http://www.aspectran.com/modules/" title="">Modules</a></li>
						<li class=""><a href="http://www.aspectran.com/blog/" title="">Blog</a></li>
					</ul>
				</div>
				<div class="small-6 medium-3 large-3 columns">
					<h5>Services</h5>
					<ul class="no-bullet">
						<li><a href="" title=""></a></li>
						<li><a href="http://www.aspectran.com/contact/" title="Contact">Contact</a></li>
						<li><a href="http://www.aspectran.com/feed.xml" title="Subscribe to RSS Feed">RSS</a></li>
						<li><a href="http://www.aspectran.com/atom.xml" title="Subscribe to Atom Feed">Atom</a></li>
						<li><a href="http://www.aspectran.com/sitemap.xml" title="Sitemap for Google Webmaster Tools">sitemap.xml</a></li>
					</ul>
				</div>
			</div>
		</div>
		<div id="subfooter">
			<nav class="row b30">
				<section id="subfooter-left" class="medium-6 columns credits">
					<p>© 2008–2016 Juho Jeong. All rights reserved.</p>
				</section>
				<section id="subfooter-right" class="medium-6 columns social-icons">
					<ul>
						<li><a href="http://github.com/aspectran/aspectran" target="_blank" class="icon-github" title="Code and more ..."></a></li>
						<li><a href="http://twitter.com/aspectran" target="_blank" class="icon-twitter" title="Always the latest news from aspectran there on Twitter"></a></li>
						<li><a href="http://www.facebook.com/aspectran" target="_blank" class="icon-facebook" title="Let's be friends!"></a></li>
					</ul>
				</section>
			</nav>
		</div>
	</footer>
	<script src="http://www.aspectran.com/assets/js/foundation.min.js"></script>
	<script>
		$(document).foundation();
		$(document).ready(function() {
			var navigationFixed = false;
			var navigationHeight = $("#masthead").height() - $("#navigation").height();
			var $window = $(window);
			$window.scroll(function() {
				var scrollTop = $window.scrollTop();
				if(navigationFixed) {
					if (scrollTop < navigationHeight) {
						navigationFixed = false;
						$("#navigation").hide();
						$("#navigation").removeClass("fixed");
						$("#navigation").slideDown(220);
					}
				} else {
					if(scrollTop > navigationHeight) {
						navigationFixed = true;
						$("#navigation").hide();
						$("#navigation").addClass("fixed");
						$("#navigation").fadeIn(450);
					}
				}
			});
			if($window.scrollTop() > navigationHeight) {
				$window.scroll();
			}
		});
	</script>
	<script>
		// Creating custom :external selector
		$.expr[':'].external = function(obj){ return !obj.href.match(/^mailto\:/) && (obj.hostname != location.hostname); };
		$(function(){
			// Add 'external' CSS class to all external links $('a:external').addClass('external');
			// turn target into target=_blank for elements w external class $(".external").attr('target','_blank');
		});
	</script>
</body>
</html>
