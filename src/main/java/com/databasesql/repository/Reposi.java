package com.databasesql.repository;

import com.databasesql.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface Reposi extends JpaRepository<Model,String> {
    }


