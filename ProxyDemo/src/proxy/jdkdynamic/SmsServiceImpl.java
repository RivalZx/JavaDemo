package proxy.jdkdynamic;

/**
 * @program: JavaDemo
 * @description: 发送短信接口的实现
 * @author: he-zx
 * @create: 2022-03-28 14:22
 **/
public class SmsServiceImpl implements SmsService {
	
	@Override
	public String send(String msg) {
		System.out.println("send message:" + msg);
		return msg;
	}
}
