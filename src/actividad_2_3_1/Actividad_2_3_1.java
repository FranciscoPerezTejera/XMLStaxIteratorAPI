package actividad_2_3_1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;

public class Actividad_2_3_1 {

    public static void main(String[] args) throws XMLStreamException {

        try (FileOutputStream fichero = new FileOutputStream("src\\actividad_2_3_1\\ugadoresDeFutbol.xml")) {
            escribirXml(fichero);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void escribirXml(OutputStream fichero) throws XMLStreamException {

        XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
        XMLEventFactory eventFactory = XMLEventFactory.newInstance();
        XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(fichero);
        XMLEvent evento = eventFactory.createStartDocument();

        evento = eventFactory.createStartDocument("utf-8", "1.0");
        eventWriter.add(evento);
        eventWriter.add(eventFactory.createCharacters("\n"));
        eventWriter.add(eventFactory.createStartElement("", "", "jugadores"));
        eventWriter.add(eventFactory.createCharacters("\n"));
        eventWriter.add(eventFactory.createComment("XML de jugadores"));
        eventWriter.add(eventFactory.createCharacters("\n"));
        eventWriter.add(eventFactory.createCharacters("\t"));
        eventWriter.add(eventFactory.createStartElement("", "", "numero"));
        eventWriter.add(eventFactory.createAttribute("dorsal", "7"));
        eventWriter.add(eventFactory.createCharacters("\n"));
        eventWriter.add(eventFactory.createCharacters("\t\t"));
        eventWriter.add(eventFactory.createStartElement("", "", "nombre"));
        eventWriter.add(eventFactory.createCharacters("Cristiano Ronaldo"));
        eventWriter.add(eventFactory.createEndElement("", "", "nombre"));
        eventWriter.add(eventFactory.createCharacters("\n"));
        eventWriter.add(eventFactory.createCharacters("\t\t"));
        eventWriter.add(eventFactory.createStartElement("", "", "posicion"));
        eventWriter.add(eventFactory.createCharacters("Delantero centro"));
        eventWriter.add(eventFactory.createEndElement("", "", "posicion"));
        eventWriter.add(eventFactory.createCharacters("\n"));
        eventWriter.add(eventFactory.createCharacters("\t\t"));
        eventWriter.add(eventFactory.createStartElement("", "", "salario"));
        eventWriter.add(eventFactory.createAttribute("cantidad", "?"));
        eventWriter.add(eventFactory.createCharacters("30000000"));
        eventWriter.add(eventFactory.createEndElement("", "", "salario"));
        eventWriter.add(eventFactory.createCharacters("\n"));
        eventWriter.add(eventFactory.createCharacters("\t\t"));
        eventWriter.add(eventFactory.createStartElement("", "", "telefono"));
        eventWriter.add(eventFactory.createCharacters("678456321"));
        eventWriter.add(eventFactory.createEndElement("", "", "telefono"));
        eventWriter.add(eventFactory.createCharacters("\n"));
        eventWriter.add(eventFactory.createCharacters("\t"));
        eventWriter.add(eventFactory.createEndElement("", "", "numero"));
        eventWriter.add(eventFactory.createCharacters("\n"));
        eventWriter.add(eventFactory.createCharacters("\t"));
        eventWriter.add(eventFactory.createStartElement("", "", "numero"));
        eventWriter.add(eventFactory.createAttribute("dorsal", "10"));
        eventWriter.add(eventFactory.createCharacters("\n"));
        eventWriter.add(eventFactory.createCharacters("\t\t"));
        eventWriter.add(eventFactory.createStartElement("", "", "nombre"));
        eventWriter.add(eventFactory.createCharacters("Lionel Messi"));
        eventWriter.add(eventFactory.createEndElement("", "", "nombre"));
        eventWriter.add(eventFactory.createCharacters("\n"));
        eventWriter.add(eventFactory.createCharacters("\t\t"));
        eventWriter.add(eventFactory.createStartElement("", "", "posicion"));
        eventWriter.add(eventFactory.createCharacters("Media Punta"));
        eventWriter.add(eventFactory.createEndElement("", "", "posicion"));
        eventWriter.add(eventFactory.createCharacters("\n"));
        eventWriter.add(eventFactory.createCharacters("\t\t"));
        eventWriter.add(eventFactory.createStartElement("", "", "salario"));
        eventWriter.add(eventFactory.createAttribute("cantidad", "?"));
        eventWriter.add(eventFactory.createCharacters("25000000"));
        eventWriter.add(eventFactory.createEndElement("", "", "salario"));
        eventWriter.add(eventFactory.createCharacters("\n"));
        eventWriter.add(eventFactory.createCharacters("\t\t"));
        eventWriter.add(eventFactory.createStartElement("", "", "telefono"));
        eventWriter.add(eventFactory.createCharacters("777444333"));
        eventWriter.add(eventFactory.createEndElement("", "", "telefono"));
        eventWriter.add(eventFactory.createCharacters("\n"));
        eventWriter.add(eventFactory.createCharacters("\t"));
        eventWriter.add(eventFactory.createEndElement("", "", "numero"));
        eventWriter.add(eventFactory.createCharacters("\n"));
        eventWriter.add(eventFactory.createEndDocument());
        eventWriter.flush();
        eventWriter.close();
    }

}
