package com.workintech.model.dao;

import com.workintech.model.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Double> {
}
