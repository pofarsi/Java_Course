package lecture08.section08.WorkWithFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WorkingWithFiles {
    public static void main(String[] args) {
// creat a file

        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        String fileName = "src/example.csv";

        File file = new File(fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println(file.getName());

            } catch (IOException e) {
                System.out.println(e);
            }
        }

        // write file
        try {
            // if put true here we append every thing, (fileName, true); .
            FileWriter fileWriter = new FileWriter(fileName);
            PrintWriter writer = new PrintWriter(fileWriter);
            writer.println("000, name ");
            writer.println("123, Ali ");
            writer.println("567, Alex ");
            writer.flush();
            writer.close();
            System.out.println("Added to file");
        } catch (IOException e) {
            System.out.println(e);
        }

        // reading file
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader reader =
                    new BufferedReader(fileReader);
            //BufferedReader reader = new BufferedReader(new FileReader(file));

            String content = "";
//            reader.readLine(); //skip first line header
            System.out.println("header " + reader.readLine());

            List<User> users = new ArrayList<>();
            while ((content = reader.readLine()) != null) {
//                System.out.println(content);
                String[] split = content.split(",");
                int id = Integer.parseInt(split[0]);
                String name = split[1];
                User user = new User(id, name);
//                System.out.println(user);
                users.add(user);
            }

            reader.close();

            System.out.println("Looping ");
            users.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
