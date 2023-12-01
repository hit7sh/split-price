package com.splitwise.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.splitwise.domain.enumeration.Status;
import com.splitwise.service.dto.TransactionDTO;

import java.io.Serializable;
import javax.persistence.*;

/**
 * A Transaction.
 */
@Entity
@Table(name = "transaction")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class Transaction implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "from_user_name")
    private String fromUserName;

    @Column(name = "amount")
    private Integer amount;

    @Column(name = "user_id")
    private Integer userId;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;

    @ManyToOne
    @JsonIgnoreProperties(value = { "transactions" }, allowSetters = true)
    private Person person;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Transaction id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFromUserName() {
        return this.fromUserName;
    }

    public Transaction fromUserName(String fromUserName) {
        this.setFromUserName(fromUserName);
        return this;
    }

    public void setFromUserName(String fromUserName) {
        this.fromUserName = fromUserName;
    }

    public Integer getAmount() {
        return this.amount;
    }

    public Transaction amount(Integer amount) {
        this.setAmount(amount);
        return this;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public Transaction userId(Integer userId) {
        this.setUserId(userId);
        return this;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Status getStatus() {
        return this.status;
    }

    public Transaction status(Status status) {
        this.setStatus(status);
        return this;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Person getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Transaction person(Person person) {
        this.setPerson(person);
        return this;
    }
    public TransactionDTO toTransactionDTO() {
        TransactionDTO transactionDTO = new TransactionDTO();
        transactionDTO.setPerson(person.toPersonDTO());
        transactionDTO.setAmount(amount);
        transactionDTO.setId(id);
        transactionDTO.setFromUserName(fromUserName);
        transactionDTO.setStatus(status);
        transactionDTO.setUserId(userId);
        return transactionDTO;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Transaction)) {
            return false;
        }
        return id != null && id.equals(((Transaction) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Transaction{" +
            "id=" + getId() +
            ", fromUserName='" + getFromUserName() + "'" +
            ", amount=" + getAmount() +
            ", userId=" + getUserId() +
            ", status='" + getStatus() + "'" +
            "}";
    }
}
