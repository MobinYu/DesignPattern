package com.example.demo.study.designpattern.actionpattern.chainofresponsibility;

/**
 * 应聘者
 * @author Administrator
 * @date 2019年6月21日 下午2:25:44
 */
public class Interviewee {

	private String name;

    private boolean teamLeaderOpinion;
    private boolean departMentManagerOpinion;
    private boolean hrOpinion;
    
    public Interviewee(String name) {
        this.name = name;
    }
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isTeamLeaderOpinion() {
		return teamLeaderOpinion;
	}
	public void setTeamLeaderOpinion(boolean teamLeaderOpinion) {
		this.teamLeaderOpinion = teamLeaderOpinion;
	}
	public boolean isDepartMentManagerOpinion() {
		return departMentManagerOpinion;
	}
	public void setDepartMentManagerOpinion(boolean departMentManagerOpinion) {
		this.departMentManagerOpinion = departMentManagerOpinion;
	}
	public boolean isHrOpinion() {
		return hrOpinion;
	}
	public void setHrOpinion(boolean hrOpinion) {
		this.hrOpinion = hrOpinion;
	}
}
