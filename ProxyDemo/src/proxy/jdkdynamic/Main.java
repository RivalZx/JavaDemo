package proxy.jdkdynamic;

/**
 * @program: JavaDemo
 * @description: 程序入口
 * @author: he-zx
 * @create: 2022-03-28 14:29
 **/
public class Main {
	
	public static void main(String[] args) {
		SmsService smsService = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
		smsService.send("动态代理Demo");
	}
}
