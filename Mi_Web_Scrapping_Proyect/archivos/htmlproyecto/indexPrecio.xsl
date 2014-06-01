<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:output method="html" encoding="utf-8" indent="yes" />
<xsl:template match="/">
<xsl:text disable-output-escaping='yes'>&lt;!DOCTYPE html></xsl:text>
<html>
  <head>
    <meta charset="utf-8" />
    <title>Noticias Actuales</title>
    <link type="text/css" rel="stylesheet" href="templatemo_style.css" />
  </head>
  <body>
    <div id="templatemo_wrapper_outer">
      <div id="templatemo_wrapper">
        <div id="templatemo_banner"><br />
          <h2>El Noticiario Tecnológico<span> web scrapping proyect</span></h2>
        </div>
        <div id="templatemo_content_wrapper">
          <div id="content">
            <xsl:for-each select="noticias/noticia">
			<xsl:sort select="./titulo" data-type="text" order="ascending"/>
            <div class="section_w610 divider">
            <table>
			<tr>
			  <th class="tdlink" colspan="3"> 
			  	<h2>
			  		<xsl:value-of select="./titulo"/> 
			  	</h2>
			  </th>
			</tr>
			<span><xsl:value-of select="./reserva"/></span>
			<tr>
				<td colspan="2"><xsl:value-of select="./cuerpo"/></td>
				<td><img><xsl:attribute name="src"><xsl:value-of select="./imagen"/></xsl:attribute></img></td>
				
			</tr>
			<tr>
				<td colspan="3"><p>link: <a><xsl:attribute name="href"><xsl:value-of select="./URL"/></xsl:attribute><xsl:value-of select="./URL"/></a></p></td>
			</tr>
			</table> 
			  
			  </div>
			  
            <br />
            </xsl:for-each>
          </div>
          <br/>
          <div class="cleaner"></div>
        </div>
        
        <div id="templatemo_footer"><br />
           <h3>Trabajo de Lenguaje de Marcas. Los Datos han sido tomados de <a href="http://www.genbeta.com/">www.genbeta.com</a> , <a href="http://www.genbetadev.com">www.genbetadev.com</a> , <a href="http://www.xataka.com">www.xataka.com</a> y <a href="http://www.appleesfera.com">www.appleesfera.com</a></h3> 
          <div class="cleaner"></div>
        </div>
      </div>
    </div>
  </body>
</html>
</xsl:template>
</xsl:stylesheet>