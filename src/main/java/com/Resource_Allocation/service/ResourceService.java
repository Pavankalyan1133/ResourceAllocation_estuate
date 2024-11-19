package com.Resource_Allocation.service;

import com.Resource_Allocation.ResourceDTO.ResourceDTO;

import java.util.List;

public interface ResourceService {
    List<String> getResourcesForMicroservice(List<String> skills);

    List<String> getResourcesForCloudProject(List<String> skills, int maxExperience);
}
