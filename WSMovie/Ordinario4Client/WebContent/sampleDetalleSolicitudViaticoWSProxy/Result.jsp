<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleDetalleSolicitudViaticoWSProxyid" scope="session" class="mx.edu.utng.ws.DetalleSolicitudViaticoWSProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleDetalleSolicitudViaticoWSProxyid.setEndpoint(request.getParameter("endpoint"));
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
        String comprobacionValida_1id=  request.getParameter("comprobacionValida7");
            java.lang.String comprobacionValida_1idTemp = null;
        if(!comprobacionValida_1id.equals("")){
         comprobacionValida_1idTemp  = comprobacionValida_1id;
        }
        String solicitudViatico_2id=  request.getParameter("solicitudViatico9");
            java.lang.String solicitudViatico_2idTemp = null;
        if(!solicitudViatico_2id.equals("")){
         solicitudViatico_2idTemp  = solicitudViatico_2id;
        }
        String montoOtorgado_3id=  request.getParameter("montoOtorgado11");
            java.lang.String montoOtorgado_3idTemp = null;
        if(!montoOtorgado_3id.equals("")){
         montoOtorgado_3idTemp  = montoOtorgado_3id;
        }
        String montoComprobado_4id=  request.getParameter("montoComprobado13");
            java.lang.String montoComprobado_4idTemp = null;
        if(!montoComprobado_4id.equals("")){
         montoComprobado_4idTemp  = montoComprobado_4id;
        }
        String partida_5id=  request.getParameter("partida15");
            java.lang.String partida_5idTemp = null;
        if(!partida_5id.equals("")){
         partida_5idTemp  = partida_5id;
        }
        String montoSolicitado_6id=  request.getParameter("montoSolicitado17");
            java.lang.String montoSolicitado_6idTemp = null;
        if(!montoSolicitado_6id.equals("")){
         montoSolicitado_6idTemp  = montoSolicitado_6id;
        }
        String id_7id=  request.getParameter("id19");
        int id_7idTemp  = Integer.parseInt(id_7id);
        %>
        <jsp:useBean id="mx1edu1utng1ws1DetalleSolicitudViatico_0id" scope="session" class="mx.edu.utng.ws.DetalleSolicitudViatico" />
        <%
        mx1edu1utng1ws1DetalleSolicitudViatico_0id.setComprobacionValida(comprobacionValida_1idTemp);
        mx1edu1utng1ws1DetalleSolicitudViatico_0id.setSolicitudViatico(solicitudViatico_2idTemp);
        mx1edu1utng1ws1DetalleSolicitudViatico_0id.setMontoOtorgado(montoOtorgado_3idTemp);
        mx1edu1utng1ws1DetalleSolicitudViatico_0id.setMontoComprobado(montoComprobado_4idTemp);
        mx1edu1utng1ws1DetalleSolicitudViatico_0id.setPartida(partida_5idTemp);
        mx1edu1utng1ws1DetalleSolicitudViatico_0id.setMontoSolicitado(montoSolicitado_6idTemp);
        mx1edu1utng1ws1DetalleSolicitudViatico_0id.setId(id_7idTemp);
        int agregarDetalleSolicitudViatico2mtemp = sampleDetalleSolicitudViaticoWSProxyid.agregarDetalleSolicitudViatico(mx1edu1utng1ws1DetalleSolicitudViatico_0id);
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(agregarDetalleSolicitudViatico2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
break;
case 21:
        gotMethod = true;
        String comprobacionValida_9id=  request.getParameter("comprobacionValida26");
            java.lang.String comprobacionValida_9idTemp = null;
        if(!comprobacionValida_9id.equals("")){
         comprobacionValida_9idTemp  = comprobacionValida_9id;
        }
        String solicitudViatico_10id=  request.getParameter("solicitudViatico28");
            java.lang.String solicitudViatico_10idTemp = null;
        if(!solicitudViatico_10id.equals("")){
         solicitudViatico_10idTemp  = solicitudViatico_10id;
        }
        String montoOtorgado_11id=  request.getParameter("montoOtorgado30");
            java.lang.String montoOtorgado_11idTemp = null;
        if(!montoOtorgado_11id.equals("")){
         montoOtorgado_11idTemp  = montoOtorgado_11id;
        }
        String montoComprobado_12id=  request.getParameter("montoComprobado32");
            java.lang.String montoComprobado_12idTemp = null;
        if(!montoComprobado_12id.equals("")){
         montoComprobado_12idTemp  = montoComprobado_12id;
        }
        String partida_13id=  request.getParameter("partida34");
            java.lang.String partida_13idTemp = null;
        if(!partida_13id.equals("")){
         partida_13idTemp  = partida_13id;
        }
        String montoSolicitado_14id=  request.getParameter("montoSolicitado36");
            java.lang.String montoSolicitado_14idTemp = null;
        if(!montoSolicitado_14id.equals("")){
         montoSolicitado_14idTemp  = montoSolicitado_14id;
        }
        String id_15id=  request.getParameter("id38");
        int id_15idTemp  = Integer.parseInt(id_15id);
        %>
        <jsp:useBean id="mx1edu1utng1ws1DetalleSolicitudViatico_8id" scope="session" class="mx.edu.utng.ws.DetalleSolicitudViatico" />
        <%
        mx1edu1utng1ws1DetalleSolicitudViatico_8id.setComprobacionValida(comprobacionValida_9idTemp);
        mx1edu1utng1ws1DetalleSolicitudViatico_8id.setSolicitudViatico(solicitudViatico_10idTemp);
        mx1edu1utng1ws1DetalleSolicitudViatico_8id.setMontoOtorgado(montoOtorgado_11idTemp);
        mx1edu1utng1ws1DetalleSolicitudViatico_8id.setMontoComprobado(montoComprobado_12idTemp);
        mx1edu1utng1ws1DetalleSolicitudViatico_8id.setPartida(partida_13idTemp);
        mx1edu1utng1ws1DetalleSolicitudViatico_8id.setMontoSolicitado(montoSolicitado_14idTemp);
        mx1edu1utng1ws1DetalleSolicitudViatico_8id.setId(id_15idTemp);
        int editarDetalleSolicitudViatico21mtemp = sampleDetalleSolicitudViaticoWSProxyid.editarDetalleSolicitudViatico(mx1edu1utng1ws1DetalleSolicitudViatico_8id);
        String tempResultreturnp22 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(editarDetalleSolicitudViatico21mtemp));
        %>
        <%= tempResultreturnp22 %>
        <%
