<%-- 
    Document   : index
    Created on : Jan 27, 2016, 6:40:23 PM
    Author     : Nicholas
--%>

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
    </head>
    <body>
        <h1>area of a rectangle</h1>
        <form method="Post" action="Calculater?calcType='rectangle'" name="rectangle">
            <label>Enter Length:</label>
            <input type="number" name="length"/>
            <label>Enter Width:</label>
            <input type="number" name="width"/>
            <button type="submit">Submit</button>
        </form>
        <form method="Post" action="Calculater?calcType='Circle'" name="circle">
            <label>Enter radius</label>
            <input type="number" name="radius"/>
            <button type="submit">Submit</button>
        </form>
        <form method="Post" action="Calculater?calcType='triangle'" name="triangle">
            <label>Side A</label>
            <input type="number" name="a"/>
            <label>Side B</label>
            <input type="number" name="b"/>
            <label>Side C</label>
            <input type="number" name="c"/>
            <button type="submit">Submit</button>
        </form>
    </body>
</html>
