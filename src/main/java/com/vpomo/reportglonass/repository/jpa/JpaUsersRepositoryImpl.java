package com.vpomo.reportglonass.repository.jpa;

import com.vpomo.reportglonass.model.Users;

import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.HibernateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * JPA implementation of the {@link com.vpomo.reportglonass.repository.UsersRepository} interface.
 *
 * @author Pomogalov Vladimir
 */

@Repository
@EnableTransactionManagement
public class JpaUsersRepositoryImpl implements com.vpomo.reportglonass.repository.UsersRepository {
    private static final Logger logger = LoggerFactory.getLogger(JpaUsersRepositoryImpl.class);
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Users> getAll() {
        Query query = this.entityManager.createQuery("SELECT u FROM Users u");
        List<Users> resultlist = query.getResultList();
        return resultlist;

    }

    @Override
    public Users getUserLogin(String login) {
        Users resultlist = null;
        //Query query = this.entityManager.createQuery("SELECT u FROM Users u WHERE u.login = :login");
        //query.setParameter("login", login);
        //resultlist = (Users) query.getResultList();
        resultlist = this.entityManager.find(Users.class,login);
        return resultlist;
    }

    @Override
    public Integer addUser(String login, String password, String passwordTwo, String names, String groupUser) {
        Date currentDate = new Date();
        Users resultList = null;

        try{
            if (login!=null && password!=null && passwordTwo!=null && password.equals(passwordTwo)){
                resultList = getUserLogin(login);
                if (resultList == null) {
                    Users user = newUser(login, password, names, currentDate, groupUser);
                    return 0;
                }else {return 3;}
            }else {return 2;}
        }catch (Exception e){
            return 1;
        }
    }

    @Override
    public Users newUser(String login, String password, String names, Date dateLastReport, String groupUser) {
        Users user = new Users(login, password, names, dateLastReport, groupUser);
        if (getUserLogin(login) == null) {
            this.entityManager.persist(user);
        } else {
            this.entityManager.merge(user);
        }

        return user;
    }

    @Override
    public void newDateUser(Users user, Date dateLastReport) {
        user.setDateLastReport(dateLastReport);
        this.entityManager.merge(user);
        this.entityManager.flush();
    }

    @Override
    public List<Users> getUsersGroup(String grUser) {
        Query query = this.entityManager.createQuery("SELECT u FROM Users u WHERE u.groupUser = :groupUser");
        query.setParameter("groupUser", grUser);
        List<Users> resultlist = query.getResultList();
        return resultlist;
    }

    @Override
    public void remove(String login) {
        Users user = this.entityManager.find(Users.class, login);
        if (user != null) {
            this.entityManager.remove(user);
        }
    }

/*

    @Override
    public void remove(int id) {
        Purchaser purchaser = this.entityManager.find(Purchaser.class, id);
        if (purchaser != null) {
            this.entityManager.remove(purchaser);
        }
    }

    @Override
    public void save(Purchaser purchaser) {
        if (purchaser.getId() == null) {
            this.entityManager.persist(purchaser);
        } else {
            this.entityManager.merge(purchaser);
        }
    }

    @Override
    public void clearAll() {
        int deletedCount = entityManager.createQuery("DELETE FROM Purchaser").executeUpdate();
    }

    @Override
    public Purchaser create(int typePurchaser, int cashBox, int quantityGoods, int waitCashbox) {
        Purchaser purchaser = new Purchaser(typePurchaser, cashBox, quantityGoods, waitCashbox);
        save(purchaser);
        return purchaser;
    }

    @Override
    public void updateStep(Purchaser currentPurchaser, int currentStep, int currPartQueue) {
        String strCurrentStep = Integer.toString(currentStep);
        String strCurrPartQueue = Integer.toString(currPartQueue);
        int idCurrentPurchaser = currentPurchaser.getId();
        int newValueCurrentStep = getValueStepByIdPurchaser(idCurrentPurchaser, currentStep) + currPartQueue;

        Query query = this.entityManager.createQuery("Update Purchaser p SET p.step" + strCurrentStep + " = :valueStep WHERE p.id = :id");
        query.setParameter("valueStep", newValueCurrentStep);
        query.setParameter("id", idCurrentPurchaser);
        int updatedCount = query.executeUpdate();
    }

    @Override
    @SuppressWarnings("unchecked")
    public Integer getValueStepByIdPurchaser(int idPurchaser, int currentStep) {
        String strCurrentStep = Integer.toString(currentStep);

        Query query = this.entityManager.createQuery("SELECT p.step" + strCurrentStep + " FROM Purchaser p WHERE p.id = :id");
        query.setParameter("id", idPurchaser);
        List<Integer> valueCurrentStep = query.getResultList();

        if (valueCurrentStep.size() > 0) {
            return valueCurrentStep.get(0);
        } else {
            return 0;
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Purchaser> currentStepQueue(int currentStep, int cashBox) {
        String strCurrentStep = Integer.toString(currentStep);

        Query query = this.entityManager.createQuery("SELECT p FROM Purchaser p WHERE p.cashBox = :cashBox AND p.step" + strCurrentStep + " > 0");
        query.setParameter("cashBox", cashBox);
        return query.getResultList();
    }

    @Override
    @SuppressWarnings("unchecked")
    public String currentStepQueueFirst(int id, int currentStep) {
        String strCurrentStep = Integer.toString(currentStep);
        String firstPurchaser = "no";

        Query query = this.entityManager.createQuery("SELECT p FROM Purchaser p WHERE p.id = :id AND p.step" + strCurrentStep + " > 1000");
        query.setParameter("id", id);
        List<Purchaser> resultList = query.getResultList();

        if (resultList.size() > 0) {
            firstPurchaser = "yes";
        }

        return firstPurchaser;
    }

*/

}
