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
        private ResourceRepository repository;

        @Override
        public List<Resource> getAllResources() {
            return repository.findAll();
        }

        @Override
        public Resource getResourceById(Long id) {
            return repository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Resource not found with id: " + id));
        }

        @Override
        public Resource addResource(ResourceDTO resourceDTO) {
            Resource resource = new Resource();
            resource.setResourceName(resourceDTO.getResourceName());
            resource.setExperience(resourceDTO.getExperience());
            resource.setSkills(resourceDTO.getSkills());
            return repository.save(resource);
        }

        @Override
        public Resource updateResource(Long id, ResourceDTO resourceDTO) {
            Resource resource = repository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Resource not found with id: " + id));
            resource.setResourceName(resourceDTO.getResourceName());
            resource.setExperience(resourceDTO.getExperience());
            resource.setSkills(resourceDTO.getSkills());
            return repository.save(resource);
        }

        @Override
        public void deleteResource(Long id) {
            repository.deleteById(id);
        }
    }
