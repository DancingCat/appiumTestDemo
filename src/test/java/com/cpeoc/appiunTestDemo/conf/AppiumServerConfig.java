package com.cpeoc.appiunTestDemo.conf;
/**
 * 服务端配置文件
 * @author ken
 * @date 2017-7-17
 * @see
 * 	1.项目运行初始化时会根据配置文件运行不同的初始化操作；</br>
 * 	2.请务必严格参照配置说明进行配置！！！！！ </br>
 */
public interface AppiumServerConfig {
	
	/** 运行主机ip */   //192.183.253.80
	String serverHost = "192.168.31.119";
	
	/** 运行用例的客户端，可选：android和ios */
	String client = "android";
	
	/** 是否真机运行(主要用于ios)，true时确保真机与电脑连接正常，false时确保模拟器存在 */
	boolean realDevice = false;
	
	/** 多机并行运行，true并行，false串行；ios不支持并行;暂时不支持其他值，当填入为true时默认parallel="tests" */
	boolean parallel = true;
	
	/** 并发运行测试用例时是否运行相同的用例 */
	boolean sameTestCase = true;
	
	/** 服务端使用的起始端口号，可自定义 */
	int startPortNum = 9000;
	
	/** adb完整路径，Mac必填，Windows可不填，确保当前用户对adb有可执行权限 */
	String adbPath="/usr/local/Cellar/android-sdk/24.4.1_1/platform-tools/adb";
	
	/**  selenium hub以及appium server启动超时时间，单位毫秒；首次启动可能时间稍长 */
	int serverStartUpTimeOut = 20000;
	
}
