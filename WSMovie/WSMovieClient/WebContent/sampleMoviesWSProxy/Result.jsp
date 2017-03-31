<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleMoviesWSProxyid" scope="session" class="mx.edu.utng.ws.MoviesWSProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleMoviesWSProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleMoviesWSProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleMoviesWSProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        mx.edu.utng.ws.MoviesWS getMoviesWS10mtemp = sampleMoviesWSProxyid.getMoviesWS();
if(getMoviesWS10mtemp == null){
%>
<%=getMoviesWS10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 15:
        gotMethod = true;
        String sinopsis_2id=  request.getParameter("sinopsis20");
            java.lang.String sinopsis_2idTemp = null;
        if(!sinopsis_2id.equals("")){
         sinopsis_2idTemp  = sinopsis_2id;
        }
        String name_3id=  request.getParameter("name22");
            java.lang.String name_3idTemp = null;
        if(!name_3id.equals("")){
         name_3idTemp  = name_3id;
        }
        String type_4id=  request.getParameter("type24");
        int type_4idTemp  = Integer.parseInt(type_4id);
        String price_5id=  request.getParameter("price26");
        float price_5idTemp  = Float.parseFloat(price_5id);
        String id_6id=  request.getParameter("id28");
        int id_6idTemp  = Integer.parseInt(id_6id);
        %>
        <jsp:useBean id="mx1edu1utng1ws1Movie_1id" scope="session" class="mx.edu.utng.ws.Movie" />
        <%
        mx1edu1utng1ws1Movie_1id.setSinopsis(sinopsis_2idTemp);
        mx1edu1utng1ws1Movie_1id.setName(name_3idTemp);
        mx1edu1utng1ws1Movie_1id.setType(type_4idTemp);
        mx1edu1utng1ws1Movie_1id.setPrice(price_5idTemp);
        mx1edu1utng1ws1Movie_1id.setId(id_6idTemp);
        int addMovie15mtemp = sampleMoviesWSProxyid.addMovie(mx1edu1utng1ws1Movie_1id);
        String tempResultreturnp16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addMovie15mtemp));
        %>
        <%= tempResultreturnp16 %>
        <%
break;
case 30:
        gotMethod = true;
        String sinopsis_8id=  request.getParameter("sinopsis35");
            java.lang.String sinopsis_8idTemp = null;
        if(!sinopsis_8id.equals("")){
         sinopsis_8idTemp  = sinopsis_8id;
        }
        String name_9id=  request.getParameter("name37");
            java.lang.String name_9idTemp = null;
        if(!name_9id.equals("")){
         name_9idTemp  = name_9id;
        }
        String type_10id=  request.getParameter("type39");
        int type_10idTemp  = Integer.parseInt(type_10id);
        String price_11id=  request.getParameter("price41");
        float price_11idTemp  = Float.parseFloat(price_11id);
        String id_12id=  request.getParameter("id43");
        int id_12idTemp  = Integer.parseInt(id_12id);
        %>
        <jsp:useBean id="mx1edu1utng1ws1Movie_7id" scope="session" class="mx.edu.utng.ws.Movie" />
        <%
        mx1edu1utng1ws1Movie_7id.setSinopsis(sinopsis_8idTemp);
        mx1edu1utng1ws1Movie_7id.setName(name_9idTemp);
        mx1edu1utng1ws1Movie_7id.setType(type_10idTemp);
        mx1edu1utng1ws1Movie_7id.setPrice(price_11idTemp);
        mx1edu1utng1ws1Movie_7id.setId(id_12idTemp);
        int editMovie30mtemp = sampleMoviesWSProxyid.editMovie(mx1edu1utng1ws1Movie_7id);
        String tempResultreturnp31 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(editMovie30mtemp));
        %>
        <%= tempResultreturnp31 %>
        <%
break;
case 45:
        gotMethod = true;
        mx.edu.utng.ws.Movie[] getMovies45mtemp = sampleMoviesWSProxyid.getMovies();
if(getMovies45mtemp == null){
%>
<%=getMovies45mtemp %>
<%
}else{
        String tempreturnp46 = null;
        if(getMovies45mtemp != null){
        java.util.List listreturnp46= java.util.Arrays.asList(getMovies45mtemp);
        tempreturnp46 = listreturnp46.toString();
        }
        %>
        <%=tempreturnp46%>
        <%
}
break;
case 48:
        gotMethod = true;
        String id_13id=  request.getParameter("id61");
        int id_13idTemp  = Integer.parseInt(id_13id);
        mx.edu.utng.ws.Movie getOneMovie48mtemp = sampleMoviesWSProxyid.getOneMovie(id_13idTemp);
if(getOneMovie48mtemp == null){
%>
<%=getOneMovie48mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">sinopsis:</TD>
<TD>
<%
if(getOneMovie48mtemp != null){
java.lang.String typesinopsis51 = getOneMovie48mtemp.getSinopsis();
        String tempResultsinopsis51 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesinopsis51));
        %>
        <%= tempResultsinopsis51 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">name:</TD>
<TD>
<%
if(getOneMovie48mtemp != null){
java.lang.String typename53 = getOneMovie48mtemp.getName();
        String tempResultname53 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename53));
        %>
        <%= tempResultname53 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">type:</TD>
<TD>
<%
if(getOneMovie48mtemp != null){
%>
<%=getOneMovie48mtemp.getType()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">price:</TD>
<TD>
<%
if(getOneMovie48mtemp != null){
%>
<%=getOneMovie48mtemp.getPrice()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(getOneMovie48mtemp != null){
%>
<%=getOneMovie48mtemp.getId()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 63:
        gotMethod = true;
        String id_14id=  request.getParameter("id66");
        int id_14idTemp  = Integer.parseInt(id_14id);
        int removeMovie63mtemp = sampleMoviesWSProxyid.removeMovie(id_14idTemp);
        String tempResultreturnp64 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(removeMovie63mtemp));
        %>
        <%= tempResultreturnp64 %>
        <%
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>