package com.user.rest;

import java.util.Collection;
import java.util.Map;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.binding.Country;

@RestController
public class CountryRestController {

    private final HashOperations<String, Integer, Country> opsForHash;

    public CountryRestController(RedisTemplate<String, Object> redisTemplate) {
        this.opsForHash = redisTemplate.opsForHash();
    }

    @PostMapping("/country")
    public String addCountry(@RequestBody Country country) {
        opsForHash.put("countries", country.getId(), country); // Use a string for the hash key
        return "Country Added";
    }

    @GetMapping("/countries")
    public Collection<Country> getCountries() {
        Map<Integer, Country> entries = opsForHash.entries("countries"); // Use a string for the hash key
        return entries.values();
    }
}
