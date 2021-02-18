package com.example.connectmysql.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Snp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String snpId;
    private String chromosome;
    private String position;
    private float dsi;
    private float dpi;
    private float score;
    private float ei;
    private String yearInitial;
    private String yearFinal;

}
