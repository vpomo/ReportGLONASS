package com.vpomo.reportglonass.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by Помогалов on 02.08.2015.
 */
@Entity
public class Report {
    private int idReport;

    @Id
    @javax.persistence.Column(name = "id_report", nullable = false, insertable = true, updatable = true)
    public int getIdReport() {
        return idReport;
    }

    public void setIdReport(int idReport) {
        this.idReport = idReport;
    }

    private Timestamp dateReport;

    @Basic
    @javax.persistence.Column(name = "date_report", nullable = true, insertable = true, updatable = true)
    public Timestamp getDateReport() {
        return dateReport;
    }

    public void setDateReport(Timestamp dateReport) {
        this.dateReport = dateReport;
    }

    private Integer catM1StateAll;

    @Basic
    @javax.persistence.Column(name = "catM1StateAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatM1StateAll() {
        return catM1StateAll;
    }

    public void setCatM1StateAll(Integer catM1StateAll) {
        this.catM1StateAll = catM1StateAll;
    }

    private Integer catM1MunicAll;

    @Basic
    @javax.persistence.Column(name = "catM1MunicAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatM1MunicAll() {
        return catM1MunicAll;
    }

    public void setCatM1MunicAll(Integer catM1MunicAll) {
        this.catM1MunicAll = catM1MunicAll;
    }

    private Integer catM1CommercAll;

    @Basic
    @javax.persistence.Column(name = "catM1CommercAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatM1CommercAll() {
        return catM1CommercAll;
    }

    public void setCatM1CommercAll(Integer catM1CommercAll) {
        this.catM1CommercAll = catM1CommercAll;
    }

    private Integer catM1ItogAll;

    @Basic
    @javax.persistence.Column(name = "catM1ItogAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatM1ItogAll() {
        return catM1ItogAll;
    }

    public void setCatM1ItogAll(Integer catM1ItogAll) {
        this.catM1ItogAll = catM1ItogAll;
    }

    private Integer catM2M3StateAll;

    @Basic
    @javax.persistence.Column(name = "catM2M3StateAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatM2M3StateAll() {
        return catM2M3StateAll;
    }

    public void setCatM2M3StateAll(Integer catM2M3StateAll) {
        this.catM2M3StateAll = catM2M3StateAll;
    }

    private Integer catM2M3MunicAll;

    @Basic
    @javax.persistence.Column(name = "catM2M3MunicAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatM2M3MunicAll() {
        return catM2M3MunicAll;
    }

    public void setCatM2M3MunicAll(Integer catM2M3MunicAll) {
        this.catM2M3MunicAll = catM2M3MunicAll;
    }

    private Integer catM2M3CommercAll;

    @Basic
    @javax.persistence.Column(name = "catM2M3CommercAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatM2M3CommercAll() {
        return catM2M3CommercAll;
    }

    public void setCatM2M3CommercAll(Integer catM2M3CommercAll) {
        this.catM2M3CommercAll = catM2M3CommercAll;
    }

    private Integer catM2M3ItogAll;

    @Basic
    @javax.persistence.Column(name = "catM2M3ItogAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatM2M3ItogAll() {
        return catM2M3ItogAll;
    }

    public void setCatM2M3ItogAll(Integer catM2M3ItogAll) {
        this.catM2M3ItogAll = catM2M3ItogAll;
    }

    private Integer catLargeStateAll;

    @Basic
    @javax.persistence.Column(name = "catLargeStateAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatLargeStateAll() {
        return catLargeStateAll;
    }

    public void setCatLargeStateAll(Integer catLargeStateAll) {
        this.catLargeStateAll = catLargeStateAll;
    }

    private Integer catLargeMunicAll;

    @Basic
    @javax.persistence.Column(name = "catLargeMunicAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatLargeMunicAll() {
        return catLargeMunicAll;
    }

    public void setCatLargeMunicAll(Integer catLargeMunicAll) {
        this.catLargeMunicAll = catLargeMunicAll;
    }

    private Integer catLargeCommercAll;

    @Basic
    @javax.persistence.Column(name = "catLargeCommercAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatLargeCommercAll() {
        return catLargeCommercAll;
    }

    public void setCatLargeCommercAll(Integer catLargeCommercAll) {
        this.catLargeCommercAll = catLargeCommercAll;
    }

    private Integer catLargeItogAll;

    @Basic
    @javax.persistence.Column(name = "catLargeItogAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatLargeItogAll() {
        return catLargeItogAll;
    }

    public void setCatLargeItogAll(Integer catLargeItogAll) {
        this.catLargeItogAll = catLargeItogAll;
    }

    private Integer catDangerStateAll;

    @Basic
    @javax.persistence.Column(name = "catDangerStateAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatDangerStateAll() {
        return catDangerStateAll;
    }

    public void setCatDangerStateAll(Integer catDangerStateAll) {
        this.catDangerStateAll = catDangerStateAll;
    }

    private Integer catDangerMunicAll;

    @Basic
    @javax.persistence.Column(name = "catDangerMunicAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatDangerMunicAll() {
        return catDangerMunicAll;
    }

    public void setCatDangerMunicAll(Integer catDangerMunicAll) {
        this.catDangerMunicAll = catDangerMunicAll;
    }

    private Integer catDangerCommercAll;

    @Basic
    @javax.persistence.Column(name = "catDangerCommercAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatDangerCommercAll() {
        return catDangerCommercAll;
    }

    public void setCatDangerCommercAll(Integer catDangerCommercAll) {
        this.catDangerCommercAll = catDangerCommercAll;
    }

    private Integer catDangerItogAll;

    @Basic
    @javax.persistence.Column(name = "catDangerItogAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatDangerItogAll() {
        return catDangerItogAll;
    }

    public void setCatDangerItogAll(Integer catDangerItogAll) {
        this.catDangerItogAll = catDangerItogAll;
    }

    private Integer catSchoolStateAll;

    @Basic
    @javax.persistence.Column(name = "catSchoolStateAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatSchoolStateAll() {
        return catSchoolStateAll;
    }

    public void setCatSchoolStateAll(Integer catSchoolStateAll) {
        this.catSchoolStateAll = catSchoolStateAll;
    }

    private Integer catSchoolMunicAll;

    @Basic
    @javax.persistence.Column(name = "catSchoolMunicAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatSchoolMunicAll() {
        return catSchoolMunicAll;
    }

    public void setCatSchoolMunicAll(Integer catSchoolMunicAll) {
        this.catSchoolMunicAll = catSchoolMunicAll;
    }

    private Integer catSchoolCommercAll;

    @Basic
    @javax.persistence.Column(name = "catSchoolCommercAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatSchoolCommercAll() {
        return catSchoolCommercAll;
    }

    public void setCatSchoolCommercAll(Integer catSchoolCommercAll) {
        this.catSchoolCommercAll = catSchoolCommercAll;
    }

    private Integer catSchoolItogAll;

    @Basic
    @javax.persistence.Column(name = "catSchoolItogAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatSchoolItogAll() {
        return catSchoolItogAll;
    }

    public void setCatSchoolItogAll(Integer catSchoolItogAll) {
        this.catSchoolItogAll = catSchoolItogAll;
    }

    private Integer catGkhStateAll;

    @Basic
    @javax.persistence.Column(name = "catGKHStateAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatGkhStateAll() {
        return catGkhStateAll;
    }

    public void setCatGkhStateAll(Integer catGkhStateAll) {
        this.catGkhStateAll = catGkhStateAll;
    }

    private Integer catGkhMunicAll;

    @Basic
    @javax.persistence.Column(name = "catGKHMunicAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatGkhMunicAll() {
        return catGkhMunicAll;
    }

    public void setCatGkhMunicAll(Integer catGkhMunicAll) {
        this.catGkhMunicAll = catGkhMunicAll;
    }

    private Integer catGkhCommercAll;

    @Basic
    @javax.persistence.Column(name = "catGKHCommercAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatGkhCommercAll() {
        return catGkhCommercAll;
    }

    public void setCatGkhCommercAll(Integer catGkhCommercAll) {
        this.catGkhCommercAll = catGkhCommercAll;
    }

    private Integer catGkhItogAll;

    @Basic
    @javax.persistence.Column(name = "catGKHItogAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatGkhItogAll() {
        return catGkhItogAll;
    }

    public void setCatGkhItogAll(Integer catGkhItogAll) {
        this.catGkhItogAll = catGkhItogAll;
    }

    private Integer catDepartStateAll;

