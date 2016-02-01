/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.CircleCalc;
import models.RectangleCalc;
import models.TriangleCalc;

/**
 *
 * @author Nicholas
 */
@WebServlet(name = "Calculater", urlPatterns = {"/Calculater"})
public class Calculater extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           String width = request.getParameter("width");
           String length = request.getParameter("length");
           String radius = request.getParameter("radius");
           String base = request.getParameter("base");
           String height = request.getParameter("height");
           String calcType = request.getParameter("calcType");
           String answer;
           System.out.println(calcType);
            switch (calcType) {
                case "rectangle":
                    System.out.println("hi");
                    RectangleCalc rc = new RectangleCalc(width,length);
                    request.setAttribute("answer",rc.CalculateArea());
                    break;
                case "circle":
                    CircleCalc cc = new CircleCalc(radius);
                    request.setAttribute("answer",cc.CalculateArea());
                    break;
                case "triangle":
                    TriangleCalc tc = new TriangleCalc(base,height);
                    request.setAttribute("answer", tc.CalculateArea());
                default:
                    break;
            }
           RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
