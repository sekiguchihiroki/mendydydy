package domain;

public class KintaiDay {

    private final String value;

    public KintaiDay(String arg1) {
        value = arg1;
    }

    public String printKintaiDayReformat() {

        System.out.println("日時" + value.substring(0, 4) + "/" + value.substring(4, 6) + "/" + value.substring(6, 8));

    }
}
