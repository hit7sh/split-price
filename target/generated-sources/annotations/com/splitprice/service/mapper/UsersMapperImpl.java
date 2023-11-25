package com.splitprice.service.mapper;

import com.splitprice.domain.Users;
import com.splitprice.service.dto.UsersDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-25T23:16:40+0530",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 18.0.2.1 (Oracle Corporation)"
)
@Component
public class UsersMapperImpl implements UsersMapper {

    @Override
    public Users toEntity(UsersDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Users users = new Users();

        users.setId( dto.getId() );
        users.setUserName( dto.getUserName() );
        users.setName( dto.getName() );
        users.setUserId( dto.getUserId() );

        return users;
    }

    @Override
    public UsersDTO toDto(Users entity) {
        if ( entity == null ) {
            return null;
        }

        UsersDTO usersDTO = new UsersDTO();

        usersDTO.setId( entity.getId() );
        usersDTO.setUserName( entity.getUserName() );
        usersDTO.setName( entity.getName() );
        usersDTO.setUserId( entity.getUserId() );

        return usersDTO;
    }

    @Override
    public List<Users> toEntity(List<UsersDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Users> list = new ArrayList<Users>( dtoList.size() );
        for ( UsersDTO usersDTO : dtoList ) {
            list.add( toEntity( usersDTO ) );
        }

        return list;
    }

    @Override
    public List<UsersDTO> toDto(List<Users> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<UsersDTO> list = new ArrayList<UsersDTO>( entityList.size() );
        for ( Users users : entityList ) {
            list.add( toDto( users ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(Users entity, UsersDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getId() != null ) {
            entity.setId( dto.getId() );
        }
        if ( dto.getUserName() != null ) {
            entity.setUserName( dto.getUserName() );
        }
        if ( dto.getName() != null ) {
            entity.setName( dto.getName() );
        }
        if ( dto.getUserId() != null ) {
            entity.setUserId( dto.getUserId() );
        }
    }
}
