package com.example.connectmysql.dao;

import com.example.connectmysql.pojo.Source;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SourceDao extends JpaRepository<Source, Integer> {
    Source findBySourceTableId(String sourceTableId);

    List<Source> findAll();
}
