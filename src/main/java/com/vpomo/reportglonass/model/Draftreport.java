package com.vpomo.reportglonass.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by Помогалов on 02.08.2015.
 */
@Entity
public class Draftreport {
    private int idDraftreport;
    private Timestamp dateReport;
    private Integer catM1StateAll;
    private Integer catM1MunicAll;
    private Integer catM1CommercAll;
    private Integer catM1ItogAll;
    private Integer catM2M3StateAll;
    private Integer catM2M3MunicAll;
    private Integer catM2M3CommercAll;
    private Integer catM2M3ItogAll;
    private Integer catLargeStateAll;
    private Integer catLargeMunicAll;
    private Integer catLargeCommercAll;
    private Integer catLargeItogAll;
    private Integer catDangerStateAll;
    private Integer catDangerMunicAll;
    private Integer catDangerCommercAll;
    private Integer catDangerItogAll;
    private Integer catSchoolStateAll;
    private Integer catSchoolMunicAll;
    private Integer catSchoolCommercAll;
    private Integer catSchoolItogAll;
    private Integer catGkhStateAll;
    private Integer catGkhMunicAll;
    private Integer catGkhCommercAll;
    private Integer catGkhItogAll;
    private Integer catDepartStateAll;
    private Integer catDepartMunicAll;
    private Integer catDepartCommercAll;
    private Integer catDepartItogAll;
    private Integer catM1StateEquip;
    private Integer catM1MunicEquip;
    private Integer catM1CommercEquip;
    private Integer catM1ItogEquip;
    private Integer catM2M3StateEquip;
    private Integer catM2M3MunicEquip;
    private Integer catM2M3CommercEquip;
    private Integer catM2M3ItogEquip;
    private Integer catLargeStateEquip;
    private Integer catLargeMunicEquip;
    private Integer catLargeCommercEquip;
    private Integer catLargeItogEquip;
    private Integer catDangerStateEquip;
    private Integer catDangerMunicEquip;
    private Integer catDangerCommercEquip;
    private Integer catDangerItogEquip;
    private Integer catSchoolStateEquip;
    private Integer catSchoolMunicEquip;
    private Integer catSchoolCommercEquip;
    private Integer catSchoolItogEquip;
    private Integer catGkhStateEquip;
    private Integer catGkhMunicEquip;
    private Integer catGkhCommercEquip;
    private Integer catGkhItogEquip;
    private Integer catDepartStateEquip;
    private Integer catDepartMunicEquip;
    private Integer catDepartCommercEquip;
    private Integer catDepartItogEquip;
    private Integer catM1StateRnis;
    private Integer catM1MunicRnis;
    private Integer catM1CommercRnis;
    private Integer catM1ItogRnis;
    private Integer catM2M3StateRnis;
    private Integer catM2M3MunicRnis;
    private Integer catM2M3CommercRnis;
    private Integer catM2M3ItogRnis;
    private Integer catLargeStateRnis;
    private Integer catLargeMunicRnis;
    private Integer catLargeCommercRnis;
    private Integer catLargeItogRnis;
    private Integer catDangerStateRnis;
    private Integer catDangerMunicRnis;
    private Integer catDangerCommercRnis;
    private Integer catDangerItogRnis;
    private Integer catSchoolStateRnis;
    private Integer catSchoolMunicRnis;
    private Integer catSchoolCommercRnis;
    private Integer catSchoolItogRnis;
    private Integer catGkhStateRnis;
    private Integer catGkhMunicRnis;
    private Integer catGkhCommercRnis;
    private Integer catGkhItogRnis;
    private Integer catDepartStateRnis;
    private Integer catDepartMunicRnis;
    private Integer catDepartCommercRnis;
    private Integer catDepartItogRnis;
    private Integer catM1StateOther;
    private Integer catM1MunicOther;
    private Integer catM1CommercOther;
    private Integer catM1ItogOther;
    private Integer catM2M3StateOther;
    private Integer catM2M3MunicOther;
    private Integer catM2M3CommercOther;
    private Integer catM2M3ItogOther;
    private Integer catLargeStateOther;
    private Integer catLargeMunicOther;
    private Integer catLargeCommercOther;
    private Integer catLargeItogOther;
    private Integer catDangerStateOther;
    private Integer catDangerMunicOther;
    private Integer catDangerCommercOther;
    private Integer catDangerItogOther;
    private Integer catSchoolStateOther;
    private Integer catSchoolMunicOther;
    private Integer catSchoolCommercOther;
    private Integer catSchoolItogOther;
    private Integer catGkhStateOther;
    private Integer catGkhMunicOther;
    private Integer catGkhCommercOther;
    private Integer catGkhItogOther;
    private Integer catDepartStateOther;
    private Integer catDepartMunicOther;
    private Integer catDepartCommercOther;
    private Integer catDepartItogOther;

    @Id
    @Column(name = "id_draftreport", nullable = false, insertable = true, updatable = true)
    public int getIdDraftreport() {
        return idDraftreport;
    }

    public void setIdDraftreport(int idDraftreport) {
        this.idDraftreport = idDraftreport;
    }

    @Basic
    @Column(name = "date_report", nullable = true, insertable = true, updatable = true)
    public Timestamp getDateReport() {
        return dateReport;
    }

    public void setDateReport(Timestamp dateReport) {
        this.dateReport = dateReport;
    }

    @Basic
    @Column(name = "catM1StateAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatM1StateAll() {
        return catM1StateAll;
    }

    public void setCatM1StateAll(Integer catM1StateAll) {
        this.catM1StateAll = catM1StateAll;
    }

    @Basic
    @Column(name = "catM1MunicAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatM1MunicAll() {
        return catM1MunicAll;
    }

    public void setCatM1MunicAll(Integer catM1MunicAll) {
        this.catM1MunicAll = catM1MunicAll;
    }

    @Basic
    @Column(name = "catM1CommercAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatM1CommercAll() {
        return catM1CommercAll;
    }

    public void setCatM1CommercAll(Integer catM1CommercAll) {
        this.catM1CommercAll = catM1CommercAll;
    }

    @Basic
    @Column(name = "catM1ItogAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatM1ItogAll() {
        return catM1ItogAll;
    }

    public void setCatM1ItogAll(Integer catM1ItogAll) {
        this.catM1ItogAll = catM1ItogAll;
    }

    @Basic
    @Column(name = "catM2M3StateAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatM2M3StateAll() {
        return catM2M3StateAll;
    }

    public void setCatM2M3StateAll(Integer catM2M3StateAll) {
        this.catM2M3StateAll = catM2M3StateAll;
    }

    @Basic
    @Column(name = "catM2M3MunicAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatM2M3MunicAll() {
        return catM2M3MunicAll;
    }

