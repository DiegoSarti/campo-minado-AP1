//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.Random;
public class campoMinado
{	
	// Main principal 
	public static void main(String[] args) {
		mostrarMenu();
	}




	public static void mostrarMenu(){
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
		System.out.println("3 - Créditos");
		System.out.println("4 - Sair");
		System.out.print("Informe a opção: ");
		int opcao = input.nextInt();

		switch (opcao) {
			case 1:
				começarJogo();
				break;
			case 2:
				mostrarTutorial();
				break;
			case 3:
				mostrarCreditos();
				break;
			case 4:
				System.out.println("Saindo do jogo...");
				break;
			default:
			System.out.println("Opção invalida!");
			break;
		}	
		input.close();    
		
	}

	public static void mostrarCreditos(){
	System.out.println("========== CREDITOS ===========");
	System.out.println("Desenvolvido por\nDiego Sarti\nLucas Soares\nRenato dos Santos");
	mostrarMenu();


	}
	
	public static void mostrarTutorial() {
    System.out.println("========== TUTORIAL DO CAMPO MINADO ==========");
    System.out.println("Seu objetivo é revelar todas as células do campo");
    System.out.println("que NÃO contêm minas. Use lógica e atenção!");
    System.out.println();
    System.out.println("Regras Básicas:");
    System.out.println("1️⃣ O campo é uma grade com várias células.");
    System.out.println("2️⃣ Algumas células escondem minas (💣).");
    System.out.println("3️⃣ Ao selecionar uma célula:");
    System.out.println("   ➤ Se houver uma mina: FIM DE JOGO!");
    System.out.println("   ➤ Se estiver vazia, será revelada.");
    System.out.println("   ➤ Se houver um número, ele indica quantas minas");
    System.out.println("      estão nas 8 células ao redor.");
    System.out.println();
    System.out.println("Comandos do jogo:");
    System.out.println("👉 Para REVELAR uma célula: informe a linha e a coluna.");
    System.out.println();
    System.out.println("Dicas:");
    System.out.println("- Comece revelando cantos ou áreas com mais espaço.");
    System.out.println("- Use os números revelados para deduzir onde estão as minas.");
    System.out.println("- Evite chutar! Use a lógica sempre que possível.");
    System.out.println();
    System.out.println("🎯 Vence o jogo quem revelar todas as células seguras!");
    System.out.println("===============================================");
    System.out.println("Boa sorte, e que sua mente seja mais afiada que as minas!");
	mostrarMenu();
}

	
	
	public static void começarJogo(){

		//Scanner 
	    Scanner input = new Scanner(System.in);
	    //random para escoler os números
        Random sorteio = new Random();

		
		//Variáveis do jogador, recebe a linha e coluna do jogador
	    int escolheLinha = 0;
	    int escolheColuna = 0;
	    int linhaMinas=0;
	    int colunaMinas=0;
		int tentativa = 0;
	    
	    //inicia o a matriz Campo que será mostrador
	        int [][] campoExibir = new int [5][5];
	        int [][] campoMinas = new int [5][5];
	        
	          
	    
		///testar minas, retirando o comentário o aparece o campo com as minas sorteadas     
	      // System.out.println("Minas|__________");
		    for(linhaMinas=0; linhaMinas<campoMinas.length;linhaMinas++){
		   // System.out.print(linhaMinas + "     | ");
		    for(colunaMinas=0;colunaMinas<campoMinas[linhaMinas].length;colunaMinas++){
		        
		        campoMinas[linhaMinas][colunaMinas] = sorteio.nextInt(4) + 1;
		        
		        
		      //  System.out.print(campoMinas[linhaMinas][colunaMinas] + " ");
		    }//fim for colunas
		   // System.out.println(" ");
		}//fim for linhas
        	//	System.out.println("        _________        ");
        	//	System.out.println("        0 1 2 3 4 Colunas");
	        
	
	
	//Encontra as bombas onde, corresponde ao núemro 4
		   
		   int minas = 0;
		   for(linhaMinas=0; linhaMinas<campoMinas.length;linhaMinas++){
		  
		   for(colunaMinas=0;colunaMinas<campoMinas[linhaMinas].length;colunaMinas++){
			   
			   if(campoMinas[linhaMinas][colunaMinas] == 4){
				   minas = minas + 1; 
				  }//fim do IF
			   }//fim for colunas
			   }//fim for linhas	   		   
	   //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	        System.out.println(minas);
	        
	    
	       //for que exibe a matriz

	       System.out.println("**-----Campo Minado-----**");
	       System.out.println("**Escolha a linha e a coluna.**");
	       System.out.println("**Cuidado para não acertar uma mina.**");
	       
	       System.out.println("Linhas|__________");
		    for(int linha=0; linha<campoExibir.length;linha++){
		    System.out.print(linha + "     | ");
		    for(int coluna=0;coluna<campoExibir[linha].length;coluna++){
		        System.out.print(campoExibir[linha][coluna] + " ");
		    }//fim for colunas
		    System.out.println(" ");
		}//fim for linhas
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
		                          }//fim for colunas
		                        System.out.println(" ");
	                            }//fim for linhas
                                	System.out.println("        _________        ");
                                    System.out.println("        0 1 2 3 4 Colunas");
        		                break;
        		                
        		            }else{
        		               campoMinas[escolheLinha][escolheColuna] = 1;
							   tentativa++;
        		              				 // System.out.println("Minas|__________");
		                        for(linhaMinas=0; linhaMinas<campoMinas.length;linhaMinas++){
		                      				 // System.out.print(linhaMinas + "     | ");
		                        for(colunaMinas=0;colunaMinas<campoMinas[linhaMinas].length;colunaMinas++){
											// System.out.print(campoMinas[linhaMinas][colunaMinas] + " ");
		                            }//fim for colunas
		                            		// System.out.println(" ");
	                            	}//fim for linhas
        	                        		//	System.out.println("        _________        ");
        	                       			 //	System.out.println("        0 1 2 3 4 Colunas");
        		                  }//fim else/if
	    
	    
	    
		                    System.out.println("Linhas|__________");
	                    	//for que exibe a matriz e adicona o numero 1 no campo de exibição
		                    for(int linha=0; linha<campoExibir.length;linha++){
		                    System.out.print(linha + "     | ");
		                    for(int coluna=0;coluna<campoExibir[linha].length;coluna++){
		                    System.out.print(campoExibir[linha][coluna] + " ");
		                    campoExibir[escolheLinha][escolheColuna] = 1;
		                    }//fim for colunas
		                    System.out.println(" ");
		                    }////fim for linhas
        		            System.out.println("        _________        ");
        		            System.out.println("        0 1 2 3 4 Colunas");
        		            
        		            
        		
	}while(tentativa < minas);
	input.close();

										//final do jogo no momento que o jogador terminou a roda.
													
										if(tentativa == minas){
											  	System.out.println();
								
												    System.out.println("");	
													System.out.println("");		
													System.out.println("Você conseguiu!! Não pisou em nenhuma mina!");
													System.out.println("Linha|__________");
											for(linhaMinas=0; linhaMinas<campoMinas.length;linhaMinas++){
													System.out.print(linhaMinas + "     | ");
											for(colunaMinas=0;colunaMinas<campoMinas[linhaMinas].length;colunaMinas++){
													System.out.print(campoMinas[linhaMinas][colunaMinas] + " ");
												}//fim for colunas
													System.out.println(" ");
												}//fim for linhas
													System.out.println("        _________        ");
													System.out.println("        0 1 2 3 4 Colunas");
											
										}//fim if
										mostrarMenu();
}//fim da void começar jogo

}//fim da classe jogo





















































































































































































































