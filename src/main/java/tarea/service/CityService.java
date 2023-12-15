package tarea.service;

import tarea.model.City;
import tarea.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService implements ICityService {

    private final CityRepository repository;

    @Autowired
    public CityService(CityRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<City> findAll() {

        return (List<City>) repository.findAll();
    }
}