package magacin;

import java.util.GregorianCalendar;

public class KucnaHemija extends Artikli {
	
	
	private String naziv;
	private String opis;
	private int sifra;
	private int kolicina;
	private GregorianCalendar rokTrajanja;
	
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}
	public GregorianCalendar getRokTrajanja() {
		return rokTrajanja;
	}
	public void setRokTrajanja(GregorianCalendar rokTrajanja) {
		this.rokTrajanja = rokTrajanja;
	}

	
	
	
}