    public void setCatM2M3MunicAll(Integer catM2M3MunicAll) {
        this.catM2M3MunicAll = catM2M3MunicAll;
    }

    @Basic
    @Column(name = "catM2M3CommercAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatM2M3CommercAll() {
        return catM2M3CommercAll;
    }

    public void setCatM2M3CommercAll(Integer catM2M3CommercAll) {
        this.catM2M3CommercAll = catM2M3CommercAll;
    }

    @Basic
    @Column(name = "catM2M3ItogAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatM2M3ItogAll() {
        return catM2M3ItogAll;
    }

    public void setCatM2M3ItogAll(Integer catM2M3ItogAll) {
        this.catM2M3ItogAll = catM2M3ItogAll;
    }

    @Basic
    @Column(name = "catLargeStateAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatLargeStateAll() {
        return catLargeStateAll;
    }

    public void setCatLargeStateAll(Integer catLargeStateAll) {
        this.catLargeStateAll = catLargeStateAll;
    }

    @Basic
    @Column(name = "catLargeMunicAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatLargeMunicAll() {
        return catLargeMunicAll;
    }

    public void setCatLargeMunicAll(Integer catLargeMunicAll) {
        this.catLargeMunicAll = catLargeMunicAll;
    }

    @Basic
    @Column(name = "catLargeCommercAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatLargeCommercAll() {
        return catLargeCommercAll;
    }

    public void setCatLargeCommercAll(Integer catLargeCommercAll) {
        this.catLargeCommercAll = catLargeCommercAll;
    }

    @Basic
    @Column(name = "catLargeItogAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatLargeItogAll() {
        return catLargeItogAll;
    }

    public void setCatLargeItogAll(Integer catLargeItogAll) {
        this.catLargeItogAll = catLargeItogAll;
    }

    @Basic
    @Column(name = "catDangerStateAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatDangerStateAll() {
        return catDangerStateAll;
    }

    public void setCatDangerStateAll(Integer catDangerStateAll) {
        this.catDangerStateAll = catDangerStateAll;
    }

    @Basic
    @Column(name = "catDangerMunicAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatDangerMunicAll() {
        return catDangerMunicAll;
    }

    public void setCatDangerMunicAll(Integer catDangerMunicAll) {
        this.catDangerMunicAll = catDangerMunicAll;
    }

    @Basic
    @Column(name = "catDangerCommercAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatDangerCommercAll() {
        return catDangerCommercAll;
    }

    public void setCatDangerCommercAll(Integer catDangerCommercAll) {
        this.catDangerCommercAll = catDangerCommercAll;
    }

    @Basic
    @Column(name = "catDangerItogAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatDangerItogAll() {
        return catDangerItogAll;
    }

    public void setCatDangerItogAll(Integer catDangerItogAll) {
        this.catDangerItogAll = catDangerItogAll;
    }

    @Basic
    @Column(name = "catSchoolStateAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatSchoolStateAll() {
        return catSchoolStateAll;
    }

    public void setCatSchoolStateAll(Integer catSchoolStateAll) {
        this.catSchoolStateAll = catSchoolStateAll;
    }

    @Basic
    @Column(name = "catSchoolMunicAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatSchoolMunicAll() {
        return catSchoolMunicAll;
    }

    public void setCatSchoolMunicAll(Integer catSchoolMunicAll) {
        this.catSchoolMunicAll = catSchoolMunicAll;
    }

    @Basic
    @Column(name = "catSchoolCommercAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatSchoolCommercAll() {
        return catSchoolCommercAll;
    }

    public void setCatSchoolCommercAll(Integer catSchoolCommercAll) {
        this.catSchoolCommercAll = catSchoolCommercAll;
    }

    @Basic
    @Column(name = "catSchoolItogAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatSchoolItogAll() {
        return catSchoolItogAll;
    }

    public void setCatSchoolItogAll(Integer catSchoolItogAll) {
        this.catSchoolItogAll = catSchoolItogAll;
    }

    @Basic
    @Column(name = "catGKHStateAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatGkhStateAll() {
        return catGkhStateAll;
    }

    public void setCatGkhStateAll(Integer catGkhStateAll) {
        this.catGkhStateAll = catGkhStateAll;
    }

    @Basic
    @Column(name = "catGKHMunicAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatGkhMunicAll() {
        return catGkhMunicAll;
    }

    public void setCatGkhMunicAll(Integer catGkhMunicAll) {
        this.catGkhMunicAll = catGkhMunicAll;
    }

    @Basic
    @Column(name = "catGKHCommercAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatGkhCommercAll() {
        return catGkhCommercAll;
    }

    public void setCatGkhCommercAll(Integer catGkhCommercAll) {
        this.catGkhCommercAll = catGkhCommercAll;
    }

    @Basic
    @Column(name = "catGKHItogAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatGkhItogAll() {
        return catGkhItogAll;
    }

    public void setCatGkhItogAll(Integer catGkhItogAll) {
        this.catGkhItogAll = catGkhItogAll;
    }

    @Basic
    @Column(name = "catDepartStateAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatDepartStateAll() {
        return catDepartStateAll;
    }

    public void setCatDepartStateAll(Integer catDepartStateAll) {
        this.catDepartStateAll = catDepartStateAll;
    }

    @Basic
    @Column(name = "catDepartMunicAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatDepartMunicAll() {
        return catDepartMunicAll;
    }

    public void setCatDepartMunicAll(Integer catDepartMunicAll) {
        this.catDepartMunicAll = catDepartMunicAll;
    }

    @Basic
    @Column(name = "catDepartCommercAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatDepartCommercAll() {
        return catDepartCommercAll;
    }

    public void setCatDepartCommercAll(Integer catDepartCommercAll) {
        this.catDepartCommercAll = catDepartCommercAll;
    }

    @Basic
    @Column(name = "catDepartItogAll", nullable = true, insertable = true, updatable = true)
    public Integer getCatDepartItogAll() {
        return catDepartItogAll;
    }

    public void setCatDepartItogAll(Integer catDepartItogAll) {
        this.catDepartItogAll = catDepartItogAll;
    }

    @Basic
    @Column(name = "catM1StateEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatM1StateEquip() {
        return catM1StateEquip;
    }

    public void setCatM1StateEquip(Integer catM1StateEquip) {
        this.catM1StateEquip = catM1StateEquip;
    }

    @Basic
    @Column(name = "catM1MunicEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatM1MunicEquip() {
        return catM1MunicEquip;
    }

    public void setCatM1MunicEquip(Integer catM1MunicEquip) {
        this.catM1MunicEquip = catM1MunicEquip;
    }

    @Basic
    @Column(name = "catM1CommercEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatM1CommercEquip() {
        return catM1CommercEquip;
    }

