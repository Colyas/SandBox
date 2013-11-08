package cos.examples.jaxb;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Departament {
	
	private int id;
	
	private String name;
	
	private ArrayList<Worker> workers;
	
	private Company company;
	
	public Departament(){
		workers = new ArrayList<Worker>();
	}
	
	public void addWorker(Worker worker){
		worker.setDepartament(this);
		workers.add(worker);
	}

	@XmlAttribute
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	@XmlElementWrapper(name="workers")
	@XmlElement
	public ArrayList<Worker> getWorkers() {
		return workers;
	}

	public void setWorkers(ArrayList<Worker> workers) {
		this.workers = workers;
	}

	@XmlTransient
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

}
