/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Pomogalov
 */
@Entity
@Table(name = "users")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u"),
    @NamedQuery(name = "Users.findByLogin", query = "SELECT u FROM Users u WHERE u.login = :login"),
    @NamedQuery(name = "Users.findByPassword", query = "SELECT u FROM Users u WHERE u.password = :password"),
    @NamedQuery(name = "Users.findByNameUser", query = "SELECT u FROM Users u WHERE u.nameUser = :nameUser"),
    @NamedQuery(name = "Users.findByDateLastReport", query = "SELECT u FROM Users u WHERE u.dateLastReport = :dateLastReport"),
    @NamedQuery(name = "Users.findByGroupUser", query = "SELECT u FROM Users u WHERE u.groupUser = :groupUser")})
public class Users implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "login")
    private String login;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "name_user")
    private String nameUser;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_last_report")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateLastReport;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "group_user")
    private String groupUser;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userReport")
    private List<Report> reportList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userLogin")
    private Collection<LogUsers> logUsersCollection;

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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getDateLastReport() {
        try{
         return new SimpleDateFormat("dd.MM.yyyy").format(this.dateLastReport);         
       }catch (NullPointerException e){
         return "Дата не определена";
       }
    }
    

    public void setDateLastReport(Date dateLastReport) {
        this.dateLastReport = dateLastReport;
    }

    public String getGroupUser() {
        return groupUser;
    }

    public void setGroupUser(String groupUser) {
        this.groupUser = groupUser;
    }

    /**
     *
     * @return
     */
    @XmlTransient
    public List<Report> getReportList() {
        return reportList;
    }

    public void setReportList(List<Report> reportList) {
        this.reportList = reportList;
    }

    @XmlTransient
    public Collection<LogUsers> getLogUsersCollection() {
        return logUsersCollection;
    }

    public void setLogUsersCollection(Collection<LogUsers> logUsersCollection) {
        this.logUsersCollection = logUsersCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (login != null ? login.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.login == null && other.login != null) || (this.login != null && !this.login.equals(other.login))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Users[ name=" + nameUser + " ]";
    }
    
}
