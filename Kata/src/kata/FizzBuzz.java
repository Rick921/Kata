/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata;

/**
 *
 * @author daw127
 */
public class FizzBuzz {
    
    public String  getFizzBuzz(int n){
        String resultado = String.valueOf(n); 
        if (n%3==0) {
            resultado = "FIZZ";
            
        }
        if (n%5==0) {
            resultado = "BUZZ";
        }
        
        if(n%5==0&&n%3==0){
            resultado = "FIZZBUZZ"; 
        }
        return resultado;
    }
}
