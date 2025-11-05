package CounterService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CounterService {

    private int counter;

    @Service
    public class FirstService {
        
        @Autowired
        private CounterService counterService;
    }

    @Service 
    public class SecondService {
        
        @Autowired
        private CounterService counterService;
    }

    @Service
    public class ThirdService {
        
        @Autowired
        private CounterService counterService;
    }

    public int counter() {
        return counter++;
    }

}
