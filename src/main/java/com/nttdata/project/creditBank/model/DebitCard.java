package com.nttdata.project.creditBank.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Getter
@Setter
@Document(collection = "debit_cards")
public class DebitCard {
    @Id
    private String id;
    @Field(name = "card_number")
    private String cardNumber;
    @Field(name = "expiration_date")
    private String expirationDate;
    private String CCI;
    @Field(name = "account_ids")
    @DocumentReference
    @JsonIgnore
    private List<Account> accounts;
}