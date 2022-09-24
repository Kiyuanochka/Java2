package Lesson5;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CreateFileClass {

    public static ArrayList<FileObject> fileObjectArrayList= new ArrayList<>();
    public static final String partToFile = "src/Lesson5/demo.csv";
    public static final String Title = "Value 1" + ";" + "Value 2" + ";" + "Value 3" + ";" + System.getProperty("line.separator");

    public static void main(String args[]) throws IOException {
        CreateFileObject();
        WriteStream();

        readToObject();
    }


public static void CreateFileObject(){
    Random random = new Random();
    for (int i=1; i<10; i++){
        fileObjectArrayList.add(new FileObject(random.nextInt(500), random.nextInt(500), random.nextInt(500)));


    }
}

    public static void WriteStream() throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(partToFile)) {
            for (byte b : Title.getBytes(StandardCharsets.UTF_8)){
                fileOutputStream.write(b);
            }

            for (FileObject fileObject : fileObjectArrayList) {
                String raw = fileObject.getValue() + "; " + fileObject.getValueFrom() + "; " + fileObject.getValueTo()
                        + "; " + System.getProperty("line.separator");
                for (byte b : raw.getBytes(StandardCharsets.UTF_8)) {
                    fileOutputStream.write(b);
                }
            }
        }

    }
    public static AppData readToObject() throws IOException {
    AppData appData = new AppData();
        List<List<String >> records = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(partToFile))){
            String Line = br.readLine();
            appData.setHeader(Line.split(";"));
            while ((Line = br.readLine()) != null){
                String[] values = Line.split(";");
                records.add(Arrays.asList(values));}
            }
        int[][] resultData = new int[records.size()][3];
        for(int i = 0; i<records.size(); i++){
            for (int j = 0; j< records.get(i).size(); j++){
                resultData[i][j] = Integer.valueOf(records.get(i).get(j));}

        }
        appData.setData(resultData);
        return appData;
    }

}
