package com.example.damcuoi.repository;

import com.example.damcuoi.entity.Gift;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGiftRepository extends JpaRepository<Gift, Long> {


}
