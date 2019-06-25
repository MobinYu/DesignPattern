package com.yu.gof.actionpattern.chainofresponsibility;

import java.util.Random;

/**
 * -面试官--组长
 * @author Administrator
 * @date 2019年6月21日 下午5:36:02
 */
public class TeamLeader extends Interviewer {

	public TeamLeader(String name) {
		super(name);
	}

	@Override
	public void handleInterview(Interviewee interviewee) {
		System.out.println("组长[" + this.name + "]面试[" + interviewee.getName() + "]同学");
		
		interviewee.setTeamLeaderOpinion(new Random().nextBoolean());
		if (interviewee.isTeamLeaderOpinion()) {
			System.out.println("[" + interviewee.getName() + "]同学组长轮面试通过");
            this.nextInterviewer.handleInterview(interviewee);
		} else {
			System.out.println("[" + interviewee.getName() + "]同学组长轮面试未通过");
		}
	}

}
