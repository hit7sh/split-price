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
    date = "2023-12-01T22:33:52+0530",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 18.0.2.1 (Oracle Corporation)"
)
@Component
public class TransactionMapperImpl implements TransactionMapper {

    @Override
    public Transaction toEntity(TransactionDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Transaction transaction = new Transaction();

        transaction.setId( dto.getId() );
        transaction.setFromUserName( dto.getFromUserName() );
        transaction.setAmount( dto.getAmount() );
        transaction.setUserId( dto.getUserId() );
        transaction.setStatus( dto.getStatus() );
        transaction.person( personDTOToPerson( dto.getPerson() ) );

        return transaction;
    }

    @Override
    public List<Transaction> toEntity(List<TransactionDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Transaction> list = new ArrayList<Transaction>( dtoList.size() );
        for ( TransactionDTO transactionDTO : dtoList ) {
            list.add( toEntity( transactionDTO ) );
        }

        return list;
    }

    @Override
    public List<TransactionDTO> toDto(List<Transaction> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TransactionDTO> list = new ArrayList<TransactionDTO>( entityList.size() );
        for ( Transaction transaction : entityList ) {
            list.add( toDto( transaction ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(Transaction entity, TransactionDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getId() != null ) {
            entity.setId( dto.getId() );
        }
        if ( dto.getFromUserName() != null ) {
            entity.setFromUserName( dto.getFromUserName() );
        }
        if ( dto.getAmount() != null ) {
            entity.setAmount( dto.getAmount() );
        }
        if ( dto.getUserId() != null ) {
            entity.setUserId( dto.getUserId() );
        }
        if ( dto.getStatus() != null ) {
            entity.setStatus( dto.getStatus() );
        }
        if ( dto.getPerson() != null ) {
            if ( entity.getPerson() == null ) {
                entity.person( new Person() );
            }
            personDTOToPerson1( dto.getPerson(), entity.getPerson() );
        }
    }

    @Override
    public TransactionDTO toDto(Transaction s) {
        if ( s == null ) {
            return null;
        }

        TransactionDTO transactionDTO = new TransactionDTO();

        transactionDTO.setPerson( toDtoPersonId( s.getPerson() ) );
        transactionDTO.setId( s.getId() );
        transactionDTO.setFromUserName( s.getFromUserName() );
        transactionDTO.setAmount( s.getAmount() );
        transactionDTO.setUserId( s.getUserId() );
        transactionDTO.setStatus( s.getStatus() );

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

    protected Person personDTOToPerson(PersonDTO personDTO) {
        if ( personDTO == null ) {
            return null;
        }

        Person person = new Person();

        person.setId( personDTO.getId() );
        person.setPersonName( personDTO.getPersonName() );
        person.setName( personDTO.getName() );
        person.setPersonId( personDTO.getPersonId() );

        return person;
    }

    protected void personDTOToPerson1(PersonDTO personDTO, Person mappingTarget) {
        if ( personDTO == null ) {
            return;
        }

        if ( personDTO.getId() != null ) {
            mappingTarget.setId( personDTO.getId() );
        }
        if ( personDTO.getPersonName() != null ) {
            mappingTarget.setPersonName( personDTO.getPersonName() );
        }
        if ( personDTO.getName() != null ) {
            mappingTarget.setName( personDTO.getName() );
        }
        if ( personDTO.getPersonId() != null ) {
            mappingTarget.setPersonId( personDTO.getPersonId() );
        }
    }
}
