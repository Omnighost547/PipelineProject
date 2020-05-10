package ie.gmit;

public class ContactControler {

    Validator validator = new Validator();
    Contact contact = new Contact();
    Database database = new Database();

    public int saveContact(String name, String secondName, String addressLine1, String addressLine2, String city, String phoneNumber, String dob, String eirCode){
       int mms =0;
       mms = validator.validateName(name);
       mms += validator.validateSecondName(secondName);
       mms += validator.validatePhoneNumber(phoneNumber);
       mms += validator.validateDOB(dob);
       mms += validator.validateEirCode(eirCode);
       if(mms != 0){
           //error ocured
       }else if(mms == 0){
           //save data
           contact.setName(name);
           contact.setSecondName(secondName);
           contact.setAddressLine1(addressLine1);
           contact.setAddressLine2(addressLine2);
           contact.setCity(city);
           contact.setPhoneNr(phoneNumber);
           contact.setDOB(dob);
           contact.setEirCode(eirCode);
           database.storeData(contact);
       }
        return mms;
    }

    public boolean deleteContact(String name){
        if(contact.getName().equals(name)){
            database.deleteData(name);
        }

        return true;
    }

    public Contact searchContact(String name){

        return contact;
    }
}
