package com.itqiankun.websocket.controller;

import cn.hutool.core.lang.Dict;
import com.itqiankun.websocket.model.Server;
import com.itqiankun.websocket.payload.ServerVO;
import com.itqiankun.websocket.util.ServerUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 服务器监控Controller
 * </p>
 *
 * @author ma_qiankun
 * @date Created in 2018-12-17 10:22
 */
@RestController
@RequestMapping("/server")
public class ServerController {

    @GetMapping
    public Dict serverInfo() throws Exception {
        Server server = new Server();
        server.copyTo();
        ServerVO serverVO = ServerUtil.wrapServerVO(server);
        return ServerUtil.wrapServerDict(serverVO);
    }

}