    @Basic
    @javax.persistence.Column(name = "catDepartStateAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatDepartStateAll() {
        return catDepartStateAll;
    }

    public void setCatDepartStateAll(Integer catDepartStateAll) {
        this.catDepartStateAll = catDepartStateAll;
    }

    private Integer catDepartMunicAll;

    @Basic
    @javax.persistence.Column(name = "catDepartMunicAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatDepartMunicAll() {
        return catDepartMunicAll;
    }

    public void setCatDepartMunicAll(Integer catDepartMunicAll) {
        this.catDepartMunicAll = catDepartMunicAll;
    }

    private Integer catDepartCommercAll;

    @Basic
    @javax.persistence.Column(name = "catDepartCommercAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatDepartCommercAll() {
        return catDepartCommercAll;
    }

    public void setCatDepartCommercAll(Integer catDepartCommercAll) {
        this.catDepartCommercAll = catDepartCommercAll;
    }

    private Integer catDepartItogAll;

    @Basic
    @javax.persistence.Column(name = "catDepartItogAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatDepartItogAll() {
        return catDepartItogAll;
    }

    public void setCatDepartItogAll(Integer catDepartItogAll) {
        this.catDepartItogAll = catDepartItogAll;
    }

    private Integer catM1StateEquip;

    @Basic
    @javax.persistence.Column(name = "catM1StateEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatM1StateEquip() {
        return catM1StateEquip;
    }

    public void setCatM1StateEquip(Integer catM1StateEquip) {
        this.catM1StateEquip = catM1StateEquip;
    }

    private Integer catM1MunicEquip;

    @Basic
    @javax.persistence.Column(name = "catM1MunicEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatM1MunicEquip() {
        return catM1MunicEquip;
    }

    public void setCatM1MunicEquip(Integer catM1MunicEquip) {
        this.catM1MunicEquip = catM1MunicEquip;
    }

    private Integer catM1CommercEquip;

    @Basic
    @javax.persistence.Column(name = "catM1CommercEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatM1CommercEquip() {
        return catM1CommercEquip;
    }

    public void setCatM1CommercEquip(Integer catM1CommercEquip) {
        this.catM1CommercEquip = catM1CommercEquip;
    }

    private Integer catM1ItogEquip;

    @Basic
    @javax.persistence.Column(name = "catM1ItogEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatM1ItogEquip() {
        return catM1ItogEquip;
    }

    public void setCatM1ItogEquip(Integer catM1ItogEquip) {
        this.catM1ItogEquip = catM1ItogEquip;
    }

    private Integer catM2M3StateEquip;

    @Basic
    @javax.persistence.Column(name = "catM2M3StateEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatM2M3StateEquip() {
        return catM2M3StateEquip;
    }

    public void setCatM2M3StateEquip(Integer catM2M3StateEquip) {
        this.catM2M3StateEquip = catM2M3StateEquip;
    }

    private Integer catM2M3MunicEquip;

    @Basic
    @javax.persistence.Column(name = "catM2M3MunicEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatM2M3MunicEquip() {
        return catM2M3MunicEquip;
    }

    public void setCatM2M3MunicEquip(Integer catM2M3MunicEquip) {
        this.catM2M3MunicEquip = catM2M3MunicEquip;
    }

    private Integer catM2M3CommercEquip;

    @Basic
    @javax.persistence.Column(name = "catM2M3CommercEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatM2M3CommercEquip() {
        return catM2M3CommercEquip;
    }

    public void setCatM2M3CommercEquip(Integer catM2M3CommercEquip) {
        this.catM2M3CommercEquip = catM2M3CommercEquip;
    }

    private Integer catM2M3ItogEquip;

    @Basic
    @javax.persistence.Column(name = "catM2M3ItogEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatM2M3ItogEquip() {
        return catM2M3ItogEquip;
    }

    public void setCatM2M3ItogEquip(Integer catM2M3ItogEquip) {
        this.catM2M3ItogEquip = catM2M3ItogEquip;
    }

    private Integer catLargeStateEquip;

    @Basic
    @javax.persistence.Column(name = "catLargeStateEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatLargeStateEquip() {
        return catLargeStateEquip;
    }

    public void setCatLargeStateEquip(Integer catLargeStateEquip) {
        this.catLargeStateEquip = catLargeStateEquip;
    }

    private Integer catLargeMunicEquip;

    @Basic
    @javax.persistence.Column(name = "catLargeMunicEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatLargeMunicEquip() {
        return catLargeMunicEquip;
    }

    public void setCatLargeMunicEquip(Integer catLargeMunicEquip) {
        this.catLargeMunicEquip = catLargeMunicEquip;
    }

    private Integer catLargeCommercEquip;

    @Basic
    @javax.persistence.Column(name = "catLargeCommercEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatLargeCommercEquip() {
        return catLargeCommercEquip;
    }

    public void setCatLargeCommercEquip(Integer catLargeCommercEquip) {
        this.catLargeCommercEquip = catLargeCommercEquip;
    }

    private Integer catLargeItogEquip;

    @Basic
    @javax.persistence.Column(name = "catLargeItogEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatLargeItogEquip() {
        return catLargeItogEquip;
    }

    public void setCatLargeItogEquip(Integer catLargeItogEquip) {
        this.catLargeItogEquip = catLargeItogEquip;
    }

    private Integer catDangerStateEquip;

    @Basic
    @javax.persistence.Column(name = "catDangerStateEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatDangerStateEquip() {
        return catDangerStateEquip;
    }

    public void setCatDangerStateEquip(Integer catDangerStateEquip) {
        this.catDangerStateEquip = catDangerStateEquip;
    }

    private Integer catDangerMunicEquip;

    @Basic
    @javax.persistence.Column(name = "catDangerMunicEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatDangerMunicEquip() {
        return catDangerMunicEquip;
    }

    public void setCatDangerMunicEquip(Integer catDangerMunicEquip) {
        this.catDangerMunicEquip = catDangerMunicEquip;
    }

    private Integer catDangerCommercEquip;

    @Basic
    @javax.persistence.Column(name = "catDangerCommercEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatDangerCommercEquip() {
        return catDangerCommercEquip;
    }

    public void setCatDangerCommercEquip(Integer catDangerCommercEquip) {
        this.catDangerCommercEquip = catDangerCommercEquip;
    }

    private Integer catDangerItogEquip;

    @Basic
    @javax.persistence.Column(name = "catDangerItogEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatDangerItogEquip() {
        return catDangerItogEquip;
    }

    public void setCatDangerItogEquip(Integer catDangerItogEquip) {
        this.catDangerItogEquip = catDangerItogEquip;
    }

    private Integer catSchoolStateEquip;

    @Basic
    @javax.persistence.Column(name = "catSchoolStateEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatSchoolStateEquip() {
        return catSchoolStateEquip;
    }

    public void setCatSchoolStateEquip(Integer catSchoolStateEquip) {
        this.catSchoolStateEquip = catSchoolStateEquip;
    }

    private Integer catSchoolMunicEquip;

    @Basic
    @javax.persistence.Column(name = "catSchoolMunicEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatSchoolMunicEquip() {
        return catSchoolMunicEquip;
    }

    public void setCatSchoolMunicEquip(Integer catSchoolMunicEquip) {
        this.catSchoolMunicEquip = catSchoolMunicEquip;
    }

    private Integer catSchoolCommercEquip;

    @Basic
    @javax.persistence.Column(name = "catSchoolCommercEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatSchoolCommercEquip() {
        return catSchoolCommercEquip;
    }

    public void setCatSchoolCommercEquip(Integer catSchoolCommercEquip) {
        this.catSchoolCommercEquip = catSchoolCommercEquip;
    }

    private Integer catSchoolItogEquip;

    @Basic
    @javax.persistence.Column(name = "catSchoolItogEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatSchoolItogEquip() {
        return catSchoolItogEquip;
    }

    public void setCatSchoolItogEquip(Integer catSchoolItogEquip) {
        this.catSchoolItogEquip = catSchoolItogEquip;
    }

    private Integer catGkhStateEquip;

    @Basic
    @javax.persistence.Column(name = "catGKHStateEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatGkhStateEquip() {
        return catGkhStateEquip;
    }

    public void setCatGkhStateEquip(Integer catGkhStateEquip) {
        this.catGkhStateEquip = catGkhStateEquip;
    }

    private Integer catGkhMunicEquip;

    @Basic
    @javax.persistence.Column(name = "catGKHMunicEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatGkhMunicEquip() {
        return catGkhMunicEquip;
    }

