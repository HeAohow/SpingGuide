package com.example.connectmysql.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Source {
    @Id
    private int sourceTableId;
    private String sourceName;
}
