package com.ensat.services;

import com.ensat.entities.Plat;

public interface PlatService {

    Iterable<Plat> listAllPlats();

    Plat getPlatById(Integer id);

    Plat savePlat(Plat product);

    void deletePlat(Integer id);

}
