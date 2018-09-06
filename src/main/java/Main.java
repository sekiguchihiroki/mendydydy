import api.kintai_kousin.KintaiRegisterApi;
import api.kintai_kousin.KintaiRegisterRequest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> kintaiList = new ArrayList<>();
        List<String> outputList = new ArrayList<>();

        try {
            FileWriter fw = new FileWriter("test.csv", false);
            PrintWriter pw = new PrintWriter(new BufferedWriter(fw));

            if (args[0].equals("input")) {
                KintaiRegisterApi kintaiRegisterApi = new KintaiRegisterApi();
                KintaiRegisterRequest kintaiRegisterRequest = new KintaiRegisterRequest(args[1],args[2],args[3]);

                kintaiRegisterApi.register(kintaiRegisterRequest);

            } else if (args[0].equals("total")) {
                Long 最初の休憩 = 1900L;
                Long 次の休憩時間 = 2200L;
                String endTime = "";
                System.out.println("test");

                //終了時間の取得
                for (String str : kintaiList) {
                    String[] kintai = str.split(",");
                    endTime = kintai[2];
                    Long endTimeLong = Long.parseLong(endTime);
                    if (endTimeLong.compareTo(最初の休憩) > 0) {
                        if (endTimeLong.compareTo(次の休憩時間) > 0) {
                            if (endTimeLong.compareTo(2400L) > 0) {
                                System.out.println("残業時間は(休憩2回)" + (2400L - 次の休憩時間) / 100);
                                outputList.add("8," + String.valueOf((2400L - 次の休憩時間) / 100));
                            } else {
                                System.out.println("残業時間は(休憩2回)" + (endTimeLong - 次の休憩時間) / 100);
                                outputList.add("8," + String.valueOf((endTimeLong - 次の休憩時間) / 100));
                            }

                        } else {
                            System.out.println("残業時間は(休憩1回)" + (endTimeLong - 最初の休憩) / 100);
                            outputList.add("8," + String.valueOf((endTimeLong - 最初の休憩) / 100));
                        }
                    } else {
                        System.out.println("残業はない");
                        outputList.add("8,0");
                    }
                }
            }
            for (String str : outputList) {
                pw.print(str);
                pw.println();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
