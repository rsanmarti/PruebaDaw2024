import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Tocino {

	public static void main(String[] args) {
		//Lee un numero por teclado que pida el precio de un producto (puede tener decimales)
		//y calcula el precio final con IVA. El IVA sera una constante que será de 21%
		//ESCRIBIR UN PRECIO Y CALCULAR EL IVA//	
		
		String n1=JOptionPane.showInputDialog("introduce el precio de un producto");   //SE PIDE EL NUMERO EN JPANE
		float num1= Float.parseFloat(n1);    //PARA PODER INTRODUCIR DECIMALES
	
		final int IVA=21;	//FINAL PARA INTRODUCIR UN NUMERO QUE NO VARÍA//
		
		float resul=(num1+(num1*IVA/100));
		DecimalFormat formato=new DecimalFormat("#.##");    //ACOTA EL RESULTADO DECIMAL A UN NUMERO DETERMINADO DE DECIMALES
		
		System.out.println("Precio sin IVA---> " + n1+"€");
		System.out.println("IVA---> " +IVA+"%");
		System.out.println("Precio con IVA---> "+ formato.format(resul)+"€");

	}

}
