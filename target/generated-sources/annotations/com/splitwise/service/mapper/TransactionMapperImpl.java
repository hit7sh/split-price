package com.splitwise.service.mapper;

import com.splitwise.domain.Person;
import com.splitwise.domain.Transaction;
import com.splitwise.service.dto.PersonDTO;
import com.splitwise.service.dto.TransactionDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-28T21:57:42+0530",
    comments = "version: 1.5.2.Final, compiler: Eclipse JDT (IDE) 3.35.0.v20230814-2020, environment: Java 17.0.8.1 (Eclipse Adoptium)"
)
@Component
public class TransactionMapperImpl implements TransactionMapper {

    @Override
    public void partialUpdate(Transaction arg0, TransactionDTO arg1) {
        if ( arg1 == null ) {
            return;
        }

        if ( arg1.getId() != null ) {
            arg0.setId( arg1.getId() );
        }
        if ( arg1.getFromUserName() != null ) {
            arg0.setFromUserName( arg1.getFromUserName() );
        }
        if ( arg1.getAmount() != null ) {
            arg0.setAmount( arg1.getAmount() );
        }
        if ( arg1.getUserId() != null ) {
            arg0.setUserId( arg1.getUserId() );
        }
        if ( arg1.getStatus() != null ) {
            arg0.setStatus( arg1.getStatus() );
        }
        if ( arg1.getPerson() != null ) {
            if ( arg0.getPerson() == null ) {
                arg0.person( new Person() );
            }
            personDTOToPerson( arg1.getPerson(), arg0.getPerson() );
        }
    }

    @Override
    public List<TransactionDTO> toDto(List<Transaction> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<TransactionDTO> list = new ArrayList<TransactionDTO>( arg0.size() );
        for ( Transaction transaction : arg0 ) {
            list.add( toDto( transaction ) );
        }

        return list;
    }

    @Override
    public Transaction toEntity(TransactionDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Transaction transaction = new Transaction();

        transaction.setId( arg0.getId() );
        transaction.setFromUserName( arg0.getFromUserName() );
        transaction.setAmount( arg0.getAmount() );
        transaction.setUserId( arg0.getUserId() );
        transaction.setStatus( arg0.getStatus() );
        transaction.person( personDTOToPerson1( arg0.getPerson() ) );

        return transaction;
    }

    @Override
    public List<Transaction> toEntity(List<TransactionDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<Transaction> list = new ArrayList<Transaction>( arg0.size() );
        for ( TransactionDTO transactionDTO : arg0 ) {
            list.add( toEntity( transactionDTO ) );
        }

        return list;
    }

    @Override
    public TransactionDTO toDto(Transaction s) {
        if ( s == null ) {
            return null;
        }

        TransactionDTO transactionDTO = new TransactionDTO();

        transactionDTO.setPerson( toDtoPersonId( s.getPerson() ) );
        transactionDTO.setAmount( s.getAmount() );
        transactionDTO.setFromUserName( s.getFromUserName() );
        transactionDTO.setId( s.getId() );
        transactionDTO.setStatus( s.getStatus() );
        transactionDTO.setUserId( s.getUserId() );

        return transactionDTO;
    }

    @Override
    public PersonDTO toDtoPersonId(Person person) {
        if ( person == null ) {
            return null;
        }

        PersonDTO personDTO = new PersonDTO();

        personDTO.setId( person.getId() );

        return personDTO;
    }

    protected void personDTOToPerson(PersonDTO personDTO, Person mappingTarget) {
        if ( personDTO == null ) {
            return;
        }

        if ( personDTO.getId() != null ) {
            mappingTarget.setId( personDTO.getId() );
        }
        if ( personDTO.getName() != null ) {
            mappingTarget.setName( personDTO.getName() );
        }
        if ( personDTO.getPersonId() != null ) {
            mappingTarget.setPersonId( personDTO.getPersonId() );
        }
        if ( personDTO.getPersonName() != null ) {
            mappingTarget.setPersonName( personDTO.getPersonName() );
        }
    }

    protected Person personDTOToPerson1(PersonDTO personDTO) {
        if ( personDTO == null ) {
            return null;
        }

        Person person = new Person();

        person.setId( personDTO.getId() );
        person.setName( personDTO.getName() );
        person.setPersonId( personDTO.getPersonId() );
        person.setPersonName( personDTO.getPersonName() );

        return person;
    }
}
