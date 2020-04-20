package AdvanceMath;

public class MeuSeno {

 protected double a;
 protected double alf;
 protected double bet;
 final static double pi = 3.14159265359;

 public MeuSeno(double A, double alfa, double beta) {
   a = A;
   alf = alfa;
   bet = beta;
 }

 // f(x)= A SEN(alfa*X+ beta)
 public double MeuValor(double x) {
   double resultado = 0;
   double argumento = 0;

   argumento = alf*x+bet;
   resultado = a*Math.sin(argumento);
   return resultado;
 }

 public double XMax(int k) {
  return (((k+1)*(pi/2)-bet)/alf);
 }

 public double XMin(int k) {
  return (((3*pi/2)*k-bet)/alf);
 }

}