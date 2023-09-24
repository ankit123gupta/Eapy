package com.itsrd.epay.repository;

import com.itsrd.epay.model.Transaction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    Page<Transaction> findByRemitterPhoneNo(String remitterPhoneNo, Pageable pageable);
}
