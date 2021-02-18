package com.example.connectmysql.dao;

import com.example.connectmysql.pojo.Disease;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DiseaseDao extends JpaRepository<Disease, Integer> {
    Disease findByDiseaseId(String diseaseId);

    Disease findByDiseaseName(String diseaseName);

    List<Disease> findAll();
}
