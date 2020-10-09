package Address;

import java.util.*;

public class AddressBook {
    public Map<String, AddressBookMain> addressBook = new TreeMap<String,AddressBookMain>();
    Scanner sc = new Scanner(System.in);
    public Map<String, List<Contacts>> cityPersonsMap;
	public Map<String, List<Contacts>> statePersonsMap;

    
	public  void showAddressBooks() {
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
	
	public void viewPersonByCityOrState()
	{
		System.out.println("Do you want to view person by city or state (Y/N-y/n): ");
		char ch=sc.next().charAt(0);
		if(ch=='N' || ch=='n')
		System.out.println("User does not want to view person by city or state.");
		else
		{
			System.out.println("Enter the City or State Name to search the person :");
			String cityOrStateName = sc.nextLine();
			for(String key : addressBook.keySet())
			{
				AddressBookMain mainObj = addressBook.get(key);
				List<Contacts> tempList = mainObj.getContactList();
				for (Contacts index : tempList) 
				{
					if (index.getStateName().equalsIgnoreCase(cityOrStateName) || index.getCityName().equalsIgnoreCase(cityOrStateName))
						System.out.println("Person is present in inputted city or state.");
					else
						System.out.println("Person is not present in inputted city or state.");
				}
			}
		}
	}
	public void dictionaryOfCity_PersonORState_Person()
	{
		System.out.println("Enter the City Name to maintain CITY_PERSONS dictionary :");
		String cityName = sc.nextLine();
		System.out.println("Enter the State Name to maintain STATE_PERSONS dictionary :");
		String stateName = sc.nextLine();
		cityPersonsMap = new HashMap<>();
		statePersonsMap = new HashMap<>();
		List cityPerson = new ArrayList();
		List statePerson = new ArrayList();
		for(String key : addressBook.keySet())
		{
			AddressBookMain mainObj = addressBook.get(key);
			List<Contacts> tempList = mainObj.getContactList();
			for (Contacts index : tempList) 
			{
				if (index.getStateName().equalsIgnoreCase(stateName))
				{
					statePerson.add((index.getFirstName() + " " + index.getLastName()));
					statePersonsMap.put(stateName, statePerson);
				}
				if (index.getCityName().equalsIgnoreCase(cityName))
				{
					cityPerson.add((index.getFirstName() + " " + index.getLastName()));
					statePersonsMap.put(stateName, cityPerson);
				}
			}
		}
	}
}

