package com.itqiankun.cache.redis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>
 * 用户实体
 * </p>
 *
 * @author ma_qiankun
 * @date Created in 2018-11-15 16:39
 */

@Data
public class User implements Serializable {

  private static final long serialVersionUID = 1L;
  private Long id;
  private String userName;
  private String password;
  private String email;
  private String nickname;
  private String regTime;

  public User() {
    super();
  }
  public User(String email, String nickname, String password, String userName, String regTime) {
    super();
    this.email = email;
    this.nickname = nickname;
    this.password = password;
    this.userName = userName;
    this.regTime = regTime;
  }

  @Override
  public String toString() {
    return "User{" +
      "id=" + id +
      ", userName='" + userName + '\'' +
      ", password='" + password + '\'' +
      ", email='" + email + '\'' +
      ", nickname='" + nickname + '\'' +
      ", regTime='" + regTime + '\'' +
      '}';
  }
}
