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

    Family storrs_fox = new Family("Storrs-Fox");

    Family donohue = new Family("Donohue");

    storrs_fox.addFamilyMember("Ngoc", "Nguyen", 33, 'F');
    storrs_fox.addFamilyMember("Chris", "Storrs-Fox", 34, 'M');
    storrs_fox.addFamilyMember("Hieu", "Storrs-Fox", 2, 'M');
    storrs_fox.addFamilyMember("Khoa", "Storrs-Fox", 0, 'M');

    donohue.addFamilyMember("Greg", "Donohue", 36, 'M');
    donohue.addFamilyMember("Jess", "Schmidt", 33, 'F');
    donohue.addFamilyMember("Charley", "Donohue-Schmidt", 1, 'F');

    storrs_fox.printFamilyInfo();

    

    donohue.updateFamilyName("Schmidt-Donohue");

    donohue.printFamilyInfo();

   
  }
}
