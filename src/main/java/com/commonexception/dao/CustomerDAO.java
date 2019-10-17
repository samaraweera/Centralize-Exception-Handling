package com.commonexception.dao;

import com.commonexception.model.BaseResponse;
import com.commonexception.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDAO extends JpaRepository<Customer,Long> {
}
