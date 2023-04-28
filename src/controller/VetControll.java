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
		
		if(guardaValor > vet[tamanho]) //caso o valor guardado da ultima recursiva seja maior 
		{							   //que o valor guardado da recursiva em execucao
			return vet[tamanho];
		}
		else //Caso nao seja, ele retornara o valor normal, sendo o menor do vetor
		{
			return guardaValor;
		}
		
	}
}
