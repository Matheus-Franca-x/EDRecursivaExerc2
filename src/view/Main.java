package view;

import controller.VetControll;

public class Main {

	public static void main(String[] args) 
	{
		//a main, onde sera executado todo o processo para iniciar a recursiva
		
		int[] vet = {15, 53, 25, 23, 12}; // valores guardados
		
		VetControll vetControll = new VetControll();
		
		int test = vetControll.vetMenor(vet, vet.length - 1); //aplicacao dos valores de entrada
		
		System.out.println(test);
	}

}
