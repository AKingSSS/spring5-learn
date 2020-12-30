package com.aking.learn.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author yk
 * @date 2020-12-25
 */
@Data
@Accessors(chain = true)
public class User {
    private Long id;
    private String name;
    private String pwd;
    private Date createTime;
}
