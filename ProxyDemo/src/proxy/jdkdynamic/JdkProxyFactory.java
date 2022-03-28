package proxy.jdkdynamic;

import java.lang.reflect.Proxy;

/**
 * @program: JavaDemo
 * @description: 代理对象的工厂类
 * @author: he-zx
 * @create: 2022-03-28 14:27
 **/
public class JdkProxyFactory {

	public static Object getProxy(Object target){
		return Proxy.newProxyInstance(
				target.getClass().getClassLoader(),
				target.getClass().getInterfaces(),
				new DebugInvocationHandler(target)
		);
	}
}
