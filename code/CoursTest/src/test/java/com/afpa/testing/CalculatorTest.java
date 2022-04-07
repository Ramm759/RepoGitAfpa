package com.afpa.testing;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.text.MessageFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Set;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private static Instant startedAt;
    private Calculator calculatorUnderTest;

    @BeforeAll
    static void initStartingTime(){
        System.out.println("Appel avant tous les tests");
        startedAt = Instant.now();
    }

    @AfterAll
    static void showTestDuration(){
        System.out.println("Appel après tous les tests");
        Instant endedAt = Instant.now();
        long duration = Duration.between(startedAt, endedAt).toMillis();
        System.out.println(MessageFormat.format("Durée des tests : {0} ms", duration));
    }

    @BeforeEach
    public void initCalculator(){
        // System.out.println("Appel avant chaque test");
        calculatorUnderTest = new Calculator();
    }

    @AfterEach
    public void undefCalculator(){
        // System.out.println("Appel après chaque test");
        calculatorUnderTest = null;
    }

    @ParameterizedTest(name = "{0} x 0 doit être égal à 0")
    @ValueSource(ints = {1, 2 ,42, 1011, 5098})
    public void multiply_shouldReturnZeroWitnIntegers(int arg){
        // ARRANGE

        // Act : Multiplication par 0
        System.out.println("Arg = " + arg);
        int actualResult = calculatorUnderTest.multiply(arg, 0);

        // ASSERT
        assertEquals(0, actualResult);
    }

    // Utilisation de jeux de test
    @ParameterizedTest(name = "{0} + {1} should equals {2}")
    @CsvSource({"1,1,2", "2,3,5", "42,57,99"})
    public void add_shouldReturnTheSum_ofMultiplesIntegers(int arg1, int arg2, int expectresult){
        // ARRANGE

        // ACT
        int actualresult =  calculatorUnderTest.add(arg1, arg2);

        // ASSERT
        assertEquals(expectresult,actualresult);
    }

    @Timeout(1) // Fait échouer le test après 1 seconde
    @Test
    public void longCalcul_shouldRealisedLessThan1Second(){
        // ARRANGE

        // ACT
        calculatorUnderTest.longCalculation();

        // ASSERT

    }

    @Test
    void testAddTwoPositiveNumbers(){
        // ARRANGE

        final int a =2;
        final int b = 3;

        // ACT
        final int somme = calculatorUnderTest.add (a, b);

        // ASSERT
        // Syntaxe Junit
        // assertEquals(5, somme); // 1er paramètre : résultat attendu, 2 eme parametre : valeur à tester

        // Syntaxe AssertJ
        assertThat(somme).isEqualTo(5);
    }

    @Test
    void testMultiplyTwoPositiveNumbers(){
        // ARRANGE
        final int a =2;
        final int b = 3;


        // ACT
        final int result = calculatorUnderTest.multiply (a, b);

        // ASSERT
        assertEquals(6, result); // 1er paramètre : résultat attendu, 2 eme parametre : valeur à tester
    }

    @Test
    public void digitset_shouldReturnTheSetOfDigits_ofPositiveInteger(){
        // GIVEN
        int number = 95897;

        // WHEN
        Set<Integer> actualDigits = calculatorUnderTest.digitsSet(number);

        // THEN
        assertThat(actualDigits).containsExactlyInAnyOrder(9,5,8,7);
    }
}
