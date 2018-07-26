package com.meltsan.backEnd.vo;

public class PaisVo {
	private String ciudad1;
	private String ciudad2;
	
	
	public PaisVo(String ciudad1, String ciudad2) {
		this.ciudad1 = ciudad1;
		this.ciudad2 = ciudad2;
	}


	public String getCiudad1() {
		return ciudad1;
	}


	public void setCiudad1(String ciudad1) {
		this.ciudad1 = ciudad1;
	}


	public String getCiudad2() {
		return ciudad2;
	}


	public void setCiudad2(String ciudad2) {
		this.ciudad2 = ciudad2;
	}


	@Override
	public String toString() {
		return "paisVo [ciudad1=" + ciudad1 + ", ciudad2=" + ciudad2 + "]";
	};
	
	
}
