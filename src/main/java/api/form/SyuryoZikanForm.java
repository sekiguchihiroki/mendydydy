package api.form;

import domain.kintai_kousin.SyuryoZikan;

public class SyuryoZikanForm {
    private String value;

    public SyuryoZikanForm(String arg3) {
    }

    public SyuryoZikan getValueObject() {
        return new SyuryoZikan(value);
    }

}
