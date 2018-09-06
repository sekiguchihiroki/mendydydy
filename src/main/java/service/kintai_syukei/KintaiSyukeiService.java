package service.kintai_syukei;

import domain.kintai_kousin.KintaiDayDataEntity;
import domain.kintai_kousin.KintaiId;
import domain.kintai_kousin.KintaiRepository;
import domain.kintai_syukei.OneMonthSyukeiKekkaList;


public class KintaiSyukeiService {
    private KintaiRepository kintaiRepository = new KintaiRepository();

    public OneMonthSyukeiKekkaList oneMonthSyukeiKekkaListRefer() {

        return new OneMonthSyukeiKekkaList();

    }

    @Override
    public KintaiId create() {
        return new KintaiId("1");
    }

    @Override
    public void 登録(KintaiDayDataEntity kintaiDayDataEntity) {

    }
}

