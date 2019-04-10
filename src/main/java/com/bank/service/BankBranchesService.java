package com.bank.service;

import com.bank.models.BankBranches;
import com.bank.repository.BankBranchesRepositoy;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
public class BankBranchesService {

    @Autowired
    BankBranchesRepositoy bankBranchesRepositoy;

    public List<BankBranches> getBankBranches(BankBranches bankBranches) {
        log.info("inside getBankBranches method");
        ExampleMatcher matcher = ExampleMatcher.matching().withIgnoreNullValues();
        Example<BankBranches> bankBranchesExample = Example.of(bankBranches, matcher);
        return bankBranchesRepositoy.findAll(bankBranchesExample);
    }
}
