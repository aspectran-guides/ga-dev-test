<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:xalan="http://xml.apache.org/xalan"
	exclude-result-prefixes="xalan">

	<xsl:template name="xui.frame.head.meta">
		<xsl:call-template name="xui.frame.meta.public" />
		<xsl:call-template name="xui.frame.meta.private" />
	</xsl:template>

	<xsl:template name="xui.frame.meta.public">
		<meta http-equiv="Cache-Control" content="no-cache" />
		<meta http-equiv="Pragma" content="no-cache" />
		<meta http-equiv="Expires" content="0" />
	</xsl:template>

	<xsl:template name="xui.frame.meta.private" />


	<xsl:template name="xui.frame.head.title">
		<title>Title</title>
	</xsl:template>

	<xsl:template name="xui.frame.head.css">
		<xsl:call-template name="xui.frame.css.public" />
		<xsl:call-template name="xui.frame.css.private" />
	</xsl:template>

	<xsl:template name="xui.frame.head.js">
		<xsl:call-template name="xui.frame.js.public" />
		<xsl:call-template name="xui.frame.js.private" />
	</xsl:template>

	<xsl:template name="xui.frame.css.public">
		<link href="h/css/layout.css"
			type="text/css" rel="STYLESHEET" />
	</xsl:template>

	<xsl:template name="xui.frame.css.private"></xsl:template>

	<xsl:template name="xui.frame.js.public">
		<script type="text/javascript"
			src="/js/common.js">
		</script>
		<script type="text/javascript"
			src="/js/script.js">
		</script>
	</xsl:template>

	<xsl:template name="xui.frame.js.private"></xsl:template>

	<xsl:template name="xui.frame.head.layout">
		<head>
			<xsl:call-template name="xui.frame.head.meta" />
			<xsl:call-template name="xui.frame.head.title" />
			<xsl:call-template name="xui.frame.head.css" />
			<xsl:call-template name="xui.frame.head.js" />
		</head>
	</xsl:template>
</xsl:stylesheet>