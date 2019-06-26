package com.yu.gof.createpattern.builder2;

import org.apache.commons.lang3.StringUtils;

public class Product {

	private String buildA;
    private String buildB;
    private String buildC;
    private String buildD;
    
	public String getBuildA() {
		return buildA;
	}
	public void setBuildA(String buildA) {
		this.buildA = buildA;
	}
	public String getBuildB() {
		return buildB;
	}
	public void setBuildB(String buildB) {
		this.buildB = buildB;
	}
	public String getBuildC() {
		return buildC;
	}
	public void setBuildC(String buildC) {
		this.buildC = buildC;
	}
	public String getBuildD() {
		return buildD;
	}
	public void setBuildD(String buildD) {
		this.buildD = buildD;
	}
    
	@Override
    public String toString() {
		StringBuffer str = new StringBuffer();
		if (!StringUtils.isBlank(buildA)) {
			str.append(buildA + "\n");
		}
		if (!StringUtils.isBlank(buildB)) {
			str.append(buildB + "\n");
		}
		if (!StringUtils.isBlank(buildC)) {
			str.append(buildC + "\n");
		}
		if (!StringUtils.isBlank(buildD)) {
			str.append(buildD + "\n");
		}
    	return str.append("组成套餐").toString();
    }
}
