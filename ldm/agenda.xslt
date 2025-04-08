<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="3.0">

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
        <xsl:copy-of select="agenda/propietario/identificadores/nombre"/>
          <xsl:copy-of select="agenda/propietario/telefonos/casa"/>
            <xsl:copy-of select="agenda/contactos/persona/identificadoes/nombre"/>
            <xsl:copy-of select="agenda/contactos/persona/identificadoes/apellidos"/>
              <xsl:copy-of select="agenda/contactos/persona/@id"/>
                <xsl:copy-of select="agenda/contactos/persona[@id='p2']"/>
                <xsl:copy-of select="agenda/contactos/persona[@id='p2']/identificadoes/nombre"/>
            <xsl:copy-of select="agenda/contactos/persona[@id='p2']/identificadoes/apellidos"/>
                         <xsl:copy-of select="agenda/contactos/persona[@id='p2']/direccion/calle"/>
            <xsl:copy-of select="agenda/contactos/persona[@id='p2']/direccion/localidad"/>
                         <xsl:copy-of select="agenda/contactos/persona[@id='p2']/direccion/cp"/>
            <xsl:copy-of select="agenda/contactos/persona[@id='p2']/telefonos/movil"/>
            <xsl:copy-of select="agenda/contactos/persona[@id='p2']/telefonos/casa"/>
                  <xsl:copy-of select="/agenda/contactos/persona[telefonos/movil]"/>
      </div>
    </body>
  </html>

  </xsl:template>
    

</xsl:stylesheet>