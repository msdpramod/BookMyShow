package com.stellarinsights.bookmyshow;

import com.stellarinsights.bookmyshow.Controllers.UserController;
import com.stellarinsights.bookmyshow.DTOs.SignupResponseDTO;
import com.stellarinsights.bookmyshow.DTOs.SingupRequestDTO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
// @EnableJpaAuditing is used to enable the auditing feature
// Auditing is a feature of Spring Data JPA that automatically populates auditing-related fields
// @CreatedDate, @CreatedBy, @LastModifiedDate, and @LastModifiedBy
// in your entities when they are created and updated.
// This feature is very useful because it eliminates the need to manually set these fields
// and also provides a way to store additional information such as who created or updated an entity,
// and when the entity was created or updated.
// To enable auditing, you need to add the @EnableJpaAuditing annotation to your main class.
// This annotation takes one parameter, which is the name of the auditor class.
// The auditor class is a class that implements the AuditorAware interface.
// This interface has one method, getCurrentAuditor(), which returns an Optional object.
// The Optional object contains the current auditor of the application.
//
public class BookMyShowApplication implements CommandLineRunner {
    private UserController userController;

    public BookMyShowApplication(UserController userController) {
        this.userController = userController;
    }

    @Override
    public void run(String... args) throws Exception {
        SingupRequestDTO requestDTO = new SingupRequestDTO();
        requestDTO.setEmail("kuppapramod@gmail.com");
        requestDTO.setPassword("password");
        userController.signup(requestDTO);
    }

    public static void main(String[] args) {
        SpringApplication.run(BookMyShowApplication.class, args);
    }

}
