package com.arslankucukkafa.dev.predictionservice.service;

import com.arslankucukkafa.dev.predictionservice.client.AuthServiceClient;
import com.arslankucukkafa.dev.predictionservice.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private AuthServiceClient authServiceClient;

    public UserDto getUserByEmail(String id) {
        return authServiceClient.getUserByEmail(id);
    }
}
