package com.example.sql.controllers;

import com.example.sql.repositories.RepositorySQL;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControllerSQL {
    private final RepositorySQL repositorySQL;

    public ControllerSQL(RepositorySQL repositorySQL) {
        this.repositorySQL = repositorySQL;
    }
    @GetMapping("/products/fetch-product")
    public List<String> getSqlSetup(@RequestParam String name) {
        return repositorySQL.getProductName(name);
    }
}
