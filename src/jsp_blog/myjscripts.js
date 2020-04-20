//JavaScripts
//Daniel Vasconcelos Gomes


////////////////////////////////////////////
//Nota: Nem todas estas funções estão 
//sendo utilizadas nesta página, mas serão.
/////////////////////////////////////////



function DefineInicioCamada(){
				 var bname = navigator.appName;

				 if (bname== "Microsoft Internet Explorer")
				  {
					  document.write("<div");

					} else 
					{
					  document.write("<layer");
					}					
}

function DefineFimCamada(){
				 var bname = navigator.appName;
				 if (bname== "Microsoft Internet Explorer")
				  {
					  document.write("</div>");
					} else 
					{
					  document.write("</layer>");
					}	
}

//Mostra a data na barra de status
function MudarTextoStatusBar(){
var s = DataHoje();
window.status = s;
}

//Função que mostra e esconde o menu
function showmenu2(el) {
 var mydom = findDOM(el,1);  
 mydom.visibility="visible";
}
function hidemenu2(el) {
 var mydom = findDOM(el,1); 
 mydom.visibility="hidden";
}

//Mostra e esconde um objeto após o evento On CLICK
// left
function ShowIt(myid) 
{ 
var obj = findDOM(myid,1);
if (obj.display=="none" ) 
 obj.display = ""; 
else 
 obj.display ="none"; 
} 

//retornar a data de Hoje no formato DD/MM/Ano
function DataHoje()
{
 var d = new Date();
 var dia = d.getDate()+ " DE ";
 var m = d.getMonth();
 var mes = getMesEmString(m) + " DE " ;
 var ano =d.getYear();
 return dia+mes+ano; 
}
//Retorna dia da Semana em String
function getMesEmString(mes)
{
var mess;
switch (mes)
 {
 case 0 :
  mess = "JANEIRO";
  break;
 case 1 :
  mess = "FEVEREIRO";
  break;
 case 2 :
  mess = "MARÇO";
  break;
 case 3 :
  mess = "ABRIL";
  break;
 case 4 :
  mess = "MAIO";
  break;
 case 5 :
  mess = "JUNHO";
  break;
 case 6 :
  mess = "JULHO";
  break;
 case 7 :
  mess = "AGOSTO";
  break;
 case 8 :
  mess = "SETEMBRO";
  break;
 case 9 :
  mess = "OUTUBRO";
  break;
 case 10 :
  mess = "NOVEMBRO";
  break;
 case 11 :
  mess = "DEZEMBRO";
  break;
 default:
  mess="Não Especificado";
 };
return mess;
}

//funções para dimensao da tela

//altura ativa
function H() {
	h_= window.screen.availHeight;			 
  return h_; 
}

//largura ativa
function L() {
	l_ = window.screen.availWidth;
 	return l_; 
}

//largura de um objeto
function lo( meuid ){
 	var theDOM = findDOM(meuid,1);
	var lo_ = theDOM.offsetWidth;
	return lo_;
}

//altura de um objeto
function ho( meuid ){
 	var theDOM = findDOM(meuid,1);
	var ho_ = theDOM.offsetHeight;
	return ho_;
}

//dimensiona a tabela em 90 % do tamanho da tela ativa
function DimensionaTabelaDeMenu(tab)
{
 var L_ = L(); 
 document.getElementById(tab).width = 0.9*L_;
}

//Alinha verticalmente as linhas da tabela
function DimensionaCel2(tab){
 var x=document.getElementById(tab).rows;
 x[0].vAlign="top";
 x[1].vAlign="top";  
}

//Dimensiona objetos
//ainda não utilizada
function DimensionObjeto( oid ) 
{
 var DOM = findDOM( oid, 1 );
 var H = H();
 var L = L();
 var lo = lo( oid );
 var ho = ho( oid );
}
/*FIM DO ARQUIVO*/

