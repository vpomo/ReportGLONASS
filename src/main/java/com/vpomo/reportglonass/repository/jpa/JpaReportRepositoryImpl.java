package com.vpomo.reportglonass.repository.jpa;

import com.vpomo.reportglonass.model.Report;
import com.vpomo.reportglonass.model.Users;
import com.vpomo.reportglonass.repository.ReportRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by Помогалов on 02.08.2015.
 */

@Repository
@EnableTransactionManagement
public class JpaReportRepositoryImpl implements ReportRepository{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Report> getAll() {
        Query query = this.entityManager.createQuery("SELECT r FROM Report r ORDER BY r.dateReport ASC");
        List<Report> resultlist = query.getResultList();
        return resultlist;
    }

}
