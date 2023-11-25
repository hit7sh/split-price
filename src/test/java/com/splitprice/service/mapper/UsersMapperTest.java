package com.splitprice.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsersMapperTest {

    private UsersMapper usersMapper;

    @BeforeEach
    public void setUp() {
        usersMapper = new UsersMapperImpl();
    }
}
