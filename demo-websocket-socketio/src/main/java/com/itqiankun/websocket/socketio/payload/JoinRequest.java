package com.itqiankun.websocket.socketio.payload;

import lombok.Data;

/**
 * <p>
 * 加群载荷
 * </p>
 *
 * @author ma_qiankun
 * @date Created in 2018-12-19 13:36
 */
@Data
public class JoinRequest {
    /**
     * 用户id
     */
    private String userId;

    /**
     * 群名称
     */
    private String groupId;
}
