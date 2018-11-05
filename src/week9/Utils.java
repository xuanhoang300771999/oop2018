package week9;

import java.io.*;
import java.util.ArrayList;

public class Utils {
    public static String readContentFromFile(String path) {
        BufferedReader br = null;
        String result = "";
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "utf-8"));
            String line;
            while ((line = br.readLine()) != null) {
                result += line;
                result += '\n';
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void BwriteContentToFile(String path) {
        BufferedReader br = null;
        String add = "Mai Văn Nam";
        ArrayList ar = new ArrayList<String>();
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "utf-8"));
            String line;
            while ((line = br.readLine()) != null) {
                ar.add(line);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 0; i < ar.size(); i++) {
            if (add.equals(ar.get(i)))
                ar.remove(i);
        }
        ar.add(add);
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            File file = new File(path);
            fw = new FileWriter(file.getAbsoluteFile());
            bw = new BufferedWriter(fw);
            for (int i = 0; i < ar.size(); i++) {
                bw.write(ar.get(i).toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void CwriteContentToFile(String path) {
        BufferedWriter bw = null;
        FileWriter fw = null;
        String add = "Mai Văn Nam";
        try {
            File file = new File(path);
            fw = new FileWriter(file.getAbsolutePath(), true);
            bw = new BufferedWriter(fw);
            bw.newLine();
            bw.write(add);
            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static File findFileByName(String folderPath, String fileName) {
        File file = new File(folderPath);
        File[] listfile = file.listFiles();
        if (listfile != null) {
            for (File f : listfile) {
                if (f.exists()) {
                    if (f.isFile()) {
                        if (f.getName().endsWith(fileName)) {
                            //System.out.println(file.getAbsolutePath());
                            return file.getAbsoluteFile();
                        }
                    }
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("_________ Test A _________");
        System.out.println(readContentFromFile("oop2018\\src\\week9\\Test.txt"));
        //Test b
        System.out.println("_________ Test B _________");
        BwriteContentToFile("oop2018\\src\\week9\\Test1.txt");
        System.out.println(readContentFromFile("oop2018\\src\\week9\\Test1.txt"));
        //Test c
        System.out.println("_________ Test C _________");
        CwriteContentToFile("oop2018\\src\\week9\\Test.txt");
        System.out.println(readContentFromFile("oop2018\\src\\week9\\Test.txt"));
        //Test d
        System.out.println("_________ Test D _________");
        File file = findFileByName("oop2018\\src\\week9", "Test1.txt");
        //System.out.println(findFileByName("oop2018\\src\\week9", "Test.txt"));
        System.out.println(file);
    }
}
