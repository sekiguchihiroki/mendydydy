package domain;

import java.util.List;

public interface KaishiRepository {

    void 登録(KintaiDayDataEntity kintaiDayDataEntity);
    List 一ヶ月集計(KintaiMonth kintaiMonth);
}
