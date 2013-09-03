package de.gzockoll.osgi.raumklima;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: guido
 * Date: 19.08.13
 * Time: 18:22
 * To change this template use File | Settings | File Templates.
 */
@CsvRecord(separator = "\\s+")
public class Sht21Data {
        @DataField(pos = 1, trim = true, precision = 1)
        BigDecimal temperature;

        @DataField(pos = 2, trim = true, precision = 1)
        BigDecimal humidity;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
