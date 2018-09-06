package service;

import domain.kintai_kousin.KintaiDayData;
import domain.kintai_kousin.KintaiDayDataEntity;
import domain.kintai_kousin.KintaiDayDataEntityFactory;
import domain.kintai_kousin.KintaiId;
import domain.kintai_kousin.KintaiRepository;


public class KintaiRegisterService implements KintaiRepository {
    private KintaiRepository kintaiRepository = new KintaiRepository();

    public void register(KintaiDayData kintaiDayData) {

        //ドメインオブジェクトを操作することで、ソフトウェアが果たすべき仕事を実現する
        KintaiId kintaiId = kintaiRepository.create();

        KintaiDayDataEntity kintaiDayDataEntity = KintaiDayDataEntityFactory.create(
                kintaiId, kintaiDayData);

        kintaiRepository.登録(kintaiDayDataEntity);

    }

    @Override
    public KintaiId create() {
        return new KintaiId("1");
    }

    @Override
    public void 登録(KintaiDayDataEntity kintaiDayDataEntity) {

    }
}

