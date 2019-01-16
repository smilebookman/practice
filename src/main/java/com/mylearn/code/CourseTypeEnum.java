/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylearn.code;

/**
 *
 * @author Administrator
 */
enum CourseTypeEnum {

    VIDEO_COURSE(1, "录播课程"),
    LIVE_COUNRSE(2, "直播课程"),
    OFFLINE_COURSE(3, "线下课程");

    private int seq;
    private String desc;

    private CourseTypeEnum(int seq, String desc) {
        this.seq = seq;
        this.desc = desc;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
