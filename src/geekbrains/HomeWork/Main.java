package geekbrains.HomeWork;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args)  {

        File file = new File("car.txt");
        System.out.println(file.isFile());
        System.out.println(file.exists());
        AppData car1 = new AppData("sunny", 50, 2000);

        int count;
        ArrayList<AppData> arrayList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            while ((count = bufferedReader.read()) != -1){
                System.out.print((char)count);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
