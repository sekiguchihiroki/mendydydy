package service;

import domain.KintaiDayDataEntity;

import java.util.ArrayList;
import java.util.List;

public class KintaiRegisterService {
    List<String> kintaiList = new ArrayList<>();

    public void register(KintaiDayDataEntity kintaiDayDataEntity) {
//ドメインオブジェクトを操作することで、ソフトウェアが果たすべき仕事を実現する層
        String startTime = args[2];
        String endTime = args[3];

        //勤怠の登録
        for (
                String kintai : kintaiList)

        {
            if (kintai.equals(args[1])) {
                //同じ日付だったら上書き
                kintai = stringDate + "," + startTime + "," + endTime;
            } else {
                kintaiList.add(formatDate + "," + startTime + "," + endTime);
            }
        }
        kintaiDayDataEntity.printReformatKintaiDay();
        System.out.println("開始時間" + Long.parseLong(startTime));
        System.out.println("終了時間" + Long.parseLong(endTime));

    }
}
