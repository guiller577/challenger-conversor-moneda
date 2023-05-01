package monedas;

import javax.swing.JOptionPane;

public class FuncionMonedas {
	
	ConversorMonedas moneda = new ConversorMonedas();
	ConversionInversa pesos = new ConversionInversa();
	
	public void ConversorMonedas(double Minput) {
		String opcion = (JOptionPane.showInputDialog(null,
				"Elejir la moneda que desea convertir el dinero: ","Monedas",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] 
				{"De Pesos a Dòlar", "De Pesos a Euro", "De Pesos a Libra", "De Pesos a Yen", "De Pesos a Won Sur Coreano", "De Dólar a Pesos", "De Euro a Pesos", "De Libra a Pesos", "De Yen a Pesos", "de won Sur Coreanos a Pesos"},
				"Selección")).toString();
		
		switch(opcion) {
		case "De Pesos a Dólar":
			moneda.convertirPesoADolar(Minput);
			break;
		case "De Pesos a Euro":
			moneda.convertirPesoAEuro(Minput);
			break;
		case "De Pesos a Libras":
			moneda.convertirPesoALibras(Minput);
			break;
		case "De Pesos a Yen":
			moneda.convertirPesoAYen(Minput);
			break;
		case "De Pesos a Won Sur Coreano":
			moneda.convertirPesoAWon(Minput);
			break;
		case "De Dólar a Pesos":
			pesos.DolarAPeso(Minput);
			break;
		case "De Euro a Pesos":
			pesos.EuroAPeso(Minput);
			break;
		case "De Libras a Pesos":
			pesos.LibraAPeso(Minput);
			break;
		case "De Yen a Pesos":
			pesos.YenAPeso(Minput);
			break;
		case "De Won Sur Coreano a Pesos":
			pesos.WonAPeso(Minput);
			break;
		}
	}
}
