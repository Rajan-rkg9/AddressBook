package Address;
import java.util.*;
import java.io.*;
public class AddressBookMain {
	private   List<Contacts> contactList = new ArrayList<>();

	public List<Contacts> getList() {
		return contactList;
	}

	public void setList(List<Contacts> list) {
		this.contactList = list;
	}
	public  void addContact(Contacts obj)
	{
		contactList.add(obj);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Contact Details:");
		System.out.println("Enter First Name: ");
		String fn=sc.nextLine();
		System.out.println("Enter Last Name: ");
		String ln=sc.nextLine();
		System.out.println("Enter Address: ");
		String add=sc.nextLine();
		System.out.println("Enter City: ");
		String c=sc.nextLine();
		System.out.println("Enter State: ");
		String s=sc.nextLine();
		System.out.println("Enter Zip Code: ");
		String zc=sc.nextLine();
		System.out.println("Enter Phone Number: ");
		String pn=sc.nextLine();
		System.out.println("Enter EmailId: ");
		String ei=sc.nextLine();
		Contacts contactObj = new Contacts(fn,ln,ei,c,add,zc,s,pn);
	    AddressBookMain ob = new AddressBookMain();
		ob.addContact(contactObj);
		System.out.println(contactObj);
	}
}
