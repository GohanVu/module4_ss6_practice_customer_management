package com.example.ss6_practice_customermanagement.service;

import java.util.List;


public interface IGenerateService<T> {
    List<T> findAll();

    void save(T t);

    T findById(Long id);

    void remove(Long id);
}
