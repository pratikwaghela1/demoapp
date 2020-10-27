package com.pc.demos.mapstructdemo.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class ProductRequest {

    private String id;
    private String name;
    private List<CategoryRequest> categories;

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public ProductRequest(@JsonProperty("id") String id, @JsonProperty("name") String name, @JsonProperty("categories") List<CategoryRequest> categories) {
        this.id = id;
        this.name = name;
        this.categories= categories;
    }


}
