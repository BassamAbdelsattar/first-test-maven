package maven-Test.service.api;

import maven-Test.domain.SampleObject;

/**
 * User: Andrew
 * Date: 6/20/13
 */
public interface TestService {
    
    public SampleObject getSampleObjectById(Long id);
}
