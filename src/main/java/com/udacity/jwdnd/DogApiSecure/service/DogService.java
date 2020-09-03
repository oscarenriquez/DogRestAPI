package com.udacity.jwdnd.DogApiSecure.service;

import com.udacity.jwdnd.DogApiSecure.entity.Dog;

import java.util.List;

public interface DogService {

    List<Dog> retrieveDogs();
    List<String> retrieveDogBreed();
    String retrieveDogBreedById(Long id);
    List<String> retrieveDogNames();
}
