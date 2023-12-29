package com.stellarinsights.bookmyshow;

import com.stellarinsights.bookmyshow.Controllers.UserController;
import com.stellarinsights.bookmyshow.DTOs.SignupResponseDTO;
import com.stellarinsights.bookmyshow.DTOs.SingupRequestDTO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
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
