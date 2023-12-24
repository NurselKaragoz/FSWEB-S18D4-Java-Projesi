package com.workintech.model.service;

import com.workintech.model.dao.AccountRepository;
import com.workintech.model.dao.AddressRepository;
import com.workintech.model.entity.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService{
    private AddressRepository addressRepository;

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }
    @Override
    public Address save(Address address) {
        return null;
    }

    @Override
    public Address findById(Double id) {
        return null;
    }
}
