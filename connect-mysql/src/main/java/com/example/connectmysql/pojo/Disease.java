package com.example.connectmysql.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Disease {
    @Id
    private int diseaseTableId;
    private String diseaseId;
    private String diseaseClass;
    private String diseaseName;
    private String diseaseType;
    private String diseaseSemanticType;
}
