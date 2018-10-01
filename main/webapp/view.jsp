<%@page import="com.sample.rest_example.ClientGet"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<script src="https://cdn.alloyui.com/3.0.1/aui/aui-min.js"></script>
<link href="https://cdn.alloyui.com/3.0.1/aui-css/css/bootstrap.min.css" rel="stylesheet"></link>

<portlet:defineObjects />
<%
ClientGet.show();
%>
This is the <b>rest-example</b>.