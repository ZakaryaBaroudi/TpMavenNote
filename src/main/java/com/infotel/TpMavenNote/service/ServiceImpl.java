package com.infotel.TpMavenNote.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotel.TpMavenNote.dao.Idao;
import com.infotel.TpMavenNote.metier.Etudiant;

@Service
public class ServiceImpl implements Iservice
{

	@Override
	public int ajouterEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
		return dao.ajouterEtudiant(e);
	}
	@Autowired
private Idao dao;
	public Idao getDao() {
		return dao;
	}
	public void setDao(Idao dao) {
		this.dao = dao;
	}
	@Override
	public String toString() {
		return "ServiceImpl [dao=" + dao + "]";
	}

}
