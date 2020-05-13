/*
The code is made by Paulius Miliunas
Here is all test cases for validator class
 */

package ie.gmit;


import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

public class TestValidator {
    private Validator validator;




    @DisplayName("  ******************************************\n" +
                    "Test starting\n" +
                    "******************************************")
    @BeforeEach
    void setup(){
        validator = new Validator();


    }

    @DisplayName(   "******************************************\n" +
                    "Happy scenario testing for name validation\n" +
                    "******************************************")
    @Test
    void testValidateName(){
       int response = validator.validateName("Paulius");
        assertEquals(0,response);
    }

    @DisplayName(   "******************************************\n"+
                    "Happy scenario testing for second name validation\n"+
                    "******************************************\n")
    @Test
    void testValidateSecondName(){
        int response = validator.validateSecondName("Miliunas");
        assertEquals(0,response);
    }

    @DisplayName(   "******************************************\n"+
                    "Happy scenario testing for phone number validation\n"+
                    "******************************************\n")
    @Test
    void testValidatePhoneNumber(){
        int response = validator.validatePhoneNumber("123456789");
        assertEquals(0,response);
    }

    @DisplayName(   "******************************************\n"+
                    "Happy scenario testing for dob validation\n"+
                    "******************************************\n")
    @Test
    void testValidateDOB(){
        int response = validator.validateDOB("13/09/1987");
        assertEquals(0,response);
    }

    @DisplayName(   "******************************************\n"+
                    "Happy scenario testing for eircode validation\n"+
                    "******************************************\n")
    @Test
    void testValidateEirCode(){
        int response = validator.validateEirCode("H91 FRN2");
        assertEquals(0,response);
    }

    //******************

    @DisplayName(   "******************************************\n"+
                    "Fail testing for name validation\n"+
                    "******************************************\n")
    @Test
    void testValidateNameFail(){
        int response = validator.validateName("paulius");
        assertEquals(1,response);
    }

    @DisplayName("  ******************************************\n"+
                    "Fail testing for second name validation\n"+
                    "******************************************\n")
    @Test
    void testValidateSecondNameFail(){
        int response = validator.validateSecondName("miliunas");
        assertEquals(2,response);
    }

    @DisplayName(   "******************************************\n"+
                    "Fail testing for phone number validation\n"+
                    "******************************************\n")
    @Test
    void testValidatePhoneNumberFail(){
        int response = validator.validatePhoneNumber("one two tree");
        assertEquals(3,response);
    }

    @DisplayName(   "******************************************\n"+
                    "Fail testing for Date of birth validation\n"+
                    "******************************************\n")
    @Test
    void testValidateDOBFail(){
        int response = validator.validateDOB("13091987");
        assertEquals(4,response);
    }

    @DisplayName(   "******************************************\n"+
                    "Fail testing for Eir code validation\n"+
                    "******************************************\n")
    @Test
    void testValidateEirCodeFail(){
        int response = validator.validateEirCode(" FRN2");
        assertEquals(5,response);
    }
}
