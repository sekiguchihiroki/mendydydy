package service;

import domain.KintaiDayData;
import domain.KintaiDayDataEntity;
import domain.KintaiDayDataEntityFactory;
import domain.KintaiId;
import domain.KintaiIdRepository;
import domain.KintaiRepository;


public class KintaiRegisterService {
    private KintaiIdRepository kintaiIdRepository = new KintaiIdRepository() {
        @Override
        public KintaiId create() {
            return new KintaiId("1");
        }
    };
    private KintaiRepository kintaiRepository = new KintaiRepository() {
        @Override
        public void 登録(KintaiDayDataEntity kintaiDayDataEntity) {

        }
    };

    public void register(KintaiDayData kintaiDayData) {
        //ドメインオブジェクトを操作することで、ソフトウェアが果たすべき仕事を実現する
        KintaiId kintaiId = kintaiIdRepository.create();

        KintaiDayDataEntity kintaiDayDataEntity = KintaiDayDataEntityFactory.create(
                kintaiId, kintaiDayData);


        kintaiRepository.登録(kintaiDayDataEntity);
    }
}
