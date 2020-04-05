package org.zerocode.example.two;

import org.jsmart.zerocode.core.domain.Scenario;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ZeroCodeUnitRunner.class)


public class hello {
    @Test
    @Scenario("hello.json")
    public void testGet() throws Exception {
    }
}
