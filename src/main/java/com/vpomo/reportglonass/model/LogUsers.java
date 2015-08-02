package com.vpomo.reportglonass.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Помогалов on 02.08.2015.
 */
@Entity
@Table(name = "log_users", schema = "", catalog = "reportglonass")
public class LogUsers {
    private int idLogUser;
    private Timestamp dateLogin;
    private String actionLog;

    @Id
    @Column(name = "id_log_user", nullable = false, insertable = true, updatable = true)
    public int getIdLogUser() {
        return idLogUser;
    }

    public void setIdLogUser(int idLogUser) {
        this.idLogUser = idLogUser;
    }

    @Basic
    @Column(name = "date_login", nullable = false, insertable = true, updatable = true)
    public Timestamp getDateLogin() {
        return dateLogin;
    }

    public void setDateLogin(Timestamp dateLogin) {
        this.dateLogin = dateLogin;
    }

    @Basic
    @Column(name = "action_log", nullable = false, insertable = true, updatable = true, length = 50)
    public String getActionLog() {
        return actionLog;
    }

    public void setActionLog(String actionLog) {
        this.actionLog = actionLog;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LogUsers logUsers = (LogUsers) o;

        if (idLogUser != logUsers.idLogUser) return false;
        if (actionLog != null ? !actionLog.equals(logUsers.actionLog) : logUsers.actionLog != null) return false;
        if (dateLogin != null ? !dateLogin.equals(logUsers.dateLogin) : logUsers.dateLogin != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idLogUser;
        result = 31 * result + (dateLogin != null ? dateLogin.hashCode() : 0);
        result = 31 * result + (actionLog != null ? actionLog.hashCode() : 0);
        return result;
    }
}
