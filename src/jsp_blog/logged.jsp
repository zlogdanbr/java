<%@ include file="html/header.html"%>

<% 
 String userN = request.getParameter("user");
 String senhaN = request.getParameter("senha");
 String controle = request.getParameter("control");
 
 if ( controle.equals("conectado") ) {	 
	 
	 if ( ( userN.equals("javarules") ) && ( senhaN.equals("jacu20") )  ){
	 		out.println("<h2>Bem-vindo Daniel.</h2>");
			session = request.getSession(true);
      session.setAttribute("conectado", new String("true"));

			%>
			<ul>
					<li><a href="postar.jsp">Postar</a></li>
					<li><a href="apagar.jsp">Apagar</a></li>
			</ul>
	 <%
	 } else {
	 	  out.println("<h3>Erro!!!</h3>");
			out.println("<h3>usuário não autorizado</h3>");
	 }
 } else if ( controle.equals("null") ) {
   		out.println("<h3>Erro!!!</h3>");
			out.println("<h3>usuário não autorizado</h3>");
 }
 %>

<%@ include file="html/footer.html"%>