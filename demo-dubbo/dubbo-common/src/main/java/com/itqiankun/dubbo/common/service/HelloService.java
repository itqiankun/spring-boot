package com.itqiankun.dubbo.common.service;

/**
 * <p>
 * Hello服务接口
 * </p>
 *
 * @author ma_qiankun
 * @date Created in 2018-12-25 16:56
 */
public interface HelloService {
    /**
     * 问好
     *
     * @param name 姓名
     * @return 问好
     */
    String sayHello(String name);
}
