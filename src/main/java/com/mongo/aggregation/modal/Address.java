package com.mongo.aggregation.modal;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Address {
    private String street;
    private String city;
    private String state;
    private String zipcode;
    private GeoLocation geoLocation;
}
