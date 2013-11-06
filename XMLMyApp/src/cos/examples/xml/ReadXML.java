package cos.examples.xml;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class ReadXML {

	public static void main(String[] args) throws JDOMException, IOException {
		SAXBuilder parser = new SAXBuilder();
		FileReader fr = new FileReader("document.xml");
		Document rDoc = parser.build(fr);
		System.out.println(rDoc.getRootElement().getName());
		List<Element> temp = rDoc.getRootElement().getChildren();
		for (int i = 0; i < temp.size(); ++i) {
			System.out.println(temp.get(i).getName() + ": " + temp.get(i).getText());

		}
	}

}
