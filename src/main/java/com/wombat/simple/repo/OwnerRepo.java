package com.wombat.simple.repo;

import com.wombat.simple.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepo extends CrudRepository<Owner,Long> {
}
