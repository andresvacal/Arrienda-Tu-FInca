package com.example.Repository;


import org.springframework.data.repository.CrudRepository;

import com.example.entity.Application;


public interface ApplicationRepository extends CrudRepository<Application, Long>{

}