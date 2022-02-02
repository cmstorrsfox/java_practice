import java.util.ArrayList;

public class Family {
  String familyName;
  ArrayList<Person> members;

  public Family(String surname) {
    familyName = surname;
    members = new ArrayList<Person>();
  }

  public void addFamilyMember(String firstName, String lastName, int age, char sex) {
    Person member = new Person(age, firstName, lastName, sex);
    members.add(member);
  
  }

  public String updateFamilyName(String newName) {
    return familyName = newName;
  }

  public void printFamilyInfo() {
    System.out.println("The "+familyName+" family has the following members: \n");
    
    for (int i = 0; i < members.size(); i++) {
      System.out.println("Family member #"+(i+1)+":\n");
      System.out.println(members.get(i));
    }
  }
  
  public static void main(String[] args) {

    Family storrs_fox = new Family("Malarky");

    Family donohue = new Family("Patricio");

    storrs_fox.addFamilyMember("Jane", "Meyers", 33, 'F');
    storrs_fox.addFamilyMember("Paul", "Trudeau", 34, 'M');
    storrs_fox.addFamilyMember("Bubba", "Trudeau", 2, 'M');
    storrs_fox.addFamilyMember("Garfield", "Trudeau", 0, 'M');

    donohue.addFamilyMember("Greg", "Patricio", 36, 'M');
    donohue.addFamilyMember("Sandra", "Gubbins", 33, 'F');
    donohue.addFamilyMember("Malcolm", "Patricio", 1, 'M');

    storrs_fox.printFamilyInfo();

    

    donohue.updateFamilyName("Patricio-Gubbins");

    donohue.printFamilyInfo();

   
  }
}
