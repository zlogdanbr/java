package AdvanceMath;

class ProdutoInterno {
 private double cont;

 public ProdutoInterno() {
  cont=0;
 }

 public double innerp(double u[], double v[], int N){

  for(int i=0; i< N-1 ;i++){
	cont = u[i]*v[i] + cont;
  }
  return cont;
 }
}

public class Interpola {

    int option;
    double mat[][]= null;
    double uo[] = null;
    double u1[] = null;
    double u2[] = null;
    double u3[] = null;
    double vet[] = null;


	public Interpola(int opt){
      option = opt;
	}

	public void Sistema(double xd[],double yd[]){

        int m=0;
        int n = xd.length;
        ProdutoInterno ipd = new ProdutoInterno();

		switch(option) {
			case 1:
			m = 2;
			for(int i=0; i < m-1; i++){
				uo[i] = 1;
				u1[i] = xd[i];
			}
			mat[0][0] = ipd.innerp(uo,uo,n);
			mat[0][1] = ipd.innerp(u1,uo,n);
			mat[1][0] = ipd.innerp(uo,u1,n);
			mat[1][1] = ipd.innerp(u1,u1,n);
			vet[0] = ipd.innerp(uo,yd,n);
			vet[1] = ipd.innerp(u1,yd,n);
			case 2:
			m = 3;
			for(int i=0; i < m-1; i++){
				uo[i] = 1;
				u1[i] = xd[i];
				u2[i] = xd[i]*xd[i];
			}
			mat[0][0] = ipd.innerp(uo,uo,n);
			mat[0][1] = ipd.innerp(u1,uo,n);
			mat[0][2] = ipd.innerp(u2,u1,n);
			mat[1][0] = ipd.innerp(uo,u1,n);
			mat[1][1] = ipd.innerp(u1,u1,n);
			mat[1][2] = ipd.innerp(u2,u1,n);
			mat[2][0] = ipd.innerp(uo,u2,n);
			mat[2][1] = ipd.innerp(u1,u2,n);
			mat[2][2] = ipd.innerp(u2,u2,n);
			vet[0] = ipd.innerp(uo,yd,n);
			vet[1] = ipd.innerp(u1,yd,n);
			vet[2] = ipd.innerp(u2,yd,n);
			case 3:
			m=4;
			for(int i=0; i < m-1; i++){
				uo[i] = 1;
				u1[i] = xd[i];
				u2[i] = xd[i]*xd[i];
				u3[i] = xd[i]*xd[i]*xd[i];
			}
			mat[0][0] = ipd.innerp(uo,uo,n);
			mat[0][1] = ipd.innerp(u1,uo,n);
			mat[0][2] = ipd.innerp(u2,uo,n);
			mat[0][3] = ipd.innerp(u3,uo,n);
			mat[1][0] = ipd.innerp(uo,u1,n);
			mat[1][1] = ipd.innerp(u1,u1,n);
			mat[1][2] = ipd.innerp(u2,u1,n);
			mat[1][3] = ipd.innerp(u3,u1,n);
			mat[2][0] = ipd.innerp(uo,u2,n);
			mat[2][1] = ipd.innerp(u1,u2,n);
			mat[2][2] = ipd.innerp(u2,u2,n);
			mat[2][3] = ipd.innerp(u3,u2,n);
			mat[3][0] = ipd.innerp(uo,u3,n);
			mat[3][1] = ipd.innerp(u1,u3,n);
			mat[3][2] = ipd.innerp(u2,u3,n);
			mat[3][3] = ipd.innerp(u3,u3,n);
			vet[0] = ipd.innerp(uo,yd,n);
			vet[1] = ipd.innerp(u1,yd,n);
			vet[2] = ipd.innerp(u2,yd,n);
			vet[3] = ipd.innerp(u3,yd,n);

		}
	}

}