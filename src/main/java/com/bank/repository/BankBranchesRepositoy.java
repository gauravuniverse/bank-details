package com.bank.repository;

import com.bank.models.BankBranches;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankBranchesRepositoy extends JpaRepository<BankBranches, String> {

}