    public void setCatM1CommercEquip(Integer catM1CommercEquip) {
        this.catM1CommercEquip = catM1CommercEquip;
    }

    @Basic
    @Column(name = "catM1ItogEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatM1ItogEquip() {
        return catM1ItogEquip;
    }

    public void setCatM1ItogEquip(Integer catM1ItogEquip) {
        this.catM1ItogEquip = catM1ItogEquip;
    }

    @Basic
    @Column(name = "catM2M3StateEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatM2M3StateEquip() {
        return catM2M3StateEquip;
    }

    public void setCatM2M3StateEquip(Integer catM2M3StateEquip) {
        this.catM2M3StateEquip = catM2M3StateEquip;
    }

    @Basic
    @Column(name = "catM2M3MunicEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatM2M3MunicEquip() {
        return catM2M3MunicEquip;
    }

    public void setCatM2M3MunicEquip(Integer catM2M3MunicEquip) {
        this.catM2M3MunicEquip = catM2M3MunicEquip;
    }

    @Basic
    @Column(name = "catM2M3CommercEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatM2M3CommercEquip() {
        return catM2M3CommercEquip;
    }

    public void setCatM2M3CommercEquip(Integer catM2M3CommercEquip) {
        this.catM2M3CommercEquip = catM2M3CommercEquip;
    }

    @Basic
    @Column(name = "catM2M3ItogEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatM2M3ItogEquip() {
        return catM2M3ItogEquip;
    }

    public void setCatM2M3ItogEquip(Integer catM2M3ItogEquip) {
        this.catM2M3ItogEquip = catM2M3ItogEquip;
    }

    @Basic
    @Column(name = "catLargeStateEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatLargeStateEquip() {
        return catLargeStateEquip;
    }

    public void setCatLargeStateEquip(Integer catLargeStateEquip) {
        this.catLargeStateEquip = catLargeStateEquip;
    }

    @Basic
    @Column(name = "catLargeMunicEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatLargeMunicEquip() {
        return catLargeMunicEquip;
    }

    public void setCatLargeMunicEquip(Integer catLargeMunicEquip) {
        this.catLargeMunicEquip = catLargeMunicEquip;
    }

    @Basic
    @Column(name = "catLargeCommercEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatLargeCommercEquip() {
        return catLargeCommercEquip;
    }

    public void setCatLargeCommercEquip(Integer catLargeCommercEquip) {
        this.catLargeCommercEquip = catLargeCommercEquip;
    }

    @Basic
    @Column(name = "catLargeItogEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatLargeItogEquip() {
        return catLargeItogEquip;
    }

    public void setCatLargeItogEquip(Integer catLargeItogEquip) {
        this.catLargeItogEquip = catLargeItogEquip;
    }

    @Basic
    @Column(name = "catDangerStateEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatDangerStateEquip() {
        return catDangerStateEquip;
    }

    public void setCatDangerStateEquip(Integer catDangerStateEquip) {
        this.catDangerStateEquip = catDangerStateEquip;
    }

    @Basic
    @Column(name = "catDangerMunicEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatDangerMunicEquip() {
        return catDangerMunicEquip;
    }

    public void setCatDangerMunicEquip(Integer catDangerMunicEquip) {
        this.catDangerMunicEquip = catDangerMunicEquip;
    }

    @Basic
    @Column(name = "catDangerCommercEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatDangerCommercEquip() {
        return catDangerCommercEquip;
    }

    public void setCatDangerCommercEquip(Integer catDangerCommercEquip) {
        this.catDangerCommercEquip = catDangerCommercEquip;
    }

    @Basic
    @Column(name = "catDangerItogEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatDangerItogEquip() {
        return catDangerItogEquip;
    }

    public void setCatDangerItogEquip(Integer catDangerItogEquip) {
        this.catDangerItogEquip = catDangerItogEquip;
    }

    @Basic
    @Column(name = "catSchoolStateEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatSchoolStateEquip() {
        return catSchoolStateEquip;
    }

    public void setCatSchoolStateEquip(Integer catSchoolStateEquip) {
        this.catSchoolStateEquip = catSchoolStateEquip;
    }

    @Basic
    @Column(name = "catSchoolMunicEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatSchoolMunicEquip() {
        return catSchoolMunicEquip;
    }

    public void setCatSchoolMunicEquip(Integer catSchoolMunicEquip) {
        this.catSchoolMunicEquip = catSchoolMunicEquip;
    }

    @Basic
    @Column(name = "catSchoolCommercEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatSchoolCommercEquip() {
        return catSchoolCommercEquip;
    }

    public void setCatSchoolCommercEquip(Integer catSchoolCommercEquip) {
        this.catSchoolCommercEquip = catSchoolCommercEquip;
    }

    @Basic
    @Column(name = "catSchoolItogEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatSchoolItogEquip() {
        return catSchoolItogEquip;
    }

    public void setCatSchoolItogEquip(Integer catSchoolItogEquip) {
        this.catSchoolItogEquip = catSchoolItogEquip;
    }

    @Basic
    @Column(name = "catGKHStateEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatGkhStateEquip() {
        return catGkhStateEquip;
    }

    public void setCatGkhStateEquip(Integer catGkhStateEquip) {
        this.catGkhStateEquip = catGkhStateEquip;
    }

    @Basic
    @Column(name = "catGKHMunicEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatGkhMunicEquip() {
        return catGkhMunicEquip;
    }

    public void setCatGkhMunicEquip(Integer catGkhMunicEquip) {
        this.catGkhMunicEquip = catGkhMunicEquip;
    }

    @Basic
    @Column(name = "catGKHCommercEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatGkhCommercEquip() {
        return catGkhCommercEquip;
    }

    public void setCatGkhCommercEquip(Integer catGkhCommercEquip) {
        this.catGkhCommercEquip = catGkhCommercEquip;
    }

    @Basic
    @Column(name = "catGKHItogEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatGkhItogEquip() {
        return catGkhItogEquip;
    }

    public void setCatGkhItogEquip(Integer catGkhItogEquip) {
        this.catGkhItogEquip = catGkhItogEquip;
    }

    @Basic
    @Column(name = "catDepartStateEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatDepartStateEquip() {
        return catDepartStateEquip;
    }

    public void setCatDepartStateEquip(Integer catDepartStateEquip) {
        this.catDepartStateEquip = catDepartStateEquip;
    }

    @Basic
    @Column(name = "catDepartMunicEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatDepartMunicEquip() {
        return catDepartMunicEquip;
    }

    public void setCatDepartMunicEquip(Integer catDepartMunicEquip) {
        this.catDepartMunicEquip = catDepartMunicEquip;
    }

    @Basic
    @Column(name = "catDepartCommercEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatDepartCommercEquip() {
        return catDepartCommercEquip;
    }

