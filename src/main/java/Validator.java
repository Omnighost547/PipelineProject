/*
 * This class is responsible for validating that input mach pattern
 * Author: Paulius Miliunas
 * For: Software with Tests pipeline project
 */
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Validator {

    //variables used in class
    private int notification;
    final private String namePattern = "^[A-Z][a-b]";
    final private String secondNamePattern = "^[A-Z][a-b]";
    final private String phoneNumberPattern = "[0-9]";
    final private String dobPattern = "[0-9]{2}\\[0-9]{2}\\[0-9]{4}";
    final private String eirCodePattern = "([AC-FHKNPRTV-Y]\\d{2}|D6W)[0-9AC-FHKNPRTV-Y]{4}";
    private Pattern pattern;
    private Matcher matcher;


    //Validator constructor
    public Validator(){}
    //function to validate name
    public int validateName(String name){
        pattern = Pattern.compile(namePattern);
        matcher = pattern.matcher(name);
        if(matcher.matches()){
            notification = 0;
        }else{
            notification = 1;
        }
        return notification;
    }
    //function to validate second name
    public int validateSecondName(String secondName){
        pattern = Pattern.compile(secondNamePattern);
        matcher = pattern.matcher(secondName);
        if(matcher.matches()){
            notification = 0;
        }else{
            notification = 2;
        }
        return notification;
    }
    //function to validate phone number
    public int validatePhoneNumber(String phoneNumber){
        pattern = Pattern.compile(phoneNumberPattern);
        matcher = pattern.matcher(phoneNumber);
        if(matcher.matches()){
            notification = 0;
        }else{
            notification = 3;
        }
        return notification;
    }
    //function to validate date of birth
    public int validateDOB(String dob){
        pattern = Pattern.compile(dobPattern);
        matcher = pattern.matcher(dob);
        if(matcher.matches()){
            notification = 0;
        }else{
            notification = 4;
        }
        return notification;
    }
    //function to validate eirCode
    public int validateEirCode(String eirCode){
        pattern = Pattern.compile(eirCodePattern);
        matcher = pattern.matcher(eirCode);
        if(matcher.matches()){
            notification = 0;
        }else{
            notification = 5;
        }
        return  notification;
    }
}
