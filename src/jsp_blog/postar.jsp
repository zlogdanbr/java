<%@ include file="html/header.html"%>

<% 
	 session = request.getSession();
	 String conectado = (String)session.getAttribute("conectado");
	 if (conectado.equals("true")) {
	 %>
 
<h1>>>>Postar</h1>
<form action="posted.jsp" method="post">
<table cellspacing="2">
			 <tr>
			 		 <td>
					 <h2>Assunto:</h2>
					 </td>
					 <td>
					 <input type="text" name = "assunto" size="50" />
					 </td>
			 </tr>
			 <tr>
			 		 <td>
					 <h2>Mensagem:</h2>
					 </td>
					 <td>
					 <textarea rows="10" cols="80" name="message"></textarea>
					 </td>
			 </tr>
			 <tr>
			 		 <td>
					 <button type="submit">Enviar</button>
					 </td>
			 </tr>
</table>
</form>
<%
		} else {%>
			<h3>Erro</h3>
		<%}%>		 


<%@ include file="html/footer.html"%>