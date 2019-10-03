/*
 * Copyright (c) 2018, Jiuye SCM and/or its affiliates. All rights reserved.
 */

package io.github.ningyu.jmeter.plugin;

import io.github.ningyu.jmeter.plugin.dubbo.sample.MethodArgument;
import io.github.ningyu.jmeter.plugin.util.ClassUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <功能描述>
 *
 * @author ningyu
 * @date 2018/12/18 11:37
 */
public class test {
    public static void main(String[] args){
        testEnumB();
    }

    private static void testEnumB() {
        HashMap<OwnString,Integer> map = new HashMap<>(15);
        map.put(new OwnString(), 1);
         map.put(new OwnString(), 2);
        map.put(new OwnString(), 3);
    }

    public static class OwnString implements CharSequence {

        @Override
        public int length() {
            return 0;
        }

        @Override
        public char charAt(int index) {
            return 0;
        }

        @Override
        public CharSequence subSequence(int start, int end) {
            return null;
        }

        @Override
        public String toString() {
            return "1".intern();
        }

        @Override
        public int hashCode() {
            return 1;
        }
    }

    private static void testEnumA() {
        List<String> paramterTypeList = new ArrayList<>();
        List<Object> parameterValuesList = new ArrayList<>();
        MethodArgument arg = new MethodArgument("io.github.ningyu.jmeter.plugin.EnumA1", "WECHAT");
        ClassUtils.parseParameter(paramterTypeList, parameterValuesList, arg);
        System.out.println(paramterTypeList.toString());
        System.out.println(parameterValuesList.toString());
    }
}
