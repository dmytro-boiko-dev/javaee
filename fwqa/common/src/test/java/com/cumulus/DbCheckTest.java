package com.cumulus;

import com.cumulus.prepearing.QueriesExecutor;
import com.cumulus.spring.BaseTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

public class DbCheckTest extends BaseTest {

    @Autowired
    public QueriesExecutor executeQueries;

    @Test
    public void test() {
        executeQueries.execute();
    }
}
