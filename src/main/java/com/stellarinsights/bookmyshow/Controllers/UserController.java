package com.stellarinsights.bookmyshow.Controllers;

import com.stellarinsights.bookmyshow.DTOs.SingupRequestDTO;
import com.stellarinsights.bookmyshow.DTOs.SignupResponseDTO;
import com.stellarinsights.bookmyshow.Models.User;
import com.stellarinsights.bookmyshow.Services.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    public SignupResponseDTO signup(SingupRequestDTO requestDTO) {
        User user = userService.signup(requestDTO. getEmail(), requestDTO.getPassword());
        SignupResponseDTO responseDTO = new SignupResponseDTO();
        responseDTO.setUserId(user.getId());
        return responseDTO;
    }
}
