package AdvanceMath;

public class Gauss{

 double alfa[];
 private int j;
 private int k;
 private int i;

 public Gauss(int N) {

 	alfa = new double[N];
    i=0;
    j=0;
    k=0;
 }

 void Solve(double MatrizA[][], double vetor[],int n){

		double p=0;
			for(k= 0; k< n-2; k++){
				for(i = k+1; i< n-1; i++){
					if (MatrizA[k][k] != 0) p = MatrizA[i][k]/MatrizA[k][k];
					for(j=0; j<1; j++){
						MatrizA[i][j] = MatrizA[i][j]- p*MatrizA[k][j];
					}
					vetor[i] = vetor[i]- p*vetor[k];
				}
			}
			p= 0;
			if (MatrizA[n][n] != 0) alfa[n] = vetor[n]/MatrizA[n][n];
			for(i= n-2; i>0; i--){
				for(j= i; i< n-1; i++){
					p= p+ MatrizA[i][j]*alfa[j];
					if (MatrizA[i][i] != 0) alfa[i] = (vetor[i]-p)/MatrizA[i][i];
				}
			}
	}
}