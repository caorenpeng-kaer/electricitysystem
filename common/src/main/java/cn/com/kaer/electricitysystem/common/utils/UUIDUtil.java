package cn.com.kaer.electricitysystem.common.utils;

import java.util.UUID;

/**
 * Created by Caorenpeng
 * 2019/7/11
 */
public class UUIDUtil {
    public static String UUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static void main(String[] args) {
        System.out.println(UUID().substring(16));
    }
}
