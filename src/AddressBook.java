import java.util.ArrayList;
import java.util.Iterator;

public class AddressBook {

    public ArrayList<BuddyInfo> buddies = new ArrayList<BuddyInfo>();

    public void addBuddy(BuddyInfo buddy){
        buddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        Iterator<BuddyInfo> buddyIterator = buddies.iterator();
        while (buddyIterator.hasNext()) {
            if (buddyIterator.next() == buddy) {
                buddyIterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }

}
