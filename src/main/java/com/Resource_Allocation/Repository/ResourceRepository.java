package com.Resource_Allocation.Repository;

import com.Resource_Allocation.Entity.Resource;
import com.Resource_Allocation.ResourceDTO.ResourceDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface ResourceRepository extends JpaRepository<Resource,Long> {

    List<Resource> findBySkillsInAndExperienceLessThanEqual(List<String> skills, int maxExperience);

    List<Resource> findBySkillsIn(List<String> skills);
}

