package com.splitprice.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Users.class)
public abstract class Users_ {

	public static volatile SingularAttribute<Users, String> name;
	public static volatile SingularAttribute<Users, Long> id;
	public static volatile SingularAttribute<Users, String> userName;
	public static volatile SetAttribute<Users, Transaction> transactions;
	public static volatile SingularAttribute<Users, Integer> userId;

	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String USER_NAME = "userName";
	public static final String TRANSACTIONS = "transactions";
	public static final String USER_ID = "userId";

}

