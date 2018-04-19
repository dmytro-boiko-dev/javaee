package com;

public class ConnectorTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.h2.Driver"); // connect db driver; don't ask - just believe in this
        Class.forName("oracle.jdbc.driver.OracleDriver");
    }
}
