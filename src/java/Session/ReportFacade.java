/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entity.Report;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Помогалов
 */
@Stateless
public class ReportFacade extends AbstractFacade<Report> {
    @PersistenceContext(unitName = "ReportGLONASSPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
    return em;
    }

    public ReportFacade() {
        super(Report.class);
    }
    
    public List getReportsLogin(String loginUser) {
        return  em.createNamedQuery("Report.findByUserReport").setParameter("login", loginUser).getResultList();  

    }

}
