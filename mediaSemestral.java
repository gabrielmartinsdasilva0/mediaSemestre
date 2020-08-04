package projetoIniciantes;
import java.util.Scanner;
public class mediaSemestral {

	
		
		public static void main(String[] args) {
			
			Scanner sn =new Scanner(System.in);
			double prova,projeto,lista, maior=0,mediaT,total=0,menor=0;
			int i=0, c=0,al=100;
			int recuperacao=0, aprovado=0,reprovado=0;
			double notasFinal []= new double[100];
			
			
			
			System.out.println("Programa de média Semestral\n");
			System.out.print("Digite a quantidade de alunos: ");
			al =sn.nextInt();
			
			
			for(i=1; i<al+1; i++){
				//CALCULO DA MEDIA PRIMEIRO SEMESTRE
			System.out.println("\n");
			System.out.println(i+"º aluno");
			System.out.print("=======Vamos para o Primeiro Bimestre=======\n");
			System.out.print("Digite a nota da prova:  ");
			prova = sn.nextDouble();
			System.out.print("Digite a nota do projeto:  ");
			projeto = sn.nextDouble();
			System.out.print("Digite a nota da lista de exercicios:  ");
			lista = sn.nextDouble();
			double media = ((prova*5)+(projeto*3)+(lista*2))/10;				
			
			
			//CALCULO DA MEDIA SEGUNDO SEMESTRE
			System.out.println("\n");
			System.out.print("=======Vamos para o Segundo Bimestre=======\n");
			System.out.print("Digite a nota da prova:  ");
			prova = sn.nextDouble();
			System.out.print("Digite a nota do projeto:  ");
			projeto = sn.nextDouble();
			System.out.print("Digite a nota da lista de exercicios: ");
			lista = sn.nextDouble();
			double media2 = ((prova*5)+(projeto*3)+(lista*2))/10;				
			
			//CALCULO DA MEDIA TERCEIRO SEMESTRE
			System.out.println("\n");
			System.out.print("=======Vamos para o Terceiro Bimestre=======\n");
			System.out.print("Digite a nota da prova:  ");
			prova = sn.nextDouble();
			System.out.print("Digite a nota do projeto:  ");
			projeto = sn.nextDouble();
			System.out.print("Digite a nota da lista de exercicios: ");
			lista = sn.nextDouble();
			double media3 = ((prova*5)+(projeto*3)+(lista*2))/10;				
			
			//CALCULO DA MEDIA QUARTO SEMESTRE
			System.out.println("\n");
			System.out.print("=======Vamos para o Quarto Bimestre=======\n");
			System.out.print("Digite a nota da prova:  ");
			prova = sn.nextDouble();
			System.out.print("Digite a nota do projeto:  ");
			projeto = sn.nextDouble();
			System.out.print("Digite a nota da lista de exercicios: ");
			lista = sn.nextDouble();
			double media4 = ((prova*5)+(projeto*3)+(lista*2))/10;			
			
			
			
			//CALCULO DA MEDIA FINAL DE CADA ALUNO
			double totalFim = (media+media2+media3+media4)/4;	
			total=total+totalFim;
			

			
			notasFinal[i]=totalFim;
			
			
						
			
			
			//IF ELSE : APROVADOS,REPROVADOS,RECUPERAÇÃO					
			   if(totalFim <=7.9 && totalFim >=5) {
					recuperacao++;
				}else if(totalFim<5) {
					reprovado++;							
				}else { 
					aprovado++;
				}
				
				
			// MAIOR MEDIA - MENOR MEDIA
			 
					
				
					}//Final FOR
			
			//MEDIA GERAL
			
			 maior=0;
			 menor=10;
			for( i=1; i<al+1; i++) {
			if(notasFinal[i]>maior) {
				maior=notasFinal[i];
		}
		if(notasFinal[i]<menor){ 
				menor=notasFinal[i];					
			}
			}
			
			
			//MEDIA GERAL
			mediaT=total/al;					
			
			
			    System.out.print("-------------------------------------------------------");
			    System.out.print("\n");
				System.out.println(aprovado + "  aluno(s) foram aprovados.");
				System.out.println(reprovado + " aluno(s) foram reprovados.");
				System.out.println(recuperacao + " aluno(s) entraram em recuperação.");
				System.out.println("Esta é a Maior média: "+maior);
				System.out.println("Esta é a Menor média: "+menor);  	
				System.out.println("A média Geral é " +mediaT);
				
				
			}
		}	
		
