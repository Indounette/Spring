package com.ensat.services;

import com.ensat.entities.Plat;
import com.ensat.repositories.PlatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Plat service implement.
 */
@Service
public class PlatServiceImpl implements PlatService {
     @Autowired
     private PlatRepository productRepository;

    

    @Override
    public Iterable<Plat> listAllPlats() {
        return productRepository.findAll();
    }

    @Override
    public Plat getPlatById(Integer id) {
        return productRepository.findById(id).get();
    }

    @Override
    public Plat savePlat(Plat product) {
        return productRepository.save(product);
    }

    @Override
    public void deletePlat(Integer id) {
        productRepository.deleteById(id);
    }

}
