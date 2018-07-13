/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.servlet;

import atos.shop.entity.Categorie;
import atos.shop.services.CategorieService;
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
@WebServlet(name = "SupprimerCategorieServlet", urlPatterns = {"/supprimer-categorie"})
public class SupprimerCategorieServlet extends HttpServlet {
    
    private CategorieService categorieService = new CategorieService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Long id = Long.parseLong(req.getParameter("idCat"));
        Categorie c = new Categorie();
        c.setId(id);
        categorieService.supprimerCategorie(c);
        resp.sendRedirect("lister-categories");

    }

}
