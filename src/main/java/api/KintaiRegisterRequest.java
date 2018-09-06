package api;

import api.form.KaishiZikanForm;
import api.form.KintaiDayForm;
import api.form.SyuryoZikanForm;
import domain.kintai_kousin.KintaiDayData;

public class KintaiRegisterRequest {

    private KintaiDayForm kintaiDayForm;
    private KaishiZikanForm kaishiZikanForm;
    private SyuryoZikanForm syuryoZikanForm;

    public KintaiRegisterRequest(String arg1, String arg2, String arg3) {
        kintaiDayForm = new KintaiDayForm(arg1);
        kaishiZikanForm = new KaishiZikanForm(arg2);
        syuryoZikanForm = new SyuryoZikanForm(arg3);

    }

    public KintaiDayData create() {
        return new KintaiDayData(kintaiDayForm.getValueObject(), kaishiZikanForm.getValueObject(), syuryoZikanForm.getValueObject());
    }
}
