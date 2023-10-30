package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.MarketEntity;
@Repository
public interface MarketRepo extends JpaRepository <MarketEntity,Integer> {

}
