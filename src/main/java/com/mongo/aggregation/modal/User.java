package com.mongo.aggregation.modal;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

@Data
@RequiredArgsConstructor
@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String name;
    private int age;
    private Address address;
    private List<Contact> contacts;
    private Map<String, Object> additionalDetails;
}
