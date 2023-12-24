package com.workintech.model.service;
import com.workintech.model.entity.Address;

public interface AddressService {
    Address save(Address address);
    Address findById(Double id);
}
