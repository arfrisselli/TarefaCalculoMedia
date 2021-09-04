package tarefa.calculo.media;

public class CalculoMedia {

	public static void main(String[] args) {

		double nota1 = 8;
		double nota2 = 3.5;
		double nota3 = 7.5;
		double nota4 = 6;

		int bimestres = 4;

		double media = (nota1 + nota2 + nota3 + nota4) / bimestres;

		System.out.println("A sua média de notas é: " + media);

		if (media >= 7) {
			System.out.println("Parabéns! Você foi aprovado(a)!");

		} else {
			System.out.println("Você ficou de recuperação!");

		}
	}

}