    public void setCatGkhMunicEquip(Integer catGkhMunicEquip) {
        this.catGkhMunicEquip = catGkhMunicEquip;
    }

    private Integer catGkhCommercEquip;

    @Basic
    @javax.persistence.Column(name = "catGKHCommercEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatGkhCommercEquip() {
        return catGkhCommercEquip;
    }

    public void setCatGkhCommercEquip(Integer catGkhCommercEquip) {
        this.catGkhCommercEquip = catGkhCommercEquip;
    }

    private Integer catGkhItogEquip;

    @Basic
    @javax.persistence.Column(name = "catGKHItogEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatGkhItogEquip() {
        return catGkhItogEquip;
    }

    public void setCatGkhItogEquip(Integer catGkhItogEquip) {
        this.catGkhItogEquip = catGkhItogEquip;
    }

    private Integer catDepartStateEquip;

    @Basic
    @javax.persistence.Column(name = "catDepartStateEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatDepartStateEquip() {
        return catDepartStateEquip;
    }

    public void setCatDepartStateEquip(Integer catDepartStateEquip) {
        this.catDepartStateEquip = catDepartStateEquip;
    }

    private Integer catDepartMunicEquip;

    @Basic
    @javax.persistence.Column(name = "catDepartMunicEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatDepartMunicEquip() {
        return catDepartMunicEquip;
    }

    public void setCatDepartMunicEquip(Integer catDepartMunicEquip) {
        this.catDepartMunicEquip = catDepartMunicEquip;
    }

    private Integer catDepartCommercEquip;

    @Basic
    @javax.persistence.Column(name = "catDepartCommercEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatDepartCommercEquip() {
        return catDepartCommercEquip;
    }

    public void setCatDepartCommercEquip(Integer catDepartCommercEquip) {
        this.catDepartCommercEquip = catDepartCommercEquip;
    }

    private Integer catDepartItogEquip;

    @Basic
    @javax.persistence.Column(name = "catDepartItogEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatDepartItogEquip() {
        return catDepartItogEquip;
    }

    public void setCatDepartItogEquip(Integer catDepartItogEquip) {
        this.catDepartItogEquip = catDepartItogEquip;
    }

    private Integer catM1StateRnis;

    @Basic
    @javax.persistence.Column(name = "catM1StateRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatM1StateRnis() {
        return catM1StateRnis;
    }

    public void setCatM1StateRnis(Integer catM1StateRnis) {
        this.catM1StateRnis = catM1StateRnis;
    }

    private Integer catM1MunicRnis;

    @Basic
    @javax.persistence.Column(name = "catM1MunicRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatM1MunicRnis() {
        return catM1MunicRnis;
    }

    public void setCatM1MunicRnis(Integer catM1MunicRnis) {
        this.catM1MunicRnis = catM1MunicRnis;
    }

    private Integer catM1CommercRnis;

    @Basic
    @javax.persistence.Column(name = "catM1CommercRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatM1CommercRnis() {
        return catM1CommercRnis;
    }

    public void setCatM1CommercRnis(Integer catM1CommercRnis) {
        this.catM1CommercRnis = catM1CommercRnis;
    }

    private Integer catM1ItogRnis;

    @Basic
    @javax.persistence.Column(name = "catM1ItogRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatM1ItogRnis() {
        return catM1ItogRnis;
    }

    public void setCatM1ItogRnis(Integer catM1ItogRnis) {
        this.catM1ItogRnis = catM1ItogRnis;
    }

    private Integer catM2M3StateRnis;

    @Basic
    @javax.persistence.Column(name = "catM2M3StateRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatM2M3StateRnis() {
        return catM2M3StateRnis;
    }

    public void setCatM2M3StateRnis(Integer catM2M3StateRnis) {
        this.catM2M3StateRnis = catM2M3StateRnis;
    }

    private Integer catM2M3MunicRnis;

    @Basic
    @javax.persistence.Column(name = "catM2M3MunicRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatM2M3MunicRnis() {
        return catM2M3MunicRnis;
    }

    public void setCatM2M3MunicRnis(Integer catM2M3MunicRnis) {
        this.catM2M3MunicRnis = catM2M3MunicRnis;
    }

    private Integer catM2M3CommercRnis;

    @Basic
    @javax.persistence.Column(name = "catM2M3CommercRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatM2M3CommercRnis() {
        return catM2M3CommercRnis;
    }

    public void setCatM2M3CommercRnis(Integer catM2M3CommercRnis) {
        this.catM2M3CommercRnis = catM2M3CommercRnis;
    }

    private Integer catM2M3ItogRnis;

    @Basic
    @javax.persistence.Column(name = "catM2M3ItogRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatM2M3ItogRnis() {
        return catM2M3ItogRnis;
    }

    public void setCatM2M3ItogRnis(Integer catM2M3ItogRnis) {
        this.catM2M3ItogRnis = catM2M3ItogRnis;
    }

    private Integer catLargeStateRnis;

    @Basic
    @javax.persistence.Column(name = "catLargeStateRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatLargeStateRnis() {
        return catLargeStateRnis;
    }

    public void setCatLargeStateRnis(Integer catLargeStateRnis) {
        this.catLargeStateRnis = catLargeStateRnis;
    }

    private Integer catLargeMunicRnis;

    @Basic
    @javax.persistence.Column(name = "catLargeMunicRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatLargeMunicRnis() {
        return catLargeMunicRnis;
    }

    public void setCatLargeMunicRnis(Integer catLargeMunicRnis) {
        this.catLargeMunicRnis = catLargeMunicRnis;
    }

    private Integer catLargeCommercRnis;

    @Basic
    @javax.persistence.Column(name = "catLargeCommercRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatLargeCommercRnis() {
        return catLargeCommercRnis;
    }

    public void setCatLargeCommercRnis(Integer catLargeCommercRnis) {
        this.catLargeCommercRnis = catLargeCommercRnis;
    }

    private Integer catLargeItogRnis;

    @Basic
    @javax.persistence.Column(name = "catLargeItogRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatLargeItogRnis() {
        return catLargeItogRnis;
    }

    public void setCatLargeItogRnis(Integer catLargeItogRnis) {
        this.catLargeItogRnis = catLargeItogRnis;
    }

    private Integer catDangerStateRnis;

    @Basic
    @javax.persistence.Column(name = "catDangerStateRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatDangerStateRnis() {
        return catDangerStateRnis;
    }

    public void setCatDangerStateRnis(Integer catDangerStateRnis) {
        this.catDangerStateRnis = catDangerStateRnis;
    }

    private Integer catDangerMunicRnis;

    @Basic
    @javax.persistence.Column(name = "catDangerMunicRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatDangerMunicRnis() {
        return catDangerMunicRnis;
    }

    public void setCatDangerMunicRnis(Integer catDangerMunicRnis) {
        this.catDangerMunicRnis = catDangerMunicRnis;
    }

    private Integer catDangerCommercRnis;

    @Basic
    @javax.persistence.Column(name = "catDangerCommercRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatDangerCommercRnis() {
        return catDangerCommercRnis;
    }

    public void setCatDangerCommercRnis(Integer catDangerCommercRnis) {
        this.catDangerCommercRnis = catDangerCommercRnis;
    }

    private Integer catDangerItogRnis;

    @Basic
    @javax.persistence.Column(name = "catDangerItogRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatDangerItogRnis() {
        return catDangerItogRnis;
    }

    public void setCatDangerItogRnis(Integer catDangerItogRnis) {
        this.catDangerItogRnis = catDangerItogRnis;
    }

    private Integer catSchoolStateRnis;

    @Basic
    @javax.persistence.Column(name = "catSchoolStateRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatSchoolStateRnis() {
        return catSchoolStateRnis;
    }

    public void setCatSchoolStateRnis(Integer catSchoolStateRnis) {
        this.catSchoolStateRnis = catSchoolStateRnis;
    }

    private Integer catSchoolMunicRnis;

    @Basic
    @javax.persistence.Column(name = "catSchoolMunicRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatSchoolMunicRnis() {
        return catSchoolMunicRnis;
    }

    public void setCatSchoolMunicRnis(Integer catSchoolMunicRnis) {
        this.catSchoolMunicRnis = catSchoolMunicRnis;
    }

    private Integer catSchoolCommercRnis;

    @Basic
    @javax.persistence.Column(name = "catSchoolCommercRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatSchoolCommercRnis() {
        return catSchoolCommercRnis;
    }

