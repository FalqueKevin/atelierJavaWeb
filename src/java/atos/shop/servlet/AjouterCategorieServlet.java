/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.servlet;

import atos.shop.entity.Categorie;
import atos.shop.services.CategorieService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrateur
 */
@WebServlet(name = "AjouterCategorieServlet", urlPatterns = {"/ajouter-categorie"})
public class AjouterCategorieServlet extends HttpServlet {
    
    private CategorieService categorieService = new CategorieService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //ajoute la nouvelle categorie
        String nom = req.getParameter("nom");
        Categorie c = new Categorie();
        c.setNom(nom);
        categorieService.ajouterCategorie(c);
        
        // demander au navigateur de faire une req get vers la route de listerCategorieServlet
        resp.sendRedirect("lister-categories");

    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("ajouter-categorie.jsp").forward(req, resp);

    }
    
}
