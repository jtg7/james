/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jamesgrimm
 */
@WebServlet(name = "Method8", urlPatterns = {"/Method8"})
public class Method8 extends HttpServlet {
    String[] userProfile(int data){
        String[] data1 = {"1","技育太郎","東京","男","プログラマー"};
        String[] data2 = {"2","技育花子","北海道","女","システムエンジニア"};
        String[] data3 = {"3","技育三郎","大阪","男","Webエンジニア"};
        String id = String.valueOf(data);
        if(id.equals(data1[0])){
        return data1;
    }else if(id.equals(data2[0])){
        return data2;
    }else if(id.equals(data3[0])){
        return data3;
    }else{
        return null;
    }
    }

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
            for(String prof:userProfile(1)){
                if (prof== "1"){
                    continue;
                }out.print(prof+"<br>");
            }for(String str:userProfile(2)){
                if (str=="2"){
                    continue;
                }out.print(str+"<br>");
            }for(String ing:userProfile(3)){
                if(ing=="3"){
                    continue;
                }out.print(ing+"<br>");
            }
          
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
