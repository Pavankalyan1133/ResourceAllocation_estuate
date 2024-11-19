package com.Resource_Allocation.ResourceDTO;

import lombok.Data;

import java.util.List;

@Data
public class ResourceDTO {
    private Long ResourceID;
    private String resourceName;
    private int experience;

    private List<String> skills;


}
