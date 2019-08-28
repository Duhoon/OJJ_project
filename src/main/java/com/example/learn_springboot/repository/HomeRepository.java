package com.example.learn_springboot.repository;

import com.example.learn_springboot.model.HomeBean;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepository extends JpaRepository<HomeBean, String> {

}