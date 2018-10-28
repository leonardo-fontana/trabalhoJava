import java.util.Scanner;
import java.util.Arrays;

	
public class ControleAcademico {
	
	// Inicialização
	public static void main(String[] args) {
		int numeroDeAlunos = 1;
		String nome[] = new String[100];
		double av1[] = new double[100];
		double av2[] = new double[100];
		int codigo = 0;
		int x = 0;		
		int z = av1[].lenght();
		double media; // média do aluno.
		media = 0;
		Scanner in = new Scanner(System.in);
		
		do {
		
			// Menu de opções para o usuário
			
			System.out.println("[1] Registrar as notas de um novo aluno.");
			System.out.println("[2] Consultar boletim de um aluno.");
			System.out.println("[3] Consultar notas da turma.");
			System.out.println("[4] Sair.");
			System.out.println("Digite o número da opção desejada.");
			x = in.nextInt(); //Ler a opção do usuário para então realizar uma das operações no menu.
			in.nextLine();
			
			switch (x) { //Escolha de uma das opções do menu.
					case 1:
						 
						 if (numeroDeAlunos <= 100) {
						//Registro do nome, nota do av1, nota do av2 e o codigo de registro.
						
							System.out.println("Digite o seu nome ");
							nome[numeroDeAlunos] = in.nextLine();
				 
				
							System.out.println("Digite a nota do seu Av1");
							av1[numeroDeAlunos] = in.nextDouble(); 
						
							System.out.println("Digite a nota do seu Av2");
							av2[numeroDeAlunos] = in.nextDouble();
							
							System.out.println("Seu código de registro é de: "+numeroDeAlunos+"");
							numeroDeAlunos++;
							break; 
						 }else{
							 System.out.println("Número máximo de registro alcançado");
						 }
					case 2:
						//Mostra o registro do aluno de acordo com o codigo digitado.
						System.out.println("Insira o seu código de registro:");
						codigo = in.nextInt(); //De acordo com o codigo irá mostrar o nome a notas correspondentes.
						System.out.println(""+nome[codigo]+"");
						System.out.println("Nota da primeira avaliação: "+av1[codigo]+"");
						System.out.println("Nota da segunda avaliação: "+av2[codigo]+"");
						media = (av1[codigo] + av2[codigo]) / 2; //Calcula a media
						
						if (media < 4) {
							System.out.println("Sua média é de "+media+"");
							System.out.println("Reprovado");
						}else if (media >= 4 && media < 7) {
							System.out.println("Sua média é de "+media+"");
							System.out.println("Em recuperação");
						}else  {
							System.out.println("Sua média é de "+media+"");
							System.out.println("Aprovado!");
						} 
				
						
					break;
			
					case 3:
					
							do {
   							    System.out.println("Aluno "+nome[codigo]+". Notas do av1 e av2: "+av1[codigo]+" e "+av2[codigo]+"");
								media = (av1[codigo] + av2[codigo]) / 2;
								
								if (media < 4) {
									System.out.println("Sua média é de "+media+"");
									System.out.println("Reprovado");
								}else if (media >= 4 && media < 7) {
									System.out.println("Sua média é de "+media+"");
									System.out.println("Em recuperação");
								}else  {
									System.out.println("Sua média é de "+media+"");
									System.out.println("Aprovado!");
								} 
							} while (av1[numeroDeAlunos] < av1.lenght);
						break;
					
					case 4:
					 
						System.out.println("Fechando  o programa.");
						break;
					
					default:
						System.out.println("Opção Invalida");
						break;
			}	
	


	



		}	while(x!= 4); //Caso o usuário digite "4", irá sair do programa, se não continuará a rodar o programa!	
	}
}	