break;
case 40:
        gotMethod = true;
        String id_16id=  request.getParameter("id43");
        int id_16idTemp  = Integer.parseInt(id_16id);
        int eliminarDetalleSolicitudViatico40mtemp = sampleDetalleSolicitudViaticoWSProxyid.eliminarDetalleSolicitudViatico(id_16idTemp);
        String tempResultreturnp41 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(eliminarDetalleSolicitudViatico40mtemp));
        %>
        <%= tempResultreturnp41 %>
        <%
break;
case 45:
        gotMethod = true;
        String id_17id=  request.getParameter("id62");
        int id_17idTemp  = Integer.parseInt(id_17id);
        mx.edu.utng.ws.DetalleSolicitudViatico obtenerDetalleSolicitudViatico45mtemp = sampleDetalleSolicitudViaticoWSProxyid.obtenerDetalleSolicitudViatico(id_17idTemp);
if(obtenerDetalleSolicitudViatico45mtemp == null){
%>
<%=obtenerDetalleSolicitudViatico45mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">comprobacionValida:</TD>
<TD>
<%
if(obtenerDetalleSolicitudViatico45mtemp != null){
java.lang.String typecomprobacionValida48 = obtenerDetalleSolicitudViatico45mtemp.getComprobacionValida();
        String tempResultcomprobacionValida48 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecomprobacionValida48));
        %>
        <%= tempResultcomprobacionValida48 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">solicitudViatico:</TD>
<TD>
<%
if(obtenerDetalleSolicitudViatico45mtemp != null){
java.lang.String typesolicitudViatico50 = obtenerDetalleSolicitudViatico45mtemp.getSolicitudViatico();
        String tempResultsolicitudViatico50 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesolicitudViatico50));
        %>
        <%= tempResultsolicitudViatico50 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">montoOtorgado:</TD>
<TD>
<%
if(obtenerDetalleSolicitudViatico45mtemp != null){
java.lang.String typemontoOtorgado52 = obtenerDetalleSolicitudViatico45mtemp.getMontoOtorgado();
        String tempResultmontoOtorgado52 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typemontoOtorgado52));
        %>
        <%= tempResultmontoOtorgado52 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">montoComprobado:</TD>
<TD>
<%
if(obtenerDetalleSolicitudViatico45mtemp != null){
java.lang.String typemontoComprobado54 = obtenerDetalleSolicitudViatico45mtemp.getMontoComprobado();
        String tempResultmontoComprobado54 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typemontoComprobado54));
        %>
        <%= tempResultmontoComprobado54 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">partida:</TD>
<TD>
<%
if(obtenerDetalleSolicitudViatico45mtemp != null){
java.lang.String typepartida56 = obtenerDetalleSolicitudViatico45mtemp.getPartida();
        String tempResultpartida56 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepartida56));
        %>
        <%= tempResultpartida56 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">montoSolicitado:</TD>
<TD>
<%
if(obtenerDetalleSolicitudViatico45mtemp != null){
java.lang.String typemontoSolicitado58 = obtenerDetalleSolicitudViatico45mtemp.getMontoSolicitado();
        String tempResultmontoSolicitado58 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typemontoSolicitado58));
        %>
        <%= tempResultmontoSolicitado58 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(obtenerDetalleSolicitudViatico45mtemp != null){
%>
<%=obtenerDetalleSolicitudViatico45mtemp.getId()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 64:
        gotMethod = true;
        mx.edu.utng.ws.DetalleSolicitudViatico[] getDetalle64mtemp = sampleDetalleSolicitudViaticoWSProxyid.getDetalle();
if(getDetalle64mtemp == null){
%>
<%=getDetalle64mtemp %>
<%
}else{
        String tempreturnp65 = null;
        if(getDetalle64mtemp != null){
        java.util.List listreturnp65= java.util.Arrays.asList(getDetalle64mtemp);
        tempreturnp65 = listreturnp65.toString();
        }
        %>
        <%=tempreturnp65%>
        <%
}
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