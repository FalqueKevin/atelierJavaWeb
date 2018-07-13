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
@WebServlet(name = "ListerCategoriesServlet", urlPatterns = {"/lister-categories"})
public class ListerCategoriesServlet extends HttpServlet {
    
    private CategorieService categorieService = new CategorieService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        //récupérer la liste des categories en BD
        List<Categorie> categories = categorieService.listerCategories();
        
        //set un attribut de requete avec liste categorie
        req.setAttribute("listeCat", categories);
        
        //forward vers vue
        req.getRequestDispatcher("lister-categorie.jsp").forward(req, resp);
        
    }

}