    public void setCatDepartCommercEquip(Integer catDepartCommercEquip) {
        this.catDepartCommercEquip = catDepartCommercEquip;
    }

    @Basic
    @Column(name = "catDepartItogEquip", nullable = true, insertable = true, updatable = true)
    public Integer getCatDepartItogEquip() {
        return catDepartItogEquip;
    }

    public void setCatDepartItogEquip(Integer catDepartItogEquip) {
        this.catDepartItogEquip = catDepartItogEquip;
    }

    @Basic
    @Column(name = "catM1StateRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatM1StateRnis() {
        return catM1StateRnis;
    }

    public void setCatM1StateRnis(Integer catM1StateRnis) {
        this.catM1StateRnis = catM1StateRnis;
    }

    @Basic
    @Column(name = "catM1MunicRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatM1MunicRnis() {
        return catM1MunicRnis;
    }

    public void setCatM1MunicRnis(Integer catM1MunicRnis) {
        this.catM1MunicRnis = catM1MunicRnis;
    }

    @Basic
    @Column(name = "catM1CommercRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatM1CommercRnis() {
        return catM1CommercRnis;
    }

    public void setCatM1CommercRnis(Integer catM1CommercRnis) {
        this.catM1CommercRnis = catM1CommercRnis;
    }

    @Basic
    @Column(name = "catM1ItogRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatM1ItogRnis() {
        return catM1ItogRnis;
    }

    public void setCatM1ItogRnis(Integer catM1ItogRnis) {
        this.catM1ItogRnis = catM1ItogRnis;
    }

    @Basic
    @Column(name = "catM2M3StateRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatM2M3StateRnis() {
        return catM2M3StateRnis;
    }

    public void setCatM2M3StateRnis(Integer catM2M3StateRnis) {
        this.catM2M3StateRnis = catM2M3StateRnis;
    }

    @Basic
    @Column(name = "catM2M3MunicRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatM2M3MunicRnis() {
        return catM2M3MunicRnis;
    }

    public void setCatM2M3MunicRnis(Integer catM2M3MunicRnis) {
        this.catM2M3MunicRnis = catM2M3MunicRnis;
    }

    @Basic
    @Column(name = "catM2M3CommercRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatM2M3CommercRnis() {
        return catM2M3CommercRnis;
    }

    public void setCatM2M3CommercRnis(Integer catM2M3CommercRnis) {
        this.catM2M3CommercRnis = catM2M3CommercRnis;
    }

    @Basic
    @Column(name = "catM2M3ItogRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatM2M3ItogRnis() {
        return catM2M3ItogRnis;
    }

    public void setCatM2M3ItogRnis(Integer catM2M3ItogRnis) {
        this.catM2M3ItogRnis = catM2M3ItogRnis;
    }

    @Basic
    @Column(name = "catLargeStateRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatLargeStateRnis() {
        return catLargeStateRnis;
    }

    public void setCatLargeStateRnis(Integer catLargeStateRnis) {
        this.catLargeStateRnis = catLargeStateRnis;
    }

    @Basic
    @Column(name = "catLargeMunicRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatLargeMunicRnis() {
        return catLargeMunicRnis;
    }

    public void setCatLargeMunicRnis(Integer catLargeMunicRnis) {
        this.catLargeMunicRnis = catLargeMunicRnis;
    }

    @Basic
    @Column(name = "catLargeCommercRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatLargeCommercRnis() {
        return catLargeCommercRnis;
    }

    public void setCatLargeCommercRnis(Integer catLargeCommercRnis) {
        this.catLargeCommercRnis = catLargeCommercRnis;
    }

    @Basic
    @Column(name = "catLargeItogRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatLargeItogRnis() {
        return catLargeItogRnis;
    }

    public void setCatLargeItogRnis(Integer catLargeItogRnis) {
        this.catLargeItogRnis = catLargeItogRnis;
    }

    @Basic
    @Column(name = "catDangerStateRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatDangerStateRnis() {
        return catDangerStateRnis;
    }

    public void setCatDangerStateRnis(Integer catDangerStateRnis) {
        this.catDangerStateRnis = catDangerStateRnis;
    }

    @Basic
    @Column(name = "catDangerMunicRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatDangerMunicRnis() {
        return catDangerMunicRnis;
    }

    public void setCatDangerMunicRnis(Integer catDangerMunicRnis) {
        this.catDangerMunicRnis = catDangerMunicRnis;
    }

    @Basic
    @Column(name = "catDangerCommercRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatDangerCommercRnis() {
        return catDangerCommercRnis;
    }

    public void setCatDangerCommercRnis(Integer catDangerCommercRnis) {
        this.catDangerCommercRnis = catDangerCommercRnis;
    }

    @Basic
    @Column(name = "catDangerItogRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatDangerItogRnis() {
        return catDangerItogRnis;
    }

    public void setCatDangerItogRnis(Integer catDangerItogRnis) {
        this.catDangerItogRnis = catDangerItogRnis;
    }

    @Basic
    @Column(name = "catSchoolStateRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatSchoolStateRnis() {
        return catSchoolStateRnis;
    }

    public void setCatSchoolStateRnis(Integer catSchoolStateRnis) {
        this.catSchoolStateRnis = catSchoolStateRnis;
    }

    @Basic
    @Column(name = "catSchoolMunicRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatSchoolMunicRnis() {
        return catSchoolMunicRnis;
    }

    public void setCatSchoolMunicRnis(Integer catSchoolMunicRnis) {
        this.catSchoolMunicRnis = catSchoolMunicRnis;
    }

    @Basic
    @Column(name = "catSchoolCommercRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatSchoolCommercRnis() {
        return catSchoolCommercRnis;
    }

    public void setCatSchoolCommercRnis(Integer catSchoolCommercRnis) {
        this.catSchoolCommercRnis = catSchoolCommercRnis;
    }

    @Basic
    @Column(name = "catSchoolItogRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatSchoolItogRnis() {
        return catSchoolItogRnis;
    }

    public void setCatSchoolItogRnis(Integer catSchoolItogRnis) {
        this.catSchoolItogRnis = catSchoolItogRnis;
    }

    @Basic
    @Column(name = "catGKHStateRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatGkhStateRnis() {
        return catGkhStateRnis;
    }

    public void setCatGkhStateRnis(Integer catGkhStateRnis) {
        this.catGkhStateRnis = catGkhStateRnis;
    }

    @Basic
    @Column(name = "catGKHMunicRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatGkhMunicRnis() {
        return catGkhMunicRnis;
    }

    public void setCatGkhMunicRnis(Integer catGkhMunicRnis) {
        this.catGkhMunicRnis = catGkhMunicRnis;
    }

    @Basic
    @Column(name = "catGKHCommercRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatGkhCommercRnis() {
        return catGkhCommercRnis;
    }

