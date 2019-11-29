package com.cumulus.constants;

/**
 * This class for common cumulus.constants, which can be used in all classes
 */
public class Constants {
    // Configuration based constants
    public static final String BASE_WORKSHOP_URL = "http://localhost:8080/cumulus/";
    public static final String BASE_INSPECTIONS_URL = "http://localhost:8080/inspections/";
    public static final String OPERATION_SYSTEM = System.getProperty("os.name");
    public static final String MAC_OS_PATH = System.getProperty("user.dir") + "/src/main/resources/macos/chromedriver";
    public static final String WINDOWS_PATH = System.getProperty("user.dir") + "/src/main/resources/windows/chromedriver.exe";
    // Common used XPATH
    public static final String DROP_DOWN_ITEMS_XPATH = "//div[@class='dropdown__list dropdown__list_state_show js-dropdown-list']//ul//li";
}
