package Session;


import Entity.Report;
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
public class ReportsManager {
@PersistenceContext(unitName = "ReportGLONASSPU")
private EntityManager em;
@Resource
private SessionContext context;
    
@TransactionAttribute(TransactionAttributeType.REQUIRED)

public Integer addReport(
        		final Users userR, final Date currentDate,
                        final Integer icatM1StateAll, final Integer icatM1StateEquip, final Integer icatM1StateRNIS, final Integer icatM1StateOther,
			final Integer icatM1MunicAll, final Integer icatM1MunicEquip, final Integer icatM1MunicRNIS, final Integer icatM1MunicOther,
			final Integer icatM1CommercAll, final Integer icatM1CommercEquip, final Integer icatM1CommercRNIS, final Integer icatM1CommercOther,
			
			final Integer icatM2M3StateAll, final Integer icatM2M3StateEquip, final Integer icatM2M3StateRNIS, final Integer icatM2M3StateOther, 
			final Integer icatM2M3MunicAll, final Integer icatM2M3MunicEquip, final Integer icatM2M3MunicRNIS, final Integer icatM2M3MunicOther, 
			final Integer icatM2M3CommercAll, final Integer icatM2M3CommercEquip, final Integer icatM2M3CommercRNIS, final Integer icatM2M3CommercOther, 
        
			final Integer icatLargeStateAll, final Integer icatLargeStateEquip, final Integer icatLargeStateRNIS, final Integer icatLargeStateOther, 
			final Integer icatLargeMunicAll, final Integer icatLargeMunicEquip, final Integer icatLargeMunicRNIS, final Integer icatLargeMunicOther, 
			final Integer icatLargeCommercAll, final Integer icatLargeCommercEquip, final Integer icatLargeCommercRNIS, final Integer icatLargeCommercOther, 

			final Integer icatDangerStateAll, final Integer icatDangerStateEquip, final Integer icatDangerStateRNIS, final Integer icatDangerStateOther, 
			final Integer icatDangerMunicAll, final Integer icatDangerMunicEquip, final Integer icatDangerMunicRNIS, final Integer  icatDangerMunicOther, 
			final Integer icatDangerCommercAll, final Integer icatDangerCommercEquip, final Integer icatDangerCommercRNIS, final Integer icatDangerCommercOther, 

                        final Integer icatSchoolStateAll, final Integer icatSchoolStateEquip, final Integer icatSchoolStateRNIS, final Integer icatSchoolStateOther, 
                        final Integer icatSchoolMunicAll, final Integer icatSchoolMunicEquip, final Integer icatSchoolMunicRNIS, final Integer icatSchoolMunicOther, 
                        final Integer icatSchoolCommercAll, final Integer icatSchoolCommercEquip, final Integer icatSchoolCommercRNIS, final Integer icatSchoolCommercOther, 

                        final Integer icatGKHStateAll, final Integer icatGKHStateEquip, final Integer icatGKHStateRNIS, final Integer icatGKHStateOther, 
                        final Integer icatGKHMunicAll, final Integer icatGKHMunicEquip, final Integer icatGKHMunicRNIS, final Integer icatGKHMunicOther, 
                        final Integer icatGKHCommercAll, final Integer icatGKHCommercEquip, final Integer icatGKHCommercRNIS, final Integer icatGKHCommercOther, 

                        final Integer icatDepartStateAll, final Integer icatDepartStateEquip, final Integer icatDepartStateRNIS, final Integer icatDepartStateOther, 
                        final Integer icatDepartMunicAll, final Integer icatDepartMunicEquip, final Integer icatDepartMunicRNIS, final Integer icatDepartMunicOther, 
                        final Integer icatDepartCommercAll, final Integer icatDepartCommercEquip, final Integer icatDepartCommercRNIS, final Integer icatDepartCommercOther 
        ) {

        try{
            Report report = newReport(
                        userR, currentDate, 
                        icatM1StateAll, icatM1StateEquip, icatM1StateRNIS, icatM1StateOther,
			icatM1MunicAll, icatM1MunicEquip, icatM1MunicRNIS, icatM1MunicOther,
			icatM1CommercAll, icatM1CommercEquip, icatM1CommercRNIS, icatM1CommercOther,
			
			icatM2M3StateAll, icatM2M3StateEquip, icatM2M3StateRNIS, icatM2M3StateOther, 
			icatM2M3MunicAll, icatM2M3MunicEquip, icatM2M3MunicRNIS, icatM2M3MunicOther, 
			icatM2M3CommercAll, icatM2M3CommercEquip, icatM2M3CommercRNIS, icatM2M3CommercOther, 
        
			icatLargeStateAll, icatLargeStateEquip, icatLargeStateRNIS, icatLargeStateOther, 
			icatLargeMunicAll, icatLargeMunicEquip, icatLargeMunicRNIS, icatLargeMunicOther, 
			icatLargeCommercAll, icatLargeCommercEquip, icatLargeCommercRNIS, icatLargeCommercOther, 

			icatDangerStateAll, icatDangerStateEquip, icatDangerStateRNIS, icatDangerStateOther, 
			icatDangerMunicAll, icatDangerMunicEquip, icatDangerMunicRNIS, icatDangerMunicOther, 
			icatDangerCommercAll, icatDangerCommercEquip, icatDangerCommercRNIS, icatDangerCommercOther, 

                        icatSchoolStateAll, icatSchoolStateEquip, icatSchoolStateRNIS, icatSchoolStateOther, 
                        icatSchoolMunicAll, icatSchoolMunicEquip, icatSchoolMunicRNIS, icatSchoolMunicOther, 
                        icatSchoolCommercAll, icatSchoolCommercEquip, icatSchoolCommercRNIS, icatSchoolCommercOther, 

                        icatGKHStateAll, icatGKHStateEquip, icatGKHStateRNIS, icatGKHStateOther, 
                        icatGKHMunicAll, icatGKHMunicEquip, icatGKHMunicRNIS, icatGKHMunicOther, 
                        icatGKHCommercAll, icatGKHCommercEquip, icatGKHCommercRNIS, icatGKHCommercOther, 

                        icatDepartStateAll, icatDepartStateEquip, icatDepartStateRNIS, icatDepartStateOther, 
                        icatDepartMunicAll, icatDepartMunicEquip, icatDepartMunicRNIS, icatDepartMunicOther, 
                        icatDepartCommercAll, icatDepartCommercEquip, icatDepartCommercRNIS, icatDepartCommercOther 
                    );
            return 1;
        }catch (Exception e){
            context.setRollbackOnly();
            return 0;
        }

    }

 
private Report newReport(Users userR, Date dateReport,
                        Integer icatM1StateAll, Integer icatM1StateEquip, Integer icatM1StateRNIS, Integer icatM1StateOther,
			Integer icatM1MunicAll, Integer icatM1MunicEquip, Integer icatM1MunicRNIS, Integer icatM1MunicOther,
			Integer icatM1CommercAll, Integer icatM1CommercEquip, Integer icatM1CommercRNIS, Integer icatM1CommercOther,
			
			Integer icatM2M3StateAll, Integer icatM2M3StateEquip, Integer icatM2M3StateRNIS, Integer icatM2M3StateOther, 
			Integer icatM2M3MunicAll, Integer icatM2M3MunicEquip, Integer icatM2M3MunicRNIS, Integer icatM2M3MunicOther, 
			Integer icatM2M3CommercAll, Integer icatM2M3CommercEquip, Integer icatM2M3CommercRNIS, Integer icatM2M3CommercOther, 
        
			Integer icatLargeStateAll, Integer icatLargeStateEquip, Integer icatLargeStateRNIS, Integer icatLargeStateOther, 
			Integer icatLargeMunicAll, Integer icatLargeMunicEquip, Integer icatLargeMunicRNIS, Integer icatLargeMunicOther, 
			Integer icatLargeCommercAll, Integer icatLargeCommercEquip, Integer icatLargeCommercRNIS, Integer icatLargeCommercOther, 

			Integer icatDangerStateAll, Integer icatDangerStateEquip, Integer icatDangerStateRNIS, Integer icatDangerStateOther, 
			Integer icatDangerMunicAll, Integer icatDangerMunicEquip, Integer icatDangerMunicRNIS, Integer  icatDangerMunicOther, 
			Integer icatDangerCommercAll, Integer icatDangerCommercEquip, Integer icatDangerCommercRNIS, Integer icatDangerCommercOther, 

                        Integer icatSchoolStateAll, Integer icatSchoolStateEquip, Integer icatSchoolStateRNIS, Integer icatSchoolStateOther, 
                        Integer icatSchoolMunicAll, Integer icatSchoolMunicEquip, Integer icatSchoolMunicRNIS, Integer icatSchoolMunicOther, 
                        Integer icatSchoolCommercAll, Integer icatSchoolCommercEquip, Integer icatSchoolCommercRNIS, Integer icatSchoolCommercOther, 

                        Integer icatGKHStateAll, Integer icatGKHStateEquip, Integer icatGKHStateRNIS, Integer icatGKHStateOther, 
                        Integer icatGKHMunicAll, Integer icatGKHMunicEquip, Integer icatGKHMunicRNIS, Integer icatGKHMunicOther, 
                        Integer icatGKHCommercAll, Integer icatGKHCommercEquip, Integer icatGKHCommercRNIS, Integer icatGKHCommercOther, 

                        Integer icatDepartStateAll, Integer icatDepartStateEquip, Integer icatDepartStateRNIS, Integer icatDepartStateOther, 
                        Integer icatDepartMunicAll, Integer icatDepartMunicEquip, Integer icatDepartMunicRNIS, Integer icatDepartMunicOther, 
                        Integer icatDepartCommercAll, Integer icatDepartCommercEquip, Integer icatDepartCommercRNIS,  Integer icatDepartCommercOther 
) {
        Report report = new Report (userR, dateReport,
                        icatM1StateAll, icatM1StateEquip, icatM1StateRNIS, icatM1StateOther,
			icatM1MunicAll, icatM1MunicEquip, icatM1MunicRNIS, icatM1MunicOther,
			icatM1CommercAll, icatM1CommercEquip, icatM1CommercRNIS, icatM1CommercOther,
			
			icatM2M3StateAll, icatM2M3StateEquip, icatM2M3StateRNIS, icatM2M3StateOther, 
			icatM2M3MunicAll, icatM2M3MunicEquip, icatM2M3MunicRNIS, icatM2M3MunicOther, 
			icatM2M3CommercAll, icatM2M3CommercEquip, icatM2M3CommercRNIS, icatM2M3CommercOther, 
        
			icatLargeStateAll, icatLargeStateEquip, icatLargeStateRNIS, icatLargeStateOther, 
			icatLargeMunicAll, icatLargeMunicEquip, icatLargeMunicRNIS, icatLargeMunicOther, 
			icatLargeCommercAll, icatLargeCommercEquip, icatLargeCommercRNIS, icatLargeCommercOther, 

			icatDangerStateAll, icatDangerStateEquip, icatDangerStateRNIS, icatDangerStateOther, 
			icatDangerMunicAll, icatDangerMunicEquip, icatDangerMunicRNIS, icatDangerMunicOther, 
			icatDangerCommercAll, icatDangerCommercEquip, icatDangerCommercRNIS, icatDangerCommercOther, 

                        icatSchoolStateAll, icatSchoolStateEquip, icatSchoolStateRNIS, icatSchoolStateOther, 
                        icatSchoolMunicAll, icatSchoolMunicEquip, icatSchoolMunicRNIS, icatSchoolMunicOther, 
                        icatSchoolCommercAll, icatSchoolCommercEquip, icatSchoolCommercRNIS, icatSchoolCommercOther, 

                        icatGKHStateAll, icatGKHStateEquip, icatGKHStateRNIS, icatGKHStateOther, 
                        icatGKHMunicAll, icatGKHMunicEquip, icatGKHMunicRNIS, icatGKHMunicOther, 
                        icatGKHCommercAll, icatGKHCommercEquip, icatGKHCommercRNIS, icatGKHCommercOther, 

                        icatDepartStateAll, icatDepartStateEquip, icatDepartStateRNIS, icatDepartStateOther, 
                        icatDepartMunicAll, icatDepartMunicEquip, icatDepartMunicRNIS, icatDepartMunicOther, 
                        icatDepartCommercAll, icatDepartCommercEquip, icatDepartCommercRNIS, icatDepartCommercOther 
        );
        em.persist(report);
        return report;
    }

 
public void removeReport(int id) {
    Report report = em.find(Report.class, id);
    if (report != null) {
        em.remove(report);
        }
}

public List<Report> findAllReports() {
    TypedQuery<Report> query = em.createQuery("SELECT r FROM Report r ORDER BY r.dateReport ASC", Report.class);
    return query.getResultList();
}

    public String findReportsLogin(String login) {
    List<Report> report;
    Users user;
    List resultList = em.createQuery("SELECT u FROM Users u WHERE u.login = :login").setParameter("login", login).getResultList();
//    userReports=query.getReursultList();
    
    return Integer.toString(resultList.size());
    }

}