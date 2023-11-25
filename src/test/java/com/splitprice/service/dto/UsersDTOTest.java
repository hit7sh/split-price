package com.splitprice.service.dto;

import static org.assertj.core.api.Assertions.assertThat;

import com.splitprice.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class UsersDTOTest {

    @Test
    void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(UsersDTO.class);
        UsersDTO usersDTO1 = new UsersDTO();
        usersDTO1.setId(1L);
        UsersDTO usersDTO2 = new UsersDTO();
        assertThat(usersDTO1).isNotEqualTo(usersDTO2);
        usersDTO2.setId(usersDTO1.getId());
        assertThat(usersDTO1).isEqualTo(usersDTO2);
        usersDTO2.setId(2L);
        assertThat(usersDTO1).isNotEqualTo(usersDTO2);
        usersDTO1.setId(null);
        assertThat(usersDTO1).isNotEqualTo(usersDTO2);
    }
}
