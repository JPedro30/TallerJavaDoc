package clases;
/**
 * Clase que representa una calculadora avanzada con operaciones aritmeticas y de raiz cuadrada
 * 
 * @author Jose Pedro Gonzalez Hens
 * @version 1.0
 * @since 19/01/2026 
 */
public class CalculadoraAvanzada {
    /**
     * Constructor de la clase CalculadoraBasica
     */
    public CalculadoraAvanzada(){
        // Constructor vacio
    }
    /**
     * Multiplica dos numeros enteros
     * 
     * @param a Primer numero entero
     * @param b Segundo numero entero
     * @return Producto de a y b
     */
    public int multiplicar(int a, int b){
        return a*b;
    }
    /**
     * Divide dos numeros enteros
     * 
     * @param a Dividendo
     * @param b Divisor (no puede ser cero)
     * @return Cociente de a y b
     * @throws ArithmeticException Si b es cero
     */
    public int dividir(int a, int b){
        if (b==0) {
            throw new ArithmeticException("No se puede dividir entre 0.");
        }
        return a/b;
    }
    /**
     * Calcula la raiz cuadrada de a
     * 
     * @param a Numero del que se desea calcular la raiz cuadrada (debe ser positivo)
     * @return La raiz cuadrada de a
     * @throws IllegalArgumentException Si a es negativo
     */
    public double raizCuadrada(double a){
        if (a<0) {
            throw new IllegalArgumentException("No se puede calcular la raiz cuadrada de un numero negativo");
        }
        return Math.sqrt(a);
    }

}
