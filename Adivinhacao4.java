package adivinhacao1;
import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.Locale;
public class Adivinhacao4 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String x,y;
		
		int i = 0;
				
		x = JOptionPane.showInputDialog("Digite o valor a ser adivinhado");
	    y = JOptionPane.showInputDialog("Digite o numero que voce acha que e o correto");
		
		
		
		if(x.equals(y)) {
			JOptionPane.showMessageDialog(null,"Você acertou");
		} else
			while(i < 2) {
				JOptionPane.showMessageDialog(null,"Tente de novo");
				y = JOptionPane.showInputDialog("Digite o numero que voce acha que e o correto");
	
			
				i = i + 1;
			} 
		  if (!x.equals(y) && i == 2 ) {
			  JOptionPane.showMessageDialog(null,"Suas tentativas acabaram e voce não acertou");
			  
		  } else {
			  JOptionPane.showMessageDialog(null,"Você acertou");
			  
		  }
		
		
		sc.close();

	}

}
