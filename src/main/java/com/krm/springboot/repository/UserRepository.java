package com.krm.springboot.repository;

import com.krm.springboot.model.UserItem;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Karan
 */
public interface UserRepository extends CrudRepository<UserItem, Long> {

}
