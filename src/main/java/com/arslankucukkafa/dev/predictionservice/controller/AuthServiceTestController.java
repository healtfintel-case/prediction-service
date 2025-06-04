package com.arslankucukkafa.dev.predictionservice.controller;

import com.arslankucukkafa.dev.predictionservice.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth-service-test")
public class AuthServiceTestController {

    private final UserService userService;


    public AuthServiceTestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/get-user-by-email")
    public String getUserByEmail() {
        return userService.getUserByEmail("arslankucukkafa@mail").getUsername();
    }
}
