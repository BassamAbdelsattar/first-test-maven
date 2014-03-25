package maven-Test.service.impl;

import maven-Test.dao.SampleObjectDao;
import maven-Test.domain.SampleObject;
import maven-Test.service.api.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: Andrew
 * Date: 6/20/13
 */
@Service
public class TestServiceImpl implements TestService {
    
    @Autowired
    private SampleObjectDao sampleObjectDao;
    
    @Override
    public SampleObject getSampleObjectById(Long id) {
        return sampleObjectDao.findById2(id);
    }
}
