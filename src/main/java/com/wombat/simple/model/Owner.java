package com.wombat.simple.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

//todo: add Person, Vet

@Getter
@Setter
@Entity
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String ownerName;

    @OneToMany
    @JoinColumn(name = "owner_id")
    private Set<Pet> pets = new HashSet<>();
    
    public Owner(String ownerName) {
        this.ownerName = ownerName;
    }

}
