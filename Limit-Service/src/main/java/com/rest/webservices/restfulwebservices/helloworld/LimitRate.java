package com.rest.webservices.restfulwebservices.helloworld;

public class LimitRate {

	public LimitRate(String curreny, Integer unitValue) {
		super();
		Curreny = curreny;
		this.unitValue = unitValue;
	}

	private String Curreny;
	private Integer unitValue;

	public String getCurreny() {
		return Curreny;
	}

	public void setCurreny(String curreny) {
		Curreny = curreny;
	}

	public Integer getUnitValue() {
		return unitValue;
	}

	public void setUnitValue(Integer unitValue) {
		this.unitValue = unitValue;
	}

	@Override
	public String toString() {
		return "LimitRate [Curreny=" + Curreny + ", unitValue=" + unitValue + "]";
	}

}
