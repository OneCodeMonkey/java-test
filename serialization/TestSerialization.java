import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable {
    String name;
    String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
}

public class TestSerialization {
    public static void main(String[] args) {
        // 创建 Dog 对象
        Dog dog1 = new Dog("Tyson", "Labrador");

        try {
            FileOutputStream fileOut = new FileOutputStream("file.txt");

            // 创建 ObjectOutputStream
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);

            // 将 dog1 序列化为二进制并写出
            objOut.writeObject(dog1);

            // 读取文件
            FileInputStream fileIn = new FileInputStream("file.txt");
            ObjectInputStream objIn = new ObjectInputStream(fileIn);

            // 读出并反序列化为 newDog
            Dog newDog = (Dog) objIn.readObject();

            System.out.println("Dog Name: " + newDog.name);
            System.out.println("Dog Breed: " + newDog.breed);

            objOut.close();
            objIn.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}