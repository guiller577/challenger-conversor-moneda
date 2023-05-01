package monedas;

import javax.swing.JOptionPane;

public class ConversionInversa {

	public void DolarAPeso(double valor) {
		double mDolar = valor * 225.00;
		mDolar = (double) Math.round(mDolar * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tiene $ " +mDolar+ " Pesos Argentinos");
	}
	
	public void EuroAPeso(double valor) {
		double mEuro = valor * 244.00;
		mEuro = (double) Math.round(mEuro * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tiene $ " +mEuro+ " Pesos Argentinos");
	}

	public void LibraAPeso(double valor) {
		double mLibra = valor * 269.03;
		mLibra = (double) Math.round(mLibra * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tiene $ " +mLibra+ " Pesos Argentinos");
	}

	public void YenAPeso(double valor) {
		double mYen = valor * 1.61;
		mYen = (double) Math.round(mYen * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tiene $ " +mYen+ " Pesos Argentinos");
	}

	public void WonAPeso(double valor) {
		double mWon = valor * 0.16;
		mWon = (double) Math.round(mWon * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tiene $ " +mWon+ " Pesos Argentinos");
	}
}
