package com.intellij.project.firstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Avatar {
    private int aid;
    private String aname;
    private String ability;
    @Autowired
    @Qualifier("m1")
    private MachineGun machineGun;


    public Avatar() {
        super();
        System.out.println("Compiling!");
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }
    public void fly(){
        System.out.println("I can fly");
        machineGun.shoot();
    }


}
