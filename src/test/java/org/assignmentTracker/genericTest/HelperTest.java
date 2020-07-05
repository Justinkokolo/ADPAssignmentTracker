package org.assignmentTracker.genericTest;

import org.assignmentTracker.util.Helper;
import org.junit.Test;

public class HelperTest {

    @Test
    public void generateStudNumTest(){
        Helper helper = new Helper();
        System.out.println(helper.generateStudNum());
    }

    @Test
    public void generateUserID(){
        Helper helper = new Helper();
        System.out.println(helper.generateID());
    }

}
