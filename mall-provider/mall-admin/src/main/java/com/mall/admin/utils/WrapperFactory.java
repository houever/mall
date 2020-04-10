package com.mall.admin.utils;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

/**
 * @author houqj
 * @date 2020-04-07 17:42
 */
public class WrapperFactory {

    public static <T> QueryWrapper<T> queryWrapper(T t) {
        return new QueryWrapper();
    }

    public static <T> LambdaQueryWrapper<T> lambdaQueryWrapper(T t) {
        return new LambdaQueryWrapper();
    }

    public static <T> UpdateWrapper<T> updateWrapper() {
        return new UpdateWrapper();
    }

    public static <T> LambdaUpdateWrapper<T> lambdaUpdateWrapper() {
        return new LambdaUpdateWrapper();
    }

}
