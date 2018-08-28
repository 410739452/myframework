package com.pf.myframework.core.config;

import java.util.UUID;

import org.apache.ibatis.reflection.MetaObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.pf.myframework.core.entity.Users;

@Component
public class MybatisPlusMetaObjectHandler implements MetaObjectHandler {
	
    private static final Logger LOGGER = LoggerFactory.getLogger(MybatisPlusMetaObjectHandler.class);	

	@Override
	public void insertFill(MetaObject metaObject) {
        LOGGER.info("start insert fill ....");
//        metaObject.setValue(Users.ID, UUID.randomUUID().toString());//考虑ID要不要配置成Meta信息
        metaObject.setValue(Users.OPERATOR,"Jerry");
        metaObject.setValue(Users.IS_DELETE, 0);
	}

	@Override
	public void updateFill(MetaObject metaObject) {
        LOGGER.info("start update fill ....");
        this.setFieldValByName(Users.OPERATOR, "Tom", metaObject);
	}

}
