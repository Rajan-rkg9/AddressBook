package Address;

import java.util.*;

public class AddressBook {
    public Map<String, AddressBookMain> addressBook = new TreeMap<String,AddressBookMain>();
	
	public  void showAddressBooks() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to view address book (Y/N-y/n): ");
		char ch=sc.next().charAt(0);
		if(ch=='N' || ch=='n')
		System.out.println("User does not want to view address book.");
		else
			{
				System.out.println("List of Address Books Added: ");
				addressBook.forEach((k,v) -> System.out.println(k + " " + v.contactList + "\n"));
			}
	}
}

