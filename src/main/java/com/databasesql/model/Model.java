package com.databasesql.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Data
@Entity
@Table(name="emp")
public class Model {

    private String empName;
    @Id
    private double salary;
    private String designation;
    private String gender;
    private String leaves;
    private String location;
}
