package com.cumulus.spring;

import com.cumulus.EntryPoint;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = EntryPoint.class)
@SpringBootTest(classes = EntryPoint.class)
public abstract class BaseTest extends AbstractTestNGSpringContextTests {
}
