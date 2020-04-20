package AdvanceMath;

public class ProdutoInterno {
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