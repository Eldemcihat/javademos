package com.hibernateandjpa.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernateandjpa.Business.ICityService;
import com.hibernateandjpa.Entities.City;



@RestController
@RequestMapping("/api")
public class CityController {
    private ICityService cityService;
    @Autowired
    public CityController(ICityService cityService) {
        this.cityService = cityService;
    }
    @GetMapping("/cities")
    public List<City> get(){
        return cityService.getAll();
    }

    @PostMapping("/add")
    public void add(City city){
        cityService.add(city);

    }
    @PostMapping("/update")
    public void update(City city){
        cityService.update(city);

    }
    @PostMapping("/delete")
    public void delete(City city){
        cityService.delete(city);

    }
}
