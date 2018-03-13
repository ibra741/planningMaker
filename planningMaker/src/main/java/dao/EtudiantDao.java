package dao;

import java.util.List;

import model.Etudiant;


public interface EtudiantDao {
	
	public boolean create(Etudiant e);
	public boolean delete(Etudiant e);
	public boolean update(Etudiant e);
	public Etudiant findById(int id);
	public List<Etudiant > findAll();	
	
	
}