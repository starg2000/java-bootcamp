package com.example.restapi;

import javax.persistence.*;

@Entity
@Table(name = "Transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long tid;
    private long acnum;
    private Float amount;
    private String ttype;
    private String tdate;
    private String status;
    private String created;
    private String updated;

    public Transaction(){}

    public Transaction(long tid, long acnum, Float amount, String ttype, String tdate, String status,
                       String created, String updated) {
        this.tid = tid;
        this.acnum = acnum;
        this.amount = amount;
        this.ttype = ttype;
        this.tdate = tdate;
        this.status = status;
        this.created = created;
        this.updated = updated;
    }

    public long getTid() {
        return tid;
    }

    public void setTid(long tid) {
        this.tid = tid;
    }

    public long getAcnum() {
        return acnum;
    }

    public void setAcnum(long acnum) {
        this.acnum = acnum;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getTtype() {
        return ttype;
    }

    public void setTtype(String ttype) {
        this.ttype = ttype;
    }

    public String getTdate() {
        return tdate;
    }

    public void setTdate(String tdate) {
        this.tdate = tdate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        return "Transaction{" +
                "tid=" + tid +
                ", acnum=" + acnum +
                ", amount=" + amount +
                ", ttype='" + ttype + '\'' +
                ", tdate='" + tdate + '\'' +
                ", status='" + status + '\'' +
                ", created='" + created + '\'' +
                ", updated='" + updated + '\'' +
                '}';
    }
}