    public void setCatSchoolCommercRnis(Integer catSchoolCommercRnis) {
        this.catSchoolCommercRnis = catSchoolCommercRnis;
    }

    private Integer catSchoolItogRnis;

    @Basic
    @javax.persistence.Column(name = "catSchoolItogRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatSchoolItogRnis() {
        return catSchoolItogRnis;
    }

    public void setCatSchoolItogRnis(Integer catSchoolItogRnis) {
        this.catSchoolItogRnis = catSchoolItogRnis;
    }

    private Integer catGkhStateRnis;

    @Basic
    @javax.persistence.Column(name = "catGKHStateRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatGkhStateRnis() {
        return catGkhStateRnis;
    }

    public void setCatGkhStateRnis(Integer catGkhStateRnis) {
        this.catGkhStateRnis = catGkhStateRnis;
    }

    private Integer catGkhMunicRnis;

    @Basic
    @javax.persistence.Column(name = "catGKHMunicRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatGkhMunicRnis() {
        return catGkhMunicRnis;
    }

    public void setCatGkhMunicRnis(Integer catGkhMunicRnis) {
        this.catGkhMunicRnis = catGkhMunicRnis;
    }

    private Integer catGkhCommercRnis;

    @Basic
    @javax.persistence.Column(name = "catGKHCommercRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatGkhCommercRnis() {
        return catGkhCommercRnis;
    }

    public void setCatGkhCommercRnis(Integer catGkhCommercRnis) {
        this.catGkhCommercRnis = catGkhCommercRnis;
    }

    private Integer catGkhItogRnis;

    @Basic
    @javax.persistence.Column(name = "catGKHItogRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatGkhItogRnis() {
        return catGkhItogRnis;
    }

    public void setCatGkhItogRnis(Integer catGkhItogRnis) {
        this.catGkhItogRnis = catGkhItogRnis;
    }

    private Integer catDepartStateRnis;

    @Basic
    @javax.persistence.Column(name = "catDepartStateRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatDepartStateRnis() {
        return catDepartStateRnis;
    }

    public void setCatDepartStateRnis(Integer catDepartStateRnis) {
        this.catDepartStateRnis = catDepartStateRnis;
    }

    private Integer catDepartMunicRnis;

    @Basic
    @javax.persistence.Column(name = "catDepartMunicRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatDepartMunicRnis() {
        return catDepartMunicRnis;
    }

    public void setCatDepartMunicRnis(Integer catDepartMunicRnis) {
        this.catDepartMunicRnis = catDepartMunicRnis;
    }

    private Integer catDepartCommercRnis;

    @Basic
    @javax.persistence.Column(name = "catDepartCommercRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatDepartCommercRnis() {
        return catDepartCommercRnis;
    }

    public void setCatDepartCommercRnis(Integer catDepartCommercRnis) {
        this.catDepartCommercRnis = catDepartCommercRnis;
    }

    private Integer catDepartItogRnis;

    @Basic
    @javax.persistence.Column(name = "catDepartItogRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatDepartItogRnis() {
        return catDepartItogRnis;
    }

    public void setCatDepartItogRnis(Integer catDepartItogRnis) {
        this.catDepartItogRnis = catDepartItogRnis;
    }

    private Integer catM1StateOther;

    @Basic
    @javax.persistence.Column(name = "catM1StateOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatM1StateOther() {
        return catM1StateOther;
    }

    public void setCatM1StateOther(Integer catM1StateOther) {
        this.catM1StateOther = catM1StateOther;
    }

    private Integer catM1MunicOther;

    @Basic
    @javax.persistence.Column(name = "catM1MunicOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatM1MunicOther() {
        return catM1MunicOther;
    }

    public void setCatM1MunicOther(Integer catM1MunicOther) {
        this.catM1MunicOther = catM1MunicOther;
    }

    private Integer catM1CommercOther;

    @Basic
    @javax.persistence.Column(name = "catM1CommercOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatM1CommercOther() {
        return catM1CommercOther;
    }

    public void setCatM1CommercOther(Integer catM1CommercOther) {
        this.catM1CommercOther = catM1CommercOther;
    }

    private Integer catM1ItogOther;

    @Basic
    @javax.persistence.Column(name = "catM1ItogOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatM1ItogOther() {
        return catM1ItogOther;
    }

    public void setCatM1ItogOther(Integer catM1ItogOther) {
        this.catM1ItogOther = catM1ItogOther;
    }

    private Integer catM2M3StateOther;

    @Basic
    @javax.persistence.Column(name = "catM2M3StateOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatM2M3StateOther() {
        return catM2M3StateOther;
    }

    public void setCatM2M3StateOther(Integer catM2M3StateOther) {
        this.catM2M3StateOther = catM2M3StateOther;
    }

    private Integer catM2M3MunicOther;

    @Basic
    @javax.persistence.Column(name = "catM2M3MunicOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatM2M3MunicOther() {
        return catM2M3MunicOther;
    }

    public void setCatM2M3MunicOther(Integer catM2M3MunicOther) {
        this.catM2M3MunicOther = catM2M3MunicOther;
    }

    private Integer catM2M3CommercOther;

    @Basic
    @javax.persistence.Column(name = "catM2M3CommercOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatM2M3CommercOther() {
        return catM2M3CommercOther;
    }

    public void setCatM2M3CommercOther(Integer catM2M3CommercOther) {
        this.catM2M3CommercOther = catM2M3CommercOther;
    }

    private Integer catM2M3ItogOther;

    @Basic
    @javax.persistence.Column(name = "catM2M3ItogOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatM2M3ItogOther() {
        return catM2M3ItogOther;
    }

    public void setCatM2M3ItogOther(Integer catM2M3ItogOther) {
        this.catM2M3ItogOther = catM2M3ItogOther;
    }

    private Integer catLargeStateOther;

    @Basic
    @javax.persistence.Column(name = "catLargeStateOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatLargeStateOther() {
        return catLargeStateOther;
    }

    public void setCatLargeStateOther(Integer catLargeStateOther) {
        this.catLargeStateOther = catLargeStateOther;
    }

    private Integer catLargeMunicOther;

    @Basic
    @javax.persistence.Column(name = "catLargeMunicOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatLargeMunicOther() {
        return catLargeMunicOther;
    }

    public void setCatLargeMunicOther(Integer catLargeMunicOther) {
        this.catLargeMunicOther = catLargeMunicOther;
    }

    private Integer catLargeCommercOther;

    @Basic
    @javax.persistence.Column(name = "catLargeCommercOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatLargeCommercOther() {
        return catLargeCommercOther;
    }

    public void setCatLargeCommercOther(Integer catLargeCommercOther) {
        this.catLargeCommercOther = catLargeCommercOther;
    }

    private Integer catLargeItogOther;

    @Basic
    @javax.persistence.Column(name = "catLargeItogOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatLargeItogOther() {
        return catLargeItogOther;
    }

    public void setCatLargeItogOther(Integer catLargeItogOther) {
        this.catLargeItogOther = catLargeItogOther;
    }

    private Integer catDangerStateOther;

    @Basic
    @javax.persistence.Column(name = "catDangerStateOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatDangerStateOther() {
        return catDangerStateOther;
    }

    public void setCatDangerStateOther(Integer catDangerStateOther) {
        this.catDangerStateOther = catDangerStateOther;
    }

    private Integer catDangerMunicOther;

    @Basic
    @javax.persistence.Column(name = "catDangerMunicOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatDangerMunicOther() {
        return catDangerMunicOther;
    }

    public void setCatDangerMunicOther(Integer catDangerMunicOther) {
        this.catDangerMunicOther = catDangerMunicOther;
    }

    private Integer catDangerCommercOther;

    @Basic
    @javax.persistence.Column(name = "catDangerCommercOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatDangerCommercOther() {
        return catDangerCommercOther;
    }

    public void setCatDangerCommercOther(Integer catDangerCommercOther) {
        this.catDangerCommercOther = catDangerCommercOther;
    }

    private Integer catDangerItogOther;

    @Basic
    @javax.persistence.Column(name = "catDangerItogOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatDangerItogOther() {
        return catDangerItogOther;
    }

    public void setCatDangerItogOther(Integer catDangerItogOther) {
        this.catDangerItogOther = catDangerItogOther;
    }

    private Integer catSchoolStateOther;

    @Basic
    @javax.persistence.Column(name = "catSchoolStateOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatSchoolStateOther() {
        return catSchoolStateOther;
    }

