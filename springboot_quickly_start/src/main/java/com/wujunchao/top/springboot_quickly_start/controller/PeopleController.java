package com.wujunchao.top.springboot_quickly_start.controller;

import com.wujunchao.top.springboot_quickly_start.entity.People;
import com.wujunchao.top.springboot_quickly_start.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: wujunchao
 * @date: 2021/07/23 22:33
 */

@RestController
@RequestMapping("/people")
public class PeopleController {

    @Autowired
    private PeopleRepository peopleRepository;

//    @PostMapping
//    public People creatPeople(People people){
//        return peopleRepository.save(people);
//    }

    @GetMapping("/{id}")
    public People getPeopleById(@PathVariable Long id){
        return peopleRepository.findById(id).orElse(new People("CC",20));
    }

    @GetMapping("/name/{name}")
    public List<People> getPeopleByName(@PathVariable String name){
        return peopleRepository.findByName(name);
    }

//    @PutMapping
//    public People updatePeople(People  people){
//        return peopleRepository.save(people);
//    }


//    @GetMapping("/hello")
//    public String sayHello(@RequestParam String name){
//        People people = new People();
//        people.setName(name);
//        return "Hello~I'm " + people.getName();
//    }
}
