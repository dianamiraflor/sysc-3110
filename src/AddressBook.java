import java.util.ArrayList;
import java.util.Iterator;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo Buddy) {
        if (Buddy != null) {
            buddies.add(Buddy);
        }
    }

    public void remove(BuddyInfo buddy) {
        Iterator<BuddyInfo> buddyIterator = buddies.iterator();
        while (buddyIterator.hasNext()) {
            if (buddyIterator.next() == buddy) {
                buddyIterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.remove(buddy);
        System.out.println("testing");
    }


}
