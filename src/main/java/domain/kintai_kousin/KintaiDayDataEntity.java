package domain.kintai_kousin;

public class KintaiDayDataEntity {

    private final KintaiId kintaiId;
    private final KintaiDay kintaiDay;
    private final KaishiZikan kaishiZikan;
    private final SyuryoZikan syuryoZikan;


    public KintaiDayDataEntity(KintaiId kintaiId, KintaiDay kintaiDay, KaishiZikan kaishiZikan, SyuryoZikan syuryoZikan) {
        this.kintaiId = kintaiId;
        this.kintaiDay = kintaiDay;
        this.kaishiZikan = kaishiZikan;
        this.syuryoZikan = syuryoZikan;
    }

    public KintaiId getKintaiId() {
        return kintaiId;
    }

    public KintaiDay getKintaiDay() {
        return kintaiDay;
    }

    public KaishiZikan getKaishiZikan() {
        return kaishiZikan;
    }

    public SyuryoZikan getSyuryoZikan() {
        return syuryoZikan;
    }


}
