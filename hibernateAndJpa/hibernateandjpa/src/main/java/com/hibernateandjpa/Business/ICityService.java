package com.hibernateandjpa.Business;

import java.util.List;

import com.hibernateandjpa.Entities.City;

public interface ICityService {
    List<City> getAll();
    void add(City city);
    void update(City city);
    void delete(City city); 
}
