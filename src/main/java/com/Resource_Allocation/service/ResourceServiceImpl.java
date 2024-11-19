package com.Resource_Allocation.service;

import com.Resource_Allocation.Entity.Resource;
import com.Resource_Allocation.Repository.ResourceRepository;
import com.Resource_Allocation.ResourceDTO.ResourceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    private ResourceRepository resourceRepository;

   @Override
    public List<String> getResourcesForMicroservice(List<String> skills) {
        List<Resource> resources = resourceRepository.findBySkillsIn(skills);
        return resources.stream()
                .map(Resource::getResourceName)
                .collect(Collectors.toList());
    }
    @Override
    public List<String> getResourcesForCloudProject(List<String> skills, int maxExperience) {
        List<Resource> resources = resourceRepository.findBySkillsInAndExperienceLessThanEqual(skills, maxExperience);
        return resources.stream()
                .map(Resource::getResourceName)
                .collect(Collectors.toList());
    }

}

