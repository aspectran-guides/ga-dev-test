<?xml version="1.0" encoding="UTF-8"?>

<!DOCTYPE stylesheet[
<!ENTITY  br "<br/>">
<!ENTITY  sp "&#160;">
]>

<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:xalan="http://xml.apache.org/xalan"
	exclude-result-prefixes="xalan">

	<xsl:template name="xui.frame.body.top">
		<xsl:param name="topno" />
		<!--	[s]Logo -->
		<div class='headerLogo'>
			<a href='/'>headerLogo</a>
			<br />
		</div>
		<!--	[e]Logo -->
		<!--	[s]Btn -->
		<div class='headerBtn'>
			<ul>
				<li>
					<a href="/admin/logout">Logout</a>
				</li>
				<li>
					<a href="/">Home</a>
				</li>
			</ul>
		</div>
		<!--	[e]Btn -->
		<!--	[s]TopMenu -->
		<div class="headerMenu">
			<ul>
				<xsl:if test="$topno=1">
					<xsl:attribute name="class">current</xsl:attribute>
				</xsl:if>
				<li>
					<a href="../menu1" class="headerMenu">
						<span>
							<xsl:if test="$topno=1">
								<xsl:attribute name="class">current</xsl:attribute>
							</xsl:if>
							Menu Item 1
						</span>
					</a>
				</li>
				<li>|</li>
				<li>
					<a href="../menu2"
						class="headerMenu">
						<span>
							<xsl:if test="$topno=2">
								<xsl:attribute name="class">current</xsl:attribute>
							</xsl:if>
							Menu Item 2
						</span>
					</a>
				</li>
				<li>|</li>
				<li>
					<a href="../menu3" class="headerMenu">
						<span>
							<xsl:if test="$topno=3">
								<xsl:attribute name="class">current</xsl:attribute>
							</xsl:if>
							Menu Item 3
						</span>
					</a>
				</li>
			</ul>
		</div>
		<!--	[e]TopMenu -->
	</xsl:template>
	<xsl:template name="xui.frame.body.left" />
	<xsl:template name="xui.frame.body.center" />
	<xsl:template name="xui.frame.body.right" />
	<xsl:template name="xui.frame.body.bottom"></xsl:template>
</xsl:stylesheet>