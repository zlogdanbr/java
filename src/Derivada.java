package AdvanceMath;

import java.util.*;
/*
  *********************************
  Classe Derivada
  *********************************

  Construtores:
  --
  xo, xf inicio e fim de um intervalo
  MAX, MIN máximo e mínimo de um intervalo
  double x: vetor de valores de x. Neste caso
  os valores de x são passados à função
  double y: valores de f(x)=y
  --
  y= f(x) (vetor Y discretização de Fn)
  h espaçamento entre as amostras
  FK_1 : f(xo-h) Onde xo é o inicio do intervalo [xo,xf]
  FK_N : f(xo+(N+1)k) ou f(xf+h)
  --

  Métodos:
  --
  DerivadaDeFuncao: Derivada de uma função discreta Fn
                    valores de x passados à função
  DerivadaPonto: valor de f'(x) num ponto value
  Derivar2Funcao: Derivada segunda de uma função discreta Fn
  DerivarFuncao: Derivada da função discreta Fn
                 Valores de x iguais a xo+hi
  VDerivadaAntesDoMaximo: valor da derivada antes de um máximo
  VDerivadaAntesDoMinimo: valor da derivada antes de um mínimo
*/
public class Derivada {

 double max;
 double min;
 double H;
 double xo;
 double xf;
 double fx_1;
 double fx_N;
 double X[];
 double Y[];
 public double DER[];
 public double DER2[];

 public
 Derivada(double XO, double XF, double MAX, double MIN, double x[], double y[]){

   X = new double[x.length];
   Y = new double[y.length];

   System.arraycopy(x,0,X,0,x.length);
   System.arraycopy(y,0,Y,0,y.length);

   max = MAX;
   min = MIN;
   xo = XO;
   xf = XF;

 }

 public Derivada(double y[], double h, double FX_1, double FX_N) {
  Y = new double[y.length];

  System.arraycopy(y,0,Y,0,y.length);
  H = h;
  fx_1= FX_1;
  fx_N= FX_N;
 }



 public double DerivadaPonto(double value, double f2, double f1){
  return ((f2-f1)/(2*H));
 }


 public void DerivarFuncao() {
  DER = new double[Y.length];
  for(int i = 0; i < Y.length; i++) {
        if (i==0) {
           DER[i]=((Y[1]-fx_1)/(2*H));
           continue;
        }
        else if (i==Y.length-1) {
           DER[i]= ((fx_N-Y[Y.length-1])/(2*H));
           continue;
        }
        else {
           DER[i]= ((Y[i+1]-Y[i-1])/(2*H));
           System.out.println("Y"+"i+1="+Y[i]);
        };
   }
 }

 public void Derivar2Funcao() {
  DER2 = new double[Y.length];
  for(int i = 0; i < Y.length; i++) {
        if (i==0) {
           DER[i]= (Y[1]-2*Y[0]+fx_1)/(Math.pow(H,2));
           continue;
        }
        else if (i==Y.length-1) {
           DER[i]= (fx_N-2*Y[Y.length-1]+Y[i-1])/(Math.pow(H,2));
           continue;
        }
        else {
           DER[i]= (fx_N-2*Y[i]+Y[i-1])/(Math.pow(H,2));
        };
   }
 }

 public double VDerivadaAntesDoMaximo() {
   double aux = 0;
   for(int i = 0; i < X.length; i++) {
        if (Y[i]==xo) {
           continue;
        };
        if (Y[i]==xf) {
           continue;
        };
        if (Y[i]==max) {
           aux = ((Y[i]-Y[i-1])/(X[i]-X[i-1]));
        };
   };
   return aux;
 }

 public double VDerivadaAntesDoMinimo() {
   double aux = 0;
   for(int i = 0; i < X.length; i++) {
        if (Y[i]==xo) {
           continue;
        };
        if (Y[i]==xf) {
           continue;
        };
        if (Y[i]==min) {
           aux = ((Y[i+1]-Y[i])/(X[i+1]-X[i]));
        };
   };
   return aux;
 }

 public void DerivadaDeFuncao(double fo, double ff) {
    DER = new double[X.length];
    for(int i = 0; i < X.length; i++) {
        if (i==0) {
           DER[i]=fo;
           continue;
        }
        else if (i==X.length-1) {
           DER[i]= ff;
           continue;
        }
        else {
           DER[i]= ((Y[i+1]-Y[i])/(X[i+1]-X[i]));
        };
   }
 }

}