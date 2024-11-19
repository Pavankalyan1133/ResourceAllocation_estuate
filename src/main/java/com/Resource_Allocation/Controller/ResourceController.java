package com.Resource_Allocation.Controller;

import com.Resource_Allocation.ResourceDTO.ResourceDTO;
import com.Resource_Allocation.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api/resources")
public class ResourceController {


    private static final Logger logger = Logger.getLogger(ResourceController.class.getName());

    @Autowired
    private ResourceService resourceService;

    /*@GetMapping("/microservice")
    public List<String> getResourcesForMicroservice(@RequestParam List<String> skills) {
        logger.info("GET /microservice called with skills: " + skills);
        return resourceService.getResourcesForMicroservice(skills);
    }

    @GetMapping("/cloud")
    public List<String> getResourcesForCloudProject(@RequestParam List<String> skills, @RequestParam int maxExperience) {
        logger.info("GET /cloud called with skills: " + skills + ", maxExperience: " + maxExperience);
        return resourceService.getResourcesForCloudProject(skills, maxExperience);
    }*/

    @GetMapping("/microservice")
    public List<String> getResourcesForMicroservice(@RequestParam(required = false, defaultValue = "") List<String> skills) {
        return resourceService.getResourcesForMicroservice(skills);
    }

    @GetMapping("/cloud")
    public List<String> getResourcesForCloudProject(
            @RequestParam(required = false, defaultValue = "") List<String> skills,
            @RequestParam(required = false, defaultValue = "10") int maxExperience) {
        return resourceService.getResourcesForCloudProject(skills, maxExperience);
    }

}




