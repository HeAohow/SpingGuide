package com.example.connectmysql.dao;

import com.example.connectmysql.pojo.Snp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SnpDao extends JpaRepository<Snp, Integer> {
    Snp findBySnpId(String snpId);
}
