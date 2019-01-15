import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddressBookTest {
    private AddressBook addressBook;

    private BuddyInfo b1;
    private BuddyInfo b2;
    private BuddyInfo b3;

    private String name = "test";
    private String phonenumber = "5555555";

    @Before
    public void setup() {
        addressBook = new AddressBook();
        b1 = new BuddyInfo(name, phonenumber);
        b2 = new BuddyInfo(name, phonenumber);
        b3 = new BuddyInfo(name, phonenumber);
    }

    //test
    @Test
    public void testConstructor() {
        AddressBook a = new AddressBook();
        assertNotNull(a);
    }

    @Test
    public void testAddBuddy() {
        addressBook.addBuddy(b1);
        assertEquals("Size should now be 1", 1, addressBook.size());
    }

    @Test
    public void testAddTwoBuddy() {
        addressBook.addBuddy(b2);
        addressBook.addBuddy(b3);
        assertEquals("Size should now be 2", 2, addressBook.size());
    }

    @Test
    public void testRmBuddy() {
        addressBook.addBuddy(b1);
        addressBook.removeBuddy(0);
        assertEquals("Size should now be 0", 0, addressBook.size());
    }

    @Test
    public void testRmTwoBuddies() {
        addressBook.addBuddy(b1);
        addressBook.addBuddy(b2);
        addressBook.removeBuddy(0);
        addressBook.removeBuddy(1);
        assertEquals("Size should now be 1", 1, addressBook.size());
    }

    @Test
    public void testRmInvalidIndex() {
        assertEquals("Should return null", null, addressBook.removeBuddy(10));
    }

    @Test
    public void testClear(){
        addressBook.clear();
        assertEquals("AddressBook should be empty", 0, addressBook.size());
    }

}