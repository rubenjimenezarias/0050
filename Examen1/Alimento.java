
/**
 * Write a description of class Alimento here.
 * 
 * @author (RUBEN JIMENEZ ARIAS) 
 * @version (a version number or a date)
 */
public class Alimento
{
    // atributo nombre del alimento
    private String nombre;
    // atributos de cada alimento
    private float proteina;
    private float carbo;
    private float grasa;
    private float caloria;

     
    /**
    * Constructor for objects of class Alimento
    */
    public Alimento(String nombre, float proteina, float carbo, float grasa)
    {
        // inicializamos variables
        this.nombre = nombre;
        this.proteina = proteina;
        this.carbo = carbo;
        this.grasa = grasa;
        
        caloria = (proteina * 4);
        caloria = (caloria + grasa * 9);
        
    }

    /**
     * Metodo que muestra los datos de cada a alimento por pantalla
     */
    public void muestraDatos()
    {
        //Calculamos cual es el componente mayoritario y lo metemos en una variable String para poder visualizarla
        String mayoritario = "Proteina, carbohidrato y grasa";
        if (proteina > carbo && proteina > grasa){
           mayoritario = "Proteina.";
        }
        else if (carbo > proteina && carbo > grasa){
             mayoritario = "Carbohidratos";  
        }
        else if (grasa > proteina && grasa > carbo){
             mayoritario = "Grasa";  
        }
        else if (grasa == proteina && grasa > carbo){
             mayoritario = "Proteina y grasa";  
        }
        else if (carbo == proteina && grasa < carbo){
             mayoritario = "Proteina y carbohidratos";  
        }
        else if (carbo == grasa && grasa > proteina){
             mayoritario = "Carbohidratos y Grasa";  
        }
        
        // mostramos los datos por pantalla de los atributos del alimento
        System.out.println("Nombre: " + nombre);
        System.out.println("Proteina: " + proteina + "g cada 100 gramos");
        System.out.println("Carbohidratos: " + carbo + "g cada 100 gramos");
        System.out.println("Grasa: " + grasa + "g cada 100 gramos");
        System.out.println("Calorias: " + caloria + "g cada 100 gramos");
        System.out.println("Componente mayoritario: " + mayoritario + ".");
    }
    
    
    
    
    
    //METODOS UTILIZADOS PARA OTRAS CLASES
    
    /**
     * Metodo que devuelve la cantidad de proteina
     */
    public float proteina()
    {
        //Devuelve proteina
        return proteina;
    }
    /**
     * Metodo que devuelve la cantidad de carbohidrato
     */
    public float carbo()
    {
        //Devuelve proteina
        return carbo;
    }
    /**
     * Metodo que devuelve la cantidad de carbohidrato
     */
    public float grasa()
    {
        //Devuelve proteina
        return grasa;
    }
    /**
     * Metodo que devuelve la cantidad de carbohidrato
     */
    public float caloria()
    {
        //Devuelve proteina
        return caloria;
    }
    /**
     * Metodo que devuelve la cantidad de carbohidrato
     */
    public String nombre()
    {
        //Devuelve proteina
        return nombre;
    }
}
