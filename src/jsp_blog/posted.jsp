<%@ include file="html/header.html"%>

<jsp:useBean id="postar" class="com.daniel.Postar"/>
<jsp:useBean id="datas" class="com.daniel.Datas"/>

<% 
	 datas.setData();
	 postar.setPost( datas.getData(), request.getParameter("assunto") , request.getParameter("message") );
	 
	 out.println("<p>Mensagem enviada!</p>");
%>

<a href="zlog.jsp">Ver Zlog</a>

<%@ include file="html/footer.html"%>