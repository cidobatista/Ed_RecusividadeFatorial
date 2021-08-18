package view;


import javax.swing.JOptionPane;

import controller.ControllerFatorial;



public class Principal {

	public static void main(String[] args) {
				
		
		int entrada, resultado;
		
		entrada = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor inteiro até 12"));
		
		ControllerFatorial ft = new ControllerFatorial();
		resultado = ft.calcFat(entrada);
		
		System.out.println("O fatorial de "+entrada+" é "+resultado+".");

	}
}