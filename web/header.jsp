<%-- 
    Document   : header
    Created on : Apr 13, 2016, 2:54:53 PM
    Author     : mboumnadel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<div id="menu">
<ul>
  <li>
      <s:url id="url" namespace="/products" action="list">
        <s:param name="start">0</s:param>
        <s:param name="maxRows">10</s:param>
      </s:url>
      <s:a href="%{url}">Products</s:a>
  </li>
  <li><a href="#news">News</a></li>
  <li><a href="#contact">Contact</a></li>
  <li style="float:right"><a class="active" href="#about">About</a></li>
</ul>
</div>
