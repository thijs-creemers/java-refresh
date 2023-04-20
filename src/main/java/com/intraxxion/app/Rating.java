package com.intraxxion.app;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Rating {
    @JsonProperty("Source")
    public String source;
    @JsonProperty("Value")
    public String value;

    // Getters and setters for the fields

    // ...
}