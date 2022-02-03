package com.urlshorter.site.workwithkafka;

import javax.persistence.*;

@Entity
@Table(name = "audit")
public class AuditRecord {

    @Id
    @Column(name = "audit_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long auditId;

    @Column(name = "login")
    private String login;

    @Column(name = "action")
    private String action;

    @Column(name = "object")
    private String object;

    public AuditRecord(){}

    public AuditRecord(long auditId, String login, String action, String object) {
        this.auditId = auditId;
        this.login = login;
        this.action = action;
        this.object = object;
    }

    public AuditRecord(String login, String action, String object) {
        this.login = login;
        this.action = action;
        this.object = object;
    }

    public long getAuditId() {
        return auditId;
    }

    public void setAuditId(long auditId) {
        this.auditId = auditId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }


}
