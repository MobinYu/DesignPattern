package com.example.demo.study.designpattern.actionpattern.chainofresponsibility;

import java.util.Random;

/**
 * -面试官 -- HR
 * @author Administrator
 * @date 2019年6月21日 下午5:36:02
 */
public class HR extends Interviewer {

    public HR(String name) {
        super(name);
    }

    @Override
    public void handleInterview(Interviewee interviewee) {
        System.out.println("HR[" + this.name + "]面试[" + interviewee.getName() + "]同学");
        interviewee.setHrOpinion(new Random().nextBoolean());
        if (interviewee.isHrOpinion()) {
            System.out.println("[" + interviewee.getName() + "]同学HR轮面试通过, 恭喜拿到 Offer");
        } else {
            System.out.println("[" + interviewee.getName() + "]同学HR轮面试不通过");
        }
    }
}
