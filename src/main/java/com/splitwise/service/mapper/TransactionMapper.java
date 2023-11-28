package com.splitwise.service.mapper;

import com.splitwise.domain.Person;
import com.splitwise.domain.Transaction;
import com.splitwise.service.dto.PersonDTO;
import com.splitwise.service.dto.TransactionDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Transaction} and its DTO {@link TransactionDTO}.
 */
@Mapper(componentModel = "spring")
public interface TransactionMapper extends EntityMapper<TransactionDTO, Transaction> {
    @Mapping(target = "person", source = "person", qualifiedByName = "personId")
    TransactionDTO toDto(Transaction s);

    @Named("personId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    PersonDTO toDtoPersonId(Person person);
}
