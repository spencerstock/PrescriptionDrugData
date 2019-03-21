package com.example.prescriptiondrugdata;

public class DrugDataModel {
    private int id;
    private String company, drugBrandName, icd10Diagnosis, icd10DxDesc;

    public DrugDataModel(int id, String company, String drugBrandName, String icd10Diagnosis, String icd10DxDesc) {
        this.id = id;
        this.company = company;
        this.drugBrandName = drugBrandName;
        this.icd10Diagnosis = icd10Diagnosis;
        this.icd10DxDesc = icd10DxDesc;
    }

    public int getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public String getDrugBrandName() {
        return drugBrandName;
    }

    public String getIcd10Diagnosis() {
        return icd10Diagnosis;
    }

    public String getIcd10DxDesc() {
        return icd10DxDesc;
    }
}
