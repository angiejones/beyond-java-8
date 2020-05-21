package models;

import com.fasterxml.jackson.annotation.JsonProperty;

//Demonstrates Records (Java 14)
public record Account(
        @JsonProperty("id") int id,
        @JsonProperty("customerId") int customerId,
        @JsonProperty("type") String type,
        @JsonProperty("balance") double balance){}