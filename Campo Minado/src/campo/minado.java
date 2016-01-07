package campo;

import java.util.Random;
import javax.swing.JOptionPane;

public class minado extends javax.swing.JFrame {
    public minado() {
        initComponents();
    }
    
    int NumJogadas = 0 ;
    boolean Jogo = false; 
    int numeroBomb = 0;
    
   //*****************************FUNÇÕES*************************************//
    MatrizCampo[][] matriz = new MatrizCampo[8][8];
    
    public void Coloca(int n, int b){
        int i,j;
        
        /*Cria a matriz */
        
        for(i=0;i<n;i++){
            for(j=0;j<n;j++)
                matriz[i][j]= new MatrizCampo();
        }
        
        /*Sorteia as bombas */ 
        int cont = 0;
        int l,c;
        Random rand = new Random();
        
        while(cont < b){
            l = rand.nextInt(8);
            c = rand.nextInt(8);
            if(matriz[l][c].bomba == 0){
                matriz[l][c].bomba = 1;
                cont++;
            }
        }
        
        /*Imprimir a matriz para testes*/
        System.out.print("\n\n\n\n");
        for(i=0;i<n;i++){
            System.out.print("\n");
            for(j=0;j<n;j++)
                System.out.print(matriz[i][j].bomba+"\t");
        }
    }
    
    public boolean ContemBandeira(int l, int c){
        if(matriz[l][c].bandeira == 1)
            return true;
        return false;
    }
    
    public boolean ContemDuvida(int l, int c){
        if(matriz[l][c].duvida == 1)
            return true;
        return false;
    }
    
    public boolean ContemBomba(int l, int c){
        if(matriz[l][c].bomba == 1)
            return true;
        return false;
    }
    
    public boolean VerificaBomba(String escolha, int l, int c, int n){
        int i,j;
        
        if(escolha.equals("A") || escolha.equals("a")){
            matriz[l][c].aberto = 1;
            if(ContemBomba(l, c)){
                JOptionPane.showMessageDialog(null, "Um bomba foi encontrada, você perdeu!\nTente novamente.");
                Jogo = false;
                matriz[l][c].aberto = 1;
                for(i=0;i<n;i++){
                    for(j=0;j<n;j++)
                        if(ContemBomba(i, j)){
                            
                            /*Para mostrar as bombas quando perder*/
                            if(i == 0 && j == 0)
                                jButton0_0.setText("*");matriz[0][0].aberto = 1;
                            if(i == 0 && j == 1)
                                jButton0_1.setText("*");matriz[0][1].aberto = 1;
                            if(i == 0 && j == 2)
                                jButton0_2.setText("*");matriz[0][2].aberto = 1;
                            if(i == 0 && j == 3)
                                jButton0_3.setText("*");matriz[0][3].aberto = 1;
                            if(i == 0 && j == 4)
                                jButton0_4.setText("*");matriz[0][4].aberto = 1;
                            if(i == 0 && j == 5)
                                jButton0_5.setText("*");matriz[0][5].aberto = 1;
                            if(i == 0 && j == 6)
                                jButton0_6.setText("*");matriz[0][6].aberto = 1;
                            if(i == 0 && j == 7)
                                jButton0_7.setText("*");matriz[0][7].aberto = 1;
                            
                            if(i == 1 && j == 0)
                                jButton1_0.setText("*");matriz[1][0].aberto = 1;
                            if(i == 1 && j == 1)
                                jButton1_1.setText("*");matriz[1][1].aberto = 1;
                            if(i == 1 && j == 2)
                                jButton1_2.setText("*");matriz[1][2].aberto = 1;
                            if(i == 1 && j == 3)
                                jButton1_3.setText("*");matriz[1][6].aberto = 1;
                            if(i == 1 && j == 4)
                                jButton1_4.setText("*");matriz[1][4].aberto = 1;
                            if(i == 1 && j == 5)
                                jButton1_5.setText("*");matriz[1][5].aberto = 1;
                            if(i == 1 && j == 6)
                                jButton1_6.setText("*");matriz[1][6].aberto = 1;
                            if(i == 1 && j == 7)
                                jButton1_7.setText("*");matriz[1][7].aberto = 1;
                            
                            if(i == 2 && j == 0)
                                jButton2_0.setText("*");matriz[2][0].aberto = 1;
                            if(i == 2 && j == 1)
                                jButton2_1.setText("*");matriz[2][1].aberto = 1;
                            if(i == 2 && j == 2)
                                jButton2_2.setText("*");matriz[2][2].aberto = 1;
                            if(i == 2 && j == 3)
                                jButton2_3.setText("*");matriz[2][3].aberto = 1;
                            if(i == 2 && j == 4)
                                jButton2_4.setText("*");matriz[2][4].aberto = 1;
                            if(i == 2 && j == 5)
                                jButton2_5.setText("*");matriz[2][5].aberto = 1;
                            if(i == 2 && j == 6)
                                jButton2_6.setText("*");matriz[2][6].aberto = 1;
                            if(i == 2 && j == 7)
                                jButton2_7.setText("*");matriz[2][7].aberto = 1;
                            
                            if(i == 3 && j == 0)
                                jButton3_0.setText("*");matriz[3][0].aberto = 1;
                            if(i == 3 && j == 1)
                                jButton3_1.setText("*");matriz[3][1].aberto = 1;
                            if(i == 3 && j == 2)
                                jButton3_2.setText("*");matriz[3][2].aberto = 1;
                            if(i == 3 && j == 3)
                                jButton3_3.setText("*");matriz[3][3].aberto = 1;
                            if(i == 3 && j == 4)
                                jButton3_4.setText("*");matriz[3][4].aberto = 1;
                            if(i == 3 && j == 5)
                                jButton3_5.setText("*");matriz[3][5].aberto = 1;
                            if(i == 3 && j == 6)
                                jButton3_6.setText("*");matriz[3][6].aberto = 1;
                            if(i == 3 && j == 7)
                                jButton3_7.setText("*");matriz[3][7].aberto = 1;
                            
                            if(i == 4 && j == 0)
                                jButton4_0.setText("*");matriz[4][0].aberto = 1;
                            if(i == 4 && j == 1)
                                jButton4_1.setText("*");matriz[4][1].aberto = 1;
                            if(i == 4 && j == 2)
                                jButton4_2.setText("*");matriz[4][2].aberto = 1;
                            if(i == 4 && j == 3)
                                jButton4_3.setText("*");matriz[4][3].aberto = 1;
                            if(i == 4 && j == 4)
                                jButton4_4.setText("*");matriz[4][4].aberto = 1;
                            if(i == 4 && j == 5)
                                jButton4_5.setText("*");matriz[4][5].aberto = 1;
                            if(i == 4 && j == 6)
                                jButton4_6.setText("*");matriz[4][6].aberto = 1;
                            if(i == 4 && j == 7)
                                jButton4_7.setText("*");matriz[4][7].aberto = 1;
                            
                            if(i == 5 && j == 0)
                                jButton5_0.setText("*");matriz[5][0].aberto = 1;
                            if(i == 5 && j == 1)
                                jButton5_1.setText("*");matriz[5][1].aberto = 1;
                            if(i == 5 && j == 2)
                                jButton5_2.setText("*");matriz[5][2].aberto = 1;
                            if(i == 5 && j == 3)
                                jButton5_3.setText("*");matriz[5][3].aberto = 1;
                            if(i == 5 && j == 4)
                                jButton5_4.setText("*");matriz[5][4].aberto = 1;
                            if(i == 5 && j == 5)
                                jButton5_5.setText("*");matriz[5][5].aberto = 1;
                            if(i == 5 && j == 6)
                                jButton5_6.setText("*");matriz[5][6].aberto = 1;
                            if(i == 5 && j == 7)
                                jButton5_7.setText("*");matriz[5][7].aberto = 1;
                            
                            if(i == 6 && j == 0)
                                jButton6_0.setText("*");matriz[6][0].aberto = 1;
                            if(i == 6 && j == 1)
                                jButton6_1.setText("*");matriz[6][1].aberto = 1;
                            if(i == 6 && j == 2)
                                jButton6_2.setText("*");matriz[6][2].aberto = 1;
                            if(i == 6 && j == 3)
                                jButton6_3.setText("*");matriz[6][3].aberto = 1;
                            if(i == 6 && j == 4)
                                jButton6_4.setText("*");matriz[6][4].aberto = 1;
                            if(i == 6 && j == 5)
                                jButton6_5.setText("*");matriz[6][5].aberto = 1;
                            if(i == 6 && j == 6)
                                jButton6_6.setText("*");matriz[6][6].aberto = 1;
                            if(i == 6 && j == 7)
                                jButton6_7.setText("*");matriz[6][7].aberto = 1;
                            
                            if(i == 7 && j == 0)
                                jButton7_0.setText("*");matriz[7][0].aberto = 1;
                            if(i == 7 && j == 1)
                                jButton7_1.setText("*");matriz[7][1].aberto = 1;
                            if(i == 7 && j == 2)
                                jButton7_2.setText("*");matriz[7][2].aberto = 1;
                            if(i == 7 && j == 3)
                                jButton7_3.setText("*");matriz[7][3].aberto = 1;
                            if(i == 7 && j == 4)
                                jButton7_4.setText("*");matriz[7][4].aberto = 1;
                            if(i == 7 && j == 5)
                                jButton7_5.setText("*");matriz[7][5].aberto = 1;
                            if(i == 7 && j == 6)
                                jButton7_6.setText("*");matriz[7][6].aberto = 1;
                            if(i == 7 && j == 7)
                                jButton7_7.setText("*");matriz[7][7].aberto = 1;
                        }
                }
                return true;
            }
        }
        return false;
    }
    
