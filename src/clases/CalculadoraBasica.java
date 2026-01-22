package clases;
/**
 * Clase que representa una calculadora basica con operaciones basicas aritmeticas
 * 
 * @author Jose Pedro Gonzalez Hens
 * @version 1.0
 * @since 19/01/2026 
 */
public class CalculadoraBasica {
    /**
     * Constructor de la clase CalculadoraBasica
     */
    public CalculadoraBasica(){
        // Constructor vacio
    }
    /**
     * Suma dos numeros enteros
     * 
     * @param a Primer numero entero
     * @param b Segundo numero entero
     * @return Suma de a y b
     */
    public int sumar(int a, int b){
        return a+b;
    }
    /**
     * Resta dos numeros enteros
     * 
     * @param a Primer numero entero
     * @param b Segundo numero entero
     * @return Resta de a y b
     */
    public int restar(int a, int b){
        return a-b;
    }

}
