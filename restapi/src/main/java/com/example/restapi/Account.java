package com.example.restapi;

import javax.persistence.*;

@Entity
@Table(name = "Account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long acnum;
    private String acname;
    private String dob;
    private String actype;
    private Float fee;
    private String created;
    private String updated;
    public Account(){}

    public Account(long acnum, String acname, String dob, String actype, Float fee, String created, String updated) {
        this.acnum = acnum;
        this.acname = acname;
        this.dob = dob;
        this.actype = actype;
        this.fee = fee;
        this.created = created;
        this.updated = updated;
    }

    public long getAcnum() {
        return acnum;
    }

    public void setAcnum(long acnum) {
        this.acnum = acnum;
    }

    public String getAcname() {
        return acname;
    }

    public void setAcname(String acname) {
        this.acname = acname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getActype() {
        return actype;
    }

    public void setActype(String actype) {
        this.actype = actype;
    }

    public Float getFee() {
        return fee;
    }

    public void setFee(Float fee) {
        this.fee = fee;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "Account{" +
                "acnum=" + acnum +
                ", acname='" + acname + '\'' +
                ", dob='" + dob + '\'' +
                ", actype='" + actype + '\'' +
                ", fee=" + fee +
                ", created='" + created + '\'' +
                ", updated='" + updated + '\'' +
                '}';
    }
}
