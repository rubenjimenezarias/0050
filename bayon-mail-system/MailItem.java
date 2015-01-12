/**
 * Esta clase representa un mensaje de email
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MailItem
{
    //Almacena que direccion envia el mensaje
    private String from;
    //Almacena para que direccion es el mensaje
    private String to;
    //Almacena el contenido del mensaje del email
    private String message;
    
    /**
     * Constructor de la clase MailItem
     */
    public MailItem(String newFrom, String newTo, String newMessage)
    {
        from = newFrom;
        to = newTo;
        message = newMessage;
    }
    
    /**
     * Devuelve la dirección de origen del mensaje
     */
    public String getFrom()
    {
        return from;
    }
    
    /** 
     * Devuelve la direccion de destino del mensaje
     */
    public String getTo()
    {
        return to;
    }
    
    /**
     * Devuelve el contenido del mensaje
     */
    public String getMessage()
    {
        return message;
    }
    
    /**
     * Imprime por pantalla los datos del email:
     * direccion de origen y destino y contenido
     */
    public void print()
    {
        System.out.println("Origen: " + from);
        System.out.println("Destino: " + to);
        System.out.println("Contenido del email: " + message);
    }
 
}
 