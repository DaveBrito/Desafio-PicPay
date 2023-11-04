package com.picpay.BackEnd.repository;

import com.picpay.BackEnd.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
