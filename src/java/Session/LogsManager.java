package Session;


import Entity.LogUsers;
import Entity.Users;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Помогалов
 */

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class LogsManager {
@PersistenceContext(unitName = "ReportGLONASSPU")
private EntityManager em;
@Resource
private SessionContext context;
    
@TransactionAttribute(TransactionAttributeType.REQUIRED)

public Integer addLogUser(final Users userL, final Date currentDate, final String actionLog) {

        try{
            LogUsers loguser = newLogUser(userL, currentDate, actionLog);
            return 1;
        }catch (Exception e){
            context.setRollbackOnly();
            return 0;
        }
    }

 
private LogUsers newLogUser(Users userL, Date dateReport, String actionLog) {
        LogUsers loguser = new LogUsers (userL, dateReport, actionLog);
        em.persist(loguser);
        return loguser;
    }

 
public void removeLogUser(int id) {
    LogUsers loguser = em.find(LogUsers.class, id);
    if (loguser != null) {
        em.remove(loguser);
        }
}

public List<LogUsers> findAllLogs() {
    TypedQuery<LogUsers> query = em.createQuery("SELECT l FROM LogUsers l", LogUsers.class);
    return query.getResultList();
}

}
