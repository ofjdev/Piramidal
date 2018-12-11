package piramidal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Nodo {
	
	private List<Nodo> hijos;
	private static String indentacionNivel = "--";
	private String nombre;
	private int numHijos;
	private float dineroPagado;
	private float dineroGanado;
	
	public Nodo() {
		hijos = new ArrayList<>();
	}
	
	public Nodo(String nombre) {
		this();
		this.nombre = nombre;
	}
	
	public Nodo(String nombre, int n) {
		this(nombre);
		for(int i=0; i < n; i++)
			hijos.add(new Nodo());
		numHijos = calculaNumHijos();
	}
	
	public Nodo(String nombre, Nodo... nodos) {
		this(nombre);
		for(Nodo nodo : nodos)
			hijos.add(nodo);
		numHijos = calculaNumHijos();
	}
	
	private int calculaNumHijos() {
		if(hijos == null)
			return 0;
		int suma = 0;
		for(Nodo hijo : hijos) {
			suma += hijo.calculaNumHijos();
		}
		return suma + 1;
	}
	
	private void printNodo(int nivelesPorEncima) {
		
		if(hijos != null && !hijos.isEmpty()) {
			String miIndentacion = "";
			for(int i=0; i < nivelesPorEncima; i++)
				miIndentacion += indentacionNivel;
			
			System.out.println(miIndentacion + nombre + "\t\t("+numHijos+" nodos, Gano "+( ( (float)((int)(dineroGanado*100)) ) / 100)+" €)");
			
			for(Nodo hijo : hijos)
				hijo.printNodo(nivelesPorEncima + 1);
		}
	}
	
	public void printNodo() {
		printNodo(0);
	}
	
	public void generaDineroPagado() {
		if(numHijos < 10)
			dineroPagado = 120;
		else dineroPagado = 0;
		
		for(Nodo hijo : hijos)
			hijo.generaDineroPagado();
	}
	
	public float comision() {
		if(numHijos < 5) return 0.03f;
		else if(numHijos < 10) return 0.05f;
		else if(numHijos < 15) return 0.07f;
		else if(numHijos < 20) return 0.09f;
		else if(numHijos < 25) return 0.11f;
		else if(numHijos < 30) return 0.13f;
		else if(numHijos < 40) return 0.15f;
		else if(numHijos < 50) return 0.17f;
		else if(numHijos < 60) return 0.20f;
		else if(numHijos < 70) return 0.23f;
		else if(numHijos < 80) return 0.26f;
		else if(numHijos < 100) return 0.29f;
		else if(numHijos < 130) return 0.33f;
		else if(numHijos < 160) return 0.37f;
		else if(numHijos < 200) return 0.41f;
		else if(numHijos < 250) return 0.45f;
		else if(numHijos < 300) return 0.50f;
		else return 0.60f;
	}
	
	public void calculaComisiones() {
		dineroGanado = 0;
		if(numHijos > 0) {
			for(Nodo hijo : hijos) {
				hijo.calculaComisiones();
				dineroGanado += comision() * (hijo.dineroGanado + hijo.dineroPagado);
			}
		}
	}

}
