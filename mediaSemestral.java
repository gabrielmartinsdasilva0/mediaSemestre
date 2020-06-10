package primeiroProjeto;
import java.util.Scanner;
public class mediaSemestral {

	
		
		public static void main(String[] args) {
			
			Scanner sn =new Scanner(System.in);
			double prova,projeto,lista, maior=0,mediaT,total=0,menor=0;
			int i=0, al=2;
			double notasFim []= new double[al];
			int recuperacao=0, aprovado=0,reprovado=0;
			
			
			
			System.out.println("Programa de média Semestral\n");
			System.out.println("Digite a quantidade de alunos");
			al =sn.nextInt();
			for(i=0; i<al; i++){
			
			System.out.println("=======Vamos para o Primeiro Bimestre=======\n");
			System.out.println("Digite a nota da prova ");
			prova = sn.nextDouble();
			System.out.println("Digite a nota do projeto ");
			projeto = sn.nextDouble();
			System.out.println("Digite a nota da lista de exercicios");
			lista = sn.nextDouble();
			double media = ((prova*5)+(projeto*3)+(lista*2))/10;				////CALCULO DA MEDIA PRIMEIRO SEMESTRE
			
			
			System.out.println("=======Vamos para o Segundo Bimestre=======\n");
			System.out.println("Digite a nota da prova ");
			prova = sn.nextDouble();
			System.out.println("Digite a nota do projeto ");
			projeto = sn.nextDouble();
			System.out.println("Digite a nota da lista de exercicios");
			lista = sn.nextDouble();
			double media2 = ((prova*5)+(projeto*3)+(lista*2))/10;				//CALCULO DA MEDIA SEGUNDO SEMESTRE
			
			
			System.out.println("=======Vamos para o Terceiro Bimestre=======\n");
			System.out.println("Digite a nota da prova ");
			prova = sn.nextDouble();
			System.out.println("Digite a nota do projeto ");
			projeto = sn.nextDouble();
			System.out.println("Digite a nota da lista de exercicios");
			lista = sn.nextDouble();
			double media3 = ((prova*5)+(projeto*3)+(lista*2))/10;				//CALCULO DA MEDIA TERCEIRO SEMESTRE
			
			
			System.out.println("=======Vamos para o Quarto Bimestre=======\n");
			System.out.println("Digite a nota da prova ");
			prova = sn.nextDouble();
			System.out.println("Digite a nota do projeto ");
			projeto = sn.nextDouble();
			System.out.println("Digite a nota da lista de exercicios");
			lista = sn.nextDouble();
			double media4 = ((prova*5)+(projeto*3)+(lista*2))/10;			//CALCULO DA MEDIA QUARTO SEMESTRE
			
			
			
			double totalFim = (media+media2+media3+media4)/4;		//CALCULO DA MEDIA FINAL DE CADA ALUNO
			
			total += totalFim;										//ADICIONADO O VALOR PARA REALIZAR A CONTA
						
							
			notasFim[i] = totalFim;								//ARRAY PARA SEPARAR NOTAS
				
				if(totalFim <=7.9 && totalFim >=5) {
					recuperacao++;
				}else if(totalFim<5) {
					reprovado++;								//IF ELSE : APROVADOS,REPROVADOS,RECUPERAÇÃO
				}else { 
					aprovado++;
				}
				
				
				
				if(maior<notasFim[0]) {
						maior=notasFim[0];					// MAIOR MEDIA;
						}
					if(menor>notasFim[i]) {
						menor=notasFim[i];					//MENOR MEDIA
					}
					
					
				
					}//Final FOR
			
			mediaT=total/al;					//MEDIA GERAL
			
			
				
			
				System.out.println(aprovado + "  aluno(s) foram aprovados.");
				System.out.println(reprovado + " aluno(s) foram reprovados.");
				System.out.println(recuperacao + " aluno(s) entraram em recuperação.");
				System.out.println("Esta é a Maior média: "+maior);
				System.out.println("Esta é a Menor média: "+menor);  	
				System.out.println("A média Geral é " +mediaT);
				
				
			}
		}	
		
		

	
				
		
		
		
		
		








