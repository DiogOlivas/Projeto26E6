package projeto_POO;

import java.util.ArrayList;

public class Sensor {
	private int id;
	private int piso;
	private String tipo;
	private ArrayList<Leitura> leituras;
	private String zona;
	private String edificio;
	private String instituicao;
	/**
	 * @param nome
	 * @param piso
	 * @param tipo
	 * @param leituras
	 * @param zona
	 */
	public Sensor(int id, String tipo, String zona) {
		this.id = id;
		this.tipo = tipo;
		this.zona = zona;
		leituras = new ArrayList<Leitura>();
	}
	
	
	
	public int getId() {
		return id;
	}
	
	public String getZona() {
		return zona;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void setZona(String zona) {
		this.zona = zona;
	}

public void registrarLeitura(Leitura novaLeitura) {
		leituras.add(novaLeitura);
		
	}
	
	public void verLeituras() {
		for (Leitura l : leituras) {
			System.out.println(l.toString());
		}
		
	}
	
	
}
