package com.test.inovasi_daya_solusi.controller;

import com.test.inovasi_daya_solusi.entity.Status;
import com.test.inovasi_daya_solusi.entity.Transactions;
import com.test.inovasi_daya_solusi.service.ViewDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ViewDataController {
    @Autowired
    private ViewDataService viewDataService;

    @GetMapping(value = "/viewData")
    public Map<String, Object> getTransactions() {
        Map<String, Object> response = new HashMap<>();
        List<Transactions> transactions = viewDataService.getAllTransactions();
        List<Status> statuses = viewDataService.getAllStatuses();
        response.put("data", transactions);
        response.put("status", statuses);
        return response;
    }
}
