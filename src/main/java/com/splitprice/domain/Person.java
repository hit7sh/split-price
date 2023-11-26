package com.splitprice.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/**
 * A Person.
 */
@Entity
@Table(name = "person")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "person_name")
    private String personName;

    @Column(name = "name")
    private String name;

    @Column(name = "person_id")
    private Integer personId;

    @OneToMany(mappedBy = "transactions")
    @JsonIgnoreProperties(value = { "transactions" }, allowSetters = true)
    private Set<Transaction> transactions = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Person id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPersonName() {
        return this.personName;
    }

    public Person personName(String personName) {
        this.setPersonName(personName);
        return this;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getName() {
        return this.name;
    }

    public Person name(String name) {
        this.setName(name);
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPersonId() {
        return this.personId;
    }

    public Person personId(Integer personId) {
        this.setPersonId(personId);
        return this;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Set<Transaction> getTransactions() {
        return this.transactions;
    }

    public void setTransactions(Set<Transaction> transactions) {
        if (this.transactions != null) {
            this.transactions.forEach(i -> i.setTransactions(null));
        }
        if (transactions != null) {
            transactions.forEach(i -> i.setTransactions(this));
        }
        this.transactions = transactions;
    }

    public Person transactions(Set<Transaction> transactions) {
        this.setTransactions(transactions);
        return this;
    }

    public Person addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
        transaction.setTransactions(this);
        return this;
    }

    public Person removeTransaction(Transaction transaction) {
        this.transactions.remove(transaction);
        transaction.setTransactions(null);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Person)) {
            return false;
        }
        return id != null && id.equals(((Person) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Person{" +
            "id=" + getId() +
            ", personName='" + getPersonName() + "'" +
            ", name='" + getName() + "'" +
            ", personId=" + getPersonId() +
            "}";
    }
}
