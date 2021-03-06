package com.xdf.bling.qa.ios.controller.learncenter.previewcapsule;


import com.xdf.bling.qa.BaseController;
import com.xdf.bling.qa.ios.page.learncenter.previewcapsule.PreviewCapsulePage;
import com.xdf.bling.qa.ios.service.learncenter.previewcapsule.PreviewCapsuleService;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.testng.annotations.Test;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: PreviewCapsuleController
 * @Description: 学习中心
 * @Author: 王雪松
 * @Date: 2020/8/10 14:39 下午
 */


public class PreviewCapsuleController extends BaseController {

    @Test(description = "学习中心--预习小胶囊", priority = 1)
    public void testPreviewCapsuleController() throws InterruptedException {
        PreviewCapsulePage previewCapsulePage = new PreviewCapsulePage((IOSDriver<MobileElement>) driver);
        PreviewCapsuleService previewCapsuleService = new PreviewCapsuleService(previewCapsulePage);
        previewCapsuleService.previewCapsuleService();
        //内部小胶囊
        previewCapsuleService.interiorPraiseService();
        //词句轮轮看操作
        previewCapsuleService.interiorLookAroundService();
        //Word Fun 操作 屏幕获取最大与实际不符
        previewCapsuleService.interiorWordFunService();
        //知识小预热
        previewCapsuleService.KnowledgePreheatingService();
        //look and listen
        previewCapsuleService.LookAndListenService();
        //预习完成视频
        previewCapsuleService.finshVideoService();


    }

}
