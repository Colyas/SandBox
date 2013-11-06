package cos.examples.xml;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class WriteXML {

	public static void main(String[] args) throws IOException {

		Element rootElement = new Element("myDate");
		Document document = new Document(rootElement);

		Element firstName = new Element("firstName");
		firstName.addContent("Colya");
		rootElement.addContent(firstName);
		Element lastName = new Element("lastName");
		lastName.addContent("Surudin");
		rootElement.addContent(lastName);

		File file = new File("document.xml");
		XMLOutputter outputter = new XMLOutputter();
		outputter.setFormat(Format.getPrettyFormat());
		FileWriter fw = new FileWriter(file);
		outputter.output(document, fw);
		fw.close();

	}

}
