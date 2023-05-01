package principal;

import javax.swing.JOptionPane;

import monedas.FuncionMonedas;
import temperatura.FuncionTemperatura;

public class Principal {
	
	public static void main(String[] args) {
		
		FuncionMonedas ValorMoneda = new FuncionMonedas();
		FuncionTemperatura temperatura = new FuncionTemperatura();
		
		boolean sigue = true;
		
		while(sigue) {
			String opciones = (JOptionPane.showInputDialog(null,"Seleccionar una opción de Conversión ", "Menú", 
								JOptionPane.QUESTION_MESSAGE, null, new Object[]
								{"Conversor de Monedas", "Conversor de Temperatura"}, "Selección")).toString();
			
			switch(opciones) {
				case "Conversor de Monedas":
					String input = JOptionPane.showInputDialog("Ingrese el monto a convertir: ");
					
					if(Valido(input) == true) {
						double Minput = Double.parseDouble(input);
						
						ValorMoneda.ConversorMonedas(Minput);
						
						int rta = JOptionPane.showConfirmDialog(null,"¿Desea realizar otra conversión?");
	                    
						if (JOptionPane.OK_OPTION == rta){
	                     	System.out.println("Selecciona opción Afirmativa");
	                    }else{
	                        JOptionPane.showMessageDialog(null, "Programa terminado"); 
	                        sigue = false;
	                    }
	                }else {
	                	JOptionPane.showMessageDialog(null, "Valor inválido");                
	                }
	                break;
				case "Conversor de Temperatura":
					input = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir ");
		            
					if(Valido(input) == true) {
						double Minput = Double.parseDouble(input);
		                
						temperatura.ConvertirTemperatura(Minput);

		                int rta = 0;
		                rta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
		                 
		                if((rta == 0) && (Valido(input) == true)) { 
		                 } else {
		                     JOptionPane.showMessageDialog(null, "Programa terminado");    
		                     sigue = false;
		                 }

		             } else {
		                 JOptionPane.showMessageDialog(null, "Valor inválido");                
		             }
		             break;
			}
		}
	}	
	
	public static boolean Valido(String input) {
		boolean resultado = false;
		try {
			double pp = Double.parseDouble(input);
			
			if(pp >= 0 || pp < 0) {
				resultado = true;
			}
		}catch(NumberFormatException e) {
			resultado = false;
		}
		return resultado;
	}
}
