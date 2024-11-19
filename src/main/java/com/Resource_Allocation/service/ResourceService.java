package com.Resource_Allocation.service;

import com.Resource_Allocation.Entity.Resource;
import com.Resource_Allocation.ResourceDTO.ResourceDTO;

import java.util.List;

public interface ResourceService {
    List<Resource> getAllResources();

    Resource getResourceById(Long id);

    Resource addResource(ResourceDTO resourceDTO);

    Resource updateResource(Long id, ResourceDTO resourceDTO);

    void deleteResource(Long id);
}
