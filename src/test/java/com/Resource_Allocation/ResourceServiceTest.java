//package com.Resource_Allocation;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

/*public class ResourceServiceTest {

    private final ResourceRepository repository = Mockito.mock(ResourceRepository.class);
    private final ResourceService service = new ResourceService(repository);

    @Test
    void testGetResourcesBySkills() {
        when(repository.findBySkillsContaining("Java")).thenReturn(List.of(new Resource(1L, "Dennis", "Java", 4)));
        List<String> result = service.getResourcesBySkills("Java");
        assertEquals(List.of("Dennis"), result);
    }
}*/