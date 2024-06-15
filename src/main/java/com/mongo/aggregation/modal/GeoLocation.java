package com.mongo.aggregation.modal;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class GeoLocation {
    private double latitude;
    private double longitude;
}
