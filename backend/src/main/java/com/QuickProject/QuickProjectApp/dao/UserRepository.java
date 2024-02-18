package com.QuickProject.QuickProjectApp.dao;

import com.QuickProject.QuickProjectApp.entity.User;
import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

/**
 * Хранилище для работы с сущностью "user"
 */
@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    @Transactional(readOnly = true)
    List<User> findByLogin(String login) throws DataAccessException;


}
