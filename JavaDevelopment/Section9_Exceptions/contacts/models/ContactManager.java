package models;

import java.text.ParseException;
import java.util.ArrayList;

public class ContactManager {
    ArrayList<Contact> contacts;

    public ContactManager(){
        this.contacts = new ArrayList<Contact>();
    }

    public Contact getContact(int index) throws ParseException{
        return new Contact(contacts.get(index));
    }

    public void setContact(Contact contact, int index) throws ParseException{
        contacts.set(index, new Contact(contact));
    }

    public void addContact(Contact contact){
        contacts.add(contact);
    }

    public void removeContact(String name){
        if(contacts.isEmpty()){
            throw new IllegalStateException("You can not remove since no contacts exist");
        }
        for(int i=0; i<contacts.size();i++){
            if(contacts.get(i).getName().equals(name)){
                contacts.remove(i);
            }
        }
    }

    public String toString(){
        String temp ="";
        for (int i = 0; i <contacts.size(); i++) {
            temp+=contacts.get(i).toString();
            temp+="\n\n";
        }
        return temp;
    }
}
