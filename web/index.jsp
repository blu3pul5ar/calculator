<%-- 
    Document   : index
    Created on : Jan 27, 2016, 6:40:23 PM
    Author     : Nicholas
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="style.css" rel="stylesheet">
    </head>
    <body>
        <div id="rectangle">
        <h2>area of a rectangle</h2>
        <form method="Post" action="Calculater?calcType=rectangle" name="rectangle">
            <label>Enter Length:</label>
            <input type="number" name="length"/>
            <label>Enter Width:</label>
            <input type="number" name="width"/>
            <button type="submit">Submit</button>
        </form>
        </div>
        <div id="circle">
        <h2>area of a circle</h2>
        <form method="Post" action="Calculater?calcType=circle" name="circle" >
            <label>Enter radius</label>
            <input type="number" name="radius"/>
            <button type="submit">Submit</button>
        </form>
        </div>
        <div id="triangle">
        <h2>area of a triangle</h2>
        <form method="Post" action="Calculater?calcType=triangle" name="triangle" >
            <label>Base</label>
            <input type="number" name="base"/>
            <label>Height</label>
            <input type="number" name="height"/>
            <button type="submit">Submit</button>
        </form>
        </div>
        <h2 id="answer">
            <c:out value="${answer}"></c:out>
        </h2>
    <center><img src="areas.png"/></center>
    </body>
</html>
