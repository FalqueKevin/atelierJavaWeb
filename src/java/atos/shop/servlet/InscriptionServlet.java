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
@WebServlet(name = "InscriptionServlet", urlPatterns = {"/inscription"})
public class InscriptionServlet extends HttpServlet {

    private ClientService clientService = new ClientService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Client c = new Client();
        c.setNom(req.getParameter("nom"));
        c.setPrenom(req.getParameter("prenom"));
        c.setLogin(req.getParameter("login"));
        c.setMdp(req.getParameter("mdp"));
        c.setNum(Integer.parseInt(req.getParameter("numero")));
        c.setRue(req.getParameter("rue"));
        c.setCodePostal(Integer.parseInt(req.getParameter("codePostal")));
        c.setVille(req.getParameter("ville"));
        clientService.ajouterClient(c);
        
        resp.sendRedirect("homepage");

    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("inscription.jsp").forward(req, resp);

    }

}
