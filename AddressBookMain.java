package Address;
import java.util.*;
import java.io.*;
public class AddressBookMain {
	private  static  List<Contacts> contactList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
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
	public void editContact()
	{
		//Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to edit contact details (Y/N-y/n): ");
		char ch=sc.nextLine().charAt(0);
		if(ch=='Y' || ch=='y')
		{
			System.out.println("Enter New Details: ");
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
			new AddressBookMain().addContact(contactObj);
			System.out.println(contactObj);
		}
		else if(ch=='N' || ch=='n')
			System.out.println("User does not want to edit details.");
		else
			System.out.println("Incorrect Input");
	}
	public void removeContact(String fname) {
		for(Contacts x : contactList)
		{
		        if(x.getFirstName().equals(fname))
					{
					    contactList.remove(x);
					    System.out.println("Contact Details removed successfully.");
					    System.exit(0);
				    }
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AddressBookMain ob = new AddressBookMain();
		System.out.println("Enter the number of persons whose contact details are to be added: ");
		int noOfPersons=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<noOfPersons;i++)
		{
				System.out.println("Enter Contact Details of Person "+(i+1)+" :");
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
				ob.addContact(contactObj);
		}
		for(int j=0;j<contactList.size();j++)
		{
			System.out.println("Contact Details of Person "+(j+1)+" :");
			System.out.println(contactList.get(j));
		}
		ob.editContact();
		System.out.println("Do you want to remove contact details (Y/N-y/n): ");
		char ch=sc.nextLine().charAt(0);
		if(ch=='Y' || ch=='y')
		{
			System.out.println("Enter your  First Name: ");
			String fnam=sc.nextLine();
			ob.removeContact(fnam);
		}
		else
		{
			System.out.println("User does not want to remove contact details.");
			System.exit(0);
		}
   }
}

