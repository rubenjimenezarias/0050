import java.util.ArrayList;
/**
 * Write a description of class Usuario here.
 * 
 * @author (RUBEN JIMENEZ ARIAS) 
 * @version (a version number or a date)
 */
public class Usuario
{
    // Atributo nombre del usuario
    private String nomusu;
    //Atributos de lo que ha ingerido el usuario.
    private float proteina;
    private float carbo;
    private float grasa;
    private float caloria;
    // Para saber cual es el alimento con mas calorias ingeridas
    private String masCalorico;
    private float cuentaCaloria;
    // Creamos una arraylist para almacenar los alimentos que ingiere el usuario
    private ArrayList<Alimento> comido;

    /**
     * Constructor for objects of class Usuario
     */
    public Usuario(String nombre)
    {
        // initialise instance variables
        nomusu = nombre;
        proteina = 0;
        carbo = 0;
        grasa = 0;
        caloria = 0;
        masCalorico = "No ha comido nada.";
        cuentaCaloria = 0;
        comido = new ArrayList<Alimento>();
    }

    /**
     * Sumamos lo ingerido al usuario
     */
    public void comer(Alimento comida, float gramos)
    {
        // Comprobamos que el alimento sea o no el que tiene mas calorias.
        if (cuentaCaloria < comida.caloria()){
            masCalorico = comida.nombre();
            cuentaCaloria = comida.caloria();
        }
        //Añadimos el alimento a la lista.
        comido.add(comida);
        // Sumamos los valores del alimento al usuario
        proteina = proteina + ((comida.proteina()/100)*gramos);
        carbo = carbo + ((comida.carbo()/100)*gramos);
        grasa = grasa + ((comida.grasa()/100)*gramos);
        caloria = caloria + ((comida.caloria()/100)*gramos);
    }
    
    /**
     * Mostramos por pantalla lo que el usuario lleva ingerido
     */
    public void estadoComidaIngerida()
    {
        //calculamos los porcentajes de los alimentos
        float total = (proteina + carbo + grasa);
        float porproteina = (proteina*100)/total;
        float porcarbo = (carbo*100)/total;
        float porgrasa = (grasa*100)/total;
        
        // mostramos los datos por pantalla el estado del estomago del usuario
        System.out.println("Nombre: " + nomusu);
        if (proteina == 0){
            System.out.println("Proteina: " + proteina + " gramos.");
        }
        else {
            System.out.println("Proteina: " + proteina + " gramos.   " + porproteina + "%.");
        }
        if (carbo == 0){
            System.out.println("Proteina: " + carbo + " gramos.");
        }
        else {
            System.out.println("Proteina: " + carbo + " gramos.   " + porcarbo + "%.");
        }
        if (grasa == 0){
            System.out.println("Proteina: " + grasa + " gramos.");
        }
        else {
            System.out.println("Proteina: " + grasa + " gramos.   " + porgrasa + "%.");
        }
        System.out.println("Calorias: " + caloria + " gramos.");
    }
    
    /**
     * Comparamos entre dos usuarios quien ha comido mas calorias y lo mostramos por pantalla
     */
    public void compararCalorias(Usuario compararCon)
    {
        if (caloria > compararCon.caloria()){
            System.out.println(nomusu + " ha comido mas calorias que " + compararCon.nombre());
        }
        else if (caloria < compararCon.caloria()){
            System.out.println(compararCon.nombre() + " ha comido mas calorias que " + nomusu);
        }
        else {
            System.out.println("Los dos han comido la misma cantidad de calorias.");
        }
    }
    
    /**
     * Muestra por pantalla cual es el metodo mas calorico ingerido.
     */
    public void alimentoMasCaloricoIngerido()
    {
        System.out.println("El alimento mas calorico ingerido es " + masCalorico + ".");
    }
    
    /**
     * Creo metodo para visualizar el alimento que indique el usuario
     */
    public void verAlimentoIngerido(int index)
    {
        int contador = comido.size();
        if (contador == 0){
            System.out.println("Este chico no ha comido nada");
        }
        else {
            if(index >= 0 && index < comido.size()) {
                Alimento elige = comido.get(index);
                elige.muestraDatos();
            }
            else {
                System.out.println("El valor introducido no esta entre 0 y " + (contador - 1) + ".");
            }
        }
    }
    
    
    
    
    
    //METODOS UTILIZADOS PARA OTRAS CLASES
    
    /**
     * Devuelve el nombre del Usuario
     */
    public String nombre()
    {
        return nomusu;
    }
    /**
     * Devuelve las calorias del usuario
     */
    public float caloria()
    {
        return caloria;
    }
}
