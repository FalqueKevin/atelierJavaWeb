/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.services;

import atos.shop.dao.CategorieDAO;
import atos.shop.entity.Categorie;
import java.util.List;

/**
 *
 * @author Administrateur
 */
public class CategorieService {
    
    private CategorieDAO categorieDAO = new CategorieDAO();
    
    public void ajouterCategorie(Categorie c) {
        
        categorieDAO.ajouter(c);
        
    }

    public List<Categorie> listerCategories() {

        return categorieDAO.listerCategories();

    }
    
    public void supprimerCategorie(Categorie c) {
        
        categorieDAO.supprimer(c);
        
    }
    
}
