import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<BuddyInfo> buddies;

    public AddressBook() {
        this.buddies = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy) {
        if(buddies != null){
            buddies.add(buddy);
        }
    }

    public BuddyInfo removeBuddy(int i) {
        if(i >= 0 && i < this.buddies.size()) {
            return buddies.remove(i);
        }
        return null;
    }

    public int size() {
        return buddies.size();
    }

    public void clear() {
        buddies.clear();
    }

    @Override
    public String toString() {
        String buddyList = "My Address Book \n";
        for (int i = 0; i < buddies.size(); i++) {
            buddyList += buddies.get(i).toString() + "\n";
        }
        return buddyList;
    }

    public static void main(String[] args) {
        AddressBook book = new AddressBook();
        BuddyInfo buddy1 = new BuddyInfo("Kshamina", "6133333333");
        BuddyInfo buddy2 = new BuddyInfo("Kshamina2", "6134444444");
        book.addBuddy(buddy1);
        book.addBuddy(buddy2);

        System.out.print(book.toString());
    }

}
