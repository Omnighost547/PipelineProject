package ie.gmit;


import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestValidator {
    Validator validator;


    @DisplayName("Creating Validator object")
    @BeforeEach
    void createValidatorObject(){
        validator = new Validator();
    }

    @DisplayName("Happy scenario testing for name validation")
    @Test
    void testValidateName(){
       int response = validator.validateName("Paulius");
        assertEquals(0,response);
    }

    @DisplayName("Happy scenario testing for second name validation")
    @Test
    void testValidateSecondName(){
        int response = validator.validateSecondName("Miliunas");
        assertEquals(0,response);
    }

    @DisplayName("Happy scenario testing for phone number validation")
    @Test
    void testValidatePhoneNumber(){
        int response = validator.validatePhoneNumber("123456789");
        assertEquals(0,response);
    }

    @DisplayName("Happy scenario testing for Date of birth validation")
    @Test
    void testValidateDOB(){
        int response = validator.validateDOB("13/09/1987");
        assertEquals(0,response);
    }

    @DisplayName("Happy scenario testing for Eir code validation")
    @Test
    void testValidateEirCode(){
        int response = validator.validateEirCode("H91 FRN2");
        assertEquals(0,response);
    }

    //******************
    @DisplayName("Fail testing for name validation")
    @Test
    void testValidateNameFail(){
        int response = validator.validateName("PAulius");
        assertEquals(1,response);
    }

    @DisplayName("Fail testing for second name validation")
    @Test
    void testValidateSecondNameFail(){
        int response = validator.validateSecondName("MIliunas");
        assertEquals(2,response);
    }

    @DisplayName("Fail testing for phone number validation")
    @Test
    void testValidatePhoneNumberFail(){
        int response = validator.validatePhoneNumber("one two tree");
        assertEquals(3,response);
    }

    @DisplayName("Fail testing for Date of birth validation")
    @Test
    void testValidateDOBFail(){
        int response = validator.validateDOB("13091987");
        assertEquals(4,response);
    }

    @DisplayName("Fail testing for Eir code validation")
    @Test
    void testValidateEirCodeFail(){
        int response = validator.validateEirCode(" FRN2");
        assertEquals(5,response);
    }
}
