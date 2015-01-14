
/**
 * Write a description of class Test0050 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test0050
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Test0050
     */
    public Test0050()
    {
        
    }

    /**
     * Multiplicacion
     */
    public int multiplicaciones(int a, int b)
    {
        int contador = 0;
        int suma = 0;
        while (contador < b)
        {
            suma+= a;
            contador ++;
        }
        return suma;
    }
    /**
     * Division
     */
    public int division(int dividendo, int divisor)
    {
        int resto = dividendo;
        int cociente = 0;
        while (dividendo >= divisor && divisor > 0)
        {
            dividendo -= divisor;
            cociente ++;
        }
        return cociente;
    }
    /**
     * Modulo
     */
    public int modulo(int numero, int modulo)
    {
        int cociente = 0;
        int resto = numero;
        //compruebo si el modulo es 0 que de 0
        if (modulo == 0){
            resto = 0;
        }
        
        while (resto >= modulo && modulo > 0)
        {
            resto -= modulo;
            cociente ++;
        }
        return resto;
    }
    /**
     * Potencia
     */
    public int potencia(int numero, int potencia)
    {
        int contador = 0;
        int suma = 0;
        int contador1 = 1;
        int limite = numero;
        
            while (contador <= potencia && contador1 < potencia)
            {
                suma += numero;
                contador ++;
                if (contador == limite && contador1 != potencia){
                    contador1 ++;
                    numero = suma;
                    contador = 1;
                }
                
            }
           
        
        return suma;
    }
    /**
     * Raiz cuadrada
     */
    public int raiz(int numero)
    {
        int contador = 0;
        int contadorFijo = -1;
        int suma = 0;
        while (suma < numero)
        {
            contador = 0;
            suma = 0;
            contadorFijo++;
            while (contador < contadorFijo)
            {
                suma+= contadorFijo;
                contador ++;
            }
        }
        
        if (suma != numero){
            contadorFijo = -1;
        }
        return contadorFijo;
    }
    
}
