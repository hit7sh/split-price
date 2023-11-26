package com.splitprice.domain;

import com.splitprice.domain.enumeration.Status;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Transaction.class)
public abstract class Transaction_ {

	public static volatile SingularAttribute<Transaction, String> fromUserName;
	public static volatile SingularAttribute<Transaction, Integer> amount;
	public static volatile SingularAttribute<Transaction, Long> id;
	public static volatile SingularAttribute<Transaction, Person> transactions;
	public static volatile SingularAttribute<Transaction, Integer> userId;
	public static volatile SingularAttribute<Transaction, Status> status;

	public static final String FROM_USER_NAME = "fromUserName";
	public static final String AMOUNT = "amount";
	public static final String ID = "id";
	public static final String TRANSACTIONS = "transactions";
	public static final String USER_ID = "userId";
	public static final String STATUS = "status";

}

