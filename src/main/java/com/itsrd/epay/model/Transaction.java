package com.itsrd.epay.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @JsonIgnore
    private Long id;

    @NotNull
    private String remitterPhoneNo;

    @NotNull
    private String type;

    @NotNull
    private Double amount;

    @NotNull
    private String description;

    private String remark;

    private String createdAt;

    public Transaction(String remitterPhoneNo, String type, Double amount, String description, String remark) {
        this.remitterPhoneNo = remitterPhoneNo;
        this.type = type;
        this.amount = amount;
        this.description = description;
        this.remark = remark;
        this.createdAt = String.valueOf(new java.util.Date());
    }
}
