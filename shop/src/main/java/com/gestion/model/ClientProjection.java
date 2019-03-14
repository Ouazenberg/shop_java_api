package com.gestion.model;

import java.util.Collection;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="pcl", types= {Client.class})
public interface ClientProjection {

	public Long getId();
	public String getNom();
	public String getPrenom();
	public Collection<Commande> getListCommandes();
	
	
}
