package com.convista.kafkaconsumerdatabase.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Person {
    private String firstName;
    private String lastName;
    private UUID uuid;
//    @JsonFormat(pattern = "yyyy-MM-dd")
//    private LocalDate dateOfBirth;
}
