package com.example.aoe.model;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Empire {
    private String name;
    private String description;
    private List<String> prosList;
    private List<String> consList;
    private String upLevel;
    private String defense;
    private String attack;
}
