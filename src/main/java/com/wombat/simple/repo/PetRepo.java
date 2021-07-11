package com.wombat.simple.repo;

import com.wombat.simple.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepo extends CrudRepository<Pet,Long> {
}
