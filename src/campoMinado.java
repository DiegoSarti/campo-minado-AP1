//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.Random;
public class campoMinado
{
	public static void main(String[] args) {
	   //Scanner 
	    Scanner input = new Scanner(System.in);
	   	

		//menu do jogo 
		System.out.println("\r\n" + //
						" #######  #######  #     #  #######  #######           #     #     #     #     #  #######  ######   #######\r\n" + //
						" #        #     #  ##   ##  #     #  #     #           ##   ##     #     ##    #  #     #  #     #  #     #\r\n" + //
						" #        #######  # # # #  #######  #     #           # # # #     #     # ### #  #######  #     #  #     #\r\n" + //
						" #        #     #  #  #  #  #        #     #           #  #  #     #     #    ##  #     #  #     #  #     #\r\n" + //
						" #######  #     #  #     #  #        #######           #     #     #     #     #  #     #  ######   #######\r\n" + //
						"\r\n" + //
						"");
		System.out.println("1 - Começar o jogo");
		System.out.println("2 - Instruções");
		System.out.println("3 - Sair");
		System.out.print("Informe a opção: ");
		int opcao = input.nextInt();

		switch (opcao) {
			case 1:
			começarJogo();

			break;
			case 2:

			break;

			case 3:
			break;
			default:
			System.out.println("Opção invalida!");
			break;
		}	
		input.close();    
		
	}
	
	public static void começarJogo(){

		//Scanner 
	    Scanner input = new Scanner(System.in);
	    //random
        Random sorteio = new Random();

		
		//Variáveis do jogador, recebe a linha e coluna do jogador
	    int escolheLinha = 0;
	    int escolheColuna = 0;
	    int linhaMinas=0;
	    int colunaMinas=0;
	    
	    //inicia o a matriz Campo que será mostrador
	        int [][] campoExibir = new int [5][5];
	        int [][] campoMinas = new int [5][5];
	        
	          
	          ///testar minas.
	        
	       
	      // System.out.println("Minas|__________");
		    for(linhaMinas=0; linhaMinas<campoMinas.length;linhaMinas++){
		   // System.out.print(linhaMinas + "     | ");
		    for(colunaMinas=0;colunaMinas<campoMinas[linhaMinas].length;colunaMinas++){
		        
		        campoMinas[linhaMinas][colunaMinas] = sorteio.nextInt(4) + 1;
		        
		        
		      //  System.out.print(campoMinas[linhaMinas][colunaMinas] + " ");
		    }
		   // System.out.println(" ");
		}
        	//	System.out.println("        _________        ");
        	//	System.out.println("        0 1 2 3 4 Colunas");
	        
	        
	        
	        
	    
	       //for que exibe a matriz
	       System.out.println("**-----Campo Minado-----**");
	       System.out.println("**Escolha a linha e a coluna.**");
	       System.out.println("**Cuidado para não acertar uma mina.**");
	       
	       System.out.println("Linhas|__________");
		    for(int linha=0; linha<campoExibir.length;linha++){
		    System.out.print(linha + "     | ");
		    for(int coluna=0;coluna<campoExibir[linha].length;coluna++){
		        System.out.print(campoExibir[linha][coluna] + " ");
		    }
		    System.out.println(" ");
		}
        		System.out.println("        _________        ");
        		System.out.println("        0 1 2 3 4 Colunas");
        		
        		
	    
	    //Laço de repetição para mostrar o campo minado e atribuir valores
	do{
	            
	            
	            System.out.println("Informe a linha: ");
		        escolheLinha = input.nextInt();
		        System.out.println("Informe a coluna: ");
		        escolheColuna = input.nextInt();
		        
		                  //verifica se o jogador acertoua bom
        		            if(campoMinas[escolheLinha][escolheColuna] == 4){
        		                
        		                System.out.println("Bumm!");
        		                System.out.println("Você acertou a Mina!");
                                System.out.println();
								System.out.println("**Campo Minado***");
        		                System.out.println("Linha|__________");
		                        for(linhaMinas=0; linhaMinas<campoMinas.length;linhaMinas++){
		                       System.out.print(linhaMinas + "     | ");
		                        for(colunaMinas=0;colunaMinas<campoMinas[linhaMinas].length;colunaMinas++){
		                       System.out.print(campoMinas[linhaMinas][colunaMinas] + " ");
		                          }
		                        System.out.println(" ");
	                            	}
                                	System.out.println("        _________        ");
                                    System.out.println("        0 1 2 3 4 Colunas");
        		                break;
        		                
        		            }else{
        		               campoMinas[escolheLinha][escolheColuna] = 1;
        		               // System.out.println("Minas|__________");
		                        for(linhaMinas=0; linhaMinas<campoMinas.length;linhaMinas++){
		                       // System.out.print(linhaMinas + "     | ");
		                        for(colunaMinas=0;colunaMinas<campoMinas[linhaMinas].length;colunaMinas++){
		                       // System.out.print(campoMinas[linhaMinas][colunaMinas] + " ");
		                            }
		                            // System.out.println(" ");
	                            	}
        	                        //	System.out.println("        _________        ");
        	                        //	System.out.println("        0 1 2 3 4 Colunas");
        		                  }//fim if
	    
	    
	    
		                    System.out.println("Linhas|__________");
	                    	//for que exibe a matriz e adicona o numero 1 no campo de exibição
		                    for(int linha=0; linha<campoExibir.length;linha++){
		                    System.out.print(linha + "     | ");
		                    for(int coluna=0;coluna<campoExibir[linha].length;coluna++){
		        
		                    System.out.print(campoExibir[linha][coluna] + " ");
		                    campoExibir[escolheLinha][escolheColuna] = 1;
		        
		                    }
		                    System.out.println(" ");
		    
		    
		                    }//fim for
        		            System.out.println("        _________        ");
        		            System.out.println("        0 1 2 3 4 Colunas");
        		            
        		            
        		
	}while(true);
	input.close();

	}

}





















































































































































































































