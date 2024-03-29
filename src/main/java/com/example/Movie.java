package com.example;

import javax.validation.constraints.*;

public class Movie {
    @NotNull
    @Min(1)
    private long id;

    @NotNull
    @Size(min=2, max=20)
    private String name;

    @NotNull
    @Size(min=3, max=10)
    private String type;

    @NotNull
    @Size(min=10, max=30)
    private String description;

    public Movie() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
