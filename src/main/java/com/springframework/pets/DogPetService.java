package com.springframework.pets;

/**
 * Created by jt on 12/28/19.
 */
// We are using java binding via GreetingServiceConfig instead
//@Profile({"dog", "default"})
//@Service
public class DogPetService implements PetService {
    public String getPetType() {
        return "Dogs are the best!";
    }
}
