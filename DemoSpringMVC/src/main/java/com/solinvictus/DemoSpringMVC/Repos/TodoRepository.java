package com.solinvictus.DemoSpringMVC.Repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.solinvictus.DemoSpringMVC.Entity.Todo;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long>{
}