    public void setCatSchoolStateOther(Integer catSchoolStateOther) {
        this.catSchoolStateOther = catSchoolStateOther;
    }

    private Integer catSchoolMunicOther;

    @Basic
    @javax.persistence.Column(name = "catSchoolMunicOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatSchoolMunicOther() {
        return catSchoolMunicOther;
    }

    public void setCatSchoolMunicOther(Integer catSchoolMunicOther) {
        this.catSchoolMunicOther = catSchoolMunicOther;
    }

    private Integer catSchoolCommercOther;

    @Basic
    @javax.persistence.Column(name = "catSchoolCommercOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatSchoolCommercOther() {
        return catSchoolCommercOther;
    }

    public void setCatSchoolCommercOther(Integer catSchoolCommercOther) {
        this.catSchoolCommercOther = catSchoolCommercOther;
    }

    private Integer catSchoolItogOther;

    @Basic
    @javax.persistence.Column(name = "catSchoolItogOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatSchoolItogOther() {
        return catSchoolItogOther;
    }

    public void setCatSchoolItogOther(Integer catSchoolItogOther) {
        this.catSchoolItogOther = catSchoolItogOther;
    }

    private Integer catGkhStateOther;

    @Basic
    @javax.persistence.Column(name = "catGKHStateOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatGkhStateOther() {
        return catGkhStateOther;
    }

    public void setCatGkhStateOther(Integer catGkhStateOther) {
        this.catGkhStateOther = catGkhStateOther;
    }

    private Integer catGkhMunicOther;

    @Basic
    @javax.persistence.Column(name = "catGKHMunicOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatGkhMunicOther() {
        return catGkhMunicOther;
    }

    public void setCatGkhMunicOther(Integer catGkhMunicOther) {
        this.catGkhMunicOther = catGkhMunicOther;
    }

    private Integer catGkhCommercOther;

    @Basic
    @javax.persistence.Column(name = "catGKHCommercOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatGkhCommercOther() {
        return catGkhCommercOther;
    }

    public void setCatGkhCommercOther(Integer catGkhCommercOther) {
        this.catGkhCommercOther = catGkhCommercOther;
    }

    private Integer catGkhItogOther;

    @Basic
    @javax.persistence.Column(name = "catGKHItogOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatGkhItogOther() {
        return catGkhItogOther;
    }

    public void setCatGkhItogOther(Integer catGkhItogOther) {
        this.catGkhItogOther = catGkhItogOther;
    }

    private Integer catDepartStateOther;

    @Basic
    @javax.persistence.Column(name = "catDepartStateOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatDepartStateOther() {
        return catDepartStateOther;
    }

    public void setCatDepartStateOther(Integer catDepartStateOther) {
        this.catDepartStateOther = catDepartStateOther;
    }

    private Integer catDepartMunicOther;

    @Basic
    @javax.persistence.Column(name = "catDepartMunicOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatDepartMunicOther() {
        return catDepartMunicOther;
    }

    public void setCatDepartMunicOther(Integer catDepartMunicOther) {
        this.catDepartMunicOther = catDepartMunicOther;
    }

    private Integer catDepartCommercOther;

    @Basic
    @javax.persistence.Column(name = "catDepartCommercOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatDepartCommercOther() {
        return catDepartCommercOther;
    }

    public void setCatDepartCommercOther(Integer catDepartCommercOther) {
        this.catDepartCommercOther = catDepartCommercOther;
    }

    private Integer catDepartItogOther;

    @Basic
    @javax.persistence.Column(name = "catDepartItogOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatDepartItogOther() {
        return catDepartItogOther;
    }

