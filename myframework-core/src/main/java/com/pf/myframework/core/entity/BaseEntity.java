package com.pf.myframework.core.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;

import lombok.Data;
import lombok.experimental.Accessors;
import lombok.experimental.FieldNameConstants;

/**
 * <p>
 * 基础实体父类
 * </p>
 *
 * @author PF
 * @since 2018年8月25日
 */
@Data
@Accessors(chain = true)
@FieldNameConstants
public class BaseEntity {
	
//	@TableField(fill = FieldFill.INSERT)
	private Long id;

	@TableField(fill = FieldFill.INSERT_UPDATE)
	private String operator;

	@TableLogic
	@TableField(fill = FieldFill.INSERT)
	private Integer isDelete;
}
