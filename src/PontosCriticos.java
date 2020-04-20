package AdvanceMath;

/*
*********************************************
Classe PontosCriticos
*********************************************
Construtor: Simplesmente inicializa duas variáveis
Construtor2: inicaliza uma função discreta com
             espaçamento h
*********************************************
Métodos:

double MaxValorDoVetor():
encontra o máximo valor de um vetor
double MinValorDoVetor():
encontrar o mínimo valor de um vetor
void GetPosicaoMax():
retorna a posição dos máximos de uma função discreta
retorna Xmas[dim1]
ou vetor com os pontos de máximo
void GetPosicaoMin():
retorna a posição dos mínimos de uma função discreta
ou o vetor com os pontos de mínimo
void Assintotas():
Retorna o vetor Infs com a posição das assíntotas.Isto
é quando Limite(x->a) = 00

*/

import java.util.*;
import java.io.*;

public class PontosCriticos {

   double max;
   double min;
   public double Xmax[]= new double[1000];
   public double Xmin[]= new double[1000];
   double aux[];
   boolean Infs[];
   double Y[];
   double H;
   public int dim1=0;
   public int dim2=0;


 public PontosCriticos(){
   max = 0;
   min = 0;
 }

 public PontosCriticos(double y[], double h){
    Y= new double[y.length];
    System.arraycopy(y,0,Y,0,y.length);
    H = h;
 }

 public void Assintotas(){
   Infs = new boolean[Y.length];
   for(int i=0; i < Y.length;i++){
    if (Y[i]==Math.abs(Math.pow(10,20))) {
     Infs[i]=true;
    } else {
     Infs[i]=false;
    }
   }
 }


 public double MaxValorDoVetor(double y[],int n) {
    aux = new double[n];
    System.arraycopy(y,0,aux,0,n);
    Arrays.sort(aux);
    max = aux[n-1];
    return max;
 }

 public double MinValorDoVetor(double y[], int n) {
    aux = new double[n];
    System.arraycopy(y,0,aux,0,n);
    Arrays.sort(aux);
    min = aux[0];
    return min;
 }

 public void GetPosicaoMax(double x[], double y[], double maximo) {
   int j = 0;

   for(int i = 0; i < y.length; i++) {
     if (y[i]== maximo) {
       Xmax[j]= x[i];
       j= j+1;
     };
   };
   dim1= j;
 }// Xmax([dim1])

 public void GetPosicaoMin(double x[], double y[], double minimo) {
  int j = 0;

   for(int i = 0; i < y.length; i++) {
     if (y[i]== minimo) {
       Xmin[j]= x[i];
       j= j+1;
     };
   };
   dim2= j;
 }
}// Xmin([dim2])