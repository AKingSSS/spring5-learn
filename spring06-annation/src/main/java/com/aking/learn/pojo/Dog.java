package com.aking.learn.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 *
 * </p>
 *
 * @author yk
 * @date 2020-12-29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dog {
    private String name;
    public void shout() {
        System.out.println("wang~~");
    }
}
