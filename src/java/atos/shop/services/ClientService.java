/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.services;

import atos.shop.dao.ClientDAO;
import atos.shop.entity.Client;
import java.util.List;

/**
 *
 * @author Administrateur
 */
public class ClientService {
    
    private ClientDAO clientDAO = new ClientDAO();
    
    public void ajouterClient(Client c) {
        
        clientDAO.ajouter(c);
        
    }

    public List<Client> listerClients() {

        return clientDAO.listerClients();

    }
    
    public Client connection(String login, String mdp) {
        
        return clientDAO.findByLoginAndPassword(login, mdp);
        
    }
    
}
