package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditCardIssuerCheckingTest {

    @Test
    public void issuerTests() {
	assertEquals("VISA", CreditCardIssuerChecking.getIssuer("4111111111111111"));
	assertEquals("AMEX", CreditCardIssuerChecking.getIssuer("378282246310005"));
	assertEquals("Unknown", CreditCardIssuerChecking.getIssuer("9111111111111111"));
	assertEquals("Mastercard", CreditCardIssuerChecking.getIssuer("5105105105105100"));
    }

}
