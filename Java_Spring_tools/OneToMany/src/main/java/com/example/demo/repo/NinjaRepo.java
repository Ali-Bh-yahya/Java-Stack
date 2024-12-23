package com.example.demo.repo;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Ninja;

@Repository
public interface NinjaRepo extends CrudRepository<Ninja, Long>{
 
    List<Ninja> findAll();

}

