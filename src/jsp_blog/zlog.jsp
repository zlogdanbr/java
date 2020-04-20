<%@ include file="html/header.html"%>
<%@ page import="java.util.ArrayList" %>

<jsp:useBean id="msgs" class="com.daniel.Consultar"/>

<h1> >>> Zlog ..... </h1>



<h2> >>> mensagens.... </h2>

<p class="intro">
Aqui está meu Z-LoG! Diário de bordo sobre tecnologia, principalmente JAVA e
eletrônica digital! Para sugestões, dicas e correções: 
<a href="mailto:dansovg@ig.com.br">dansovg@ig.com.br</a>
</p>

<p class="intro">
Por favor, para maiores informações, visite minha página:
<a href="http://www.geocities.com/danielvg.geo" target="_blank">Tecnologia &amp; Outros </a>
</p>

			 
<% 	  
			msgs.setConsultar();
			String[] m = msgs.getConsultar();
			for ( int i = 0 ; i < m.length ; i++ ){
					
					out.println(m[i]);
			}
%>
			
<%@ include file="html/footer.html"%>