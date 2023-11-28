package com.splitwise.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Person.class)
public abstract class Person_ {

	public static volatile SingularAttribute<Person, String> personName;
	public static volatile SingularAttribute<Person, String> name;
	public static volatile SingularAttribute<Person, Integer> personId;
	public static volatile SingularAttribute<Person, Long> id;
	public static volatile SetAttribute<Person, Transaction> transactions;

	public static final String PERSON_NAME = "personName";
	public static final String NAME = "name";
	public static final String PERSON_ID = "personId";
	public static final String ID = "id";
	public static final String TRANSACTIONS = "transactions";

}

