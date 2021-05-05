import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

//Pesquisando sequencialmente um item em um array.

public class PesquisaLinear {

	// realiza uma pesquisa linear nos dados.
	public static int linearBusca(int data[], int buscaChave) {

		// faz um loop pelo array sequencialmente
		for (int indice = 0; indice < data.length; indice++)
			if (data[indice] == buscaChave)
				return indice; // retorna indice de inteiros
		return -1; // inteiro não foi localizado
	} // fim do metodo

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SecureRandom generator = new SecureRandom();

		int[] data = new int[20]; // cria o array

		for (int i = 0; i < data.length; i++) // preenche o array
			data[i] = 10 + generator.nextInt(90);

		System.out.printf("%s%n%n", Arrays.toString(data)); // exibe o array

		System.out.print("Digite um valor inteiro ou -1 para sair: "); // entrada de um inteiro pelo usuário
		int buscaInt = input.nextInt();

		// insere repetidamente um inteiro ou -1 termina o programa.
		while (buscaInt != -1) {
			int posicao = linearBusca(data, buscaInt); // realiza a pesquisa.

			// não encontrado
			if (posicao == -1) {
				System.out.printf("%d Não foi encontrado%n%n", buscaInt);
			} else {
				System.out.printf("%d Foi encontrado na posição %d%n%n", buscaInt, posicao);
			}

			System.out.print("Digite um valor inteiro ou -1 para sair:");
			buscaInt = input.nextInt();

		}

	}

}
