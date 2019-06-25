package com.yu.gof.actionpattern.chainofresponsibility;

/**
 * -面试官
 * @author Administrator
 * @date 2019年6月21日 下午5:36:02
 */
abstract class Interviewer {
	
	protected String name;
	
	protected Interviewer nextInterviewer;

	public Interviewer(String name) {
		this.name = name;
	}

	public Interviewer setNextInterviewer(Interviewer nextInterviewer) {
		this.nextInterviewer = nextInterviewer;
		return this.nextInterviewer;
	}
	
	public abstract void handleInterview(Interviewee interviewee);

}
