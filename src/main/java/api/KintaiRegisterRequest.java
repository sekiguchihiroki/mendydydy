package api;

import domain.KaishiZikan;
import domain.KintaiDay;
import domain.KintaiDayDataEntity;
import domain.SyuryoZikan;

public class KintaiRegisterRequest {

    String arg1;
    String arg2;
    String arg3;

    public KintaiRegisterRequest(String arg1, String arg2, String arg3) {
    }

    public KintaiDayDataEntity create() {
        return new KintaiDayDataEntity(new KintaiDay(arg1), new KaishiZikan(arg2), new SyuryoZikan(arg3));
    }
}
