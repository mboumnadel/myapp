<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="<s:url value="/main.css"/>">
        <title><s:text name="HelloWorld.message"/></title>
    </head>

    <body>
        
        <s:include value="/header.jsp"></s:include>
        
        %{prod.productCode} <br/>
        <s:property value="%{prod.productCode}"/><br/>
        
        prod.productCode <br/>
        <s:property value="prod.productCode"/><br/>
        
        <br/>
        
        <h2><s:property value="message"/></h2>
    </body>
</html>

