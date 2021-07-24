package com.wujunchao.top.springboot_quickly_start.repository;

import com.wujunchao.top.springboot_quickly_start.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: wujunchao
 * @date: 2021/07/23 23:14
 */

@Service
public interface PeopleRepository extends JpaRepository<People, Long> {
    List<People> findByName(String name);
}
