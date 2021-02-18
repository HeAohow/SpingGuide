package com.example.connectmysql.controller;

import com.example.connectmysql.dao.SdaDao;
import com.example.connectmysql.dao.SnpDao;
import com.example.connectmysql.pojo.Sda;
import com.example.connectmysql.service.SdaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/demo")
public class SdaController {
    @Autowired
    SdaService sdaService;

    @GetMapping("/queryBySnp/{snpId}")
    public List<Sda> querySdaBySnp(@PathVariable() String snpId){
        return sdaService.findBySnpId(snpId);
    }
}
