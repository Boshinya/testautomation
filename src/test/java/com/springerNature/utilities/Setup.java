package com.springerNature.utilities;

import org.junit.AfterClass;
import org.junit.BeforeClass;

/**
 * Created by bothees on 27/11/2018.
 */


public class Setup extends DriverFactory {

    public static DriverFactory driver = new DriverFactory();

    @BeforeClass
    public static void setupDriver(){
        driver.initialiseDriver();
    }

    @AfterClass
    public static void destroyDriver(){
        if(DriverFactory.driver != null){
            DriverFactory.driver.quit();
            DriverFactory.driver = null;
        }
    }

}





