package ie.gmit;

/*
 * This class verifies is user entering correct format data
 * Author: Paulius Miliunas
 * For: Software with Tests pipeline project
 *
 */
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Validator {

    //variables used in class
    private int errorCode;//this will store error code from validation
    //pattern variables will hold fixt patterns
    final private String namePattern = "^[A-Z][a-z]+";
    final private String phoneNumberPattern = "[0-9]+";
    final private String dobPattern = "[0-9]{2}/[0-9]{2}/[0-9]{4}";
    final private String eirCodePattern = "^[AC-FHKNPRTV-Y]\\d[0-9W][ -]?[0-9AC-FHKNPRTV-Y]{4}$";
    private Pattern pattern;
    private Matcher matcher;


    //Validator constructor
    public Validator(){}
    //function to validate name
    public int validateName(String name){
        pattern = Pattern.compile(namePattern);
        matcher = pattern.matcher(name);
        if(matcher.matches()){
            errorCode = 0;
        }else{
            errorCode = 1;//
        }
        return errorCode;
    }
    //function to validate second name
    public int validateSecondName(String secondName){
        pattern = Pattern.compile(namePattern);
        matcher = pattern.matcher(secondName);
        if(matcher.matches()){
            errorCode = 0;
        }else{
            errorCode = 2;
        }
        return errorCode;
    }
    //function to validate phone number
    public int validatePhoneNumber(String phoneNumber){
        pattern = Pattern.compile(phoneNumberPattern);
        matcher = pattern.matcher(phoneNumber);
        if(matcher.matches()){
            errorCode = 0;
        }else{
            errorCode = 3;
        }
        return errorCode;
    }
    //function to validate date of birth
    public int validateDOB(String dob){
        pattern = Pattern.compile(dobPattern);
        matcher = pattern.matcher(dob);
        if(matcher.matches()){
            errorCode = 0;
        }else{
            errorCode = 4;
        }
        return errorCode;
    }
    //function to validate eirCode
    public int validateEirCode(String eirCode){
        pattern = Pattern.compile(eirCodePattern);
        matcher = pattern.matcher(eirCode);
        if(matcher.matches()){
            errorCode = 0;
        }else{
            errorCode = 5;
        }
        return  errorCode;
    }
}
