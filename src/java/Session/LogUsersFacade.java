/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entity.LogUsers;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Помогалов
 */
@Stateless
public class LogUsersFacade extends AbstractFacade<LogUsers> {
    @PersistenceContext(unitName = "ReportGLONASSPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LogUsersFacade() {
        super(LogUsers.class);
    }
    
}
