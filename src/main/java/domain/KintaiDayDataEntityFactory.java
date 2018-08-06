package domain;

public class KintaiDayDataEntityFactory {


    public static KintaiDayDataEntity create(KintaiId kintaiId, KintaiDayData kintaiDayData) {

        return new KintaiDayDataEntity(kintaiId,
                                       kintaiDayData.getKintaiDay(),
                                       kintaiDayData.getKaishiZikan(),
                                       kintaiDayData.getSyuryoZikan());
    }

}
