package com.mongo.aggregation.modal;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Contact {
    private String type;
    private String detail;
    private boolean isPrimary;
}
