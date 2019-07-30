package com.yu.gof.actionpattern.memento.other;

public class App {
	
	private String content;
	private String version;
	
	public App(String content, String version) {
		this.content = content;
		this.version = version;
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	@Override
    public String toString() {
        return "App {" +
                    "content='" + content + '\'' +
                    ", version='" + version + '\'' +
                '}';
    }
}
