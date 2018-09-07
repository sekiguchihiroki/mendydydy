package domain.kintai_syukei;

import domain.kintai_kousin.KintaiDay;
import domain.kintai_kousin.KintaiDayDataEntity;

import java.util.List;

public class OneMonthList {
    private List<KintaiDayDataEntity> kintaiDayDataEntityList;

    public OneMonthSyukeiKekkaList oneMonthList(){

        //勤怠日毎エンティティから休憩時間を間引いて
        //残業時間を計算して
        //勤務時間を計算して
        //１ヶ月集計結果のリストを返却したい
        //リストの扱いうまく設計も実装もできなかった
        //kintaiDayDataEntityList.stream().filter休憩時間()

        return new OneMonthSyukeiKekkaList(
                new OneMonthSyukeiDayData(
                        new KintaiDay("1"),
                        new KinmuZikan("1"),
                        new ZangyoZikan("1")
                )
        );
    }
    private void filter休憩時間(KintaiDayDataEntity kintaiDayDataEntity){

    }
    private void 残業時間計算(KintaiDayDataEntity kintaiDayDataEntity){

    }
    private void 勤務時間計算(KintaiDayDataEntity kintaiDayDataEntity){

    }
}
