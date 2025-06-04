package com.arslankucukkafa.dev.predictionservice.client;

import com.arslankucukkafa.dev.predictionservice.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Bu interfacein implementasyonu yok. Direkt olarak openfeign kütüphanleri tarafından implement ediliyor
 * */
@FeignClient(name = "auth-service")
public interface AuthServiceClient {
    @GetMapping("/api/v1/users/{id}")
    UserDto getUserById(@PathVariable("id") Long id);

    @GetMapping("/api/v1/users/email/{email}")
    UserDto getUserByEmail(@PathVariable("email") String email);
} 