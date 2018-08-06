package api.form;

import domain.KintaiDay;

public class KintaiDayForm {
    private String value;

    public KintaiDayForm(String arg1) {
    }

    public KintaiDay getValueObject() {
        return new KintaiDay(value);
    }

}
