package AdvanceMath;

public class MyFilter {

 private double N;
 private double A;

 public MyFilter(double n, double a) {
   N = n;
   A = a;
 }

 public MyFilter() {
  N= 0;
  A= 0;
 }

 public MyFilter(double n) {
  N = n;
  A = n;
 }

 public double MeuValor(double x) {
   double resultado = 0;

   try {
      resultado = (1/(Math.pow(x,N)+A));
      return resultado;
   } catch (Exception e) {
      System.out.println("Erro" + e);
      return resultado = -1;
   }

 }
}