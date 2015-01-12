
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
       
    }

    /**
     * Metodo que te indica los multiplos de 5 entre 10 y 95 ambos no incluidos.
     */
    public void multiplesOfFive()
    {
        int num = 15;
        while (num < 95){
            System.out.println(num);
            num += 5;
        }
    }
    /**
     * Metodo que suma los valores del 0 al 10 ambos incluidos
     */
    public void sumValue()
    {
        int num = 0;
        int suma = 0;
        while (num < 11){
            suma += num;
            num++;
        }
        System.out.println("La suma es " + suma + ".");
    }
     /**
     * Metodo que suma los valores comprendidos entre a y b
     */
    public void sumValueInternal(int a, int b)
    {
        //compruebo si b es mayor que a sino hacemos el cambio
        if (a > b){
            int c = a;
            a = b;
            b = c;  
        }
        //Realizamos el ejercicio comprobando que los numero no sean iguales.
        if (a==b){
            System.out.println("Los numeros son iguales");
        }
        else {
            int suma = 0;
            int num = a;
                
            while (num <= b){
                suma += num;
                num++;
            }
            System.out.println("La suma es " + suma + ".");
        }
    }
    /**
     * Metodo que comprueba si es primario
     */
    public boolean isPrime(int n)
    {
        // ESTA SIN ACABAR SOLO EMPEZADO.
        boolean prime = false;
        return prime;
    }
}