    public void verificaSeTiver(int i, int j, int Conta_bomba){
        if(i == 0 && j == 0)
            jButton0_0.setText(""+Conta_bomba);
        if(i == 0 && j == 1)
            jButton0_1.setText(""+Conta_bomba);
        if(i == 0 && j == 2)
            jButton0_2.setText(""+Conta_bomba);
        if(i == 0 && j == 3)
            jButton0_3.setText(""+Conta_bomba);
        if(i == 0 && j == 4)
            jButton0_4.setText(""+Conta_bomba);
        if(i == 0 && j == 5)
            jButton0_5.setText(""+Conta_bomba);
        if(i == 0 && j == 6)
            jButton0_6.setText(""+Conta_bomba);
        if(i == 0 && j == 7)
            jButton0_7.setText(""+Conta_bomba);

        if(i == 1 && j == 0)
            jButton1_0.setText(""+Conta_bomba);
        if(i == 1 && j == 1)
            jButton1_1.setText(""+Conta_bomba);
        if(i == 1 && j == 2)
            jButton1_2.setText(""+Conta_bomba);
        if(i == 1 && j == 3)
            jButton1_3.setText(""+Conta_bomba);
        if(i == 1 && j == 4)
            jButton1_4.setText(""+Conta_bomba);
        if(i == 1 && j == 5)
            jButton1_5.setText(""+Conta_bomba);
        if(i == 1 && j == 6)
            jButton1_6.setText(""+Conta_bomba);
        if(i == 1 && j == 7)
            jButton1_7.setText(""+Conta_bomba);

        if(i == 2 && j == 0)
            jButton2_0.setText(""+Conta_bomba);
        if(i == 2 && j == 1)
            jButton2_1.setText(""+Conta_bomba);
        if(i == 2 && j == 2)
            jButton2_2.setText(""+Conta_bomba);
        if(i == 2 && j == 3)
            jButton2_3.setText(""+Conta_bomba);
        if(i == 2 && j == 4)
            jButton2_4.setText(""+Conta_bomba);
        if(i == 2 && j == 5)
            jButton2_5.setText(""+Conta_bomba);
        if(i == 2 && j == 6)
            jButton2_6.setText(""+Conta_bomba);
        if(i == 2 && j == 7)
            jButton2_7.setText(""+Conta_bomba);

        if(i == 3 && j == 0)
            jButton3_0.setText(""+Conta_bomba);
        if(i == 3 && j == 1)
            jButton3_1.setText(""+Conta_bomba);
        if(i == 3 && j == 2)
            jButton3_2.setText(""+Conta_bomba);
        if(i == 3 && j == 3)
            jButton3_3.setText(""+Conta_bomba);
        if(i == 3 && j == 4)
            jButton3_4.setText(""+Conta_bomba);
        if(i == 3 && j == 5)
            jButton3_5.setText(""+Conta_bomba);
        if(i == 3 && j == 6)
            jButton3_6.setText(""+Conta_bomba);
        if(i == 3 && j == 7)
            jButton3_7.setText(""+Conta_bomba);

        if(i == 4 && j == 0)
            jButton4_0.setText(""+Conta_bomba);
        if(i == 4 && j == 1)
            jButton4_1.setText(""+Conta_bomba);
        if(i == 4 && j == 2)
            jButton4_2.setText(""+Conta_bomba);
        if(i == 4 && j == 3)
            jButton4_3.setText(""+Conta_bomba);
        if(i == 4 && j == 4)
            jButton4_4.setText(""+Conta_bomba);
        if(i == 4 && j == 5)
            jButton4_5.setText(""+Conta_bomba);
        if(i == 4 && j == 6)
            jButton4_6.setText(""+Conta_bomba);
        if(i == 4 && j == 7)
            jButton4_7.setText(""+Conta_bomba);

        if(i == 5 && j == 0)
            jButton5_0.setText(""+Conta_bomba);
        if(i == 5 && j == 1)
            jButton5_1.setText(""+Conta_bomba);
        if(i == 5 && j == 2)
            jButton5_2.setText(""+Conta_bomba);
        if(i == 5 && j == 3)
            jButton5_3.setText(""+Conta_bomba);
        if(i == 5 && j == 4)
            jButton5_4.setText(""+Conta_bomba);
        if(i == 5 && j == 5)
            jButton5_5.setText(""+Conta_bomba);
        if(i == 5 && j == 6)
            jButton5_6.setText(""+Conta_bomba);
        if(i == 5 && j == 7)
            jButton5_7.setText(""+Conta_bomba);

        if(i == 6 && j == 0)
            jButton6_0.setText(""+Conta_bomba);
        if(i == 6 && j == 1)
            jButton6_1.setText(""+Conta_bomba);
        if(i == 6 && j == 2)
            jButton6_2.setText(""+Conta_bomba);
        if(i == 6 && j == 3)
            jButton6_3.setText(""+Conta_bomba);
        if(i == 6 && j == 4)
            jButton6_4.setText(""+Conta_bomba);
        if(i == 6 && j == 5)
            jButton6_5.setText(""+Conta_bomba);
        if(i == 6 && j == 6)
            jButton6_6.setText(""+Conta_bomba);
        if(i == 6 && j == 7)
            jButton6_7.setText(""+Conta_bomba);

        if(i == 7 && j == 0)
            jButton7_0.setText(""+Conta_bomba);
        if(i == 7 && j == 1)
            jButton7_1.setText(""+Conta_bomba);
        if(i == 7 && j == 2)
            jButton7_2.setText(""+Conta_bomba);
        if(i == 7 && j == 3)
            jButton7_3.setText(""+Conta_bomba);
        if(i == 7 && j == 4)
            jButton7_4.setText(""+Conta_bomba);
        if(i == 7 && j == 5)
            jButton7_5.setText(""+Conta_bomba);
        if(i == 7 && j == 6)
            jButton7_6.setText(""+Conta_bomba);
        if(i == 7 && j == 7)
            jButton7_7.setText(""+Conta_bomba);
    }
    
    
    public void nubombas(int l, int c, int le, int ce){//funcao que conta o numero de bombas adjacentes a posicao escolhida
	int contbomba = 0;// 3  3      1        1

	if(le>=0 && le<l && ce-1>=0 && ce-1<c){
		if(ContemBomba(le, ce-1)){
			contbomba++;
		}
	}
	if(le-1>=0 && le-1<l && ce-1>=0 && ce-1<c){
		if(ContemBomba(le-1, ce-1)){
			contbomba++;
		}
	}
	if(le-1>=0 && le-1<l && ce>=0 && ce<c){
		if(ContemBomba(le-1, ce)){
			contbomba++;
		}
	}
	if(le-1>=0 && le-1<l && ce+1>=0 && ce+1<c){
		if(ContemBomba(le-1, ce+1)){
			contbomba++;
		}
	}
	if(le>=0 && le<l && ce+1>=0 && ce+1<c){
		if(ContemBomba(le, ce+1)){
			contbomba++;
		}
	}
	if(le+1>=0 && le+1<l && ce+1>=0 && ce+1<c){
		if(ContemBomba(le+1, ce+1)){
			contbomba++;
		}
	}
	if(le+1>=0 && le+1<l && ce>=0 && ce<c){
		if(ContemBomba(le+1, ce)){
			contbomba++;
		}
	}
	if(le+1>=0 && le+1<l && ce-1>=0 && ce-1<c){
		if(ContemBomba(le+1, ce-1)){
			contbomba++;
		}
	}
	verificaSeTiver(le, ce, contbomba);
        
        /*
        nubombas(l, c, le, ce-1);
        nubombas(l, c, le-1, ce-1);
        nubombas(l, c, le-1, ce);
        nubombas(l, c, le-1, ce+1);
        nubombas(l, c, le, ce+1);
        nubombas(l, c, le+1, ce+1);
        nubombas(l, c, le+1, ce);
        nubombas(l, c, le+1, ce-1);*/
        /*
        if(le>=0 && le<l && ce-1>=0 && ce-1<c){
		if(!ContemBomba(le, ce-1)){
			verificaSeTiver(le, ce-1, 0);
		}
	}
	if(le-1>=0 && le-1<l && ce-1>=0 && ce-1<c){
		if(!ContemBomba(le-1, ce-1)){
			verificaSeTiver(le-1, ce-1, 0);
		}
	}
	if(le-1>=0 && le-1<l && ce>=0 && ce<c){
		if(!ContemBomba(le-1, ce)){
			verificaSeTiver(le-1, ce, 0);
		}
	}
	if(le-1>=0 && le-1<l && ce+1>=0 && ce+1<c){
		if(!ContemBomba(le-1, ce+1)){
			verificaSeTiver(le-1, ce+1, 0);
		}
	}
	if(le>=0 && le<l && ce+1>=0 && ce+1<c){
		if(!ContemBomba(le, ce+1)){
			verificaSeTiver(le, ce+1, 0);
		}
	}
	if(le+1>=0 && le+1<l && ce+1>=0 && ce+1<c){
		if(!ContemBomba(le+1, ce+1)){
			verificaSeTiver(le+1, ce+1, 0);
		}
	}
	if(le+1>=0 && le+1<l && ce>=0 && ce<c){
		if(!ContemBomba(le+1, ce)){
			verificaSeTiver(le+1, ce, 0);
		}
	}
	if(le+1>=0 && le+1<l && ce-1>=0 && ce-1<c){
		if(!ContemBomba(le+1, ce-1)){
			verificaSeTiver(le+1, ce-1, 0);
		}
	}*/
    }
    
