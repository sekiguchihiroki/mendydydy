package api;


import service.KintaiRegisterService;

public class KintaiRegisterApi {
//ユーザとの相互作用の境界となる層　IF層
    public void register(KintaiRegisterRequest kintaiRegisterRequest) {
        KintaiRegisterService kintaiRegisterService = new KintaiRegisterService();

        kintaiRegisterService.register(kintaiRegisterRequest.create());
    }



}
