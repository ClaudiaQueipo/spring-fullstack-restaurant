package com.example.RestaurantManagement;

import com.example.RestaurantManagement.Models.DishType;
import com.example.RestaurantManagement.Models.Staff;
import com.example.RestaurantManagement.Repositories.DishRepository;
import com.example.RestaurantManagement.Repositories.DishTypeRepository;
import com.example.RestaurantManagement.Repositories.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.Date;

@SpringBootApplication
public class RestaurantManagementApplication {
    @Autowired
    private StaffRepository repository;

    @Autowired
    private DishTypeRepository dishRepository;

    public static void main(String[] args) {
        SpringApplication.run(RestaurantManagementApplication.class, args);
    }

    @Bean
    public CommandLineRunner initialCreate() {
        return (args) -> {
            var admin = new Staff();
            admin.setLogin("admin");
            admin.setName("admin");
            admin.setPassword("admin");
            admin.setRole("ADMINISTRADOR");
            repository.save(admin);

            var type1 = new DishType();
            type1.setName("plato fuerte");
            dishRepository.save(type1);

            var type3 = new DishType();
            type3.setName("aperitivo");
            dishRepository.save(type3);

            var type2 = new DishType();
            type2.setName("postre");
            dishRepository.save(type2);
        };

    }



}
