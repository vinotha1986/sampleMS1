package com.example.demoms.controller;

import com.example.demoms.Entity.Car;
import com.example.demoms.repository.Carrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Carcontroller {
    @Autowired
    private Carrepository carrepository;
   @GetMapping(value = "/car")
    public List<Car> getcar(){
  //     Car c1= new Car();
//c1.setName("vinotha's car");
//c1.setID(123);
//deleted this code
//return c1;
       return carrepository.findAll();
    }

    @PostMapping(value = "/car")
    public Car addnewcar(@RequestBody Car c1){
       return carrepository.save(c1);
       // return "the new added is "+c1.getName();
        //changes done by casy
    }
}
