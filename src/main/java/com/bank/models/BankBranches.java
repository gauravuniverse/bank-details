package com.bank.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "bank_branches")
@Data
public class BankBranches implements Serializable {

    @Id
    @Column(name = "ifsc")
    private String ifsc;

    @Column(name = "bank_id")
    private Long bankId;

    @Column(name = "branch")
    private String branch;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "district")
    private String district;

    @Column(name = "state")
    private String state;

    @Column(name = "bank_name")
    private String bankName;
}
