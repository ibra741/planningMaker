package model;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

public class SoutenanceJoin {
	private int id;
	private Date date;
	private Time heure;
	private int id_salle;
	private String titreSujets;
	private String ContenuSujets;
	private String jurenom ;
	private String jurePrenom ;

	

	
	public String getJurenom() {
		return jurenom;
	}

	public void setJurenom(String jurenom) {
		this.jurenom = jurenom;
	}

	public String getJurePrenom() {
		return jurePrenom;
	}

	public void setJurePrenom(String jurePrenom) {
		this.jurePrenom = jurePrenom;
	}

	public SoutenanceJoin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getHeure() {
		return heure;
	}
	public void setHeure(Time heure) {
		this.heure = heure;
	}
	public int getId_salle() {
		return id_salle;
	}
	public void setId_salle(int id_salle) {
		this.id_salle = id_salle;
	}
	public String getTitreSujets() {
		return titreSujets;
	}
	public void setTitreSujets(String titreSujets) {
		this.titreSujets = titreSujets;
	}
	public String getContenuSujets() {
		return ContenuSujets;
	}
	public void setContenuSujets(String contenuSujets) {
		ContenuSujets = contenuSujets;
	}
	
	
	

	public SoutenanceJoin(int id, Date date, Time heure, int id_salle, String titreSujets, String contenuSujets,
			String jurenom, String jurePrenom) {
		super();
		this.id = id;
		this.date = date;
		this.heure = heure;
		this.id_salle = id_salle;
		this.titreSujets = titreSujets;
		ContenuSujets = contenuSujets;
		this.jurenom = jurenom;
		this.jurePrenom = jurePrenom;
	}

	@Override
	public String toString() {
		return "SoutenanceJoin [id=" + id + ", date=" + date + ", heure=" + heure + ", id_salle=" + id_salle
				+ ", titreSujets=" + titreSujets + ", ContenuSujets=" + ContenuSujets + ", jure=" + jurenom + "]";
	}

	
	
	
	

}
