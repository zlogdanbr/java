package AdvanceMath;

public class MeuPolinomio {

 private double v[];
 private int N;

 // construtor
 public MeuPolinomio(double coef[], int n) {
  v= new double[n];
  N = n;
  for(int i = 0; i < N; i++) {
          v[i]= coef[i];
  }
}

 public double MeuValor(double x) {

  double pot[] = new double[N];
  double aux[] = new double[N];
  double resultado = 0;

  // gera os valores de 1, x, x^2, x^3...x^n

  for(int i = 0; i < N; i++) {
         pot[i]= Math.pow(x,i);
  };

 // gera os pares aox,a1x,a2x^2...anx^n
 // o resultado é Pn(x)

  for(int  i = 0; i < N; i++) {
   aux[i] = pot[i]*v[i];
   resultado = aux[i] + resultado;
  };

  return resultado;
 }
}