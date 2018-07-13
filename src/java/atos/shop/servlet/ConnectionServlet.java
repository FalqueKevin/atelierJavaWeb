/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.servlet;

import atos.shop.entity.Client;
import atos.shop.services.ClientService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrateur
 */
@WebServlet(name = "ConnectionServlet", urlPatterns = {"/connection"})
public class ConnectionServlet extends HttpServlet {

    private ClientService clientService = new ClientService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String login = req.getParameter("login");
        String mdp = req.getParameter("mdp");
        Client client = clientService.connection(login, mdp);
        if (client == null) {
            //throw new RuntimeException("Erreur de connection");
            resp.sendRedirect("connection");
        }else {
            req.getSession().setAttribute("clientConnecte", client);
            resp.sendRedirect("homepage");
        }

    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("connection.jsp").forward(req, resp);

    }

}
