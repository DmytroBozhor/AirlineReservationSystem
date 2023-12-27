package com.dmytrobozhor.airlinereservationservice.service;

import com.dmytrobozhor.airlinereservationservice.domain.Airport;

import java.util.List;

public interface AbstractAirportService {

    List<Airport> findAll();

    Airport save(Airport airport);

    void deleteById(Integer id);

    void delete(Airport airport);

    Airport findById(Integer id);

    Airport updateById(Integer id, Airport airport);

    Airport updateOrCreateById(Integer id, Airport airport);

}