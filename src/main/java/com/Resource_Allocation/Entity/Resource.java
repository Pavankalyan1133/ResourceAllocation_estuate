package com.Resource_Allocation.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ResourceID;
    private String resourceName;
    private int experience;

    @ElementCollection
    private List<String> skills;
}



