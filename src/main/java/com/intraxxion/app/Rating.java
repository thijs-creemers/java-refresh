package com.intraxxion.app;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Rating {
    @JsonProperty("Source")
    public String source;
    @JsonProperty("Value")
    public String value;

    public Rating() {
    }

    public Rating(String source, String value) {
        this.source = source;
        this.value = value;
    }

    public String getSource() {
        return source;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "source='" + source + '\'' +
                ", value='" + value + '\'' +
                '}';
    }


}