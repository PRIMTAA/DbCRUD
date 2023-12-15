package com.sqlConnect.DbCRUD.repo;

import com.sqlConnect.DbCRUD.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {
}
