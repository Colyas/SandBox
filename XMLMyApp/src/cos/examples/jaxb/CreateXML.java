package cos.examples.jaxb;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class CreateXML {

	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		
		Company company = new Company();
		company.setName("ITCompany");
		
		Departament itDepartament = new Departament();
		itDepartament.setName("IT");
		
		Worker worker = new Worker();
		worker.setName("Tom");
		itDepartament.addWorker(worker);
		
		Worker worker2 = new Worker();
		worker2.setName("Nick");
		itDepartament.addWorker(worker2);
		company.addDepartament(itDepartament);
		
		Departament hrDepartament = new Departament();
		hrDepartament.setName("HR");
		
		Worker worker3 = new Worker();
		worker3.setName("Tina");
		hrDepartament.addWorker(worker3);
		
		Worker worker4 = new Worker();
		worker4.setName("Nicka");
		hrDepartament.addWorker(worker4);
		company.addDepartament(hrDepartament);
		 
		JAXBContext jc = JAXBContext.newInstance(Company.class);
		
		File file = new File("files/jaxb.xml");
		Marshaller marshaller = jc.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(company, file);
		
		Unmarshaller unmarshaller = jc.createUnmarshaller();
		Company company2 = (Company)unmarshaller.unmarshal(new FileReader(file));
		ArrayList<Departament> departaments2 = company2.getDepartaments();

			for(int i = 0; i < departaments2.size(); i++){
				ArrayList<Worker> workers2 = departaments2.get(i).getWorkers();
				System.out.println(departaments2.get(i).getName());
				for(int j = 0; j < workers2.size(); j++){
					System.out.println(workers2.get(j).getName());
				}
			
		}

	}

}
