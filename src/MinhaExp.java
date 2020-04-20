package AdvanceMath;

public class MinhaExp {

 private double v1[];
 private double v2[];
 private int N;

 // construtor
 public MinhaExp(double coef1[], double coef2[], int n) {

  v1= new double[n];
  v2= new double[n];

  N = n;
  for(int i = 0; i < N; i++) {
          // coef1 (ao,a1,a2..an)
          // coef2 (alfa1,alfa2,alfa3...alfan)
          v1[i] = coef1[i];
          v2[i] = coef2[i];
  }
}

 public double MeuValor(double x) {

  double prod1[] = new double[N];
  double prod2[] = new double[N];
  double resultado = 0;


  // gera os valores de prod1=(alfa0x,alfa1x....alfanx)
  for(int i = 0; i < N; i++) {

           prod1[i]= (x*v2[i]);
  };

 // gera os valores de prod2=(aoexp(alfao*x),a1exp(alfa1*x)....anexp(alfan*x))
 // o resultado é PnExp(x)

  for(int  i = 0; i < N; i++) {

           prod2[i]= (v1[i]*Math.exp(prod1[i]));
           resultado = prod2[i] + resultado;
  };

  return resultado;
 }
}