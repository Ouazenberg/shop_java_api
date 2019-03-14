package com.gestion.model;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="pco", types= {Commande.class})
public interface CommandeProjection {
	
	public Long getId();
	public String getProduit();
	public int getQuantite();
	public Client getClient();

}
