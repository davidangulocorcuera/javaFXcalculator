package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Controller {
	@FXML
	private Label lblPantalla;
	@FXML
	private Button btnBorrar;
	@FXML
	private Button btnUno;
	@FXML
	private Button btnDos;
	@FXML
	private Button btnTres;
	@FXML
	private Button btnCuatro;
	@FXML
	private Button btnCinco;
	@FXML
	private Button btnSeis;
	@FXML
	private Button btnSiete;
	@FXML
	private Button btnOcho;
	@FXML
	private Button btnNueve;
	@FXML
	private Button btnSumar;
	@FXML
	private Button btnRestar;
	@FXML
	private Button btnMultiplicar;
	@FXML
	private Button btnDividir;
	@FXML
	private Button btnResultado;
	@FXML
	private Button btnComa;

	private StringBuilder numero = new StringBuilder();

	@FXML
	public void initialize() {

		// TODO (don't really need to do anything here).

	}

	public void igual() {
		String operacion = "";
		for (int i = 0; i < numero.length(); i++) {
			if (numero.charAt(i) == '+') {
				operacion = "sumar";
			} else if (numero.charAt(i) == '-') {
				operacion = "restar";
			} else if (numero.charAt(i) == 'x') {
				operacion = "multiplicar";
			} else if (numero.charAt(i) == '/') {
				operacion = "dividir";
			} else if (numero.charAt(i) == '%') {
				operacion = "porcentaje";
			}
		}
		//comprobamos cual es la operacion
		if (operacion.equals("sumar")) {
			// casteamos de StringBuilder str
			String numeroFinal = numero  + "";
			// dividimos el string en 2numeros separados por la operacion
			// como es un + hay que poner "//" antes
			String[] numeros = numeroFinal.split("\\+");
			// los convertimos en int
			double num1 = Double.parseDouble(numeros[0]);
			double num2 = Double.parseDouble(numeros[1]);
			double res = num1 + num2;
			StringBuilder resf = new StringBuilder(res + "");
			numero = new StringBuilder("");
			lblPantalla.setText(resf.toString());
			
		} else if (operacion.equals("restar")) {
			// casteamos de StringBuilder str
			String numeroFinal = numero  + "";
			System.out.println("1");
			// dividimos el string en 2numeros separados por la operacion
			// como es un + hay que poner "//" antes
			String[] numeros = numeroFinal.split("-");
			System.out.println("2");
			// los convertimos en int
			double num1 = Double.parseDouble(numeros[0]);
			double num2 = Double.parseDouble(numeros[1]);
			double res = num1 - num2;
			StringBuilder resf = new StringBuilder(res + "");
			numero = new StringBuilder("");
			lblPantalla.setText(resf.toString());

		} else if (operacion.equals("multiplicar")) {
			String numeroFinal = numero  + "";
			System.out.println("1");
			String[] numeros = numeroFinal.split("x");
			System.out.println("2");
			double num1 = Double.parseDouble(numeros[0]);
			double num2 = Double.parseDouble(numeros[1]);
			double res = num1 * num2;
			StringBuilder resf = new StringBuilder(res + "");
			numero = new StringBuilder("");
			lblPantalla.setText(resf.toString());

		} else if (operacion.equals("dividir")) {
			String numeroFinal = numero  + "";
			System.out.println("1");
			String[] numeros = numeroFinal.split("\\/");
			System.out.println("2");
			double num1 = Double.parseDouble(numeros[0]);
			double num2 = Double.parseDouble(numeros[1]);
			double res = num1 / num2;
			StringBuilder resf = new StringBuilder(res + "");
			numero = new StringBuilder("");
			lblPantalla.setText(resf.toString());

		} else if (operacion.equals("porcentaje")) {
						String numeroFinal = numero  + "";
						String[] numeros = numeroFinal.split("%");
						double num1 = Double.parseDouble(numeros[0]);
						double num2 = Double.parseDouble(numeros[1]);
						double res = (num1*100) /num2;
						StringBuilder resf = new StringBuilder(res + "");
						numero = new StringBuilder("");
						lblPantalla.setText(resf.toString());
		}
	}

	public void sumar() {
		int esta = 0;
		for (int i = 0; i < numero.length(); i++) {
			if (numero.charAt(i) == '+' || numero.charAt(i) == '-' || numero.charAt(i) == 'x'
					|| numero.charAt(i) == '/' || numero.charAt(i) == '%') {
				esta = 1;
			}
		}
		if (esta == 0) {
			String num = "+";
			numero.append(num);
			lblPantalla.setText(numero.toString());
		}
	}

	public void restar() {
		System.out.println("estoy aqui");
		int esta = 0;
		for (int i = 0; i < numero.length(); i++) {
			if (numero.charAt(i) == '+' || numero.charAt(i) == '-' || numero.charAt(i) == 'x'
					|| numero.charAt(i) == '/' || numero.charAt(i) == '%') {
				esta = 1;
			}
		}
		if (esta == 0) {
			String num = "-";
			numero.append(num);
			lblPantalla.setText(numero.toString());
		}

	}

	public void multiplicar() {
		int esta = 0;
		for (int i = 0; i < numero.length(); i++) {
			if (numero.charAt(i) == '+' || numero.charAt(i) == '-' || numero.charAt(i) == 'x'
					|| numero.charAt(i) == '/' || numero.charAt(i) == '%') {
				esta = 1;
			}
		}
		if (esta == 0) {
			String num = "x";
			numero.append(num);
			lblPantalla.setText(numero.toString());
		}
	}

	public void dividir() {
		int esta = 0;
		for (int i = 0; i < numero.length(); i++) {
			if (numero.charAt(i) == '+' || numero.charAt(i) == '-' || numero.charAt(i) == 'x'
					|| numero.charAt(i) == '/' || numero.charAt(i) == '%') {
				esta = 1;
			}
		}
		if (esta == 0) {
			String num = "/";
			numero.append(num);
			lblPantalla.setText(numero.toString());
		}
	}
	public void porcentaje() {
		int esta = 0;
		for (int i = 0; i < numero.length(); i++) {
			if (numero.charAt(i) == '+' || numero.charAt(i) == '-' || numero.charAt(i) == 'x'
					|| numero.charAt(i) == '/' || numero.charAt(i) == '%') {
				esta = 1;
			}
		}
		if (esta == 0) {
			String num = "%";
			numero.append(num);
			lblPantalla.setText(numero.toString());
		}
	}
	public void coma() {
		int esta = 0;
		for (int i = 0; i < numero.length(); i++) {
			if (numero.charAt(i) == '.') {
				esta = 1;
			}
		}
		if (esta == 0) {
			String num = ".";
			numero.append(num);
			lblPantalla.setText(numero.toString());
		}
	}
	public void borrar(ActionEvent event) {

		StringBuilder borrar = new StringBuilder("0");
		numero = new StringBuilder("");
		lblPantalla.setText(borrar.toString());
	}
	public void setCero(ActionEvent event) {
		String num = "0";
		numero.append(num);
		lblPantalla.setText(numero.toString());
	}
	public void setUno(ActionEvent event) {
		String num = "1";
		numero.append(num);
		lblPantalla.setText(numero.toString());
	}

	public void setDos(ActionEvent event) {
		String num = "2";
		numero.append(num);
		lblPantalla.setText(numero.toString());
	}

	public void setTres(ActionEvent event) {
		String num = "3";
		numero.append(num);
		lblPantalla.setText(numero.toString());
	}

	public void setCuatro(ActionEvent event) {
		String num = "4";
		numero.append(num);
		lblPantalla.setText(numero.toString());
	}

	public void setCinco(ActionEvent event) {
		String num = "5";
		numero.append(num);
		lblPantalla.setText(numero.toString());
	}

	public void setSeis(ActionEvent event) {
		String num = "6";
		numero.append(num);
		lblPantalla.setText(numero.toString());
	}

	public void setSiete(ActionEvent event) {
		String num = "7";
		numero.append(num);
		lblPantalla.setText(numero.toString());
	}

	public void setOcho(ActionEvent event) {
		String num = "8";
		numero.append(num);
		lblPantalla.setText(numero.toString());
	}

	public void setNueve(ActionEvent event) {
		String num = "9";
		numero.append(num);
		lblPantalla.setText(numero.toString());
	}

}
