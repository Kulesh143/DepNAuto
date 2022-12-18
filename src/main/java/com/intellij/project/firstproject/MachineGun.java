package com.intellij.project.firstproject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("m1")
public class MachineGun {
    private int mid;
    private String mname;

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }
    public void shoot(){
        System.out.println("Baaam!");
    }
}
