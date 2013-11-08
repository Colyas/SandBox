package cos.examples.jaxb;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Company {
	
	
	private int id;
	
	private String name;
	
	private ArrayList<Departament> departaments;
	
	public Company(){
		departaments = new ArrayList<Departament>();
	}
	
	public void addDepartament(Departament departament) {
		departament.setCompany(this);
		departaments.add(departament);
	}
	
	@XmlAttribute
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@XmlAttribute
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@XmlElementWrapper(name="departaments")
	@XmlElement
	public ArrayList<Departament> getDepartaments() {
		return departaments;
	}

	public void setDepartaments(ArrayList<Departament> departaments) {
		this.departaments = departaments;
	}

}
