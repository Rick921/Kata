/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daw127
 */
public class FizzBuzzTest {
    
    public FizzBuzzTest() {
    }

    @Test
    public void testFizzBuzzDeUnoDevuelveUno() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(1);
        assertEquals("1", result); 
        
    }
     @Test
    public void testFizzBuzzDeDosDevuelveDos() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(2);
        assertEquals("2", result); 
        
    }
    
      @Test
    public void testFizzBuzzDeTresDevuelveFIZZ() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(3);
        assertEquals("FIZZ", result); 
        
    }
    
    
      @Test
    public void testFizzBuzzDeMultiploTresDevuelveFIZZ() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(6);
        assertEquals("FIZZ", result); 
        
    }
    
      @Test
    public void testFizzBuzzDeMultiploCincoDevuelveBuzz() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(15);
        assertEquals("BUZZ", result); 
        
    }
    
   
}
