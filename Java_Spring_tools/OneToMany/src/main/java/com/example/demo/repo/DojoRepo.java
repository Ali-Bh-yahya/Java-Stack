package com.example.demo.repo;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Dojo;

@Repository
public interface DojoRepo extends CrudRepository<Dojo, Long>{
 
    List<Dojo> findAll();

}

