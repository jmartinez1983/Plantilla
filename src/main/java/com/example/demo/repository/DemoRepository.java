package com.example.demo.repository;

import com.example.demo.entity.DemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DemoRepository extends JpaRepository<DemoEntity, String> {

    @Override
    Optional<DemoEntity> findById(String id);
}
