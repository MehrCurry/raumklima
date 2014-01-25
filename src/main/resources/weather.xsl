<xsl:stylesheet version = '1.0'
                xmlns:xsl='http://www.w3.org/1999/XSL/Transform'>
    <xsl:output method="text" encoding="UTF-8" />
    <xsl:template match="/">
        <xsl:variable name="temp" select="//temp"/>
        <xsl:variable name="hum" select="//humidity"/>

        <xsl:value-of select="concat(1,' ',round(($temp - 273.15)*10) div 10,' ',$hum)"/>
    </xsl:template>
</xsl:stylesheet>