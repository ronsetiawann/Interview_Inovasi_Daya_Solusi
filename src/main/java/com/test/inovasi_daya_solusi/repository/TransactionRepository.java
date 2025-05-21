package com.test.inovasi_daya_solusi.repository;

import com.test.inovasi_daya_solusi.entity.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transactions, Integer> {
}
