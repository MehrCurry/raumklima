package de.gzockoll.osgi.raumklima;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;

@CsvRecord(separator = "\\s+")
public class Sht21Data {
	@DataField(pos = 1, trim = true)
	private double temperature;

	@DataField(pos = 2, trim = true)
	private double humidity;

	
	public Sht21Data(double temperature, double humidity) {
		super();
		this.temperature = temperature;
		this.humidity = humidity;
	}

	public double getHumidity() {
		return humidity;
	}

	public double getTemperature() {
		return temperature;
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
