package com.restapimysql.entity.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserVO {

    private Integer id;
    private String name;
    private String email;

}
