package com.solinvictus.DemoSpringMVC.Repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.solinvictus.DemoSpringMVC.Entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
}
