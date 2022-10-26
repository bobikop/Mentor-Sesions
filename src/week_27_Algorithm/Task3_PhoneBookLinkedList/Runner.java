package week_27_Algorithm.Task3_PhoneBookLinkedList;

public class Runner {

    public static void main(String[] args) throws Exception {

        PhoneBook_LinkedList phoneBook = new PhoneBookImpl();

        phoneBook.add(new Contact("Larry", "Bird",
                "bird@nba.com", "(866) 952-0828"));

        phoneBook.add(new Contact("Scottie", "Pippen",
                "pippen@gmail.com", "(342) 456-1287"));

        phoneBook.add(new Contact("Mary", "Pippen",
                "pippen@gmail.com", "(342) 456-1287"));


        System.out.println("*****Print all records*****");
        phoneBook.printPhoneBook();
        System.out.println("--------------------------------");
        System.out.println(phoneBook.findByFirstName("Larry"));
        System.out.println("--------------------------------");
        System.out.println(phoneBook.findAllByLastName("Pippen"));
        System.out.println("--------------------------------");
        phoneBook.deleteByFirstName("Mary");
        phoneBook.printPhoneBook();

    }


}