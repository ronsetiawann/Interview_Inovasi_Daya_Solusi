package com.test.inovasi_daya_solusi.service;

import com.test.inovasi_daya_solusi.entity.Status;
import com.test.inovasi_daya_solusi.entity.Transactions;
import com.test.inovasi_daya_solusi.repository.StatusRepository;
import com.test.inovasi_daya_solusi.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;
import java.util.*;

@Service
public class ViewDataService {

    @Autowired
    private StatusRepository statusRepository;
    @Autowired
    private TransactionRepository transactionRepository;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public List<Transactions> getAllTransactions() {
        return transactionRepository.findAll();
    }
    public List<Status> getAllStatuses() {
        return statusRepository.findAll();
    }
}
