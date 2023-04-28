package controller;

public class VetControll 
{
	public VetControll()
	{
		super();
	}
	
	
	public int vetMenor(int[] vet, int tamanho) //inicio
	{
		
		if(tamanho == 0)
		{
			return vet[tamanho]; //esse seria o ultimo valor para retornar a recursiva
		}
		
		int guardaValor = vetMenor(vet, tamanho - 1); //ira guardar o valor do return anterior
		
		return guardaValor > vet[tamanho] ? vet[tamanho] : guardaValor;
		
		//caso o valor guardado da ultima recursiva seja maior que o valor guardado da recursiva em execucao
		//caso nao seja, ele retornara o valor normal, sendo o menor do vetor
	}
}