    public void setCatGkhCommercRnis(Integer catGkhCommercRnis) {
        this.catGkhCommercRnis = catGkhCommercRnis;
    }

    @Basic
    @Column(name = "catGKHItogRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatGkhItogRnis() {
        return catGkhItogRnis;
    }

    public void setCatGkhItogRnis(Integer catGkhItogRnis) {
        this.catGkhItogRnis = catGkhItogRnis;
    }

    @Basic
    @Column(name = "catDepartStateRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatDepartStateRnis() {
        return catDepartStateRnis;
    }

    public void setCatDepartStateRnis(Integer catDepartStateRnis) {
        this.catDepartStateRnis = catDepartStateRnis;
    }

    @Basic
    @Column(name = "catDepartMunicRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatDepartMunicRnis() {
        return catDepartMunicRnis;
    }

    public void setCatDepartMunicRnis(Integer catDepartMunicRnis) {
        this.catDepartMunicRnis = catDepartMunicRnis;
    }

    @Basic
    @Column(name = "catDepartCommercRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatDepartCommercRnis() {
        return catDepartCommercRnis;
    }

    public void setCatDepartCommercRnis(Integer catDepartCommercRnis) {
        this.catDepartCommercRnis = catDepartCommercRnis;
    }

    @Basic
    @Column(name = "catDepartItogRNIS", nullable = true, insertable = true, updatable = true)
    public Integer getCatDepartItogRnis() {
        return catDepartItogRnis;
    }

    public void setCatDepartItogRnis(Integer catDepartItogRnis) {
        this.catDepartItogRnis = catDepartItogRnis;
    }

    @Basic
    @Column(name = "catM1StateOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatM1StateOther() {
        return catM1StateOther;
    }

    public void setCatM1StateOther(Integer catM1StateOther) {
        this.catM1StateOther = catM1StateOther;
    }

    @Basic
    @Column(name = "catM1MunicOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatM1MunicOther() {
        return catM1MunicOther;
    }

    public void setCatM1MunicOther(Integer catM1MunicOther) {
        this.catM1MunicOther = catM1MunicOther;
    }

    @Basic
    @Column(name = "catM1CommercOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatM1CommercOther() {
        return catM1CommercOther;
    }

    public void setCatM1CommercOther(Integer catM1CommercOther) {
        this.catM1CommercOther = catM1CommercOther;
    }

    @Basic
    @Column(name = "catM1ItogOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatM1ItogOther() {
        return catM1ItogOther;
    }

    public void setCatM1ItogOther(Integer catM1ItogOther) {
        this.catM1ItogOther = catM1ItogOther;
    }

    @Basic
    @Column(name = "catM2M3StateOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatM2M3StateOther() {
        return catM2M3StateOther;
    }

    public void setCatM2M3StateOther(Integer catM2M3StateOther) {
        this.catM2M3StateOther = catM2M3StateOther;
    }

    @Basic
    @Column(name = "catM2M3MunicOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatM2M3MunicOther() {
        return catM2M3MunicOther;
    }

    public void setCatM2M3MunicOther(Integer catM2M3MunicOther) {
        this.catM2M3MunicOther = catM2M3MunicOther;
    }

    @Basic
    @Column(name = "catM2M3CommercOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatM2M3CommercOther() {
        return catM2M3CommercOther;
    }

    public void setCatM2M3CommercOther(Integer catM2M3CommercOther) {
        this.catM2M3CommercOther = catM2M3CommercOther;
    }

    @Basic
    @Column(name = "catM2M3ItogOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatM2M3ItogOther() {
        return catM2M3ItogOther;
    }

    public void setCatM2M3ItogOther(Integer catM2M3ItogOther) {
        this.catM2M3ItogOther = catM2M3ItogOther;
    }

    @Basic
    @Column(name = "catLargeStateOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatLargeStateOther() {
        return catLargeStateOther;
    }

    public void setCatLargeStateOther(Integer catLargeStateOther) {
        this.catLargeStateOther = catLargeStateOther;
    }

    @Basic
    @Column(name = "catLargeMunicOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatLargeMunicOther() {
        return catLargeMunicOther;
    }

    public void setCatLargeMunicOther(Integer catLargeMunicOther) {
        this.catLargeMunicOther = catLargeMunicOther;
    }

    @Basic
    @Column(name = "catLargeCommercOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatLargeCommercOther() {
        return catLargeCommercOther;
    }

    public void setCatLargeCommercOther(Integer catLargeCommercOther) {
        this.catLargeCommercOther = catLargeCommercOther;
    }

    @Basic
    @Column(name = "catLargeItogOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatLargeItogOther() {
        return catLargeItogOther;
    }

    public void setCatLargeItogOther(Integer catLargeItogOther) {
        this.catLargeItogOther = catLargeItogOther;
    }

    @Basic
    @Column(name = "catDangerStateOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatDangerStateOther() {
        return catDangerStateOther;
    }

    public void setCatDangerStateOther(Integer catDangerStateOther) {
        this.catDangerStateOther = catDangerStateOther;
    }

    @Basic
    @Column(name = "catDangerMunicOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatDangerMunicOther() {
        return catDangerMunicOther;
    }

    public void setCatDangerMunicOther(Integer catDangerMunicOther) {
        this.catDangerMunicOther = catDangerMunicOther;
    }

    @Basic
    @Column(name = "catDangerCommercOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatDangerCommercOther() {
        return catDangerCommercOther;
    }

    public void setCatDangerCommercOther(Integer catDangerCommercOther) {
        this.catDangerCommercOther = catDangerCommercOther;
    }

    @Basic
    @Column(name = "catDangerItogOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatDangerItogOther() {
        return catDangerItogOther;
    }

    public void setCatDangerItogOther(Integer catDangerItogOther) {
        this.catDangerItogOther = catDangerItogOther;
    }

    @Basic
    @Column(name = "catSchoolStateOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatSchoolStateOther() {
        return catSchoolStateOther;
    }

    public void setCatSchoolStateOther(Integer catSchoolStateOther) {
        this.catSchoolStateOther = catSchoolStateOther;
    }

    @Basic
    @Column(name = "catSchoolMunicOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatSchoolMunicOther() {
        return catSchoolMunicOther;
    }

    public void setCatSchoolMunicOther(Integer catSchoolMunicOther) {
        this.catSchoolMunicOther = catSchoolMunicOther;
    }

    @Basic
    @Column(name = "catSchoolCommercOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatSchoolCommercOther() {
        return catSchoolCommercOther;
    }

    public void setCatSchoolCommercOther(Integer catSchoolCommercOther) {
        this.catSchoolCommercOther = catSchoolCommercOther;
    }

    @Basic
    @Column(name = "catSchoolItogOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatSchoolItogOther() {
        return catSchoolItogOther;
    }

