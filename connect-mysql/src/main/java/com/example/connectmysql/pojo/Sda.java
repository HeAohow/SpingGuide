package com.example.connectmysql.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "sda")
@Getter
@Setter
public class Sda {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "sda_id")
    private int sdaId;
//    @Column(name = "snp_id")
    private String snpId;
//    @Column(name = "disease_table_id")
    private int diseaseTableId;
//    @Column(name = "source_table_id")
    private int sourceTableId;
//    @Column(name = "pm_id")
    private String pmId;

}
