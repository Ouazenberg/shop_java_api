package com.gestion;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.gestion.model.Client;
import com.gestion.model.Commande;
import com.gestion.repository.ClientRepository;
import com.gestion.repository.CommandeRepository;

@SpringBootApplication
public class ShopApplication implements CommandLineRunner{
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private CommandeRepository commandeRepository;
	
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;	

	public static void main(String[] args) {
		SpringApplication.run(ShopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		this.repositoryRestConfiguration.exposeIdsFor(Client.class, Commande.class);
		
	Client ferhat = this.clientRepository.save(new Client(null, "OUAZENE", "Ferhat", null));
	Client mamine = this.clientRepository.save(new Client(null, "MENASRI", "Mamine", null));
	Client nassim = this.clientRepository.save(new Client(null, "SOLTANI", "Nassim", null));
	Client daniel = this.clientRepository.save(new Client(null, "MENASRI", "Daniel", null));
	Client syfax  = this.clientRepository.save(new Client(null, "ARKOUB", "Syfax", null));
	
	this.commandeRepository.save(new Commande(null, "PC Dell", 2, new Date(), ferhat));
	this.commandeRepository.save(new Commande(null, "Iphone 7", 1, new Date(), syfax));
	this.commandeRepository.save(new Commande(null, "Mac Book", 2, new Date(), syfax));
	this.commandeRepository.save(new Commande(null, "Huawei T80", 1, new Date(), mamine));
	this.commandeRepository.save(new Commande(null, "HDMI cable", 9, new Date(), ferhat));
	this.commandeRepository.save(new Commande(null, "Galaxy S6", 5, new Date(), daniel));
	this.commandeRepository.save(new Commande(null, "HP Printer", 1, new Date(), nassim));
	this.commandeRepository.save(new Commande(null, "PC Samsung", 4, new Date(), ferhat));

	
		
	}

}
