package utils.configuration.rules;

import static org.apache.commons.lang3.RandomStringUtils.random;

/**
 * The interface Inputs.
 */
public interface Inputs {

    /**
     * The constant FIRSTNAME.
     */
    String FIRSTNAME = "auto";
    /**
     * The constant LASTNAME.
     */
    String LASTNAME = "user";
    /**
     * The constant EMAIL.
     */
    String EMAIL = "";
    /**
     * The constant RANDOM_EMAIL.
     */
    String RANDOM_EMAIL = FIRSTNAME + LASTNAME + random(10, false, true) + "byteant.com";
    /**
     * The constant contactNumber.
     */
    String contactNumber = "+1 (706) 4318302";
    /**
     * The constant largeAmount.
     */
    String largeAmount = "12345678901234567890123456789012345678901234567890123456789012345";
    /**
     * The constant scriptJS.
     */
    String scriptJS = "<script>alert(1)</script>;";
}

