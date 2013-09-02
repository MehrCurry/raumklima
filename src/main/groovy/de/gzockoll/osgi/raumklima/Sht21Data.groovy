package de.gzockoll.osgi.raumklima

import groovy.transform.ToString
import org.apache.camel.dataformat.bindy.annotation.CsvRecord
import org.apache.camel.dataformat.bindy.annotation.DataField

/**
 * Created with IntelliJ IDEA.
 * User: guido
 * Date: 19.08.13
 * Time: 18:22
 * To change this template use File | Settings | File Templates.
 */
@ToString
@CsvRecord(separator = "\\s+")
class Sht21Data {
        @DataField(pos = 1, trim = true, precision = 1)
        BigDecimal temperature

        @DataField(pos = 2, trim = true, precision = 1)
        BigDecimal humidity
}
