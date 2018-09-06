package api.kintai_syukei;


import api.kintai_kousin.KintaiRegisterRequest;
import domain.kintai_syukei.OneMonthSyukeiKekkaList;
import service.kintai_kousin.KintaiRegisterService;
import service.kintai_syukei.KintaiSyukeiService;

public class KintaiSyukeiApi {
    public OneMonthSyukeiKekkaList 勤怠集計() {
        KintaiSyukeiService kintaiSyukeiService = new KintaiSyukeiService();

        return kintaiSyukeiService.oneMonthSyukeiKekkaListRefer();
    }


}
