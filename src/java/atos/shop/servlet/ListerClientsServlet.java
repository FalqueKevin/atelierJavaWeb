/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.servlet;

import atos.shop.entity.Client;
import atos.shop.services.ClientService;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrateur
 */
@WebServlet(name = "ListerClientsServlet", urlPatterns = {"/lister-clients"})
public class ListerClientsServlet extends HttpServlet {

    private ClientService clientService = new ClientService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        //récupérer la liste des categories en BD
        List<Client> clients = clientService.listerClients();
        
        //set un attribut de requete avec liste categorie
        req.setAttribute("listeClients", clients);
        
        //forward vers vue
        req.getRequestDispatcher("lister-clients.jsp").forward(req, resp);
        
    }

}
