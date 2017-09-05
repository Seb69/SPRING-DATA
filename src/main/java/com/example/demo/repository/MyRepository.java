package com.example.demo.repository;

import com.example.demo.entity.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ANDRE
 * @since 05/09/2017
 */
//@Repository
public interface MyRepository extends JpaRepository<MyEntity, Integer> {
}
