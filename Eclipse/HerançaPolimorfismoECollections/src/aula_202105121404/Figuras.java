package aula_202105121404;

public interface Figuras {
	
	public String nomeInterface = "Figuras";
	abstract public String getNome();
	abstract public void setNome(String Nome);
	public double getArea();
	public double getPerimetro();
	double getDiagonal();
	
	

}
