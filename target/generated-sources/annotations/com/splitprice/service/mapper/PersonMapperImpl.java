package com.splitprice.service.mapper;

import com.splitprice.domain.Person;
import com.splitprice.service.dto.PersonDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-26T19:51:31+0530",
    comments = "version: 1.5.2.Final, compiler: Eclipse JDT (IDE) 3.35.0.v20230814-2020, environment: Java 17.0.8.1 (Eclipse Adoptium)"
)
@Component
public class PersonMapperImpl implements PersonMapper {

    @Override
    public Person toEntity(PersonDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Person person = new Person();

        person.setId( dto.getId() );
        person.setPersonName( dto.getPersonName() );
        person.setName( dto.getName() );
        person.setPersonId( dto.getPersonId() );

        return person;
    }

    @Override
    public PersonDTO toDto(Person entity) {
        if ( entity == null ) {
            return null;
        }

        PersonDTO personDTO = new PersonDTO();

        personDTO.setId( entity.getId() );
        personDTO.setPersonName( entity.getPersonName() );
        personDTO.setName( entity.getName() );
        personDTO.setPersonId( entity.getPersonId() );

        return personDTO;
    }

    @Override
    public List<Person> toEntity(List<PersonDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Person> list = new ArrayList<Person>( dtoList.size() );
        for ( PersonDTO personDTO : dtoList ) {
            list.add( toEntity( personDTO ) );
        }

        return list;
    }

    @Override
    public List<PersonDTO> toDto(List<Person> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PersonDTO> list = new ArrayList<PersonDTO>( entityList.size() );
        for ( Person person : entityList ) {
            list.add( toDto( person ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(Person entity, PersonDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getId() != null ) {
            entity.setId( dto.getId() );
        }
        if ( dto.getPersonName() != null ) {
            entity.setPersonName( dto.getPersonName() );
        }
        if ( dto.getName() != null ) {
            entity.setName( dto.getName() );
        }
        if ( dto.getPersonId() != null ) {
            entity.setPersonId( dto.getPersonId() );
        }
    }
}