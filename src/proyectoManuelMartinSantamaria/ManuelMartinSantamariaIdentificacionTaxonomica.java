package proyectoManuelMartinSantamaria;

public class ManuelMartinSantamariaIdentificacionTaxonomica {
	private String familia, genero, hobby;
	public ManuelMartinSantamariaIdentificacionTaxonomica(String familia, String genero, String hobby) {
		this.familia = familia;
		this.genero = genero;
		this.hobby = hobby;
	}
	public void setFamilia(String familia) {
		this.familia = familia;
	}
	public String getFamilia() {
		return familia;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getGenero() {
		return genero;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getHobby() {
		return hobby;
	}
	@SuppressWarnings("unused")
	private void impimeNombreHobbyX1000() {
		for(int repeticion = 0; repeticion < 1000; repeticion++) {
			System.out.println(hobby);
		}
	}
}



