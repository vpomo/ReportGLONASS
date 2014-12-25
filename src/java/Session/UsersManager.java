package Session;


import Entity.Users;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Помогалов
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class UsersManager {
@PersistenceContext(unitName = "ReportGLONASSPU")
private EntityManager em;
@Resource
private SessionContext context;

@TransactionAttribute(TransactionAttributeType.REQUIRED)
    public Integer addUser(final String login, final String password, final String passwordTwo, final String names, final String groupUser) {
        Date currentDate = new Date();
        try{
            if (login!=null && password!=null && passwordTwo!=null && password.equals(passwordTwo)){
                List resultList = em.createNamedQuery("Users.findByLogin").setParameter("login", login).getResultList();
                if (resultList.isEmpty()){
                Users user=newUser(login, password, names, currentDate, groupUser);
                    return 0;
                }else {return 3;}
            }else {return 2;}
        }catch (Exception e){
            context.setRollbackOnly();
            return 1;
        }
    }


    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    private Users newUser(String login, String password, String names, Date dateLastReport, String groupUser) {
        Users user = new Users(login, password, names, dateLastReport, groupUser);
        em.persist(user);
        return user;
    }
    
    public void newDateUser(Users user, Date dateLastReport) {
        user.setDateLastReport(dateLastReport);
        em.merge(user);
        em.flush();
    }

    
}
