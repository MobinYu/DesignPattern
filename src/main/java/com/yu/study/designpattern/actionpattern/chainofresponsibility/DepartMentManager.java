package com.example.demo.study.designpattern.actionpattern.chainofresponsibility;

import java.util.Random;

/**
 * -面试官 -- 部门经理
 * @author Administrator
 * @date 2019年6月21日 下午5:36:02
 */
public class DepartMentManager extends Interviewer {

    public DepartMentManager(String name) {
        super(name);
    }

    @Override
    public void handleInterview(Interviewee interviewee) {
        System.out.println("部门经理[" + this.name + "]面试[" + interviewee.getName() + "]同学");
        interviewee.setDepartMentManagerOpinion(new Random().nextBoolean());
        if (interviewee.isDepartMentManagerOpinion()) {
            System.out.println("[" + interviewee.getName() + "]同学部门经理轮面试通过");
            this.nextInterviewer.handleInterview(interviewee);
        } else {
            System.out.println("[" + interviewee.getName() + "]同学部门经理轮面试不通过");
        }
    }
}
