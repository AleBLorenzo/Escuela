<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0">
 
  <xsl:output method="html"/>

  <!-- Plantilla de identidad -->

  <xsl:template match="/">
  <html>
    <head>
      <title>Plantilla de Identidad</title>
      <style>
        body {
          font-family: Arial, sans-serif;
          margin: 20px;
        }
        h1 {
          color: #333;
        }
        .content {
          border: 1px solid #ccc;
          padding: 10px;
          background-color: #f9f9f9;
        }
        </style>
    </head>
    <body>
      <h1>Plantilla de Identidad</h1>
      <div class="content">
        <xsl:copy-of select="." />
      </div>
    </body>
  </html>
   
  </xsl:template>

</xsl:stylesheet>
