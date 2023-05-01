package temperatura;

import javax.swing.JOptionPane;

public class FuncionTemperatura {

	ConversorTemperatura temperatura = new ConversorTemperatura();
	
	public void ConvertirTemperatura(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Temperatura", 
    					JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    					{"Grados Celcius a Grados Farenheit", "Grados Celcius a Kelvin", "Grados Farenheit a Grados Celcius",
    					 "Kelvin a Grados Celcius","Kelvin a Grados Farenheit"}, "Seleccion")).toString();
        
    	switch(opcion) {
        case "Grados Celcius a Grados Farenheit":
        	temperatura.CelciusAFarenheit(Minput);
        	break;
        case "Grados Celcius a Kelvin":
            temperatura.CelciusAKelvin(Minput);
            break;
        case "Grados Farenheit a Grados Celcius":
        	temperatura.FarenheitACelcius(Minput);
        	break;
        case "Kelvin a Grados Celcius":
        	temperatura.KelvinACelcius(Minput);
        	break;
        case "Kelvin a Grados Farenheit":
        	temperatura.KelvinAFarenheit(Minput);
        	break;
        }
	}
}
