
/**
 * Beschreiben Sie hier die Klasse Heater.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Heater
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int temperature;
    private int x = 5;
    private int min;
    private int max;
    private int increment;

    /**
     * Konstruktor für Objekte der Klasse Heater
     */
    public Heater(int minTemperature, int maxTemperature)
    {
        // Instanzvariable initialisieren
        temperature = 15;
        min = minTemperature;
        max = maxTemperature;
        increment = 5;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void warmer()
    {
        // tragen Sie hier den Code ein
        temperature = temperature + x;
        if(temperature >= max)
        {
            temperature = max;
            System.out.println("Maximaltemperatur ist überschritten!");
        }  
            
    }
    
    public void cooler()
    {
        temperature = temperature - x;
        if(temperature <= min)
        {
            temperature = min;
            System.out.println("Minimaltemperatur ist unterschritten!");
        }  
    }
    
    public int temperatureCurrent()
    {
        return temperature;
    }
}
