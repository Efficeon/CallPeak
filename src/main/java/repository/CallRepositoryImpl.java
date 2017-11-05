package repository;

import model.PhoneCall;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CallRepositoryImpl implements CallRepository{
    public static final String FILE = "src/main/resources/phoneCallHistory.txt";

    //@Override
    public List<PhoneCall> listCalls() {
        List<PhoneCall> result = new ArrayList<PhoneCall>();
        Scanner scannerLog = null;
        try {
            scannerLog = new Scanner(new File(FILE));
            while (scannerLog.hasNext()) {
                String[] logs = scannerLog.next().split(":");
                PhoneCall newCall = new PhoneCall(Long.valueOf(logs[0]), Long.valueOf(logs[1]));
                result.add(newCall);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            scannerLog.close();
        }

        return result;
    }
}
