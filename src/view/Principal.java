package view;

import model.Aluno;

public class Principal {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();

//		a1.nota1 = 7.5f;
//		a1.nota2 = 6.3f;
//		a1.nota3 = 8.4f;
//		a1.presencas = 72;
//
//		float media = a1.getMedia();
//		String situacao = a1.getSituacao();
//
//		System.out.println(media);
//		System.out.println(situacao);
//
//		System.out.println("********************************");
//
//		Aluno a2 = new Aluno(3.4f, 5.2f, 2.1f, 64);
//		System.out.println(a2.getMedia());
//		System.out.println(a2.getSituacao());

		a1.setNota1(7.5f);
		a1.setNota2(6.3f);
		a1.setNota3(8.4f);
		a1.setPresencas(72);

		float media = a1.getMedia();
		String situacao = a1.getSituacao();

		System.out.println(media);
		System.out.println(situacao);

		Aluno a2 = new Aluno();
		a2.setNota1(3.4f);
		a2.setNota2(5.2f);
		a2.setNota3(2.1f);
		a2.setPresencas(64);

		media = a2.getMedia();
		situacao = a2.getSituacao();

		System.out.println(media);
		System.out.println(situacao);
	}
}
