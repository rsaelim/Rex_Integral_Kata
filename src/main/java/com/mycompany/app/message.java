package com.mycompany.app;


public class message
{
	private final int time;
	private final String content;

	public message(int aTime, String aContent) {
		time = aTime;
		content = aContent;
	}

	public int getTime() { return time; }
	public String getContent() { return content; }
}