package eleme.openapi.sdk.api.base;

import eleme.openapi.sdk.api.annotation.Service;
import eleme.openapi.sdk.api.exception.ServiceException;
import eleme.openapi.sdk.oauth.OAuthException;
import eleme.openapi.sdk.oauth.response.OAuthResponse;
import eleme.openapi.sdk.utils.WebUtils;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class BaseNopService {
    private OAuthResponse oAuthResponse;
    private Map<String, Method> methodMap = new HashMap<String, Method>();
    private Class service;

    public BaseNopService(OAuthResponse oAuthResponse, Class service) {
        this.oAuthResponse = oAuthResponse;
        this.service = service;
        Method[] methods = service.getMethods();
        for (Method method : methods) {
            methodMap.put(method.getName(), method);
        }
    }

    public <T> T call(Map<String, Object> parameters) throws ServiceException, OAuthException {
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        Method method = getMethod(methodName);
        Service annotation = (Service) service.getAnnotation(Service.class);
        if (annotation == null)
            throw new RuntimeException("服务未找到Service注解");
        String action = String.format("%s.%s", annotation.value(), methodName);
        return WebUtils.call(action, parameters, oAuthResponse, method.getGenericReturnType());
    }

    private Method getMethod(String methodName) {
        return methodMap.get(methodName);
    }
}