    public void setCatDepartItogOther(Integer catDepartItogOther) {
        this.catDepartItogOther = catDepartItogOther;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Report report = (Report) o;

        if (idReport != report.idReport) return false;
        if (catDangerCommercAll != null ? !catDangerCommercAll.equals(report.catDangerCommercAll) : report.catDangerCommercAll != null)
            return false;
        if (catDangerCommercEquip != null ? !catDangerCommercEquip.equals(report.catDangerCommercEquip) : report.catDangerCommercEquip != null)
            return false;
        if (catDangerCommercOther != null ? !catDangerCommercOther.equals(report.catDangerCommercOther) : report.catDangerCommercOther != null)
            return false;
        if (catDangerCommercRnis != null ? !catDangerCommercRnis.equals(report.catDangerCommercRnis) : report.catDangerCommercRnis != null)
            return false;
        if (catDangerItogAll != null ? !catDangerItogAll.equals(report.catDangerItogAll) : report.catDangerItogAll != null)
            return false;
        if (catDangerItogEquip != null ? !catDangerItogEquip.equals(report.catDangerItogEquip) : report.catDangerItogEquip != null)
            return false;
        if (catDangerItogOther != null ? !catDangerItogOther.equals(report.catDangerItogOther) : report.catDangerItogOther != null)
            return false;
        if (catDangerItogRnis != null ? !catDangerItogRnis.equals(report.catDangerItogRnis) : report.catDangerItogRnis != null)
            return false;
        if (catDangerMunicAll != null ? !catDangerMunicAll.equals(report.catDangerMunicAll) : report.catDangerMunicAll != null)
            return false;
        if (catDangerMunicEquip != null ? !catDangerMunicEquip.equals(report.catDangerMunicEquip) : report.catDangerMunicEquip != null)
            return false;
        if (catDangerMunicOther != null ? !catDangerMunicOther.equals(report.catDangerMunicOther) : report.catDangerMunicOther != null)
            return false;
        if (catDangerMunicRnis != null ? !catDangerMunicRnis.equals(report.catDangerMunicRnis) : report.catDangerMunicRnis != null)
            return false;
        if (catDangerStateAll != null ? !catDangerStateAll.equals(report.catDangerStateAll) : report.catDangerStateAll != null)
            return false;
        if (catDangerStateEquip != null ? !catDangerStateEquip.equals(report.catDangerStateEquip) : report.catDangerStateEquip != null)
            return false;
        if (catDangerStateOther != null ? !catDangerStateOther.equals(report.catDangerStateOther) : report.catDangerStateOther != null)
            return false;
        if (catDangerStateRnis != null ? !catDangerStateRnis.equals(report.catDangerStateRnis) : report.catDangerStateRnis != null)
            return false;
        if (catDepartCommercAll != null ? !catDepartCommercAll.equals(report.catDepartCommercAll) : report.catDepartCommercAll != null)
            return false;
        if (catDepartCommercEquip != null ? !catDepartCommercEquip.equals(report.catDepartCommercEquip) : report.catDepartCommercEquip != null)
            return false;
        if (catDepartCommercOther != null ? !catDepartCommercOther.equals(report.catDepartCommercOther) : report.catDepartCommercOther != null)
            return false;
        if (catDepartCommercRnis != null ? !catDepartCommercRnis.equals(report.catDepartCommercRnis) : report.catDepartCommercRnis != null)
            return false;
        if (catDepartItogAll != null ? !catDepartItogAll.equals(report.catDepartItogAll) : report.catDepartItogAll != null)
            return false;
        if (catDepartItogEquip != null ? !catDepartItogEquip.equals(report.catDepartItogEquip) : report.catDepartItogEquip != null)
            return false;
        if (catDepartItogOther != null ? !catDepartItogOther.equals(report.catDepartItogOther) : report.catDepartItogOther != null)
            return false;
        if (catDepartItogRnis != null ? !catDepartItogRnis.equals(report.catDepartItogRnis) : report.catDepartItogRnis != null)
            return false;
        if (catDepartMunicAll != null ? !catDepartMunicAll.equals(report.catDepartMunicAll) : report.catDepartMunicAll != null)
            return false;
        if (catDepartMunicEquip != null ? !catDepartMunicEquip.equals(report.catDepartMunicEquip) : report.catDepartMunicEquip != null)
            return false;
        if (catDepartMunicOther != null ? !catDepartMunicOther.equals(report.catDepartMunicOther) : report.catDepartMunicOther != null)
            return false;
        if (catDepartMunicRnis != null ? !catDepartMunicRnis.equals(report.catDepartMunicRnis) : report.catDepartMunicRnis != null)
            return false;
        if (catDepartStateAll != null ? !catDepartStateAll.equals(report.catDepartStateAll) : report.catDepartStateAll != null)
            return false;
        if (catDepartStateEquip != null ? !catDepartStateEquip.equals(report.catDepartStateEquip) : report.catDepartStateEquip != null)
            return false;
        if (catDepartStateOther != null ? !catDepartStateOther.equals(report.catDepartStateOther) : report.catDepartStateOther != null)
            return false;
        if (catDepartStateRnis != null ? !catDepartStateRnis.equals(report.catDepartStateRnis) : report.catDepartStateRnis != null)
            return false;
        if (catGkhCommercAll != null ? !catGkhCommercAll.equals(report.catGkhCommercAll) : report.catGkhCommercAll != null)
            return false;
        if (catGkhCommercEquip != null ? !catGkhCommercEquip.equals(report.catGkhCommercEquip) : report.catGkhCommercEquip != null)
            return false;
        if (catGkhCommercOther != null ? !catGkhCommercOther.equals(report.catGkhCommercOther) : report.catGkhCommercOther != null)
            return false;
        if (catGkhCommercRnis != null ? !catGkhCommercRnis.equals(report.catGkhCommercRnis) : report.catGkhCommercRnis != null)
            return false;
        if (catGkhItogAll != null ? !catGkhItogAll.equals(report.catGkhItogAll) : report.catGkhItogAll != null)
            return false;
        if (catGkhItogEquip != null ? !catGkhItogEquip.equals(report.catGkhItogEquip) : report.catGkhItogEquip != null)
            return false;
        if (catGkhItogOther != null ? !catGkhItogOther.equals(report.catGkhItogOther) : report.catGkhItogOther != null)
            return false;
        if (catGkhItogRnis != null ? !catGkhItogRnis.equals(report.catGkhItogRnis) : report.catGkhItogRnis != null)
            return false;
        if (catGkhMunicAll != null ? !catGkhMunicAll.equals(report.catGkhMunicAll) : report.catGkhMunicAll != null)
            return false;
        if (catGkhMunicEquip != null ? !catGkhMunicEquip.equals(report.catGkhMunicEquip) : report.catGkhMunicEquip != null)
            return false;
        if (catGkhMunicOther != null ? !catGkhMunicOther.equals(report.catGkhMunicOther) : report.catGkhMunicOther != null)
            return false;
        if (catGkhMunicRnis != null ? !catGkhMunicRnis.equals(report.catGkhMunicRnis) : report.catGkhMunicRnis != null)
            return false;
        if (catGkhStateAll != null ? !catGkhStateAll.equals(report.catGkhStateAll) : report.catGkhStateAll != null)
            return false;
        if (catGkhStateEquip != null ? !catGkhStateEquip.equals(report.catGkhStateEquip) : report.catGkhStateEquip != null)
            return false;
        if (catGkhStateOther != null ? !catGkhStateOther.equals(report.catGkhStateOther) : report.catGkhStateOther != null)
            return false;
        if (catGkhStateRnis != null ? !catGkhStateRnis.equals(report.catGkhStateRnis) : report.catGkhStateRnis != null)
            return false;
        if (catLargeCommercAll != null ? !catLargeCommercAll.equals(report.catLargeCommercAll) : report.catLargeCommercAll != null)
            return false;
        if (catLargeCommercEquip != null ? !catLargeCommercEquip.equals(report.catLargeCommercEquip) : report.catLargeCommercEquip != null)
            return false;
        if (catLargeCommercOther != null ? !catLargeCommercOther.equals(report.catLargeCommercOther) : report.catLargeCommercOther != null)
            return false;
        if (catLargeCommercRnis != null ? !catLargeCommercRnis.equals(report.catLargeCommercRnis) : report.catLargeCommercRnis != null)
            return false;
        if (catLargeItogAll != null ? !catLargeItogAll.equals(report.catLargeItogAll) : report.catLargeItogAll != null)
            return false;
        if (catLargeItogEquip != null ? !catLargeItogEquip.equals(report.catLargeItogEquip) : report.catLargeItogEquip != null)
            return false;
        if (catLargeItogOther != null ? !catLargeItogOther.equals(report.catLargeItogOther) : report.catLargeItogOther != null)
            return false;
        if (catLargeItogRnis != null ? !catLargeItogRnis.equals(report.catLargeItogRnis) : report.catLargeItogRnis != null)
            return false;
        if (catLargeMunicAll != null ? !catLargeMunicAll.equals(report.catLargeMunicAll) : report.catLargeMunicAll != null)
            return false;
        if (catLargeMunicEquip != null ? !catLargeMunicEquip.equals(report.catLargeMunicEquip) : report.catLargeMunicEquip != null)
            return false;
        if (catLargeMunicOther != null ? !catLargeMunicOther.equals(report.catLargeMunicOther) : report.catLargeMunicOther != null)
            return false;
        if (catLargeMunicRnis != null ? !catLargeMunicRnis.equals(report.catLargeMunicRnis) : report.catLargeMunicRnis != null)
            return false;
        if (catLargeStateAll != null ? !catLargeStateAll.equals(report.catLargeStateAll) : report.catLargeStateAll != null)
            return false;
        if (catLargeStateEquip != null ? !catLargeStateEquip.equals(report.catLargeStateEquip) : report.catLargeStateEquip != null)
            return false;
        if (catLargeStateOther != null ? !catLargeStateOther.equals(report.catLargeStateOther) : report.catLargeStateOther != null)
            return false;
        if (catLargeStateRnis != null ? !catLargeStateRnis.equals(report.catLargeStateRnis) : report.catLargeStateRnis != null)
            return false;
        if (catM1CommercAll != null ? !catM1CommercAll.equals(report.catM1CommercAll) : report.catM1CommercAll != null)
            return false;
        if (catM1CommercEquip != null ? !catM1CommercEquip.equals(report.catM1CommercEquip) : report.catM1CommercEquip != null)
            return false;
        if (catM1CommercOther != null ? !catM1CommercOther.equals(report.catM1CommercOther) : report.catM1CommercOther != null)
            return false;
        if (catM1CommercRnis != null ? !catM1CommercRnis.equals(report.catM1CommercRnis) : report.catM1CommercRnis != null)
            return false;
        if (catM1ItogAll != null ? !catM1ItogAll.equals(report.catM1ItogAll) : report.catM1ItogAll != null)
            return false;
        if (catM1ItogEquip != null ? !catM1ItogEquip.equals(report.catM1ItogEquip) : report.catM1ItogEquip != null)
            return false;
        if (catM1ItogOther != null ? !catM1ItogOther.equals(report.catM1ItogOther) : report.catM1ItogOther != null)
            return false;
        if (catM1ItogRnis != null ? !catM1ItogRnis.equals(report.catM1ItogRnis) : report.catM1ItogRnis != null)
            return false;
        if (catM1MunicAll != null ? !catM1MunicAll.equals(report.catM1MunicAll) : report.catM1MunicAll != null)
            return false;
        if (catM1MunicEquip != null ? !catM1MunicEquip.equals(report.catM1MunicEquip) : report.catM1MunicEquip != null)
            return false;
        if (catM1MunicOther != null ? !catM1MunicOther.equals(report.catM1MunicOther) : report.catM1MunicOther != null)
            return false;
        if (catM1MunicRnis != null ? !catM1MunicRnis.equals(report.catM1MunicRnis) : report.catM1MunicRnis != null)
            return false;
        if (catM1StateAll != null ? !catM1StateAll.equals(report.catM1StateAll) : report.catM1StateAll != null)
            return false;
        if (catM1StateEquip != null ? !catM1StateEquip.equals(report.catM1StateEquip) : report.catM1StateEquip != null)
            return false;
        if (catM1StateOther != null ? !catM1StateOther.equals(report.catM1StateOther) : report.catM1StateOther != null)
            return false;
        if (catM1StateRnis != null ? !catM1StateRnis.equals(report.catM1StateRnis) : report.catM1StateRnis != null)
            return false;
        if (catM2M3CommercAll != null ? !catM2M3CommercAll.equals(report.catM2M3CommercAll) : report.catM2M3CommercAll != null)
            return false;
        if (catM2M3CommercEquip != null ? !catM2M3CommercEquip.equals(report.catM2M3CommercEquip) : report.catM2M3CommercEquip != null)
            return false;
        if (catM2M3CommercOther != null ? !catM2M3CommercOther.equals(report.catM2M3CommercOther) : report.catM2M3CommercOther != null)
            return false;
        if (catM2M3CommercRnis != null ? !catM2M3CommercRnis.equals(report.catM2M3CommercRnis) : report.catM2M3CommercRnis != null)
            return false;
        if (catM2M3ItogAll != null ? !catM2M3ItogAll.equals(report.catM2M3ItogAll) : report.catM2M3ItogAll != null)
            return false;
        if (catM2M3ItogEquip != null ? !catM2M3ItogEquip.equals(report.catM2M3ItogEquip) : report.catM2M3ItogEquip != null)
            return false;
        if (catM2M3ItogOther != null ? !catM2M3ItogOther.equals(report.catM2M3ItogOther) : report.catM2M3ItogOther != null)
            return false;
        if (catM2M3ItogRnis != null ? !catM2M3ItogRnis.equals(report.catM2M3ItogRnis) : report.catM2M3ItogRnis != null)
            return false;
        if (catM2M3MunicAll != null ? !catM2M3MunicAll.equals(report.catM2M3MunicAll) : report.catM2M3MunicAll != null)
            return false;
        if (catM2M3MunicEquip != null ? !catM2M3MunicEquip.equals(report.catM2M3MunicEquip) : report.catM2M3MunicEquip != null)
            return false;
        if (catM2M3MunicOther != null ? !catM2M3MunicOther.equals(report.catM2M3MunicOther) : report.catM2M3MunicOther != null)
            return false;
        if (catM2M3MunicRnis != null ? !catM2M3MunicRnis.equals(report.catM2M3MunicRnis) : report.catM2M3MunicRnis != null)
            return false;
        if (catM2M3StateAll != null ? !catM2M3StateAll.equals(report.catM2M3StateAll) : report.catM2M3StateAll != null)
            return false;
        if (catM2M3StateEquip != null ? !catM2M3StateEquip.equals(report.catM2M3StateEquip) : report.catM2M3StateEquip != null)
            return false;
        if (catM2M3StateOther != null ? !catM2M3StateOther.equals(report.catM2M3StateOther) : report.catM2M3StateOther != null)
            return false;
        if (catM2M3StateRnis != null ? !catM2M3StateRnis.equals(report.catM2M3StateRnis) : report.catM2M3StateRnis != null)
            return false;
        if (catSchoolCommercAll != null ? !catSchoolCommercAll.equals(report.catSchoolCommercAll) : report.catSchoolCommercAll != null)
            return false;
        if (catSchoolCommercEquip != null ? !catSchoolCommercEquip.equals(report.catSchoolCommercEquip) : report.catSchoolCommercEquip != null)
            return false;
        if (catSchoolCommercOther != null ? !catSchoolCommercOther.equals(report.catSchoolCommercOther) : report.catSchoolCommercOther != null)
            return false;
        if (catSchoolCommercRnis != null ? !catSchoolCommercRnis.equals(report.catSchoolCommercRnis) : report.catSchoolCommercRnis != null)
            return false;
        if (catSchoolItogAll != null ? !catSchoolItogAll.equals(report.catSchoolItogAll) : report.catSchoolItogAll != null)
            return false;
        if (catSchoolItogEquip != null ? !catSchoolItogEquip.equals(report.catSchoolItogEquip) : report.catSchoolItogEquip != null)
            return false;
        if (catSchoolItogOther != null ? !catSchoolItogOther.equals(report.catSchoolItogOther) : report.catSchoolItogOther != null)
            return false;
        if (catSchoolItogRnis != null ? !catSchoolItogRnis.equals(report.catSchoolItogRnis) : report.catSchoolItogRnis != null)
            return false;
        if (catSchoolMunicAll != null ? !catSchoolMunicAll.equals(report.catSchoolMunicAll) : report.catSchoolMunicAll != null)
            return false;
        if (catSchoolMunicEquip != null ? !catSchoolMunicEquip.equals(report.catSchoolMunicEquip) : report.catSchoolMunicEquip != null)
            return false;
        if (catSchoolMunicOther != null ? !catSchoolMunicOther.equals(report.catSchoolMunicOther) : report.catSchoolMunicOther != null)
            return false;
        if (catSchoolMunicRnis != null ? !catSchoolMunicRnis.equals(report.catSchoolMunicRnis) : report.catSchoolMunicRnis != null)
            return false;
        if (catSchoolStateAll != null ? !catSchoolStateAll.equals(report.catSchoolStateAll) : report.catSchoolStateAll != null)
            return false;
        if (catSchoolStateEquip != null ? !catSchoolStateEquip.equals(report.catSchoolStateEquip) : report.catSchoolStateEquip != null)
            return false;
        if (catSchoolStateOther != null ? !catSchoolStateOther.equals(report.catSchoolStateOther) : report.catSchoolStateOther != null)
            return false;
        if (catSchoolStateRnis != null ? !catSchoolStateRnis.equals(report.catSchoolStateRnis) : report.catSchoolStateRnis != null)
            return false;
        if (dateReport != null ? !dateReport.equals(report.dateReport) : report.dateReport != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idReport;
        result = 31 * result + (dateReport != null ? dateReport.hashCode() : 0);
        result = 31 * result + (catM1StateAll != null ? catM1StateAll.hashCode() : 0);
        result = 31 * result + (catM1MunicAll != null ? catM1MunicAll.hashCode() : 0);
        result = 31 * result + (catM1CommercAll != null ? catM1CommercAll.hashCode() : 0);
        result = 31 * result + (catM1ItogAll != null ? catM1ItogAll.hashCode() : 0);
        result = 31 * result + (catM2M3StateAll != null ? catM2M3StateAll.hashCode() : 0);
        result = 31 * result + (catM2M3MunicAll != null ? catM2M3MunicAll.hashCode() : 0);
        result = 31 * result + (catM2M3CommercAll != null ? catM2M3CommercAll.hashCode() : 0);
        result = 31 * result + (catM2M3ItogAll != null ? catM2M3ItogAll.hashCode() : 0);
        result = 31 * result + (catLargeStateAll != null ? catLargeStateAll.hashCode() : 0);
        result = 31 * result + (catLargeMunicAll != null ? catLargeMunicAll.hashCode() : 0);
        result = 31 * result + (catLargeCommercAll != null ? catLargeCommercAll.hashCode() : 0);
        result = 31 * result + (catLargeItogAll != null ? catLargeItogAll.hashCode() : 0);
        result = 31 * result + (catDangerStateAll != null ? catDangerStateAll.hashCode() : 0);
        result = 31 * result + (catDangerMunicAll != null ? catDangerMunicAll.hashCode() : 0);
        result = 31 * result + (catDangerCommercAll != null ? catDangerCommercAll.hashCode() : 0);
        result = 31 * result + (catDangerItogAll != null ? catDangerItogAll.hashCode() : 0);
        result = 31 * result + (catSchoolStateAll != null ? catSchoolStateAll.hashCode() : 0);
        result = 31 * result + (catSchoolMunicAll != null ? catSchoolMunicAll.hashCode() : 0);
        result = 31 * result + (catSchoolCommercAll != null ? catSchoolCommercAll.hashCode() : 0);
        result = 31 * result + (catSchoolItogAll != null ? catSchoolItogAll.hashCode() : 0);
        result = 31 * result + (catGkhStateAll != null ? catGkhStateAll.hashCode() : 0);
        result = 31 * result + (catGkhMunicAll != null ? catGkhMunicAll.hashCode() : 0);
        result = 31 * result + (catGkhCommercAll != null ? catGkhCommercAll.hashCode() : 0);
        result = 31 * result + (catGkhItogAll != null ? catGkhItogAll.hashCode() : 0);
        result = 31 * result + (catDepartStateAll != null ? catDepartStateAll.hashCode() : 0);
        result = 31 * result + (catDepartMunicAll != null ? catDepartMunicAll.hashCode() : 0);
        result = 31 * result + (catDepartCommercAll != null ? catDepartCommercAll.hashCode() : 0);
        result = 31 * result + (catDepartItogAll != null ? catDepartItogAll.hashCode() : 0);
        result = 31 * result + (catM1StateEquip != null ? catM1StateEquip.hashCode() : 0);
        result = 31 * result + (catM1MunicEquip != null ? catM1MunicEquip.hashCode() : 0);
        result = 31 * result + (catM1CommercEquip != null ? catM1CommercEquip.hashCode() : 0);
        result = 31 * result + (catM1ItogEquip != null ? catM1ItogEquip.hashCode() : 0);
        result = 31 * result + (catM2M3StateEquip != null ? catM2M3StateEquip.hashCode() : 0);
        result = 31 * result + (catM2M3MunicEquip != null ? catM2M3MunicEquip.hashCode() : 0);
        result = 31 * result + (catM2M3CommercEquip != null ? catM2M3CommercEquip.hashCode() : 0);
        result = 31 * result + (catM2M3ItogEquip != null ? catM2M3ItogEquip.hashCode() : 0);
        result = 31 * result + (catLargeStateEquip != null ? catLargeStateEquip.hashCode() : 0);
        result = 31 * result + (catLargeMunicEquip != null ? catLargeMunicEquip.hashCode() : 0);
        result = 31 * result + (catLargeCommercEquip != null ? catLargeCommercEquip.hashCode() : 0);
        result = 31 * result + (catLargeItogEquip != null ? catLargeItogEquip.hashCode() : 0);
        result = 31 * result + (catDangerStateEquip != null ? catDangerStateEquip.hashCode() : 0);
        result = 31 * result + (catDangerMunicEquip != null ? catDangerMunicEquip.hashCode() : 0);
        result = 31 * result + (catDangerCommercEquip != null ? catDangerCommercEquip.hashCode() : 0);
        result = 31 * result + (catDangerItogEquip != null ? catDangerItogEquip.hashCode() : 0);
        result = 31 * result + (catSchoolStateEquip != null ? catSchoolStateEquip.hashCode() : 0);
        result = 31 * result + (catSchoolMunicEquip != null ? catSchoolMunicEquip.hashCode() : 0);
        result = 31 * result + (catSchoolCommercEquip != null ? catSchoolCommercEquip.hashCode() : 0);
        result = 31 * result + (catSchoolItogEquip != null ? catSchoolItogEquip.hashCode() : 0);
        result = 31 * result + (catGkhStateEquip != null ? catGkhStateEquip.hashCode() : 0);
        result = 31 * result + (catGkhMunicEquip != null ? catGkhMunicEquip.hashCode() : 0);
        result = 31 * result + (catGkhCommercEquip != null ? catGkhCommercEquip.hashCode() : 0);
        result = 31 * result + (catGkhItogEquip != null ? catGkhItogEquip.hashCode() : 0);
        result = 31 * result + (catDepartStateEquip != null ? catDepartStateEquip.hashCode() : 0);
        result = 31 * result + (catDepartMunicEquip != null ? catDepartMunicEquip.hashCode() : 0);
        result = 31 * result + (catDepartCommercEquip != null ? catDepartCommercEquip.hashCode() : 0);
        result = 31 * result + (catDepartItogEquip != null ? catDepartItogEquip.hashCode() : 0);
        result = 31 * result + (catM1StateRnis != null ? catM1StateRnis.hashCode() : 0);
        result = 31 * result + (catM1MunicRnis != null ? catM1MunicRnis.hashCode() : 0);
        result = 31 * result + (catM1CommercRnis != null ? catM1CommercRnis.hashCode() : 0);
        result = 31 * result + (catM1ItogRnis != null ? catM1ItogRnis.hashCode() : 0);
        result = 31 * result + (catM2M3StateRnis != null ? catM2M3StateRnis.hashCode() : 0);
        result = 31 * result + (catM2M3MunicRnis != null ? catM2M3MunicRnis.hashCode() : 0);
        result = 31 * result + (catM2M3CommercRnis != null ? catM2M3CommercRnis.hashCode() : 0);
        result = 31 * result + (catM2M3ItogRnis != null ? catM2M3ItogRnis.hashCode() : 0);
        result = 31 * result + (catLargeStateRnis != null ? catLargeStateRnis.hashCode() : 0);
        result = 31 * result + (catLargeMunicRnis != null ? catLargeMunicRnis.hashCode() : 0);
        result = 31 * result + (catLargeCommercRnis != null ? catLargeCommercRnis.hashCode() : 0);
        result = 31 * result + (catLargeItogRnis != null ? catLargeItogRnis.hashCode() : 0);
        result = 31 * result + (catDangerStateRnis != null ? catDangerStateRnis.hashCode() : 0);
        result = 31 * result + (catDangerMunicRnis != null ? catDangerMunicRnis.hashCode() : 0);
        result = 31 * result + (catDangerCommercRnis != null ? catDangerCommercRnis.hashCode() : 0);
        result = 31 * result + (catDangerItogRnis != null ? catDangerItogRnis.hashCode() : 0);
        result = 31 * result + (catSchoolStateRnis != null ? catSchoolStateRnis.hashCode() : 0);
        result = 31 * result + (catSchoolMunicRnis != null ? catSchoolMunicRnis.hashCode() : 0);
        result = 31 * result + (catSchoolCommercRnis != null ? catSchoolCommercRnis.hashCode() : 0);
        result = 31 * result + (catSchoolItogRnis != null ? catSchoolItogRnis.hashCode() : 0);
        result = 31 * result + (catGkhStateRnis != null ? catGkhStateRnis.hashCode() : 0);
        result = 31 * result + (catGkhMunicRnis != null ? catGkhMunicRnis.hashCode() : 0);
        result = 31 * result + (catGkhCommercRnis != null ? catGkhCommercRnis.hashCode() : 0);
        result = 31 * result + (catGkhItogRnis != null ? catGkhItogRnis.hashCode() : 0);
        result = 31 * result + (catDepartStateRnis != null ? catDepartStateRnis.hashCode() : 0);
        result = 31 * result + (catDepartMunicRnis != null ? catDepartMunicRnis.hashCode() : 0);
        result = 31 * result + (catDepartCommercRnis != null ? catDepartCommercRnis.hashCode() : 0);
        result = 31 * result + (catDepartItogRnis != null ? catDepartItogRnis.hashCode() : 0);
        result = 31 * result + (catM1StateOther != null ? catM1StateOther.hashCode() : 0);
        result = 31 * result + (catM1MunicOther != null ? catM1MunicOther.hashCode() : 0);
        result = 31 * result + (catM1CommercOther != null ? catM1CommercOther.hashCode() : 0);
        result = 31 * result + (catM1ItogOther != null ? catM1ItogOther.hashCode() : 0);
        result = 31 * result + (catM2M3StateOther != null ? catM2M3StateOther.hashCode() : 0);
        result = 31 * result + (catM2M3MunicOther != null ? catM2M3MunicOther.hashCode() : 0);
        result = 31 * result + (catM2M3CommercOther != null ? catM2M3CommercOther.hashCode() : 0);
        result = 31 * result + (catM2M3ItogOther != null ? catM2M3ItogOther.hashCode() : 0);
        result = 31 * result + (catLargeStateOther != null ? catLargeStateOther.hashCode() : 0);
        result = 31 * result + (catLargeMunicOther != null ? catLargeMunicOther.hashCode() : 0);
        result = 31 * result + (catLargeCommercOther != null ? catLargeCommercOther.hashCode() : 0);
        result = 31 * result + (catLargeItogOther != null ? catLargeItogOther.hashCode() : 0);
        result = 31 * result + (catDangerStateOther != null ? catDangerStateOther.hashCode() : 0);
        result = 31 * result + (catDangerMunicOther != null ? catDangerMunicOther.hashCode() : 0);
        result = 31 * result + (catDangerCommercOther != null ? catDangerCommercOther.hashCode() : 0);
        result = 31 * result + (catDangerItogOther != null ? catDangerItogOther.hashCode() : 0);
        result = 31 * result + (catSchoolStateOther != null ? catSchoolStateOther.hashCode() : 0);
        result = 31 * result + (catSchoolMunicOther != null ? catSchoolMunicOther.hashCode() : 0);
        result = 31 * result + (catSchoolCommercOther != null ? catSchoolCommercOther.hashCode() : 0);
        result = 31 * result + (catSchoolItogOther != null ? catSchoolItogOther.hashCode() : 0);
        result = 31 * result + (catGkhStateOther != null ? catGkhStateOther.hashCode() : 0);
        result = 31 * result + (catGkhMunicOther != null ? catGkhMunicOther.hashCode() : 0);
        result = 31 * result + (catGkhCommercOther != null ? catGkhCommercOther.hashCode() : 0);
        result = 31 * result + (catGkhItogOther != null ? catGkhItogOther.hashCode() : 0);
        result = 31 * result + (catDepartStateOther != null ? catDepartStateOther.hashCode() : 0);
        result = 31 * result + (catDepartMunicOther != null ? catDepartMunicOther.hashCode() : 0);
        result = 31 * result + (catDepartCommercOther != null ? catDepartCommercOther.hashCode() : 0);
        result = 31 * result + (catDepartItogOther != null ? catDepartItogOther.hashCode() : 0);
        return result;
    }
}
