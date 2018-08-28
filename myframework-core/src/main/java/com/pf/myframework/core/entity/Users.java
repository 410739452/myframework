package com.pf.myframework.core.entity;

import com.pf.myframework.core.entity.enums.AgeEnum;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.experimental.FieldNameConstants;


/**
 * <p>
 * 用户实体，对应表users
 * </p> 
 *
 * @author PF
 * @since 2018年8月25日
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@FieldNameConstants
public class Users extends BaseEntity {
    private String name;
    private AgeEnum age;
    private String email;
}