    public void setCatSchoolItogOther(Integer catSchoolItogOther) {
        this.catSchoolItogOther = catSchoolItogOther;
    }

    @Basic
    @Column(name = "catGKHStateOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatGkhStateOther() {
        return catGkhStateOther;
    }

    public void setCatGkhStateOther(Integer catGkhStateOther) {
        this.catGkhStateOther = catGkhStateOther;
    }

    @Basic
    @Column(name = "catGKHMunicOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatGkhMunicOther() {
        return catGkhMunicOther;
    }

    public void setCatGkhMunicOther(Integer catGkhMunicOther) {
        this.catGkhMunicOther = catGkhMunicOther;
    }

    @Basic
    @Column(name = "catGKHCommercOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatGkhCommercOther() {
        return catGkhCommercOther;
    }

    public void setCatGkhCommercOther(Integer catGkhCommercOther) {
        this.catGkhCommercOther = catGkhCommercOther;
    }

    @Basic
    @Column(name = "catGKHItogOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatGkhItogOther() {
        return catGkhItogOther;
    }

    public void setCatGkhItogOther(Integer catGkhItogOther) {
        this.catGkhItogOther = catGkhItogOther;
    }

    @Basic
    @Column(name = "catDepartStateOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatDepartStateOther() {
        return catDepartStateOther;
    }

    public void setCatDepartStateOther(Integer catDepartStateOther) {
        this.catDepartStateOther = catDepartStateOther;
    }

    @Basic
    @Column(name = "catDepartMunicOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatDepartMunicOther() {
        return catDepartMunicOther;
    }

    public void setCatDepartMunicOther(Integer catDepartMunicOther) {
        this.catDepartMunicOther = catDepartMunicOther;
    }

    @Basic
    @Column(name = "catDepartCommercOther", nullable = true, insertable = true, updatable = true)
    public Integer getCatDepartCommercOther() {
        return catDepartCommercOther;
    }

    public void setCatDepartCommercOther(Integer catDepartCommercOther) {
        this.catDepartCommercOther = catDepartCommercOther;
    }

    @Basic
    @Column(name = "catDepartItogOther", nullable = true, insertable = true, updatable = true)
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

        Draftreport that = (Draftreport) o;

