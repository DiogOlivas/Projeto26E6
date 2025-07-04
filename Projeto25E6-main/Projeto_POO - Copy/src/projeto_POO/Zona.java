package projeto_POO;
import java.util.ArrayList;

public class Zona {
	private String nomeZona;
	private ArrayList<Sensor> sensores;
	
	public String getNomeZona() {
		return nomeZona;
	}

	public void setNomeZona(String nomeZona) {
		this.nomeZona = nomeZona;
	}

	public ArrayList<Sensor> getSensores() {
		return sensores;
	}

	public void setSensores(ArrayList<Sensor> sensores) {
		this.sensores = sensores;
	}

	public Zona(String nomeZona) {
		this.nomeZona = nomeZona;
		sensores = new ArrayList<Sensor>();
	}
	
	public void addSensor(Sensor novoSensor) {
		sensores.add(novoSensor);
	}
	
	 public void removerSensor(Sensor s) {
	        sensores.remove(s);
	    }
	
	public void verLeiturasZonas() {

		for (Sensor s : sensores) {
			s.verLeituras();
		}
	}
	
	public Sensor existeSensor(int idSensor) {
		for(Sensor s: sensores) {
			if(s.getId() == idSensor) {
				return s;
			}
		}
		return null;
	}
	
}
