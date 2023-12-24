package com.workintech.model.service;


import com.workintech.model.entity.Costumer;

public interface CostumerService {
    Costumer save(Costumer costumer);
    Costumer findById(Double id);
}
