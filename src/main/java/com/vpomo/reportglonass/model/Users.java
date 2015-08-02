package com.vpomo.reportglonass.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Помогалов on 02.08.2015.
 */
@Entity
public class Users {
    private String login;
    private String password;
    private String nameUser;
    private Date dateLastReport;
    private String groupUser;
    private String enabled;

    public Users() {
    }

    public Users(String login) {
        this.login = login;
    }

    public Users(String login, String password, String nameUser, Date dateLastReport, String groupUser) {
        this.login = login;
        this.password = password;
        this.nameUser = nameUser;
        this.dateLastReport = dateLastReport;
        this.groupUser = groupUser;
    }

    @Id
    @Column(name = "login", nullable = false, insertable = true, updatable = true, length = 10)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "password", nullable = false, insertable = true, updatable = true, length = 20)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "name_user", nullable = false, insertable = true, updatable = true, length = 60)
    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    @Basic
    @Column(name = "date_last_report", nullable = false, insertable = true, updatable = true)
    public Date getDateLastReport() {
        return dateLastReport;
    }

    public void setDateLastReport(Date dateLastReport) {
        this.dateLastReport = dateLastReport;
    }

    @Basic
    @Column(name = "group_user", nullable = false, insertable = true, updatable = true, length = 9)
    public String getGroupUser() {
        return groupUser;
    }

    public void setGroupUser(String groupUser) {
        this.groupUser = groupUser;
    }

    @Basic
    @Column(name = "enabled", nullable = true, insertable = true, updatable = true, length = 2)
    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;

        if (dateLastReport != null ? !dateLastReport.equals(users.dateLastReport) : users.dateLastReport != null)
            return false;
        if (enabled != null ? !enabled.equals(users.enabled) : users.enabled != null) return false;
        if (groupUser != null ? !groupUser.equals(users.groupUser) : users.groupUser != null) return false;
        if (login != null ? !login.equals(users.login) : users.login != null) return false;
        if (nameUser != null ? !nameUser.equals(users.nameUser) : users.nameUser != null) return false;
        if (password != null ? !password.equals(users.password) : users.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (nameUser != null ? nameUser.hashCode() : 0);
        result = 31 * result + (dateLastReport != null ? dateLastReport.hashCode() : 0);
        result = 31 * result + (groupUser != null ? groupUser.hashCode() : 0);
        result = 31 * result + (enabled != null ? enabled.hashCode() : 0);
        return result;
    }
}
