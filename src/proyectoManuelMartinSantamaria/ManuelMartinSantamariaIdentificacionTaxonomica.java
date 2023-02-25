package proyectoManuelMartinSantamaria;

public class ManuelMartinSantamariaIdentificacionTaxonomica {
	private String familia, genero, hobbie;
	public ManuelMartinSantamariaIdentificacionTaxonomica(String familia, String genero, String hobbie) {
		this.familia = familia;
		this.genero = genero;
		this.hobbie = hobbie;
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
}