    public void Ganhou(int n){//verificar se todas as opções que tem bomba nao foram abertas...
        int contador = 0;
        int contador_bandeira = 0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!ContemBomba(i, j)){
                    if(i == 0 && j == 0 && !jButton0_0.getText().equals(""))
                        contador++;
                    else if(i == 0 && j == 1 && !jButton0_1.getText().equals(""))
                        contador++;
                    else if(i == 0 && j == 2 && !jButton0_2.getText().equals(""))
                        contador++;
                    else if(i == 0 && j == 3 && !jButton0_3.getText().equals(""))
                        contador++;
                    else if(i == 0 && j == 4 && !jButton0_4.getText().equals(""))
                        contador++;
                    else if(i == 0 && j == 5 && !jButton0_5.getText().equals(""))
                        contador++;
                    else if(i == 0 && j == 6 && !jButton0_6.getText().equals(""))
                        contador++;
                    else if(i == 0 && j == 7 && !jButton0_7.getText().equals(""))
                        contador++;

                    else if(i == 1 && j == 0 && !jButton1_0.getText().equals(""))
                        contador++;
                    else if(i == 1 && j == 1 && !jButton1_1.getText().equals(""))
                        contador++;
                    else if(i == 1 && j == 2 && !jButton1_2.getText().equals(""))
                        contador++;
                    else if(i == 1 && j == 3 && !jButton1_3.getText().equals(""))
                        contador++;
                    else if(i == 1 && j == 4 && !jButton1_4.getText().equals(""))
                        contador++;
                    else if(i == 1 && j == 5 && !jButton1_5.getText().equals(""))
                        contador++;
                    else if(i == 1 && j == 6 && !jButton1_6.getText().equals(""))
                        contador++;
                    else if(i == 1 && j == 7 && !jButton1_7.getText().equals(""))
                        contador++; 

                    else if(i == 2 && j == 0 && !jButton2_0.getText().equals(""))
                        contador++;
                    else if(i == 2 && j == 1 && !jButton2_1.getText().equals(""))
                        contador++;
                    else if(i == 2 && j == 2 && !jButton2_2.getText().equals(""))
                        contador++;
                    else if(i == 2 && j == 3 && !jButton2_3.getText().equals(""))
                        contador++;
                    else if(i == 2 && j == 4 && !jButton2_4.getText().equals(""))
                        contador++;
                    else if(i == 2 && j == 5 && !jButton2_5.getText().equals(""))
                        contador++;
                    else if(i == 2 && j == 6 && !jButton2_6.getText().equals(""))
                        contador++;
                    else if(i == 2 && j == 7 && !jButton2_7.getText().equals(""))
                        contador++;

                    else if(i == 3 && j == 0 && !jButton3_0.getText().equals(""))
                        contador++;
                    else if(i == 3 && j == 1 && !jButton3_1.getText().equals(""))
                        contador++;
                    else if(i == 3 && j == 2 && !jButton3_2.getText().equals(""))
                        contador++;
                    else if(i == 3 && j == 3 && !jButton3_3.getText().equals(""))
                        contador++;
                    else if(i == 3 && j == 4 && !jButton3_4.getText().equals(""))
                        contador++;
                    else if(i == 3 && j == 5 && !jButton3_5.getText().equals(""))
                        contador++;
                    else if(i == 3 && j == 6 && !jButton3_6.getText().equals(""))
                        contador++;
                    else if(i == 3 && j == 7 && !jButton3_7.getText().equals(""))
                        contador++;

                    else if(i == 4 && j == 0 && !jButton4_0.getText().equals(""))
                        contador++;
                    else if(i == 4 && j == 1 && !jButton4_1.getText().equals(""))
                        contador++;
                    else if(i == 4 && j == 2 && !jButton4_2.getText().equals(""))
                        contador++;
                    else if(i == 4 && j == 3 && !jButton4_3.getText().equals(""))
                        contador++;
                    else if(i == 4 && j == 4 && !jButton4_4.getText().equals(""))
                        contador++;
                    else if(i == 4 && j == 5 && !jButton4_5.getText().equals(""))
                        contador++;
                    else if(i == 4 && j == 6 && !jButton4_6.getText().equals(""))
                        contador++;
                    else if(i == 4 && j == 7 && !jButton4_7.getText().equals(""))
                        contador++;

                    else if(i == 5 && j == 0 && !jButton5_0.getText().equals(""))
                        contador++;
                    else if(i == 5 && j == 1 && !jButton5_1.getText().equals(""))
                        contador++;
                    else if(i == 5 && j == 2 && !jButton5_2.getText().equals(""))
                        contador++;
                    else if(i == 5 && j == 3 && !jButton5_3.getText().equals(""))
                        contador++;
                    else if(i == 5 && j == 4 && !jButton5_4.getText().equals(""))
                        contador++;
                    else if(i == 5 && j == 5 && !jButton5_5.getText().equals(""))
                        contador++;
                    else if(i == 5 && j == 6 && !jButton5_6.getText().equals(""))
                        contador++;
                    else if(i == 5 && j == 7 && !jButton5_7.getText().equals(""))
                        contador++;

                    else if(i == 6 && j == 0 && !jButton6_0.getText().equals(""))
                        contador++;
                    else if(i == 6 && j == 1 && !jButton6_1.getText().equals(""))
                        contador++;
                    else if(i == 6 && j == 2 && !jButton6_2.getText().equals(""))
                        contador++;
                    else if(i == 6 && j == 3 && !jButton6_3.getText().equals(""))
                        contador++;
                    else if(i == 6 && j == 4 && !jButton6_4.getText().equals(""))
                        contador++;
                    else if(i == 6 && j == 5 && !jButton6_5.getText().equals(""))
                        contador++;
                    else if(i == 6 && j == 6 && !jButton6_6.getText().equals(""))
                        contador++;
                    else if(i == 6 && j == 7 && !jButton6_7.getText().equals(""))
                        contador++;

                    else if(i == 7 && j == 0 && !jButton7_0.getText().equals(""))
                        contador++;
                    else if(i == 7 && j == 1 && !jButton7_1.getText().equals(""))
                        contador++;
                    else if(i == 7 && j == 2 && !jButton7_2.getText().equals(""))
                        contador++;
                    else if(i == 7 && j == 3 && !jButton7_3.getText().equals(""))
                        contador++;
                    else if(i == 7 && j == 4 && !jButton7_4.getText().equals(""))
                        contador++;
                    else if(i == 7 && j == 5 && !jButton7_5.getText().equals(""))
                        contador++;
                    else if(i == 7 && j == 6 && !jButton7_6.getText().equals(""))
                        contador++;
                    else if(i == 7 && j == 7 && !jButton7_7.getText().equals(""))
                        contador++;
                }
                /*verifica se colocou as bandeiras em todas as bombas*/
                else if(ContemBomba(i, j)){
                    if(i == 0 && j == 0 && (jButton0_0.getText().equals("B") || jButton0_0.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 0 && j == 1 && (jButton0_1.getText().equals("B") || jButton0_1.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 0 && j == 2 && (jButton0_2.getText().equals("B") || jButton0_2.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 0 && j == 3 && (jButton0_3.getText().equals("B") || jButton0_3.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 0 && j == 4 && (jButton0_4.getText().equals("B") || jButton0_4.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 0 && j == 5 && (jButton0_5.getText().equals("B") || jButton0_5.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 0 && j == 6 && (jButton0_6.getText().equals("B") || jButton0_6.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 0 && j == 7 && (jButton0_7.getText().equals("B") || jButton0_7.getText().equals("b")))
                        contador_bandeira++;

                    else if(i == 1 && j == 0 && (jButton1_0.getText().equals("B") || jButton1_0.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 1 && j == 1 && (jButton1_1.getText().equals("B") || jButton1_1.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 1 && j == 2 && (jButton1_2.getText().equals("B") || jButton1_2.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 1 && j == 3 && (jButton1_3.getText().equals("B") || jButton1_3.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 1 && j == 4 && (jButton1_4.getText().equals("B") || jButton1_4.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 1 && j == 5 && (jButton1_5.getText().equals("B") || jButton1_5.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 1 && j == 6 && (jButton1_6.getText().equals("B") || jButton1_6.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 1 && j == 7 && (jButton1_7.getText().equals("B") || jButton1_7.getText().equals("b")))
                        contador_bandeira++; 

                    else if(i == 2 && j == 0 && (jButton2_0.getText().equals("B") || jButton2_0.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 2 && j == 1 && (jButton2_1.getText().equals("B") || jButton2_1.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 2 && j == 2 && (jButton2_2.getText().equals("B") || jButton2_2.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 2 && j == 3 && (jButton2_3.getText().equals("B") || jButton2_3.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 2 && j == 4 && (jButton2_4.getText().equals("B") || jButton2_4.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 2 && j == 5 && (jButton2_5.getText().equals("B") || jButton2_5.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 2 && j == 6 && (jButton2_6.getText().equals("B") || jButton2_6.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 2 && j == 7 && (jButton2_7.getText().equals("B") || jButton2_7.getText().equals("b")))
                        contador_bandeira++;

                    else if(i == 3 && j == 0 && (jButton3_0.getText().equals("B") || jButton3_0.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 3 && j == 1 && (jButton3_1.getText().equals("B") || jButton3_1.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 3 && j == 2 && (jButton3_2.getText().equals("B") || jButton3_2.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 3 && j == 3 && (jButton3_3.getText().equals("B") || jButton3_3.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 3 && j == 4 && (jButton3_4.getText().equals("B") || jButton3_4.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 3 && j == 5 && (jButton3_5.getText().equals("B") || jButton3_5.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 3 && j == 6 && (jButton3_6.getText().equals("B") || jButton3_6.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 3 && j == 7 && (jButton3_7.getText().equals("B") || jButton3_7.getText().equals("b")))
                        contador_bandeira++;

                    else if(i == 4 && j == 0 && (jButton4_0.getText().equals("B") || jButton4_0.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 4 && j == 1 && (jButton4_1.getText().equals("B") || jButton4_1.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 4 && j == 2 && (jButton4_2.getText().equals("B") || jButton4_2.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 4 && j == 3 && (jButton4_3.getText().equals("B") || jButton4_3.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 4 && j == 4 && (jButton4_4.getText().equals("B") || jButton4_4.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 4 && j == 5 && (jButton4_5.getText().equals("B") || jButton4_5.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 4 && j == 6 && (jButton4_6.getText().equals("B") || jButton4_6.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 4 && j == 7 && (jButton4_7.getText().equals("B") || jButton4_7.getText().equals("b")))
                        contador_bandeira++;

                    else if(i == 5 && j == 0 && (jButton5_0.getText().equals("B") || jButton5_0.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 5 && j == 1 && (jButton5_1.getText().equals("B") || jButton5_1.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 5 && j == 2 && (jButton5_2.getText().equals("B") || jButton5_2.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 5 && j == 3 && (jButton5_3.getText().equals("B") || jButton5_3.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 5 && j == 4 && (jButton5_4.getText().equals("B") || jButton5_4.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 5 && j == 5 && (jButton5_5.getText().equals("B") || jButton5_5.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 5 && j == 6 && (jButton5_6.getText().equals("B") || jButton5_6.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 5 && j == 7 && (jButton5_7.getText().equals("B") || jButton5_7.getText().equals("b")))
                        contador_bandeira++;

                    else if(i == 6 && j == 0 && (jButton6_0.getText().equals("B") || jButton6_0.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 6 && j == 1 && (jButton6_1.getText().equals("B") || jButton6_1.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 6 && j == 2 && (jButton6_2.getText().equals("B") || jButton6_2.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 6 && j == 3 && (jButton6_3.getText().equals("B") || jButton6_3.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 6 && j == 4 && (jButton6_4.getText().equals("B") || jButton6_4.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 6 && j == 5 && (jButton6_5.getText().equals("B") || jButton6_5.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 6 && j == 6 && (jButton6_6.getText().equals("B") || jButton6_6.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 6 && j == 7 && (jButton6_7.getText().equals("B") || jButton6_7.getText().equals("b")))
                        contador_bandeira++;

                    else if(i == 7 && j == 0 && (jButton7_0.getText().equals("B") || jButton7_0.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 7 && j == 1 && (jButton7_1.getText().equals("B") || jButton7_1.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 7 && j == 2 && (jButton7_2.getText().equals("B") || jButton7_2.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 7 && j == 3 && (jButton7_3.getText().equals("B") || jButton7_3.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 7 && j == 4 && (jButton7_4.getText().equals("B") || jButton7_4.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 7 && j == 5 && (jButton7_5.getText().equals("B") || jButton7_5.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 7 && j == 6 && (jButton7_6.getText().equals("B") || jButton7_6.getText().equals("b")))
                        contador_bandeira++;
                    else if(i == 7 && j == 7 && (jButton7_7.getText().equals("B") || jButton7_7.getText().equals("b")))
                        contador_bandeira++;
                }
            }
        }
        if(contador == 64-numeroBomb){
            JOptionPane.showMessageDialog(null, "Parabéns você ganhou!!");
            Jogo = false;
        }
        if(contador_bandeira == numeroBomb){
            JOptionPane.showMessageDialog(null, "Todas as bombas possuem bandeira.\nParabéns você ganhou!!");
            Jogo = false;
        }
    }
    
    public void LimpaTela(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                jButton0_0.setText("");
                jButton0_1.setText("");
                jButton0_2.setText("");
                jButton0_3.setText("");
                jButton0_4.setText("");
                jButton0_5.setText("");
                jButton0_6.setText("");
                jButton0_7.setText("");
                
                jButton1_0.setText("");
                jButton1_1.setText("");
                jButton1_2.setText("");
                jButton1_3.setText("");
                jButton1_4.setText("");
                jButton1_5.setText("");
                jButton1_6.setText("");
                jButton1_7.setText("");
                
                jButton2_0.setText("");
                jButton2_1.setText("");
                jButton2_2.setText("");
                jButton2_3.setText("");
                jButton2_4.setText("");
                jButton2_5.setText("");
                jButton2_6.setText("");
                jButton2_7.setText("");
                
                jButton3_0.setText("");
                jButton3_1.setText("");
                jButton3_2.setText("");
                jButton3_3.setText("");
                jButton3_4.setText("");
                jButton3_5.setText("");
                jButton3_6.setText("");
                jButton3_7.setText("");
                
                jButton4_0.setText("");
                jButton4_1.setText("");
                jButton4_2.setText("");
                jButton4_3.setText("");
                jButton4_4.setText("");
                jButton4_5.setText("");
                jButton4_6.setText("");
                jButton4_7.setText("");
                
                jButton5_0.setText("");
                jButton5_1.setText("");
                jButton5_2.setText("");
                jButton5_3.setText("");
                jButton5_4.setText("");
                jButton5_5.setText("");
                jButton5_6.setText("");
                jButton5_7.setText("");
                
                jButton6_0.setText("");
                jButton6_1.setText("");
                jButton6_2.setText("");
                jButton6_3.setText("");
                jButton6_4.setText("");
                jButton6_5.setText("");
                jButton6_6.setText("");
                jButton6_7.setText("");
                
                jButton7_0.setText("");
                jButton7_1.setText("");
                jButton7_2.setText("");
                jButton7_3.setText("");
                jButton7_4.setText("");
                jButton7_5.setText("");
                jButton7_6.setText("");
                jButton7_7.setText("");
            }
        }
    }
    
    
    //*************************FIM_FUNÇÕES************************************//
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jButton0_0 = new javax.swing.JButton();
        jButton0_1 = new javax.swing.JButton();
        jButton0_3 = new javax.swing.JButton();
        jButton0_2 = new javax.swing.JButton();
        jButton0_7 = new javax.swing.JButton();
        jButton0_6 = new javax.swing.JButton();
        jButton0_5 = new javax.swing.JButton();
        jButton0_4 = new javax.swing.JButton();
        jButton1_7 = new javax.swing.JButton();
        jButton1_6 = new javax.swing.JButton();
        jButton1_5 = new javax.swing.JButton();
        jButton1_4 = new javax.swing.JButton();
        jButton1_3 = new javax.swing.JButton();
        jButton1_2 = new javax.swing.JButton();
        jButton1_1 = new javax.swing.JButton();
        jButton1_0 = new javax.swing.JButton();
        jButton2_7 = new javax.swing.JButton();
        jButton2_6 = new javax.swing.JButton();
        jButton2_5 = new javax.swing.JButton();
        jButton2_4 = new javax.swing.JButton();
        jButton2_3 = new javax.swing.JButton();
        jButton2_2 = new javax.swing.JButton();
        jButton2_1 = new javax.swing.JButton();
        jButton2_0 = new javax.swing.JButton();
        jButton3_7 = new javax.swing.JButton();
        jButton3_6 = new javax.swing.JButton();
        jButton3_5 = new javax.swing.JButton();
        jButton3_4 = new javax.swing.JButton();
        jButton3_3 = new javax.swing.JButton();
        jButton3_2 = new javax.swing.JButton();
        jButton3_1 = new javax.swing.JButton();
        jButton3_0 = new javax.swing.JButton();
        jButton4_7 = new javax.swing.JButton();
        jButton4_6 = new javax.swing.JButton();
        jButton4_5 = new javax.swing.JButton();
        jButton4_4 = new javax.swing.JButton();
        jButton4_3 = new javax.swing.JButton();
        jButton4_2 = new javax.swing.JButton();
        jButton4_1 = new javax.swing.JButton();
        jButton4_0 = new javax.swing.JButton();
        jButton5_7 = new javax.swing.JButton();
        jButton5_6 = new javax.swing.JButton();
        jButton5_5 = new javax.swing.JButton();
        jButton5_4 = new javax.swing.JButton();
        jButton5_3 = new javax.swing.JButton();
        jButton5_2 = new javax.swing.JButton();
        jButton5_1 = new javax.swing.JButton();
        jButton5_0 = new javax.swing.JButton();
        jButton6_7 = new javax.swing.JButton();
        jButton6_6 = new javax.swing.JButton();
        jButton6_5 = new javax.swing.JButton();
        jButton6_4 = new javax.swing.JButton();
        jButton6_3 = new javax.swing.JButton();
        jButton6_2 = new javax.swing.JButton();
        jButton6_1 = new javax.swing.JButton();
        jButton6_0 = new javax.swing.JButton();
        jButton7_7 = new javax.swing.JButton();
        jButton7_6 = new javax.swing.JButton();
        jButton7_5 = new javax.swing.JButton();
        jButton7_4 = new javax.swing.JButton();
        jButton7_3 = new javax.swing.JButton();
        jButton7_2 = new javax.swing.JButton();
        jButton7_1 = new javax.swing.JButton();
        jButton7_0 = new javax.swing.JButton();
        jTextJogadas1 = new javax.swing.JTextField();
        jTextNumBombas = new javax.swing.JTextField();
        jButtonIniciar = new javax.swing.JButton();
        jButtonSobre = new javax.swing.JButton();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CAMPO MINADO");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMaximumSize(new java.awt.Dimension(708, 511));
        jPanel1.setMinimumSize(new java.awt.Dimension(708, 511));

        jButton0_0.setBackground(new java.awt.Color(51, 102, 255));
        jButton0_0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton0_0.setText(" ");
        jButton0_0.setToolTipText("");
        jButton0_0.setAutoscrolls(true);
        jButton0_0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton0_0.setFocusTraversalPolicyProvider(true);
        jButton0_0.setSelected(true);
        jButton0_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0_0ActionPerformed(evt);
            }
        });

        jButton0_1.setBackground(new java.awt.Color(51, 102, 255));
        jButton0_1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton0_1.setText(" ");
        jButton0_1.setToolTipText("");
        jButton0_1.setAutoscrolls(true);
        jButton0_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton0_1.setFocusTraversalPolicyProvider(true);
        jButton0_1.setSelected(true);
        jButton0_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0_1ActionPerformed(evt);
            }
        });

        jButton0_3.setBackground(new java.awt.Color(51, 102, 255));
        jButton0_3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton0_3.setText(" ");
        jButton0_3.setToolTipText("");
        jButton0_3.setAutoscrolls(true);
        jButton0_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton0_3.setFocusTraversalPolicyProvider(true);
        jButton0_3.setSelected(true);
        jButton0_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0_3ActionPerformed(evt);
            }
        });

        jButton0_2.setBackground(new java.awt.Color(51, 102, 255));
        jButton0_2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton0_2.setText(" ");
        jButton0_2.setToolTipText("");
        jButton0_2.setAutoscrolls(true);
        jButton0_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton0_2.setFocusTraversalPolicyProvider(true);
        jButton0_2.setSelected(true);
        jButton0_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0_2ActionPerformed(evt);
            }
        });

        jButton0_7.setBackground(new java.awt.Color(51, 102, 255));
        jButton0_7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton0_7.setText(" ");
        jButton0_7.setToolTipText("");
        jButton0_7.setAutoscrolls(true);
        jButton0_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton0_7.setFocusTraversalPolicyProvider(true);
        jButton0_7.setSelected(true);
        jButton0_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0_7ActionPerformed(evt);
            }
        });

        jButton0_6.setBackground(new java.awt.Color(51, 102, 255));
        jButton0_6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton0_6.setText(" ");
        jButton0_6.setToolTipText("");
        jButton0_6.setAutoscrolls(true);
        jButton0_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton0_6.setFocusTraversalPolicyProvider(true);
        jButton0_6.setSelected(true);
        jButton0_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0_6ActionPerformed(evt);
            }
        });

        jButton0_5.setBackground(new java.awt.Color(51, 102, 255));
        jButton0_5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton0_5.setText(" ");
        jButton0_5.setToolTipText("");
        jButton0_5.setAutoscrolls(true);
        jButton0_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton0_5.setFocusTraversalPolicyProvider(true);
        jButton0_5.setSelected(true);
        jButton0_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0_5ActionPerformed(evt);
            }
        });

        jButton0_4.setBackground(new java.awt.Color(51, 102, 255));
        jButton0_4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton0_4.setText(" ");
        jButton0_4.setToolTipText("");
        jButton0_4.setAutoscrolls(true);
        jButton0_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton0_4.setFocusTraversalPolicyProvider(true);
        jButton0_4.setSelected(true);
        jButton0_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0_4ActionPerformed(evt);
            }
        });

        jButton1_7.setBackground(new java.awt.Color(51, 102, 255));
        jButton1_7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1_7.setText(" ");
        jButton1_7.setToolTipText("");
        jButton1_7.setAutoscrolls(true);
        jButton1_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1_7.setFocusTraversalPolicyProvider(true);
        jButton1_7.setSelected(true);
        jButton1_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_7ActionPerformed(evt);
            }
        });

        jButton1_6.setBackground(new java.awt.Color(51, 102, 255));
        jButton1_6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1_6.setText(" ");
        jButton1_6.setToolTipText("");
        jButton1_6.setAutoscrolls(true);
        jButton1_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1_6.setFocusTraversalPolicyProvider(true);
        jButton1_6.setName(" "); // NOI18N
        jButton1_6.setSelected(true);
        jButton1_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_6ActionPerformed(evt);
            }
        });

        jButton1_5.setBackground(new java.awt.Color(51, 102, 255));
        jButton1_5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1_5.setText(" ");
        jButton1_5.setToolTipText("");
        jButton1_5.setAutoscrolls(true);
        jButton1_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1_5.setFocusTraversalPolicyProvider(true);
        jButton1_5.setName(" "); // NOI18N
        jButton1_5.setSelected(true);
        jButton1_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_5ActionPerformed(evt);
            }
        });

        jButton1_4.setBackground(new java.awt.Color(51, 102, 255));
        jButton1_4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1_4.setText(" ");
        jButton1_4.setToolTipText("");
        jButton1_4.setAutoscrolls(true);
        jButton1_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1_4.setFocusTraversalPolicyProvider(true);
        jButton1_4.setSelected(true);
        jButton1_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_4ActionPerformed(evt);
            }
        });

        jButton1_3.setBackground(new java.awt.Color(51, 102, 255));
        jButton1_3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1_3.setText(" ");
        jButton1_3.setToolTipText("");
        jButton1_3.setAutoscrolls(true);
        jButton1_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1_3.setFocusTraversalPolicyProvider(true);
        jButton1_3.setName(" "); // NOI18N
        jButton1_3.setSelected(true);
        jButton1_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_3ActionPerformed(evt);
            }
        });

        jButton1_2.setBackground(new java.awt.Color(51, 102, 255));
        jButton1_2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1_2.setText(" ");
        jButton1_2.setToolTipText("");
        jButton1_2.setAutoscrolls(true);
        jButton1_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1_2.setFocusTraversalPolicyProvider(true);
        jButton1_2.setName(" "); // NOI18N
        jButton1_2.setSelected(true);
        jButton1_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_2ActionPerformed(evt);
            }
        });

        jButton1_1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1_1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1_1.setText(" ");
        jButton1_1.setToolTipText("");
        jButton1_1.setAutoscrolls(true);
        jButton1_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1_1.setFocusTraversalPolicyProvider(true);
        jButton1_1.setName(" "); // NOI18N
        jButton1_1.setSelected(true);
        jButton1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_1ActionPerformed(evt);
            }
        });

        jButton1_0.setBackground(new java.awt.Color(51, 102, 255));
        jButton1_0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1_0.setText(" ");
        jButton1_0.setToolTipText("");
        jButton1_0.setAutoscrolls(true);
        jButton1_0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1_0.setFocusTraversalPolicyProvider(true);
        jButton1_0.setSelected(true);
        jButton1_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_0ActionPerformed(evt);
            }
        });

        jButton2_7.setBackground(new java.awt.Color(51, 102, 255));
        jButton2_7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2_7.setText(" ");
        jButton2_7.setToolTipText("");
        jButton2_7.setAutoscrolls(true);
        jButton2_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2_7.setFocusTraversalPolicyProvider(true);
        jButton2_7.setSelected(true);
        jButton2_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_7ActionPerformed(evt);
            }
        });

        jButton2_6.setBackground(new java.awt.Color(51, 102, 255));
        jButton2_6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2_6.setText(" ");
        jButton2_6.setToolTipText("");
        jButton2_6.setAutoscrolls(true);
        jButton2_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2_6.setFocusTraversalPolicyProvider(true);
        jButton2_6.setSelected(true);
        jButton2_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_6ActionPerformed(evt);
            }
        });

        jButton2_5.setBackground(new java.awt.Color(51, 102, 255));
        jButton2_5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2_5.setText(" ");
        jButton2_5.setToolTipText("");
        jButton2_5.setAutoscrolls(true);
        jButton2_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2_5.setFocusTraversalPolicyProvider(true);
        jButton2_5.setSelected(true);
        jButton2_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_5ActionPerformed(evt);
            }
        });

        jButton2_4.setBackground(new java.awt.Color(51, 102, 255));
        jButton2_4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2_4.setText(" ");
        jButton2_4.setToolTipText("");
        jButton2_4.setAutoscrolls(true);
        jButton2_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2_4.setFocusTraversalPolicyProvider(true);
        jButton2_4.setName(" "); // NOI18N
        jButton2_4.setSelected(true);
        jButton2_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_4ActionPerformed(evt);
            }
        });

        jButton2_3.setBackground(new java.awt.Color(51, 102, 255));
        jButton2_3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2_3.setText(" ");
        jButton2_3.setToolTipText("");
        jButton2_3.setAutoscrolls(true);
        jButton2_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2_3.setFocusTraversalPolicyProvider(true);
        jButton2_3.setName(" "); // NOI18N
        jButton2_3.setSelected(true);
        jButton2_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_3ActionPerformed(evt);
            }
        });

        jButton2_2.setBackground(new java.awt.Color(51, 102, 255));
        jButton2_2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2_2.setText(" ");
        jButton2_2.setToolTipText("");
        jButton2_2.setAutoscrolls(true);
        jButton2_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2_2.setFocusTraversalPolicyProvider(true);
        jButton2_2.setName(" "); // NOI18N
        jButton2_2.setSelected(true);
        jButton2_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_2ActionPerformed(evt);
            }
        });

        jButton2_1.setBackground(new java.awt.Color(51, 102, 255));
        jButton2_1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2_1.setText(" ");
        jButton2_1.setToolTipText("");
        jButton2_1.setAutoscrolls(true);
        jButton2_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2_1.setFocusTraversalPolicyProvider(true);
        jButton2_1.setName(" "); // NOI18N
        jButton2_1.setSelected(true);
        jButton2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_1ActionPerformed(evt);
            }
        });

        jButton2_0.setBackground(new java.awt.Color(51, 102, 255));
        jButton2_0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2_0.setText(" ");
        jButton2_0.setToolTipText("");
        jButton2_0.setAutoscrolls(true);
        jButton2_0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2_0.setFocusTraversalPolicyProvider(true);
        jButton2_0.setSelected(true);
        jButton2_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_0ActionPerformed(evt);
            }
        });

        jButton3_7.setBackground(new java.awt.Color(51, 102, 255));
        jButton3_7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3_7.setText(" ");
        jButton3_7.setToolTipText("");
        jButton3_7.setAutoscrolls(true);
        jButton3_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3_7.setFocusTraversalPolicyProvider(true);
        jButton3_7.setSelected(true);
        jButton3_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_7ActionPerformed(evt);
            }
        });

        jButton3_6.setBackground(new java.awt.Color(51, 102, 255));
        jButton3_6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3_6.setText(" ");
        jButton3_6.setToolTipText("");
        jButton3_6.setAutoscrolls(true);
        jButton3_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3_6.setFocusTraversalPolicyProvider(true);
        jButton3_6.setSelected(true);
        jButton3_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_6ActionPerformed(evt);
            }
        });

        jButton3_5.setBackground(new java.awt.Color(51, 102, 255));
        jButton3_5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3_5.setText(" ");
        jButton3_5.setToolTipText("");
        jButton3_5.setAutoscrolls(true);
        jButton3_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3_5.setFocusTraversalPolicyProvider(true);
        jButton3_5.setSelected(true);
        jButton3_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_5ActionPerformed(evt);
            }
        });

        jButton3_4.setBackground(new java.awt.Color(51, 102, 255));
        jButton3_4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3_4.setText(" ");
        jButton3_4.setToolTipText("");
        jButton3_4.setAutoscrolls(true);
        jButton3_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3_4.setFocusTraversalPolicyProvider(true);
        jButton3_4.setSelected(true);
        jButton3_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_4ActionPerformed(evt);
            }
        });

        jButton3_3.setBackground(new java.awt.Color(51, 102, 255));
        jButton3_3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3_3.setText(" ");
        jButton3_3.setToolTipText("");
        jButton3_3.setAutoscrolls(true);
        jButton3_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3_3.setFocusTraversalPolicyProvider(true);
        jButton3_3.setSelected(true);
        jButton3_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_3ActionPerformed(evt);
            }
        });

        jButton3_2.setBackground(new java.awt.Color(51, 102, 255));
        jButton3_2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3_2.setText(" ");
        jButton3_2.setToolTipText("");
        jButton3_2.setAutoscrolls(true);
        jButton3_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3_2.setFocusTraversalPolicyProvider(true);
        jButton3_2.setSelected(true);
        jButton3_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_2ActionPerformed(evt);
            }
        });

        jButton3_1.setBackground(new java.awt.Color(51, 102, 255));
        jButton3_1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3_1.setText(" ");
        jButton3_1.setToolTipText("");
        jButton3_1.setAutoscrolls(true);
        jButton3_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3_1.setFocusTraversalPolicyProvider(true);
        jButton3_1.setSelected(true);
        jButton3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_1ActionPerformed(evt);
            }
        });

        jButton3_0.setBackground(new java.awt.Color(51, 102, 255));
        jButton3_0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3_0.setText(" ");
        jButton3_0.setToolTipText("");
        jButton3_0.setAutoscrolls(true);
        jButton3_0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3_0.setFocusTraversalPolicyProvider(true);
        jButton3_0.setSelected(true);
        jButton3_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_0ActionPerformed(evt);
            }
        });

        jButton4_7.setBackground(new java.awt.Color(51, 102, 255));
        jButton4_7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4_7.setText(" ");
        jButton4_7.setToolTipText("");
        jButton4_7.setAutoscrolls(true);
        jButton4_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4_7.setFocusTraversalPolicyProvider(true);
        jButton4_7.setSelected(true);
        jButton4_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_7ActionPerformed(evt);
            }
        });

        jButton4_6.setBackground(new java.awt.Color(51, 102, 255));
        jButton4_6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4_6.setText(" ");
        jButton4_6.setToolTipText("");
        jButton4_6.setAutoscrolls(true);
        jButton4_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4_6.setFocusTraversalPolicyProvider(true);
        jButton4_6.setSelected(true);
        jButton4_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_6ActionPerformed(evt);
            }
        });

        jButton4_5.setBackground(new java.awt.Color(51, 102, 255));
        jButton4_5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4_5.setText(" ");
        jButton4_5.setToolTipText("");
        jButton4_5.setAutoscrolls(true);
        jButton4_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4_5.setFocusTraversalPolicyProvider(true);
        jButton4_5.setSelected(true);
        jButton4_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_5ActionPerformed(evt);
            }
        });

        jButton4_4.setBackground(new java.awt.Color(51, 102, 255));
        jButton4_4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4_4.setText(" ");
        jButton4_4.setToolTipText("");
        jButton4_4.setAutoscrolls(true);
        jButton4_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4_4.setFocusTraversalPolicyProvider(true);
        jButton4_4.setSelected(true);
        jButton4_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_4ActionPerformed(evt);
            }
        });

        jButton4_3.setBackground(new java.awt.Color(51, 102, 255));
        jButton4_3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4_3.setText(" ");
        jButton4_3.setToolTipText("");
        jButton4_3.setAutoscrolls(true);
        jButton4_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4_3.setFocusTraversalPolicyProvider(true);
        jButton4_3.setSelected(true);
        jButton4_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_3ActionPerformed(evt);
            }
        });

        jButton4_2.setBackground(new java.awt.Color(51, 102, 255));
        jButton4_2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4_2.setText(" ");
        jButton4_2.setToolTipText("");
        jButton4_2.setAutoscrolls(true);
        jButton4_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4_2.setFocusTraversalPolicyProvider(true);
        jButton4_2.setSelected(true);
        jButton4_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_2ActionPerformed(evt);
            }
        });

        jButton4_1.setBackground(new java.awt.Color(51, 102, 255));
        jButton4_1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4_1.setText(" ");
        jButton4_1.setToolTipText("");
        jButton4_1.setAutoscrolls(true);
        jButton4_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4_1.setFocusTraversalPolicyProvider(true);
        jButton4_1.setSelected(true);
        jButton4_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_1ActionPerformed(evt);
            }
        });

        jButton4_0.setBackground(new java.awt.Color(51, 102, 255));
        jButton4_0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4_0.setText(" ");
        jButton4_0.setToolTipText("");
        jButton4_0.setAutoscrolls(true);
        jButton4_0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4_0.setFocusTraversalPolicyProvider(true);
        jButton4_0.setSelected(true);
        jButton4_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_0ActionPerformed(evt);
            }
        });

        jButton5_7.setBackground(new java.awt.Color(51, 102, 255));
        jButton5_7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5_7.setText(" ");
        jButton5_7.setToolTipText("");
        jButton5_7.setAutoscrolls(true);
        jButton5_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5_7.setFocusTraversalPolicyProvider(true);
        jButton5_7.setSelected(true);
        jButton5_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5_7ActionPerformed(evt);
            }
        });

        jButton5_6.setBackground(new java.awt.Color(51, 102, 255));
        jButton5_6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5_6.setText(" ");
        jButton5_6.setToolTipText("");
        jButton5_6.setAutoscrolls(true);
        jButton5_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5_6.setFocusTraversalPolicyProvider(true);
        jButton5_6.setSelected(true);
        jButton5_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5_6ActionPerformed(evt);
            }
        });

        jButton5_5.setBackground(new java.awt.Color(51, 102, 255));
        jButton5_5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5_5.setText(" ");
        jButton5_5.setToolTipText("");
        jButton5_5.setAutoscrolls(true);
        jButton5_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5_5.setFocusTraversalPolicyProvider(true);
        jButton5_5.setSelected(true);
        jButton5_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5_5ActionPerformed(evt);
            }
        });

        jButton5_4.setBackground(new java.awt.Color(51, 102, 255));
        jButton5_4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5_4.setText(" ");
        jButton5_4.setToolTipText("");
        jButton5_4.setAutoscrolls(true);
        jButton5_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5_4.setFocusTraversalPolicyProvider(true);
        jButton5_4.setSelected(true);
        jButton5_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5_4ActionPerformed(evt);
            }
        });

        jButton5_3.setBackground(new java.awt.Color(51, 102, 255));
        jButton5_3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5_3.setText(" ");
        jButton5_3.setToolTipText("");
        jButton5_3.setAutoscrolls(true);
        jButton5_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5_3.setFocusTraversalPolicyProvider(true);
        jButton5_3.setSelected(true);
        jButton5_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5_3ActionPerformed(evt);
            }
        });

        jButton5_2.setBackground(new java.awt.Color(51, 102, 255));
        jButton5_2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5_2.setText(" ");
        jButton5_2.setToolTipText("");
        jButton5_2.setAutoscrolls(true);
        jButton5_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5_2.setFocusTraversalPolicyProvider(true);
        jButton5_2.setSelected(true);
        jButton5_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5_2ActionPerformed(evt);
            }
        });

        jButton5_1.setBackground(new java.awt.Color(51, 102, 255));
        jButton5_1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5_1.setText(" ");
        jButton5_1.setToolTipText("");
        jButton5_1.setAutoscrolls(true);
        jButton5_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5_1.setFocusTraversalPolicyProvider(true);
        jButton5_1.setSelected(true);
        jButton5_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5_1ActionPerformed(evt);
            }
        });

        jButton5_0.setBackground(new java.awt.Color(51, 102, 255));
        jButton5_0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5_0.setText(" ");
        jButton5_0.setToolTipText("");
        jButton5_0.setAutoscrolls(true);
        jButton5_0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5_0.setFocusTraversalPolicyProvider(true);
        jButton5_0.setSelected(true);
        jButton5_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5_0ActionPerformed(evt);
            }
        });

        jButton6_7.setBackground(new java.awt.Color(51, 102, 255));
        jButton6_7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6_7.setText(" ");
        jButton6_7.setToolTipText("");
        jButton6_7.setAutoscrolls(true);
        jButton6_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6_7.setFocusTraversalPolicyProvider(true);
        jButton6_7.setSelected(true);
        jButton6_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6_7ActionPerformed(evt);
            }
        });

        jButton6_6.setBackground(new java.awt.Color(51, 102, 255));
        jButton6_6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6_6.setText(" ");
        jButton6_6.setToolTipText("");
        jButton6_6.setAutoscrolls(true);
        jButton6_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6_6.setFocusTraversalPolicyProvider(true);
        jButton6_6.setSelected(true);
        jButton6_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6_6ActionPerformed(evt);
            }
        });

        jButton6_5.setBackground(new java.awt.Color(51, 102, 255));
        jButton6_5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6_5.setText(" ");
        jButton6_5.setToolTipText("");
        jButton6_5.setAutoscrolls(true);
        jButton6_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6_5.setFocusTraversalPolicyProvider(true);
        jButton6_5.setSelected(true);
        jButton6_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6_5ActionPerformed(evt);
            }
        });

        jButton6_4.setBackground(new java.awt.Color(51, 102, 255));
        jButton6_4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6_4.setText(" ");
        jButton6_4.setToolTipText("");
        jButton6_4.setAutoscrolls(true);
        jButton6_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6_4.setFocusTraversalPolicyProvider(true);
        jButton6_4.setSelected(true);
        jButton6_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6_4ActionPerformed(evt);
            }
        });

        jButton6_3.setBackground(new java.awt.Color(51, 102, 255));
        jButton6_3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6_3.setText(" ");
        jButton6_3.setToolTipText("");
        jButton6_3.setAutoscrolls(true);
        jButton6_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6_3.setFocusTraversalPolicyProvider(true);
        jButton6_3.setSelected(true);
        jButton6_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6_3ActionPerformed(evt);
            }
        });

        jButton6_2.setBackground(new java.awt.Color(51, 102, 255));
        jButton6_2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6_2.setText(" ");
        jButton6_2.setToolTipText("");
        jButton6_2.setAutoscrolls(true);
        jButton6_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6_2.setFocusTraversalPolicyProvider(true);
        jButton6_2.setSelected(true);
        jButton6_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6_2ActionPerformed(evt);
            }
        });

        jButton6_1.setBackground(new java.awt.Color(51, 102, 255));
        jButton6_1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6_1.setText(" ");
        jButton6_1.setToolTipText("");
        jButton6_1.setAutoscrolls(true);
        jButton6_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6_1.setFocusTraversalPolicyProvider(true);
        jButton6_1.setSelected(true);
        jButton6_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6_1ActionPerformed(evt);
            }
        });

        jButton6_0.setBackground(new java.awt.Color(51, 102, 255));
        jButton6_0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6_0.setText(" ");
        jButton6_0.setToolTipText("");
        jButton6_0.setAutoscrolls(true);
        jButton6_0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6_0.setFocusTraversalPolicyProvider(true);
        jButton6_0.setSelected(true);
        jButton6_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6_0ActionPerformed(evt);
            }
        });

        jButton7_7.setBackground(new java.awt.Color(51, 102, 255));
        jButton7_7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7_7.setText(" ");
        jButton7_7.setToolTipText("");
        jButton7_7.setAutoscrolls(true);
        jButton7_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7_7.setFocusTraversalPolicyProvider(true);
        jButton7_7.setSelected(true);
        jButton7_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7_7ActionPerformed(evt);
            }
        });

        jButton7_6.setBackground(new java.awt.Color(51, 102, 255));
        jButton7_6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7_6.setText(" ");
        jButton7_6.setToolTipText("");
        jButton7_6.setAutoscrolls(true);
        jButton7_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7_6.setFocusTraversalPolicyProvider(true);
        jButton7_6.setSelected(true);
        jButton7_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7_6ActionPerformed(evt);
            }
        });

        jButton7_5.setBackground(new java.awt.Color(51, 102, 255));
        jButton7_5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7_5.setText(" ");
        jButton7_5.setToolTipText("");
        jButton7_5.setAutoscrolls(true);
        jButton7_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7_5.setFocusTraversalPolicyProvider(true);
        jButton7_5.setSelected(true);
        jButton7_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7_5ActionPerformed(evt);
            }
        });

        jButton7_4.setBackground(new java.awt.Color(51, 102, 255));
        jButton7_4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7_4.setText(" ");
        jButton7_4.setToolTipText("");
        jButton7_4.setAutoscrolls(true);
        jButton7_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7_4.setFocusTraversalPolicyProvider(true);
        jButton7_4.setSelected(true);
        jButton7_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7_4ActionPerformed(evt);
            }
        });

        jButton7_3.setBackground(new java.awt.Color(51, 102, 255));
        jButton7_3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7_3.setText(" ");
        jButton7_3.setToolTipText("");
        jButton7_3.setAutoscrolls(true);
        jButton7_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7_3.setFocusTraversalPolicyProvider(true);
        jButton7_3.setSelected(true);
        jButton7_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7_3ActionPerformed(evt);
            }
        });

        jButton7_2.setBackground(new java.awt.Color(51, 102, 255));
        jButton7_2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7_2.setText(" ");
        jButton7_2.setToolTipText("");
        jButton7_2.setAutoscrolls(true);
        jButton7_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7_2.setFocusTraversalPolicyProvider(true);
        jButton7_2.setSelected(true);
        jButton7_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7_2ActionPerformed(evt);
            }
        });

        jButton7_1.setBackground(new java.awt.Color(51, 102, 255));
        jButton7_1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7_1.setText(" ");
        jButton7_1.setToolTipText("");
        jButton7_1.setAutoscrolls(true);
        jButton7_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7_1.setFocusTraversalPolicyProvider(true);
        jButton7_1.setSelected(true);
        jButton7_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7_1ActionPerformed(evt);
            }
        });

        jButton7_0.setBackground(new java.awt.Color(51, 102, 255));
        jButton7_0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7_0.setText(" ");
        jButton7_0.setToolTipText("");
        jButton7_0.setAutoscrolls(true);
        jButton7_0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7_0.setFocusTraversalPolicyProvider(true);
        jButton7_0.setSelected(true);
        jButton7_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7_0ActionPerformed(evt);
            }
        });

        jTextJogadas1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextJogadas1.setText("Numero de Jogadas: 0");
        jTextJogadas1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextJogadas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextJogadas1ActionPerformed(evt);
            }
        });

        jTextNumBombas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextNumBombas.setText("Numero de Bombas: 0");
        jTextNumBombas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextNumBombas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNumBombasActionPerformed(evt);
            }
        });

        jButtonIniciar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonIniciar.setText("Iniciar e sortear bombas");
        jButtonIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarActionPerformed(evt);
            }
        });

        jButtonSobre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonSobre.setText("Sobre");
        jButtonSobre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSobreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextJogadas1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextNumBombas, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jButtonIniciar)
                .addGap(18, 18, 18)
                .addComponent(jButtonSobre, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5_0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5_3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5_4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5_5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5_6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton6_0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6_1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6_2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6_3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6_4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6_5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6_6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4_0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4_6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3_0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3_5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3_6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2_0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton0_0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton0_1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton0_2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton0_3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton0_4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton0_5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton0_6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1_0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton7_0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7_1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7_2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7_3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7_4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7_5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7_6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton0_7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1_7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2_7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3_7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4_7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6_7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5_7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7_7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton0_0, jButton0_1, jButton0_2, jButton0_3, jButton0_4, jButton0_5, jButton0_6, jButton0_7, jButton1_0, jButton1_1, jButton1_2, jButton1_3, jButton1_4, jButton1_5, jButton1_6, jButton1_7, jButton2_0, jButton2_1, jButton2_2, jButton2_3, jButton2_4, jButton2_5, jButton2_6, jButton2_7, jButton3_0, jButton3_1, jButton3_2, jButton3_3, jButton3_4, jButton3_5, jButton3_6, jButton3_7, jButton4_0, jButton4_1, jButton4_2, jButton4_3, jButton4_4, jButton4_5, jButton4_6, jButton4_7, jButton5_0, jButton5_1, jButton5_2, jButton5_3, jButton5_4, jButton5_5, jButton5_6, jButton5_7, jButton6_0, jButton6_1, jButton6_2, jButton6_3, jButton6_4, jButton6_5, jButton6_6, jButton6_7, jButton7_0, jButton7_1, jButton7_2, jButton7_3, jButton7_4, jButton7_5, jButton7_6, jButton7_7});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextJogadas1, jTextNumBombas});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton0_6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton0_5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton0_0, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton0_1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton0_3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton0_2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton0_4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1_0, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2_0, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3_0, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3_5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3_6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4_0, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4_6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5_0, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5_3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5_4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5_5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5_6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6_0, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton6_1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton6_3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton6_2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton6_4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton6_5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton6_6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7_0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton7_3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton7_2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton7_4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton7_5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton7_1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton7_6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton0_7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1_7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2_7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3_7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4_7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5_7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6_7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7_7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSobre)
                    .addComponent(jButtonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextNumBombas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextJogadas1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton0_0, jButton0_1, jButton0_2, jButton0_3, jButton0_4, jButton0_5, jButton0_6, jButton0_7, jButton1_0, jButton1_1, jButton1_2, jButton1_3, jButton1_4, jButton1_5, jButton1_6, jButton1_7, jButton2_0, jButton2_1, jButton2_2, jButton2_3, jButton2_4, jButton2_5, jButton2_6, jButton2_7, jButton3_0, jButton3_1, jButton3_2, jButton3_3, jButton3_4, jButton3_5, jButton3_6, jButton3_7, jButton4_0, jButton4_1, jButton4_2, jButton4_3, jButton4_4, jButton4_5, jButton4_6, jButton4_7, jButton5_0, jButton5_1, jButton5_2, jButton5_3, jButton5_4, jButton5_5, jButton5_6, jButton5_7, jButton6_0, jButton6_1, jButton6_2, jButton6_3, jButton6_4, jButton6_5, jButton6_6, jButton6_7, jButton7_0, jButton7_1, jButton7_2, jButton7_3, jButton7_4, jButton7_5, jButton7_6, jButton7_7});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonIniciar, jButtonSobre});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextJogadas1, jTextNumBombas});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSobreActionPerformed
        JOptionPane.showMessageDialog(null, "A área de jogo consiste num campo de quadrados retangular. "
            + "Cada quadrado pode ser revelado clicando sobre ele, \ne se o quadrado clicado contiver uma mina, "
            + "então o jogo acaba. Se, por outro lado, o quadrado não contiver uma mina,\n um número aparece, indicando a "
            + "quantidade de quadrados adjacentes que contêm minas;");
    }//GEN-LAST:event_jButtonSobreActionPerformed

    private void jButtonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarActionPerformed
        NumJogadas = 0 ;
        numeroBomb = 0;

        Jogo = true;
        LimpaTela(8);
        while(numeroBomb < 20 || numeroBomb > 50){
            String Snum = JOptionPane.showInputDialog("Digite o numero de bombas:");
            numeroBomb = Integer.parseInt(Snum);
            if (numeroBomb < 20 || numeroBomb > 50)
            JOptionPane.showMessageDialog(null, "Digite entre 20 e 50 bombas!");
        }
        Coloca(8, numeroBomb);
        jTextNumBombas.setText("Numero de Bombas: "+numeroBomb);
    }//GEN-LAST:event_jButtonIniciarActionPerformed

    private void jTextNumBombasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNumBombasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNumBombasActionPerformed

    private void jTextJogadas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextJogadas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextJogadas1ActionPerformed

    private void jButton7_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7_0ActionPerformed
        String tipo = "";
        if((jButton7_0.getText().equals("B") || jButton7_0.getText().equals("b") || jButton7_0.getText().equals("?") ||
            jButton7_0.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 7, 0, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 7, 0);
            else
            jButton7_0.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton7_0ActionPerformed

    private void jButton7_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7_1ActionPerformed
        String tipo = "";
        if((jButton7_1.getText().equals("B") || jButton7_1.getText().equals("b") || jButton7_1.getText().equals("?") ||
            jButton7_1.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 7, 1, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 7, 1);
            else
            jButton7_1.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton7_1ActionPerformed

    private void jButton7_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7_2ActionPerformed
        String tipo = "";
        if((jButton7_2.getText().equals("B") || jButton7_2.getText().equals("b") || jButton7_2.getText().equals("?") ||
            jButton7_2.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 7, 2, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 7, 2);
            else
            jButton7_2.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton7_2ActionPerformed

    private void jButton7_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7_3ActionPerformed
        String tipo = "";
        if((jButton7_3.getText().equals("B") || jButton7_3.getText().equals("b") || jButton7_3.getText().equals("?") ||
            jButton7_3.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 7, 3, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 7, 3);
            else
            jButton7_3.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton7_3ActionPerformed

    private void jButton7_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7_4ActionPerformed
        String tipo = "";
        if((jButton7_4.getText().equals("B") || jButton7_4.getText().equals("b") || jButton7_4.getText().equals("?") ||
            jButton7_4.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 7, 4, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 7, 4);
            else
            jButton7_4.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton7_4ActionPerformed

    private void jButton7_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7_5ActionPerformed
        String tipo = "";
        if((jButton7_5.getText().equals("B") || jButton7_5.getText().equals("b") || jButton7_5.getText().equals("?") ||
            jButton7_5.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 7, 5, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 7, 5);
            else
            jButton7_5.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton7_5ActionPerformed

    private void jButton7_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7_6ActionPerformed
        String tipo = "";
        if((jButton7_6.getText().equals("B") || jButton7_6.getText().equals("b") || jButton7_6.getText().equals("?") ||
            jButton7_6.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 7, 6, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 7, 6);
            else
            jButton7_6.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton7_6ActionPerformed

    private void jButton7_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7_7ActionPerformed
        String tipo = "";
        if((jButton7_7.getText().equals("B") || jButton7_7.getText().equals("b") || jButton7_7.getText().equals("?") ||
            jButton7_7.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 7, 7, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 7, 7);
            else
            jButton7_7.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton7_7ActionPerformed

    private void jButton6_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6_0ActionPerformed
        String tipo = "";
        if((jButton6_0.getText().equals("B") || jButton6_0.getText().equals("b") || jButton6_0.getText().equals("?") ||
            jButton6_0.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 6, 0, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 6, 0);
            else
            jButton6_0.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton6_0ActionPerformed

    private void jButton6_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6_1ActionPerformed
        String tipo = "";
        if((jButton6_1.getText().equals("B") || jButton6_1.getText().equals("b") || jButton6_1.getText().equals("?") ||
            jButton6_1.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 6, 1, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 6, 1);
            else
            jButton6_1.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton6_1ActionPerformed

    private void jButton6_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6_2ActionPerformed
        String tipo = "";
        if((jButton6_2.getText().equals("B") || jButton6_2.getText().equals("b") || jButton6_2.getText().equals("?") ||
            jButton6_2.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 6, 2, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 6, 2);
            else
            jButton6_2.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton6_2ActionPerformed

    private void jButton6_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6_3ActionPerformed
        String tipo = "";
        if((jButton6_3.getText().equals("B") || jButton6_3.getText().equals("b") || jButton6_3.getText().equals("?") ||
            jButton6_3.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 6, 3, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 6, 3);
            else
            jButton6_3.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton6_3ActionPerformed

    private void jButton6_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6_4ActionPerformed
        String tipo = "";
        if((jButton6_4.getText().equals("B") || jButton6_4.getText().equals("b") || jButton6_4.getText().equals("?") ||
            jButton6_4.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 6, 4, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 6, 4);
            else
            jButton6_4.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton6_4ActionPerformed

    private void jButton6_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6_5ActionPerformed
        String tipo = "";
        if((jButton6_5.getText().equals("B") || jButton6_5.getText().equals("b") || jButton6_5.getText().equals("?") ||
            jButton6_5.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 6, 5, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 6, 5);
            else
            jButton6_5.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton6_5ActionPerformed

    private void jButton6_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6_6ActionPerformed
        String tipo = "";
        if((jButton6_6.getText().equals("B") || jButton6_6.getText().equals("b") || jButton6_6.getText().equals("?") ||
            jButton6_6.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 6, 6, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 6, 6);
            else
            jButton6_6.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton6_6ActionPerformed

    private void jButton6_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6_7ActionPerformed
        String tipo = "";
        if((jButton6_7.getText().equals("B") || jButton6_7.getText().equals("b") || jButton6_7.getText().equals("?") ||
            jButton6_7.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 6, 7, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 6, 7);
            else
            jButton6_7.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton6_7ActionPerformed

    private void jButton5_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5_0ActionPerformed
        String tipo = "";
        if((jButton5_0.getText().equals("B") || jButton5_0.getText().equals("b") || jButton5_0.getText().equals("?") ||
            jButton5_0.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 5, 0, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 5, 0);
            else
            jButton5_0.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton5_0ActionPerformed

    private void jButton5_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5_1ActionPerformed
        String tipo = "";
        if((jButton5_1.getText().equals("B") || jButton5_1.getText().equals("b") || jButton5_1.getText().equals("?") ||
            jButton5_1.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 5, 1, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 5, 1);
            else
            jButton5_1.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton5_1ActionPerformed

    private void jButton5_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5_2ActionPerformed
        String tipo = "";
        if((jButton5_2.getText().equals("B") || jButton5_2.getText().equals("b") || jButton5_2.getText().equals("?") ||
            jButton5_2.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 5, 2, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 5, 2);
            else
            jButton5_2.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton5_2ActionPerformed

    private void jButton5_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5_3ActionPerformed
        String tipo = "";
        if((jButton5_3.getText().equals("B") || jButton5_3.getText().equals("b") || jButton5_3.getText().equals("?") ||
            jButton5_3.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 5, 3, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 5, 3);
            else
            jButton5_3.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton5_3ActionPerformed

    private void jButton5_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5_4ActionPerformed
        String tipo = "";
        if((jButton5_4.getText().equals("B") || jButton5_4.getText().equals("b") || jButton5_4.getText().equals("?") ||
            jButton5_4.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 5, 4, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 5, 4);
            else
            jButton5_4.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton5_4ActionPerformed

    private void jButton5_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5_5ActionPerformed
        String tipo = "";
        if((jButton5_5.getText().equals("B") || jButton5_5.getText().equals("b") || jButton5_5.getText().equals("?") ||
            jButton5_5.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 5, 5, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 5, 5);
            else
            jButton5_5.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton5_5ActionPerformed

    private void jButton5_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5_6ActionPerformed
        String tipo = "";
        if((jButton5_6.getText().equals("B") || jButton5_6.getText().equals("b") || jButton5_6.getText().equals("?") ||
            jButton5_6.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 5, 6, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 5, 6);
            else
            jButton5_6.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton5_6ActionPerformed

    private void jButton5_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5_7ActionPerformed
        String tipo = "";
        if((jButton5_7.getText().equals("B") || jButton5_7.getText().equals("b") || jButton5_7.getText().equals("?") ||
            jButton5_7.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 5, 7, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 5, 7);
            else
            jButton5_7.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton5_7ActionPerformed

    private void jButton4_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_0ActionPerformed
        String tipo = "";
        if((jButton4_0.getText().equals("B") || jButton4_0.getText().equals("b") || jButton4_0.getText().equals("?") ||
            jButton4_0.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 4, 0, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 4, 0);
            else
            jButton4_0.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton4_0ActionPerformed

    private void jButton4_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_1ActionPerformed
        String tipo = "";
        if((jButton4_1.getText().equals("B") || jButton4_1.getText().equals("b") || jButton4_1.getText().equals("?") ||
            jButton4_1.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 4, 1, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 4, 1);
            else
            jButton4_1.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton4_1ActionPerformed

    private void jButton4_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_2ActionPerformed
        String tipo = "";
        if((jButton4_2.getText().equals("B") || jButton4_2.getText().equals("b") || jButton4_2.getText().equals("?") ||
            jButton4_2.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 4, 2, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 4, 2);
            else
            jButton4_2.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton4_2ActionPerformed

    private void jButton4_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_3ActionPerformed
        String tipo = "";
        if((jButton4_3.getText().equals("B") || jButton4_3.getText().equals("b") || jButton4_3.getText().equals("?") ||
            jButton4_3.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 4, 3, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 4, 3);
            else
            jButton4_3.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton4_3ActionPerformed

    private void jButton4_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_4ActionPerformed
        String tipo = "";
        if((jButton4_4.getText().equals("B") || jButton4_4.getText().equals("b") || jButton4_4.getText().equals("?") ||
            jButton4_4.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 4, 4, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 4, 4);
            else
            jButton4_4.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton4_4ActionPerformed

    private void jButton4_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_5ActionPerformed
        String tipo = "";
        if((jButton4_5.getText().equals("B") || jButton4_5.getText().equals("b") || jButton4_5.getText().equals("?") ||
            jButton4_5.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 4, 5, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 4, 5);
            else
            jButton4_5.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton4_5ActionPerformed

    private void jButton4_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_6ActionPerformed
        String tipo = "";
        if((jButton4_6.getText().equals("B") || jButton4_6.getText().equals("b") || jButton4_6.getText().equals("?") ||
            jButton4_6.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 4, 6, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 4, 6);
            else
            jButton4_6.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton4_6ActionPerformed

    private void jButton4_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_7ActionPerformed
        String tipo = "";
        if((jButton4_7.getText().equals("B") || jButton4_7.getText().equals("b") || jButton4_7.getText().equals("?") ||
            jButton4_7.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 4, 7, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 4, 7);
            else
            jButton4_7.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton4_7ActionPerformed

    private void jButton3_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_0ActionPerformed
        String tipo = "";
        if((jButton3_0.getText().equals("B") || jButton3_0.getText().equals("b") || jButton3_0.getText().equals("?") ||
            jButton3_0.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 3, 0, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 3, 0);
            else
            jButton3_0.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton3_0ActionPerformed

    private void jButton3_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_1ActionPerformed
        String tipo = "";
        if((jButton3_1.getText().equals("B") || jButton3_1.getText().equals("b") || jButton3_1.getText().equals("?") ||
            jButton3_1.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 3, 1, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 3, 1);
            else
            jButton3_1.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton3_1ActionPerformed

    private void jButton3_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_2ActionPerformed
        String tipo = "";
        if((jButton3_2.getText().equals("B") || jButton3_2.getText().equals("b") || jButton3_2.getText().equals("?") ||
            jButton3_2.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 3, 2, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 3, 2);
            else
            jButton3_2.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton3_2ActionPerformed

    private void jButton3_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_3ActionPerformed
        String tipo = "";
        if((jButton3_3.getText().equals("B") || jButton3_3.getText().equals("b") || jButton3_3.getText().equals("?") ||
            jButton3_3.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 3, 3, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 3, 3);
            else
            jButton3_3.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton3_3ActionPerformed

    private void jButton3_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_4ActionPerformed
        String tipo = "";
        if((jButton3_4.getText().equals("B") || jButton3_4.getText().equals("b") || jButton3_4.getText().equals("?") ||
            jButton3_4.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 3, 4, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 3, 4);
            else
            jButton3_4.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton3_4ActionPerformed

    private void jButton3_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_5ActionPerformed
        String tipo = "";
        if((jButton3_5.getText().equals("B") || jButton3_5.getText().equals("b") || jButton3_5.getText().equals("?") ||
            jButton3_5.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 3, 5, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 3, 5);
            else
            jButton3_5.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton3_5ActionPerformed

    private void jButton3_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_6ActionPerformed
        String tipo = "";
        if((jButton3_6.getText().equals("B") || jButton3_6.getText().equals("b") || jButton3_6.getText().equals("?") ||
            jButton3_6.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 3, 6, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 3, 6);
            else
            jButton3_6.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton3_6ActionPerformed

    private void jButton3_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_7ActionPerformed
        String tipo = "";
        if((jButton3_7.getText().equals("B") || jButton3_7.getText().equals("b") || jButton3_7.getText().equals("?") ||
            jButton3_7.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 3, 7, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 3, 7);
            else
            jButton3_7.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }
    }//GEN-LAST:event_jButton3_7ActionPerformed

    private void jButton2_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_0ActionPerformed
        String tipo = "";
        if((jButton2_0.getText().equals("B") || jButton2_0.getText().equals("b") || jButton2_0.getText().equals("?") ||
            jButton2_0.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 2, 0, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 2, 0);
            else
            jButton2_0.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);

        }
    }//GEN-LAST:event_jButton2_0ActionPerformed

    private void jButton2_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_1ActionPerformed
        String tipo = "";
        if((jButton2_1.getText().equals("B") || jButton2_1.getText().equals("b") || jButton2_1.getText().equals("?") ||
            jButton2_1.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 2, 1, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 2, 1);
            else
            jButton2_1.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);

        }
    }//GEN-LAST:event_jButton2_1ActionPerformed

    private void jButton2_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_2ActionPerformed
        String tipo = "";
        if((jButton2_2.getText().equals("B") || jButton2_2.getText().equals("b") || jButton2_2.getText().equals("?") ||
            jButton2_2.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 2, 2, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 2, 2);
            else
            jButton2_2.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);

        }
    }//GEN-LAST:event_jButton2_2ActionPerformed

    private void jButton2_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_3ActionPerformed
        String tipo = "";
        if((jButton2_3.getText().equals("B") || jButton2_3.getText().equals("b") || jButton2_3.getText().equals("?") ||
            jButton2_3.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 2, 3, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 2, 3);
            else
            jButton2_3.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);

        }
    }//GEN-LAST:event_jButton2_3ActionPerformed

    private void jButton2_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_4ActionPerformed
        String tipo = "";
        if((jButton2_4.getText().equals("B") || jButton2_4.getText().equals("b") || jButton2_4.getText().equals("?") ||
            jButton2_4.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 2, 4, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 2, 4);
            else
            jButton2_4.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);

        }
    }//GEN-LAST:event_jButton2_4ActionPerformed

    private void jButton2_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_5ActionPerformed
        String tipo = "";
        if((jButton2_5.getText().equals("B") || jButton2_5.getText().equals("b") || jButton2_5.getText().equals("?") ||
            jButton2_5.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 2, 5, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 2, 5);
            else
            jButton2_5.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);

        }
    }//GEN-LAST:event_jButton2_5ActionPerformed

    private void jButton2_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_6ActionPerformed
        String tipo = "";
        if((jButton2_6.getText().equals("B") || jButton2_6.getText().equals("b") || jButton2_6.getText().equals("?") ||
            jButton2_6.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 2, 6, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 2, 6);
            else
            jButton2_6.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);

        }
    }//GEN-LAST:event_jButton2_6ActionPerformed

    private void jButton2_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_7ActionPerformed
        String tipo = "";
        if((jButton2_7.getText().equals("B") || jButton2_7.getText().equals("b") || jButton2_7.getText().equals("?") ||
            jButton2_7.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 2, 7, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 2, 7);
            else
            jButton2_7.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);

        }
    }//GEN-LAST:event_jButton2_7ActionPerformed

    private void jButton1_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_0ActionPerformed
        String tipo = "";
        if((jButton1_0.getText().equals("B") || jButton1_0.getText().equals("b") || jButton1_0.getText().equals("?") ||
            jButton1_0.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 1, 0, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 1, 0);
            else
            jButton1_0.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);

        }
    }//GEN-LAST:event_jButton1_0ActionPerformed

    private void jButton1_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_1ActionPerformed
        String tipo = "";
        if((jButton1_1.getText().equals("B") || jButton1_1.getText().equals("b") || jButton1_1.getText().equals("?") ||
            jButton1_1.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 1, 1, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 1, 1);
            else
            jButton1_1.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);

        }
    }//GEN-LAST:event_jButton1_1ActionPerformed

    private void jButton1_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_2ActionPerformed
        String tipo = "";
        if((jButton1_2.getText().equals("B") || jButton1_2.getText().equals("b") || jButton1_2.getText().equals("?") ||
            jButton1_2.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 1, 2, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 1, 2);
            else
            jButton1_2.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);

        }
    }//GEN-LAST:event_jButton1_2ActionPerformed

    private void jButton1_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_3ActionPerformed
        String tipo = "";
        if((jButton1_3.getText().equals("B") || jButton1_3.getText().equals("b") || jButton1_3.getText().equals("?") ||
            jButton1_3.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 1, 3, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 1, 3);
            else
            jButton1_3.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);

        }
    }//GEN-LAST:event_jButton1_3ActionPerformed

    private void jButton1_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_4ActionPerformed
        String tipo = "";
        if((jButton1_4.getText().equals("B") || jButton1_4.getText().equals("b") || jButton1_4.getText().equals("?") ||
            jButton1_4.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 1, 4, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 1, 4);
            else
            jButton1_4.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);

        }
    }//GEN-LAST:event_jButton1_4ActionPerformed

    private void jButton1_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_5ActionPerformed
        String tipo = "";
        if((jButton1_5.getText().equals("B") || jButton1_5.getText().equals("b") || jButton1_5.getText().equals("?") ||
            jButton1_5.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 1, 5, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 1, 5);
            else
            jButton1_5.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);

        }
    }//GEN-LAST:event_jButton1_5ActionPerformed

    private void jButton1_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_6ActionPerformed
        String tipo = "";
        if((jButton1_6.getText().equals("B") || jButton1_6.getText().equals("b") || jButton1_6.getText().equals("?") ||
            jButton1_6.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 1, 6, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 1, 6);
            else
            jButton1_6.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);

        }
    }//GEN-LAST:event_jButton1_6ActionPerformed

    private void jButton1_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_7ActionPerformed
        String tipo = "";
        if((jButton1_7.getText().equals("B") || jButton1_7.getText().equals("b") || jButton1_7.getText().equals("?") ||
            jButton1_7.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 1, 7, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 1, 7);
            else
            jButton1_7.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);

        }
    }//GEN-LAST:event_jButton1_7ActionPerformed

    private void jButton0_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0_4ActionPerformed
        String tipo = "";
        if((jButton0_4.getText().equals("B") || jButton0_4.getText().equals("b") || jButton0_4.getText().equals("?") ||
            jButton0_4.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 0, 4, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 0, 4);
            else
            jButton0_4.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);

        }

    }//GEN-LAST:event_jButton0_4ActionPerformed

    private void jButton0_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0_5ActionPerformed
        String tipo = "";
        if((jButton0_5.getText().equals("B") || jButton0_5.getText().equals("b") || jButton0_5.getText().equals("?") ||
            jButton0_5.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 0, 5, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 0, 5);
            else
            jButton0_5.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);

        }

    }//GEN-LAST:event_jButton0_5ActionPerformed

    private void jButton0_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0_6ActionPerformed
        String tipo = "";
        if((jButton0_6.getText().equals("B") || jButton0_6.getText().equals("b") || jButton0_6.getText().equals("?") ||
            jButton0_6.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 0, 6, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 0, 6);
            else
            jButton0_6.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);
        }

    }//GEN-LAST:event_jButton0_6ActionPerformed

    private void jButton0_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0_7ActionPerformed
        String tipo = "";
        if((jButton0_7.getText().equals("B") || jButton0_7.getText().equals("b") || jButton0_7.getText().equals("?") ||
            jButton0_7.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 0, 7, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 0, 7);
            else
            jButton0_7.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);

        }

    }//GEN-LAST:event_jButton0_7ActionPerformed

    private void jButton0_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0_2ActionPerformed
        String tipo = "";
        if((jButton0_2.getText().equals("B") || jButton0_2.getText().equals("b") || jButton0_2.getText().equals("?") ||
            jButton0_2.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 0, 2, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 0, 2);
            else
            jButton0_2.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);

        }

    }//GEN-LAST:event_jButton0_2ActionPerformed

    private void jButton0_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0_3ActionPerformed
        String tipo = "";
        if((jButton0_3.getText().equals("B") || jButton0_3.getText().equals("b") || jButton0_3.getText().equals("?") ||
            jButton0_3.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 0, 3, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 0, 3);
            else
            jButton0_3.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);

        }

    }//GEN-LAST:event_jButton0_3ActionPerformed

    private void jButton0_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0_1ActionPerformed
        String tipo = "";
        if((jButton0_1.getText().equals("B") || jButton0_1.getText().equals("b") || jButton0_1.getText().equals("?") ||
            jButton0_1.getText().equals("")) && Jogo == true){
        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");
        if(!VerificaBomba(tipo, 0, 1, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 0, 1);
            else
            jButton0_1.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);

        }

    }//GEN-LAST:event_jButton0_1ActionPerformed

    private void jButton0_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0_0ActionPerformed
        String tipo = "";

        if((jButton0_0.getText().equals("B") || jButton0_0.getText().equals("b") || jButton0_0.getText().equals("?") ||
            jButton0_0.getText().equals("")) && Jogo == true){

        while(!tipo.equals("B") && !tipo.equals("b") && !tipo.equals("?") && !tipo.equals("A") && !tipo.equals("a"))
        tipo = JOptionPane.showInputDialog(null, "Digite:\nB - Bandeira / ? - Duvida / A - Abrir");

        if(!VerificaBomba(tipo, 0, 0, 8)){
            if(tipo.equals("A") || tipo.equals("a"))
            nubombas(8, 8, 0, 0);
            else
            jButton0_0.setText(tipo);

            NumJogadas++;
            jTextJogadas1.setText("Numero de Jogadas: "+NumJogadas);
        }
        Ganhou(8);

        }

    }//GEN-LAST:event_jButton0_0ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(minado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(minado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(minado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(minado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
            
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new minado().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton0_0;
    private javax.swing.JButton jButton0_1;
    private javax.swing.JButton jButton0_2;
    private javax.swing.JButton jButton0_3;
    private javax.swing.JButton jButton0_4;
    private javax.swing.JButton jButton0_5;
    private javax.swing.JButton jButton0_6;
    private javax.swing.JButton jButton0_7;
    private javax.swing.JButton jButton1_0;
    private javax.swing.JButton jButton1_1;
    private javax.swing.JButton jButton1_2;
    private javax.swing.JButton jButton1_3;
    private javax.swing.JButton jButton1_4;
    private javax.swing.JButton jButton1_5;
    private javax.swing.JButton jButton1_6;
    private javax.swing.JButton jButton1_7;
    private javax.swing.JButton jButton2_0;
    private javax.swing.JButton jButton2_1;
    private javax.swing.JButton jButton2_2;
    private javax.swing.JButton jButton2_3;
    private javax.swing.JButton jButton2_4;
    private javax.swing.JButton jButton2_5;
    private javax.swing.JButton jButton2_6;
    private javax.swing.JButton jButton2_7;
    private javax.swing.JButton jButton3_0;
    private javax.swing.JButton jButton3_1;
    private javax.swing.JButton jButton3_2;
    private javax.swing.JButton jButton3_3;
    private javax.swing.JButton jButton3_4;
    private javax.swing.JButton jButton3_5;
    private javax.swing.JButton jButton3_6;
    private javax.swing.JButton jButton3_7;
    private javax.swing.JButton jButton4_0;
    private javax.swing.JButton jButton4_1;
    private javax.swing.JButton jButton4_2;
    private javax.swing.JButton jButton4_3;
    private javax.swing.JButton jButton4_4;
    private javax.swing.JButton jButton4_5;
    private javax.swing.JButton jButton4_6;
    private javax.swing.JButton jButton4_7;
    private javax.swing.JButton jButton5_0;
    private javax.swing.JButton jButton5_1;
    private javax.swing.JButton jButton5_2;
    private javax.swing.JButton jButton5_3;
    private javax.swing.JButton jButton5_4;
    private javax.swing.JButton jButton5_5;
    private javax.swing.JButton jButton5_6;
    private javax.swing.JButton jButton5_7;
    private javax.swing.JButton jButton6_0;
    private javax.swing.JButton jButton6_1;
    private javax.swing.JButton jButton6_2;
    private javax.swing.JButton jButton6_3;
    private javax.swing.JButton jButton6_4;
    private javax.swing.JButton jButton6_5;
    private javax.swing.JButton jButton6_6;
    private javax.swing.JButton jButton6_7;
    private javax.swing.JButton jButton7_0;
    private javax.swing.JButton jButton7_1;
    private javax.swing.JButton jButton7_2;
    private javax.swing.JButton jButton7_3;
    private javax.swing.JButton jButton7_4;
    private javax.swing.JButton jButton7_5;
    private javax.swing.JButton jButton7_6;
    private javax.swing.JButton jButton7_7;
    private javax.swing.JButton jButtonIniciar;
    private javax.swing.JButton jButtonSobre;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextJogadas1;
    private javax.swing.JTextField jTextNumBombas;
    // End of variables declaration//GEN-END:variables
}
