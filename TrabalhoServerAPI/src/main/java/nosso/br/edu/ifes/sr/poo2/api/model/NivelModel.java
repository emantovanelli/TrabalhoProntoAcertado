package nosso.br.edu.ifes.sr.poo2.api.model;

public enum NivelModel {
	FACIL (1), MEDIO (2), DIFICIL (3), MIX(0);
	
	private int valor;
	
	public int getValor()
	{
		return this.valor;
	}
	
	private NivelModel(int valor)
	{
		this.valor = valor;
	}
}
