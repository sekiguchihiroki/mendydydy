package api.kintai_kousin;

import api.kintai_kousin.form.KaishiZikanForm;
import api.kintai_kousin.form.KintaiDayForm;
import api.kintai_kousin.form.SyuryoZikanForm;
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
