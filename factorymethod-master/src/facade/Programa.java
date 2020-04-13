package facade;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Programa {
	/*
	 * Frequentemente precisamos ocultar um conjunto de classes com uma interface complexa
por trás de uma classe mais simples. Isso acontece, por exemplo, ao reutilizar código escrito
por outra equipe de programadores.
Escreva uma classe Java chamada IOFacade que simplifique o uso dos recursos de I/O do
Java com métodos para abrir arquivos texto, arquivos binários e objetos.
	 */
	public static void main(String[] args) {
		/* Para o exemplo funcionar você tem que ter um arquivo 'confidencial.txt' na
		 * raiz do projeto
		 */
		escreverObjeto();
		IOFacade ioFacade = new IOFacade();
		System.out.println("Arquivo texto: " + ioFacade.abrirTexto("confidencial.txt"));
		System.out.print("Arquivo binário (bytes lidos): ");
		for (byte b : ioFacade.abrirBinario("confidencial.txt")) {
			System.out.print(b + " ");
		};
		System.out.println("\nArquivo com objeto: " + ioFacade.abrirObjeto("aluno.obj"));
	}

	private static void escreverObjeto() {
		Aluno aluno = new Aluno(1, "Lili", 9.9);
		try {
			FileOutputStream fileOut = new FileOutputStream("aluno.obj");
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(aluno);
			objectOut.close();
		} catch (Exception ex) {
			System.out.println("Não foi possível escrever o objeto.");
			ex.printStackTrace();
		}
	}
}
