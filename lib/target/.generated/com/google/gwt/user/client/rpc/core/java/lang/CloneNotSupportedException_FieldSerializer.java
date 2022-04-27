package com.google.gwt.user.client.rpc.core.java.lang;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class CloneNotSupportedException_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, java.lang.CloneNotSupportedException instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static java.lang.CloneNotSupportedException instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new java.lang.CloneNotSupportedException();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, java.lang.CloneNotSupportedException instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.google.gwt.user.client.rpc.core.java.lang.CloneNotSupportedException_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.CloneNotSupportedException_FieldSerializer.deserialize(reader, (java.lang.CloneNotSupportedException)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.CloneNotSupportedException_FieldSerializer.serialize(writer, (java.lang.CloneNotSupportedException)object);
  }
  
}
