package com.example.connectmysql.dao;

import com.example.connectmysql.pojo.Sda;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SdaDao extends JpaRepository<Sda, Integer> {
    List<Sda> findBySnpId(String SnpId);

    List<Sda> findByDiseaseTableId(String diseaseTableId);
}
