package tarefa.calculo.media;

public class CalculoMedia {

	public static void main(String[] args) {

		double nota1 = 8;
		double nota2 = 3.5;
		double nota3 = 7.5;
		double nota4 = 6;

		int bimestres = 4;

		double media = (nota1 + nota2 + nota3 + nota4) / bimestres;

		System.out.println("A sua m�dia de notas �: " + media);

		if (media >= 7) {
			System.out.println("Parab�ns! Voc� foi aprovado(a)!");

		} else {
			System.out.println("Voc� ficou de recupera��o!");

		}
	}

}
