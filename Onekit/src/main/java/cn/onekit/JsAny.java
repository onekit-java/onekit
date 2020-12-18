package cn.onekit;

public interface JsAny {

    JsAny get(JsAny key) ;
    JsAny set(JsAny key, JsAny value);

    JsAny get(String key) ;
    JsAny set(String key, JsAny value);

    JsAny ToString();

    JsAny invoke(JsAny... arguments);

}
