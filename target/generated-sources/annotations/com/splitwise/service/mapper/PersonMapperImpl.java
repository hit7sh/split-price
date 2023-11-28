package com.splitwise.service.mapper;

import com.splitwise.domain.Person;
import com.splitwise.service.dto.PersonDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-28T21:57:41+0530",
    comments = "version: 1.5.2.Final, compiler: Eclipse JDT (IDE) 3.35.0.v20230814-2020, environment: Java 17.0.8.1 (Eclipse Adoptium)"
)
@Component
public class PersonMapperImpl implements PersonMapper {

    @Override
    public void partialUpdate(Person arg0, PersonDTO arg1) {
        if ( arg1 == null ) {
            return;
        }

        if ( arg1.getId() != null ) {
            arg0.setId( arg1.getId() );
        }
        if ( arg1.getName() != null ) {
            arg0.setName( arg1.getName() );
        }
        if ( arg1.getPersonId() != null ) {
            arg0.setPersonId( arg1.getPersonId() );
        }
        if ( arg1.getPersonName() != null ) {
            arg0.setPersonName( arg1.getPersonName() );
        }
    }

    @Override
    public PersonDTO toDto(Person arg0) {
        if ( arg0 == null ) {
            return null;
        }

        PersonDTO personDTO = new PersonDTO();

        personDTO.setId( arg0.getId() );
        personDTO.setPersonName( arg0.getPersonName() );
        personDTO.setName( arg0.getName() );
        personDTO.setPersonId( arg0.getPersonId() );

        return personDTO;
    }

    @Override
    public List<PersonDTO> toDto(List<Person> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<PersonDTO> list = new ArrayList<PersonDTO>( arg0.size() );
        for ( Person person : arg0 ) {
            list.add( toDto( person ) );
        }

        return list;
    }

    @Override
    public Person toEntity(PersonDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Person person = new Person();

        person.setId( arg0.getId() );
        person.setName( arg0.getName() );
        person.setPersonId( arg0.getPersonId() );
        person.setPersonName( arg0.getPersonName() );

        return person;
    }

    @Override
    public List<Person> toEntity(List<PersonDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<Person> list = new ArrayList<Person>( arg0.size() );
        for ( PersonDTO personDTO : arg0 ) {
            list.add( toEntity( personDTO ) );
        }

        return list;
    }
}
