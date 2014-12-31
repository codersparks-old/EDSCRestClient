package org.codersparks.elite.edsc.model;

public class EDSCData {

	private int ver = 2;
	private boolean test = true;
	private int outputmode = 2;
	private EDSCFilter filter;

	public int getVer() {
		return ver;
	}

	public void setVer(int ver) {
		this.ver = ver;
	}

	public boolean isTest() {
		return test;
	}

	public void setTest(boolean test) {
		this.test = test;
	}

	public int getOutputmode() {
		return outputmode;
	}

	public void setOutputmode(int outputmode) {
		this.outputmode = outputmode;
	}

	public EDSCFilter getFilter() {
		return filter;
	}

	public void setFilter(EDSCFilter filter) {
		this.filter = filter;
	}

}