        if (idDraftreport != that.idDraftreport) return false;
        if (catDangerCommercAll != null ? !catDangerCommercAll.equals(that.catDangerCommercAll) : that.catDangerCommercAll != null)
            return false;
        if (catDangerCommercEquip != null ? !catDangerCommercEquip.equals(that.catDangerCommercEquip) : that.catDangerCommercEquip != null)
            return false;
        if (catDangerCommercOther != null ? !catDangerCommercOther.equals(that.catDangerCommercOther) : that.catDangerCommercOther != null)
            return false;
        if (catDangerCommercRnis != null ? !catDangerCommercRnis.equals(that.catDangerCommercRnis) : that.catDangerCommercRnis != null)
            return false;
        if (catDangerItogAll != null ? !catDangerItogAll.equals(that.catDangerItogAll) : that.catDangerItogAll != null)
            return false;
        if (catDangerItogEquip != null ? !catDangerItogEquip.equals(that.catDangerItogEquip) : that.catDangerItogEquip != null)
            return false;
        if (catDangerItogOther != null ? !catDangerItogOther.equals(that.catDangerItogOther) : that.catDangerItogOther != null)
            return false;
        if (catDangerItogRnis != null ? !catDangerItogRnis.equals(that.catDangerItogRnis) : that.catDangerItogRnis != null)
            return false;
        if (catDangerMunicAll != null ? !catDangerMunicAll.equals(that.catDangerMunicAll) : that.catDangerMunicAll != null)
            return false;
        if (catDangerMunicEquip != null ? !catDangerMunicEquip.equals(that.catDangerMunicEquip) : that.catDangerMunicEquip != null)
            return false;
        if (catDangerMunicOther != null ? !catDangerMunicOther.equals(that.catDangerMunicOther) : that.catDangerMunicOther != null)
            return false;
        if (catDangerMunicRnis != null ? !catDangerMunicRnis.equals(that.catDangerMunicRnis) : that.catDangerMunicRnis != null)
            return false;
        if (catDangerStateAll != null ? !catDangerStateAll.equals(that.catDangerStateAll) : that.catDangerStateAll != null)
            return false;
        if (catDangerStateEquip != null ? !catDangerStateEquip.equals(that.catDangerStateEquip) : that.catDangerStateEquip != null)
            return false;
        if (catDangerStateOther != null ? !catDangerStateOther.equals(that.catDangerStateOther) : that.catDangerStateOther != null)
            return false;
        if (catDangerStateRnis != null ? !catDangerStateRnis.equals(that.catDangerStateRnis) : that.catDangerStateRnis != null)
            return false;
        if (catDepartCommercAll != null ? !catDepartCommercAll.equals(that.catDepartCommercAll) : that.catDepartCommercAll != null)
            return false;
        if (catDepartCommercEquip != null ? !catDepartCommercEquip.equals(that.catDepartCommercEquip) : that.catDepartCommercEquip != null)
            return false;
        if (catDepartCommercOther != null ? !catDepartCommercOther.equals(that.catDepartCommercOther) : that.catDepartCommercOther != null)
            return false;
        if (catDepartCommercRnis != null ? !catDepartCommercRnis.equals(that.catDepartCommercRnis) : that.catDepartCommercRnis != null)
            return false;
        if (catDepartItogAll != null ? !catDepartItogAll.equals(that.catDepartItogAll) : that.catDepartItogAll != null)
            return false;
        if (catDepartItogEquip != null ? !catDepartItogEquip.equals(that.catDepartItogEquip) : that.catDepartItogEquip != null)
            return false;
        if (catDepartItogOther != null ? !catDepartItogOther.equals(that.catDepartItogOther) : that.catDepartItogOther != null)
            return false;
        if (catDepartItogRnis != null ? !catDepartItogRnis.equals(that.catDepartItogRnis) : that.catDepartItogRnis != null)
            return false;
        if (catDepartMunicAll != null ? !catDepartMunicAll.equals(that.catDepartMunicAll) : that.catDepartMunicAll != null)
            return false;
        if (catDepartMunicEquip != null ? !catDepartMunicEquip.equals(that.catDepartMunicEquip) : that.catDepartMunicEquip != null)
            return false;
        if (catDepartMunicOther != null ? !catDepartMunicOther.equals(that.catDepartMunicOther) : that.catDepartMunicOther != null)
            return false;
        if (catDepartMunicRnis != null ? !catDepartMunicRnis.equals(that.catDepartMunicRnis) : that.catDepartMunicRnis != null)
            return false;
        if (catDepartStateAll != null ? !catDepartStateAll.equals(that.catDepartStateAll) : that.catDepartStateAll != null)
            return false;
        if (catDepartStateEquip != null ? !catDepartStateEquip.equals(that.catDepartStateEquip) : that.catDepartStateEquip != null)
            return false;
        if (catDepartStateOther != null ? !catDepartStateOther.equals(that.catDepartStateOther) : that.catDepartStateOther != null)
            return false;
        if (catDepartStateRnis != null ? !catDepartStateRnis.equals(that.catDepartStateRnis) : that.catDepartStateRnis != null)
            return false;
        if (catGkhCommercAll != null ? !catGkhCommercAll.equals(that.catGkhCommercAll) : that.catGkhCommercAll != null)
            return false;
        if (catGkhCommercEquip != null ? !catGkhCommercEquip.equals(that.catGkhCommercEquip) : that.catGkhCommercEquip != null)
            return false;
        if (catGkhCommercOther != null ? !catGkhCommercOther.equals(that.catGkhCommercOther) : that.catGkhCommercOther != null)
            return false;
        if (catGkhCommercRnis != null ? !catGkhCommercRnis.equals(that.catGkhCommercRnis) : that.catGkhCommercRnis != null)
            return false;
        if (catGkhItogAll != null ? !catGkhItogAll.equals(that.catGkhItogAll) : that.catGkhItogAll != null)
            return false;
        if (catGkhItogEquip != null ? !catGkhItogEquip.equals(that.catGkhItogEquip) : that.catGkhItogEquip != null)
            return false;
        if (catGkhItogOther != null ? !catGkhItogOther.equals(that.catGkhItogOther) : that.catGkhItogOther != null)
            return false;
        if (catGkhItogRnis != null ? !catGkhItogRnis.equals(that.catGkhItogRnis) : that.catGkhItogRnis != null)
            return false;
        if (catGkhMunicAll != null ? !catGkhMunicAll.equals(that.catGkhMunicAll) : that.catGkhMunicAll != null)
            return false;
        if (catGkhMunicEquip != null ? !catGkhMunicEquip.equals(that.catGkhMunicEquip) : that.catGkhMunicEquip != null)
            return false;
        if (catGkhMunicOther != null ? !catGkhMunicOther.equals(that.catGkhMunicOther) : that.catGkhMunicOther != null)
            return false;
        if (catGkhMunicRnis != null ? !catGkhMunicRnis.equals(that.catGkhMunicRnis) : that.catGkhMunicRnis != null)
            return false;
        if (catGkhStateAll != null ? !catGkhStateAll.equals(that.catGkhStateAll) : that.catGkhStateAll != null)
            return false;
        if (catGkhStateEquip != null ? !catGkhStateEquip.equals(that.catGkhStateEquip) : that.catGkhStateEquip != null)
            return false;
        if (catGkhStateOther != null ? !catGkhStateOther.equals(that.catGkhStateOther) : that.catGkhStateOther != null)
            return false;
        if (catGkhStateRnis != null ? !catGkhStateRnis.equals(that.catGkhStateRnis) : that.catGkhStateRnis != null)
            return false;
        if (catLargeCommercAll != null ? !catLargeCommercAll.equals(that.catLargeCommercAll) : that.catLargeCommercAll != null)
            return false;
        if (catLargeCommercEquip != null ? !catLargeCommercEquip.equals(that.catLargeCommercEquip) : that.catLargeCommercEquip != null)
            return false;
        if (catLargeCommercOther != null ? !catLargeCommercOther.equals(that.catLargeCommercOther) : that.catLargeCommercOther != null)
            return false;
        if (catLargeCommercRnis != null ? !catLargeCommercRnis.equals(that.catLargeCommercRnis) : that.catLargeCommercRnis != null)
            return false;
        if (catLargeItogAll != null ? !catLargeItogAll.equals(that.catLargeItogAll) : that.catLargeItogAll != null)
            return false;
        if (catLargeItogEquip != null ? !catLargeItogEquip.equals(that.catLargeItogEquip) : that.catLargeItogEquip != null)
            return false;
        if (catLargeItogOther != null ? !catLargeItogOther.equals(that.catLargeItogOther) : that.catLargeItogOther != null)
            return false;
        if (catLargeItogRnis != null ? !catLargeItogRnis.equals(that.catLargeItogRnis) : that.catLargeItogRnis != null)
            return false;
        if (catLargeMunicAll != null ? !catLargeMunicAll.equals(that.catLargeMunicAll) : that.catLargeMunicAll != null)
            return false;
        if (catLargeMunicEquip != null ? !catLargeMunicEquip.equals(that.catLargeMunicEquip) : that.catLargeMunicEquip != null)
            return false;
        if (catLargeMunicOther != null ? !catLargeMunicOther.equals(that.catLargeMunicOther) : that.catLargeMunicOther != null)
            return false;
        if (catLargeMunicRnis != null ? !catLargeMunicRnis.equals(that.catLargeMunicRnis) : that.catLargeMunicRnis != null)
            return false;
        if (catLargeStateAll != null ? !catLargeStateAll.equals(that.catLargeStateAll) : that.catLargeStateAll != null)
            return false;
        if (catLargeStateEquip != null ? !catLargeStateEquip.equals(that.catLargeStateEquip) : that.catLargeStateEquip != null)
            return false;
        if (catLargeStateOther != null ? !catLargeStateOther.equals(that.catLargeStateOther) : that.catLargeStateOther != null)
            return false;
        if (catLargeStateRnis != null ? !catLargeStateRnis.equals(that.catLargeStateRnis) : that.catLargeStateRnis != null)
            return false;
        if (catM1CommercAll != null ? !catM1CommercAll.equals(that.catM1CommercAll) : that.catM1CommercAll != null)
            return false;
        if (catM1CommercEquip != null ? !catM1CommercEquip.equals(that.catM1CommercEquip) : that.catM1CommercEquip != null)
            return false;
        if (catM1CommercOther != null ? !catM1CommercOther.equals(that.catM1CommercOther) : that.catM1CommercOther != null)
            return false;
        if (catM1CommercRnis != null ? !catM1CommercRnis.equals(that.catM1CommercRnis) : that.catM1CommercRnis != null)
            return false;
        if (catM1ItogAll != null ? !catM1ItogAll.equals(that.catM1ItogAll) : that.catM1ItogAll != null) return false;
        if (catM1ItogEquip != null ? !catM1ItogEquip.equals(that.catM1ItogEquip) : that.catM1ItogEquip != null)
            return false;
        if (catM1ItogOther != null ? !catM1ItogOther.equals(that.catM1ItogOther) : that.catM1ItogOther != null)
            return false;
        if (catM1ItogRnis != null ? !catM1ItogRnis.equals(that.catM1ItogRnis) : that.catM1ItogRnis != null)
            return false;
        if (catM1MunicAll != null ? !catM1MunicAll.equals(that.catM1MunicAll) : that.catM1MunicAll != null)
            return false;
        if (catM1MunicEquip != null ? !catM1MunicEquip.equals(that.catM1MunicEquip) : that.catM1MunicEquip != null)
            return false;
        if (catM1MunicOther != null ? !catM1MunicOther.equals(that.catM1MunicOther) : that.catM1MunicOther != null)
            return false;
        if (catM1MunicRnis != null ? !catM1MunicRnis.equals(that.catM1MunicRnis) : that.catM1MunicRnis != null)
            return false;
        if (catM1StateAll != null ? !catM1StateAll.equals(that.catM1StateAll) : that.catM1StateAll != null)
            return false;
        if (catM1StateEquip != null ? !catM1StateEquip.equals(that.catM1StateEquip) : that.catM1StateEquip != null)
            return false;
        if (catM1StateOther != null ? !catM1StateOther.equals(that.catM1StateOther) : that.catM1StateOther != null)
            return false;
        if (catM1StateRnis != null ? !catM1StateRnis.equals(that.catM1StateRnis) : that.catM1StateRnis != null)
            return false;
        if (catM2M3CommercAll != null ? !catM2M3CommercAll.equals(that.catM2M3CommercAll) : that.catM2M3CommercAll != null)
            return false;
        if (catM2M3CommercEquip != null ? !catM2M3CommercEquip.equals(that.catM2M3CommercEquip) : that.catM2M3CommercEquip != null)
            return false;
        if (catM2M3CommercOther != null ? !catM2M3CommercOther.equals(that.catM2M3CommercOther) : that.catM2M3CommercOther != null)
            return false;
        if (catM2M3CommercRnis != null ? !catM2M3CommercRnis.equals(that.catM2M3CommercRnis) : that.catM2M3CommercRnis != null)
            return false;
        if (catM2M3ItogAll != null ? !catM2M3ItogAll.equals(that.catM2M3ItogAll) : that.catM2M3ItogAll != null)
            return false;
        if (catM2M3ItogEquip != null ? !catM2M3ItogEquip.equals(that.catM2M3ItogEquip) : that.catM2M3ItogEquip != null)
            return false;
        if (catM2M3ItogOther != null ? !catM2M3ItogOther.equals(that.catM2M3ItogOther) : that.catM2M3ItogOther != null)
            return false;
        if (catM2M3ItogRnis != null ? !catM2M3ItogRnis.equals(that.catM2M3ItogRnis) : that.catM2M3ItogRnis != null)
            return false;
        if (catM2M3MunicAll != null ? !catM2M3MunicAll.equals(that.catM2M3MunicAll) : that.catM2M3MunicAll != null)
            return false;
        if (catM2M3MunicEquip != null ? !catM2M3MunicEquip.equals(that.catM2M3MunicEquip) : that.catM2M3MunicEquip != null)
            return false;
        if (catM2M3MunicOther != null ? !catM2M3MunicOther.equals(that.catM2M3MunicOther) : that.catM2M3MunicOther != null)
            return false;
        if (catM2M3MunicRnis != null ? !catM2M3MunicRnis.equals(that.catM2M3MunicRnis) : that.catM2M3MunicRnis != null)
            return false;
        if (catM2M3StateAll != null ? !catM2M3StateAll.equals(that.catM2M3StateAll) : that.catM2M3StateAll != null)
            return false;
        if (catM2M3StateEquip != null ? !catM2M3StateEquip.equals(that.catM2M3StateEquip) : that.catM2M3StateEquip != null)
            return false;
        if (catM2M3StateOther != null ? !catM2M3StateOther.equals(that.catM2M3StateOther) : that.catM2M3StateOther != null)
            return false;
        if (catM2M3StateRnis != null ? !catM2M3StateRnis.equals(that.catM2M3StateRnis) : that.catM2M3StateRnis != null)
            return false;
        if (catSchoolCommercAll != null ? !catSchoolCommercAll.equals(that.catSchoolCommercAll) : that.catSchoolCommercAll != null)
            return false;
        if (catSchoolCommercEquip != null ? !catSchoolCommercEquip.equals(that.catSchoolCommercEquip) : that.catSchoolCommercEquip != null)
            return false;
        if (catSchoolCommercOther != null ? !catSchoolCommercOther.equals(that.catSchoolCommercOther) : that.catSchoolCommercOther != null)
            return false;
        if (catSchoolCommercRnis != null ? !catSchoolCommercRnis.equals(that.catSchoolCommercRnis) : that.catSchoolCommercRnis != null)
            return false;
        if (catSchoolItogAll != null ? !catSchoolItogAll.equals(that.catSchoolItogAll) : that.catSchoolItogAll != null)
            return false;
        if (catSchoolItogEquip != null ? !catSchoolItogEquip.equals(that.catSchoolItogEquip) : that.catSchoolItogEquip != null)
            return false;
        if (catSchoolItogOther != null ? !catSchoolItogOther.equals(that.catSchoolItogOther) : that.catSchoolItogOther != null)
            return false;
        if (catSchoolItogRnis != null ? !catSchoolItogRnis.equals(that.catSchoolItogRnis) : that.catSchoolItogRnis != null)
            return false;
        if (catSchoolMunicAll != null ? !catSchoolMunicAll.equals(that.catSchoolMunicAll) : that.catSchoolMunicAll != null)
            return false;
        if (catSchoolMunicEquip != null ? !catSchoolMunicEquip.equals(that.catSchoolMunicEquip) : that.catSchoolMunicEquip != null)
            return false;
        if (catSchoolMunicOther != null ? !catSchoolMunicOther.equals(that.catSchoolMunicOther) : that.catSchoolMunicOther != null)
            return false;
        if (catSchoolMunicRnis != null ? !catSchoolMunicRnis.equals(that.catSchoolMunicRnis) : that.catSchoolMunicRnis != null)
            return false;
        if (catSchoolStateAll != null ? !catSchoolStateAll.equals(that.catSchoolStateAll) : that.catSchoolStateAll != null)
            return false;
        if (catSchoolStateEquip != null ? !catSchoolStateEquip.equals(that.catSchoolStateEquip) : that.catSchoolStateEquip != null)
            return false;
        if (catSchoolStateOther != null ? !catSchoolStateOther.equals(that.catSchoolStateOther) : that.catSchoolStateOther != null)
            return false;
        if (catSchoolStateRnis != null ? !catSchoolStateRnis.equals(that.catSchoolStateRnis) : that.catSchoolStateRnis != null)
            return false;
        if (dateReport != null ? !dateReport.equals(that.dateReport) : that.dateReport != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idDraftreport;
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
