package com.hibernateandjpa.Business;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hibernateandjpa.DataAccess.ICityDal;
import com.hibernateandjpa.Entities.City;

@Service
public class CityManager implements ICityService{

    private ICityDal cityDal;

    public CityManager(ICityDal cityDal) {
        this.cityDal = cityDal;
    }
    @Override
    @Transactional
    public List<City> getAll() {
       
        return cityDal.getAll();
    }

    @Override
    @Transactional
    public void add(City city) {
        this.cityDal.add(city);
        
    }

    @Override
    @Transactional
    public void update(City city) {
        this.cityDal.update(city);
        
    }
    @Override
    @Transactional
    public void delete(City city) {
        this.cityDal.delete(city);
        
    }
    
}
