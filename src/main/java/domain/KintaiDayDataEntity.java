package domain;

public class KintaiDayDataEntity {

    private final KintaiDay kintaiDay;
    private final KaishiZikan kaishiZikan;
    private final SyuryoZikan syuryoZikan;


    public KintaiDayDataEntity(KintaiDay kintaiDay, KaishiZikan kaishiZikan, SyuryoZikan syuryoZikan) {
        this.kintaiDay = kintaiDay;
        this.kaishiZikan = kaishiZikan;
        this.syuryoZikan = syuryoZikan;
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


    public void printReformatKintaiDay() {
        getKintaiDay().printKintaiDayReformat();
    }
}
