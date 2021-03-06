package com.xdf.bling.qa.ios.controller.mine;


import com.xdf.bling.qa.BaseController;
import com.xdf.bling.qa.ios.page.mine.MyOrderPage;
import com.xdf.bling.qa.ios.service.mine.MyOrderService;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.testng.annotations.Test;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: MyOrderController
 * @Description: 我的-我的订单
 * @Author: 王雪松
 * @Date: 2020/8/05 17:26 下午
 */



public class MyOrderController extends BaseController {

    @Test(description = "测试我的账户-我的订单",priority = 1)
    public void testMyOrderController () {
        MyOrderPage myOrderPage = new MyOrderPage((IOSDriver<MobileElement>) driver);
        MyOrderService myOrderService = new MyOrderService(myOrderPage);
        myOrderService.myOrderService();


    }

}
