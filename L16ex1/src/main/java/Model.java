import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Model implements Serializable {
    private List<String> messages = new ArrayList<>();
    private static final Logger LOGGER = LoggerFactory.getLogger(Model.class);

    public static Model read() {
        try {
            FileInputStream fis = new FileInputStream("data.txt");
            ObjectInputStream oin = new ObjectInputStream(fis);
            return (Model) oin.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new Model();
        }
    }

    public String addMessage(String message) {
        messages.add(message);
        serialize();
        return "Success";
    }

    private void serialize() {
        try {
            FileOutputStream fos = new FileOutputStream("data.txt");//открытие потока, для чтения файла.
            ObjectOutputStream oos = new ObjectOutputStream(fos);//преобразования байтов файла в объект.
            oos.writeObject(this);//записывает объект в файл
            oos.flush();
            oos.close();//закрытие потока
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
    }

    public List<String> getMessages() {
        return messages;
    }

}

