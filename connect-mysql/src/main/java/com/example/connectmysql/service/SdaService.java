package com.example.connectmysql.service;

import com.example.connectmysql.dao.DiseaseDao;
import com.example.connectmysql.dao.SdaDao;
import com.example.connectmysql.dao.SnpDao;
import com.example.connectmysql.dao.SourceDao;
import com.example.connectmysql.pojo.Disease;
import com.example.connectmysql.pojo.Sda;
import com.example.connectmysql.pojo.Snp;
import com.example.connectmysql.pojo.Source;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Service
public class SdaService {
    @Autowired
    private SnpDao snpDao;
    @Autowired
    private SdaDao sdaDao;
//    @Autowired
//    private DiseaseDao diseaseDao;
//    @Autowired
//    private SourceDao sourceDao;

//    private HashMap<Integer, String> diseaseMap;
//    private HashMap<Integer, String> sourceMap;
//
//    public SdaService(SnpDao snpDao, SdaDao sdaDao, DiseaseDao diseaseDao, SourceDao sourceDao) {
//        this.snpDao = snpDao;
//        this.sdaDao = sdaDao;
//        this.diseaseDao = diseaseDao;
//        this.sourceDao = sourceDao;
//
//        List<Disease> diseases = diseaseDao.findAll();
//        List<Source> sources = sourceDao.findAll();
//
//        for(Disease disease : diseases){
//            diseaseMap.put(disease.getDiseaseTableId(), disease.getDiseaseName());
//        }
//
//        for(Source source : sources){
//            sourceMap.put(source.getSourceTableId(), source.getSourceName());
//        }
//    }

    //    输入snp查询相关疾病
    public List<Sda> findBySnpId(String snpId){
        // 判断输入的snp是否已存储在数据库中
        Snp snp = snpDao.findBySnpId(snpId);
        // 如果不在直接返回
        if(snp == null){
            return null;
        }
        else{
            // 如果在则查询sda表并返回和该snp相关的disease
            return sdaDao.findBySnpId(snp.getSnpId());
//            // 返回相关信息
//            // JSON格式吗？
//            for(Sda sda : sdaList){
//            }
        }

    }

    //    输入疾病查询相关基因
    public void querySnpByGene(){

    }
}
