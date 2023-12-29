package com.stellarinsights.bookmyshow.Services;

import com.stellarinsights.bookmyshow.DTOs.SignupResponseDTO;
import com.stellarinsights.bookmyshow.DTOs.SingupRequestDTO;
import com.stellarinsights.bookmyshow.Models.User;
import com.stellarinsights.bookmyshow.Repositories.UserRepositorty;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepositorty userRepositorty;

    public UserService(UserRepositorty userRepositorty) {
        this.userRepositorty = userRepositorty;
    }

    public User signup(String email, String password) {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        userRepositorty.save(user);
        return user;

    }


}
