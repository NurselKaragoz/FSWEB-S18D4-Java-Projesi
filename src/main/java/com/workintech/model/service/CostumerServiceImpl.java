package com.workintech.model.service;

import com.workintech.model.dao.AddressRepository;
import com.workintech.model.dao.CostumerRepository;
import com.workintech.model.entity.Costumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CostumerServiceImpl implements CostumerService {
    private CostumerRepository costumerRepository;

    @Autowired
    public CostumerServiceImpl(CostumerRepository costumerRepository) {
        this.costumerRepository = costumerRepository;
    }
    @Override
    public Costumer save(Costumer costumer) {
        return null;
    }

    @Override
    public Costumer findById(Double id) {
        return null;
    }
}
