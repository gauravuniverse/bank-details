package com.bank.api;

import com.bank.models.BankBranches;
import com.bank.service.BankBranchesService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j2
@RestController
public class BankBranchesController {

    @Autowired
    BankBranchesService bankBranchesService;

    @PostMapping(value = "/bank")
    public ResponseEntity<List<BankBranches>> getBankBranches(@RequestBody BankBranches bankBranches) {
        log.info("inside getBankBranches method");
        return  ResponseEntity.ok(bankBranchesService.getBankBranches(bankBranches));
    }

}
