package api.kintai_kousin.form;

import domain.kintai_kousin.KintaiDay;

public class KintaiDayForm {
    private String value;

    public KintaiDayForm(String arg1) {
    }

    public KintaiDay getValueObject() {
        return new KintaiDay(value);
    }

}
