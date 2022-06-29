package com.mavenanalytics.telecom;

public enum BinaryAnswer {
	NO("No",0),
	YES("Yes",1);
	
	private String string;
	private int bin;

	BinaryAnswer(String string, int i) {
		this.string = string;
		this.bin = i;
	}
	
	public static BinaryAnswer getBAEnum(String BAString) {
		if(BAString.toLowerCase() == "yes" ) {
			return BinaryAnswer.YES;
		}
		else {
			return BinaryAnswer.NO;
		}
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public int getBin() {
		return bin;
	}

	public void setBin(int bin) {
		this.bin = bin;
	}
	
	
	
}
