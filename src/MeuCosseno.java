package AdvanceMath;

public class MeuCosseno {

 protected double a;
 protected double alf;
 protected double bet;
 final static double pi = 3.14159265359;


 public MeuCosseno(double A, double alfa, double beta) {
   a = A;
   alf = alfa;
   bet = beta;
 }

 // f(x)= A cos(alfa*X+ beta)
 public double MeuValor(double x) {
   double resultado = 0;
   double argumento = 0;

   argumento = alf*x+bet;
   resultado = a*Math.cos(argumento);
   return resultado;
 }

 public double XMin(int k) {
  return ((pi*(2*k+1)-bet)/alf);
 }

 public double XMax(int k) {
  return ((2*k*pi-bet)/alf);
 }

}