import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

import models.*;
public class Main {
    static ContactManager manage = new ContactManager();
    public static void main(String[] args) {
        try{
            loadContacts("contacts.txt");
        } catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Contacts Loaded\n\n");
            System.out.println(manage);
        }
        
       /* try{
            Contact contact = new Contact("Alan", "6122334455","07/23/1912");
            contact.setBirthDate("08/23/1912");
            System.out.println(contact);

            //Copy contact using constructor
            Contact contact2 = new Contact(contact);
            System.out.println(contact2);*/

          /*  ContactManager manage = new ContactManager();
            manage.addContact(new Contact("Alan", "6122334455","07/23/1912"));
            manage.addContact(new Contact("Ryan", "6122334455","07/23/1912"));
            manage.addContact(new Contact("Jio", "6122334455","07/23/1912"));
            System.out.println(manage);
        }catch(ParseException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Process complete");
        }*/
      
        
    }

    /**
     * Name: manageContacts
     *
     * Inside the function:
     *   • 1. Starts a new instance of Scanner;
     *   • 2. In an infinite loop, the user can choose to a) add b) remove a contact c) exit.
     *   •        case a: ask for the name, phone number and birthDate.
     *   •        case b: ask who they'd like to remove.
     *   •        case c: break the loop.
     *   • 3. close Scanner.
     */



    /**
     * Name: loadContacts
     * @param fileName (String)
     * @throws FileNotFoundException
     *
     * Inside the function:
     *   • 1. loads contacts from <fileName>;
     *   • 2. From the manager object, it adds all contacts to the contacts list.
     *        Hint: use scan.next to grab the next String separated by white space.
     */
    public static void loadContacts(String fileName) throws FileNotFoundException{
        FileInputStream str = new FileInputStream(fileName);
        Scanner scan = new Scanner(str);
        while(scan.hasNextLine()){
            try{
                Contact contact = new Contact(scan.next(), scan.next(), scan.next());
                manage.addContact(contact);
            }catch(ParseException e){
                System.out.println(e.getMessage());
            }
        }
        scan.close();
    }

}
