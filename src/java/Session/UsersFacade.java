/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entity.Users;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Помогалов
 */
@Stateless
public class UsersFacade extends AbstractFacade<Users> {
    @PersistenceContext(unitName = "ReportGLONASSPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
            return em;
    }

    public UsersFacade() {
        super(Users.class);
    }
    public List<Users> getUsersGroup(String grUser) {
        return  em.createNamedQuery("Users.findByGroupUser").setParameter("groupUser", grUser).getResultList();  
    }
    public List getUserLogin(String login) {
        return  em.createNamedQuery("Users.findByLogin").setParameter("login", login).getResultList();  
    }
    
}
