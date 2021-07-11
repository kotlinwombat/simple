package com.wombat.simple.bootstrap;

import com.wombat.simple.model.Owner;
import com.wombat.simple.model.Pet;
import com.wombat.simple.repo.OwnerRepo;
import com.wombat.simple.repo.PetRepo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

//@AllArgsConstructor
@Getter
@Setter
//@NoArgsConstructor
@Configuration
public class DataLoader implements CommandLineRunner {
    private final OwnerRepo ownerRepo;
    private final PetRepo petRepo;

    public DataLoader(OwnerRepo ownerRepo, PetRepo petRepo) {
        this.ownerRepo = ownerRepo;
        this.petRepo = petRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("xgudt DataLoader");

        Owner glenn = new Owner("Glenn");
        Pet molly = new Pet("Molly");
        glenn.getPets().add(molly);
        petRepo.save(molly);
        ownerRepo.save(glenn);
    }
}
