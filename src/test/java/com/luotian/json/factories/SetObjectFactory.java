package com.luotian.json.factories;


import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashSet;

import com.luotian.json.ObjectBinder;
import com.luotian.json.ObjectFactory;

public class SetObjectFactory implements ObjectFactory {
    public Object instantiate(ObjectBinder context, Object value, Type targetType, Class targetClass) {
        if( value instanceof Collection) {
            return context.bindIntoCollection((Collection)value, new HashSet(), targetType);
        } else {
            HashSet<Object> set = new HashSet<Object>();
            set.add( context.bind( value ) );
            return set;
        }
    }
}
