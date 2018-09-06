package domain.kintai_kousin;

public interface KintaiRepository {

    KintaiId create();

    void 登録(KintaiDayDataEntity kintaiDayDataEntity);
}
