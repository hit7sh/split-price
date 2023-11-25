package com.splitprice.service;

import com.splitprice.service.dto.UsersDTO;
import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link com.splitprice.domain.Users}.
 */
public interface UsersService {
    /**
     * Save a users.
     *
     * @param usersDTO the entity to save.
     * @return the persisted entity.
     */
    UsersDTO save(UsersDTO usersDTO);

    /**
     * Updates a users.
     *
     * @param usersDTO the entity to update.
     * @return the persisted entity.
     */
    UsersDTO update(UsersDTO usersDTO);

    /**
     * Partially updates a users.
     *
     * @param usersDTO the entity to update partially.
     * @return the persisted entity.
     */
    Optional<UsersDTO> partialUpdate(UsersDTO usersDTO);

    /**
     * Get all the users.
     *
     * @return the list of entities.
     */
    List<UsersDTO> findAll();

    /**
     * Get the "id" users.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<UsersDTO> findOne(Long id);

    /**
     * Delete the "id" users.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
