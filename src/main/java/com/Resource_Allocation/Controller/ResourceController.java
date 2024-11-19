package com.Resource_Allocation.Controller;

import com.Resource_Allocation.Entity.Resource;
import com.Resource_Allocation.ResourceDTO.ResourceDTO;
import com.Resource_Allocation.service.ResourceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/resources")
public class ResourceController {
    @Autowired
    private ResourceService service;

    @GetMapping
    public List<Resource> getAllResources() {
        return service.getAllResources();
    }

    @GetMapping("/{id}")
    public Resource getResourceById(@PathVariable Long id) {
        return service.getResourceById(id);
    }

    @PostMapping
    public Resource addResource(@RequestBody ResourceDTO resourceDTO) {
        return service.addResource(resourceDTO);
    }

    @PutMapping("/{id}")
    public Resource updateResource(@PathVariable Long id, @RequestBody ResourceDTO resourceDTO) {
        return service.updateResource(id, resourceDTO);
    }

    @DeleteMapping("/{id}")
    public String deleteResource(@PathVariable Long id) {
        service.deleteResource(id);
        return "Resource with ID " + id + " has been deleted.";
    }
}
