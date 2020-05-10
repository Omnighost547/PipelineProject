package ie.gmit;

import java.util.ArrayList;
import java.util.Iterator;

public class Database {

    Contact contact = new Contact();
    ArrayList<Contact> contactDB = new ArrayList<>();

    public boolean storeData(Contact contact){
        boolean result;
        if(contact != null){
            contactDB.add(contact);
            result = true;
        }else{
            result = false;
        }
        return result;
    }

    public Contact retrieveData(String name){

        Iterator iter = contactDB.iterator();
        while(iter.hasNext()){
            contact = (Contact) iter.next();
            if(contact.getName().equals(name)){
                break;
            }else{
                contact = null;
            }
        }
        return contact;
    }
    public boolean deleteData(String name){
        boolean result = true;
        for(int i = 0; i < contactDB.size(); i++){
            contact = contactDB.get(i);
            if(contact.getName().equals(name)){
                contactDB.remove(i);
                result = true;
            }else{
                result = false;
            }
        }


        return result;

    }
}
