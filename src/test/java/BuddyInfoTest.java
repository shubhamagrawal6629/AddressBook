import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuddyInfoTest {

    private BuddyInfo buddyInfo;

    private String name = "test";
    private String phonenumber = "5555555";

    @Before
    public void setup() {
        buddyInfo = new BuddyInfo(name, phonenumber);
    }

    @Test
    public void testConstructorValid() {
        assertNotNull("Constructor object should not be null", buddyInfo);
    }

    @Test(expected = NullPointerException.class)
    public void testNullName() {
        buddyInfo = new BuddyInfo(null, phonenumber);
    }

    @Test(expected = NullPointerException.class)
    public void testNullNumber() {
        buddyInfo = new BuddyInfo(name, null);
    }

    @Test
    public void testToString() {
        assertEquals("Should say 'test: 5555555'", "test: 5555555", buddyInfo.toString());
    }
}