package com.example.demo.study.designpattern.actionpattern.chainofresponsibility;

public class TestMain {

	public static void main(String[] args) {
		//构造应聘者
		Interviewee viewee = new Interviewee("小明");
		
		//构造面试官
		TeamLeader teamLeader = new TeamLeader("老王");
		DepartMentManager mentManager = new DepartMentManager("老李");
		HR hr = new HR("老赵");
		
		//设置下一个处理对象（面试流程）
		teamLeader.setNextInterviewer(mentManager);
		mentManager.setNextInterviewer(hr);
		
//		teamLeader.nextInterviewer = mentManager;
//		mentManager.nextInterviewer = hr;
		
		//面试开始
		teamLeader.handleInterview(viewee);
		
	}
}
