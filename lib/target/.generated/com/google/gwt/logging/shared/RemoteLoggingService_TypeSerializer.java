package com.google.gwt.logging.shared;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.impl.TypeHandler;
import java.util.HashMap;
import java.util.Map;
import com.google.gwt.core.client.GwtScriptOnly;

public class RemoteLoggingService_TypeSerializer extends com.google.gwt.user.client.rpc.impl.SerializerBase {
  private static final MethodMap methodMapNative;
  private static final JsArrayString signatureMapNative;
  
  static {
    methodMapNative = loadMethodsNative();
    signatureMapNative = loadSignaturesNative();
  }
  
  @SuppressWarnings("deprecation")
  @GwtScriptOnly
  private static native MethodMap loadMethodsNative() /*-{
    var result = {};
    result["com.google.gwt.core.shared.SerializableThrowable/2791287161"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.com.google.gwt.core.shared.SerializableThrowable_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/core/shared/SerializableThrowable;)
      ];
    
    result["com.google.gwt.event.shared.UmbrellaException/3104463596"] = [
        ,
        ,
        @com.google.gwt.event.shared.UmbrellaException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/event/shared/UmbrellaException;)
      ];
    
    result["com.google.gwt.http.client.RequestException/190587325"] = [
        ,
        ,
        @com.google.gwt.http.client.RequestException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/http/client/RequestException;)
      ];
    
    result["com.google.gwt.json.client.JSONException/2941795468"] = [
        ,
        ,
        @com.google.gwt.json.client.JSONException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/json/client/JSONException;)
      ];
    
    result["com.google.gwt.jsonp.client.TimeoutException/1112787596"] = [
        ,
        ,
        @com.google.gwt.jsonp.client.TimeoutException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/jsonp/client/TimeoutException;)
      ];
    
    result["com.google.gwt.junit.client.TimeoutException/1599913304"] = [
        ,
        ,
        @com.google.gwt.junit.client.TimeoutException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/junit/client/TimeoutException;)
      ];
    
    result["com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533"] = [
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;)
      ];
    
    result["com.google.gwt.user.client.rpc.RpcTokenException/2345075298"] = [
        @com.google.gwt.user.client.rpc.RpcTokenException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.RpcTokenException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/RpcTokenException;),
        @com.google.gwt.user.client.rpc.RpcTokenException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/RpcTokenException;)
      ];
    
    result["com.google.gwt.user.client.rpc.SerializableException/3047383460"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.SerializableException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/SerializableException;)
      ];
    
    result["com.google.gwt.user.client.rpc.SerializationException/2836333220"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.SerializationException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/SerializationException;)
      ];
    
    result["com.google.gwt.user.client.rpc.SerializedTypeViolationException/914601580"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.SerializedTypeViolationException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/SerializedTypeViolationException;)
      ];
    
    result["com.google.gwt.user.client.rpc.ServiceDefTarget$NoServiceEntryPointSpecifiedException/3408313447"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.ServiceDefTarget_NoServiceEntryPointSpecifiedException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/ServiceDefTarget$NoServiceEntryPointSpecifiedException;)
      ];
    
    result["com.google.gwt.user.client.rpc.XsrfToken/4254043109"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.XsrfToken_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/XsrfToken;)
      ];
    
    result["com.google.gwt.useragent.client.UserAgentAsserter$UserAgentAssertionError/1267019011"] = [
        ,
        ,
        @com.google.gwt.useragent.client.UserAgentAsserter_UserAgentAssertionError_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/useragent/client/UserAgentAsserter$UserAgentAssertionError;)
      ];
    
    result["com.google.web.bindery.event.shared.UmbrellaException/1025846929"] = [
        ,
        ,
        @com.google.web.bindery.event.shared.UmbrellaException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/web/bindery/event/shared/UmbrellaException;)
      ];
    
    result["java.io.IOException/1159940531"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.io.IOException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/io/IOException;)
      ];
    
    result["java.io.UnsupportedEncodingException/1526756933"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.io.UnsupportedEncodingException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/io/UnsupportedEncodingException;)
      ];
    
    result["java.lang.ArithmeticException/1539622151"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.ArithmeticException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/ArithmeticException;)
      ];
    
    result["java.lang.ArrayIndexOutOfBoundsException/600550433"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.ArrayIndexOutOfBoundsException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/ArrayIndexOutOfBoundsException;)
      ];
    
    result["java.lang.ArrayStoreException/3540507190"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.ArrayStoreException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/ArrayStoreException;)
      ];
    
    result["java.lang.AssertionError/3490171458"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.AssertionError_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/AssertionError;)
      ];
    
    result["java.lang.Boolean/476441737"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Boolean;)
      ];
    
    result["java.lang.ClassCastException/702295179"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.ClassCastException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/ClassCastException;)
      ];
    
    result["java.lang.CloneNotSupportedException/1114494199"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.CloneNotSupportedException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/CloneNotSupportedException;)
      ];
    
    result["java.lang.Error/1331973429"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.Error_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Error;)
      ];
    
    result["java.lang.Exception/1920171873"] = [
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Exception;),
        @com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Exception;)
      ];
    
    result["java.lang.IllegalArgumentException/1755012560"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.IllegalArgumentException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/IllegalArgumentException;)
      ];
    
    result["java.lang.IllegalStateException/1972187323"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.IllegalStateException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/IllegalStateException;)
      ];
    
    result["java.lang.IndexOutOfBoundsException/2489527753"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.IndexOutOfBoundsException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/IndexOutOfBoundsException;)
      ];
    
    result["java.lang.NegativeArraySizeException/3846860241"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.NegativeArraySizeException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/NegativeArraySizeException;)
      ];
    
    result["java.lang.NoSuchMethodException/260969707"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.NoSuchMethodException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/NoSuchMethodException;)
      ];
    
    result["java.lang.NullPointerException/3618884511"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.NullPointerException_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/NullPointerException;)
      ];
    
    result["java.lang.NumberFormatException/3305228476"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.NumberFormatException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/NumberFormatException;)
      ];
    
    result["java.lang.RuntimeException/515124647"] = [
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.RuntimeException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/RuntimeException;),
        @com.google.gwt.user.client.rpc.core.java.lang.RuntimeException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/RuntimeException;)
      ];
    
    result["java.lang.SecurityException/2381737870"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.SecurityException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/SecurityException;)
      ];
    
    result["java.lang.StackTraceElement/455763907"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.StackTraceElement_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/StackTraceElement;)
      ];
    
    result["[Ljava.lang.StackTraceElement;/3867167983"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.StackTraceElement_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/lang/StackTraceElement;)
      ];
    
    result["java.lang.String/2004016611"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/String;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/String;)
      ];
    
    result["java.lang.StringIndexOutOfBoundsException/500777603"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.StringIndexOutOfBoundsException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/StringIndexOutOfBoundsException;)
      ];
    
    result["java.lang.Throwable/2953622131"] = [
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.Throwable_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Throwable;),
        @com.google.gwt.user.client.rpc.core.java.lang.Throwable_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Throwable;)
      ];
    
    result["java.lang.UnsupportedOperationException/3744010015"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.UnsupportedOperationException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/UnsupportedOperationException;)
      ];
    
    result["java.lang.annotation.AnnotationFormatError/2257184627"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.annotation.AnnotationFormatError_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/annotation/AnnotationFormatError;)
      ];
    
    result["java.lang.annotation.AnnotationTypeMismatchException/976205828"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.annotation.AnnotationTypeMismatchException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/annotation/AnnotationTypeMismatchException;)
      ];
    
    result["java.security.DigestException/629316798"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.security.DigestException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/security/DigestException;)
      ];
    
    result["java.security.GeneralSecurityException/2669239907"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.security.GeneralSecurityException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/security/GeneralSecurityException;)
      ];
    
    result["java.security.NoSuchAlgorithmException/2892037213"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.security.NoSuchAlgorithmException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/security/NoSuchAlgorithmException;)
      ];
    
    result["java.util.Collections$EmptySet/3523698179"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptySet_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Set;)
      ];
    
    result["java.util.ConcurrentModificationException/2717383897"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.ConcurrentModificationException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/ConcurrentModificationException;)
      ];
    
    result["java.util.EmptyStackException/89438517"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.EmptyStackException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/EmptyStackException;)
      ];
    
    result["java.util.HashSet/3273092938"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.HashSet_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/HashSet;)
      ];
    
    result["java.util.LinkedHashSet/95640124"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/LinkedHashSet;)
      ];
    
    result["java.util.NoSuchElementException/1559248883"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.NoSuchElementException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/NoSuchElementException;)
      ];
    
    result["java.util.TooManyListenersException/2023078032"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.TooManyListenersException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/TooManyListenersException;)
      ];
    
    result["java.util.TreeMap/1493889780"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/TreeMap;)
      ];
    
    result["java.util.TreeSet/4043497002"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.TreeSet_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/TreeSet;)
      ];
    
    result["java.util.logging.Level/2839552483"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.logging.Level_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/logging/Level;)
      ];
    
    result["java.util.logging.LogRecord/2492345967"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.logging.LogRecord_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/logging/LogRecord;)
      ];
    
    result["junit.framework.AssertionFailedError/3756236039"] = [
        ,
        ,
        @junit.framework.AssertionFailedError_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljunit/framework/AssertionFailedError;)
      ];
    
    return result;
  }-*/;
  
  @SuppressWarnings("deprecation")
  @GwtScriptOnly
  private static native JsArrayString loadSignaturesNative() /*-{
    var result = [];
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@com.google.gwt.core.shared.SerializableThrowable::class)] = "com.google.gwt.core.shared.SerializableThrowable/2791287161";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@com.google.gwt.event.shared.UmbrellaException::class)] = "com.google.gwt.event.shared.UmbrellaException/3104463596";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@com.google.gwt.http.client.RequestException::class)] = "com.google.gwt.http.client.RequestException/190587325";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@com.google.gwt.json.client.JSONException::class)] = "com.google.gwt.json.client.JSONException/2941795468";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@com.google.gwt.jsonp.client.TimeoutException::class)] = "com.google.gwt.jsonp.client.TimeoutException/1112787596";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@com.google.gwt.junit.client.TimeoutException::class)] = "com.google.gwt.junit.client.TimeoutException/1599913304";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException::class)] = "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@com.google.gwt.user.client.rpc.RpcTokenException::class)] = "com.google.gwt.user.client.rpc.RpcTokenException/2345075298";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@com.google.gwt.user.client.rpc.SerializableException::class)] = "com.google.gwt.user.client.rpc.SerializableException/3047383460";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@com.google.gwt.user.client.rpc.SerializationException::class)] = "com.google.gwt.user.client.rpc.SerializationException/2836333220";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@com.google.gwt.user.client.rpc.SerializedTypeViolationException::class)] = "com.google.gwt.user.client.rpc.SerializedTypeViolationException/914601580";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@com.google.gwt.user.client.rpc.ServiceDefTarget.NoServiceEntryPointSpecifiedException::class)] = "com.google.gwt.user.client.rpc.ServiceDefTarget$NoServiceEntryPointSpecifiedException/3408313447";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@com.google.gwt.user.client.rpc.XsrfToken::class)] = "com.google.gwt.user.client.rpc.XsrfToken/4254043109";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@com.google.gwt.useragent.client.UserAgentAsserter.UserAgentAssertionError::class)] = "com.google.gwt.useragent.client.UserAgentAsserter$UserAgentAssertionError/1267019011";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@com.google.web.bindery.event.shared.UmbrellaException::class)] = "com.google.web.bindery.event.shared.UmbrellaException/1025846929";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.io.IOException::class)] = "java.io.IOException/1159940531";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.io.UnsupportedEncodingException::class)] = "java.io.UnsupportedEncodingException/1526756933";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.lang.ArithmeticException::class)] = "java.lang.ArithmeticException/1539622151";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.lang.ArrayIndexOutOfBoundsException::class)] = "java.lang.ArrayIndexOutOfBoundsException/600550433";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.lang.ArrayStoreException::class)] = "java.lang.ArrayStoreException/3540507190";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.lang.AssertionError::class)] = "java.lang.AssertionError/3490171458";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.lang.Boolean::class)] = "java.lang.Boolean/476441737";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.lang.ClassCastException::class)] = "java.lang.ClassCastException/702295179";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.lang.CloneNotSupportedException::class)] = "java.lang.CloneNotSupportedException/1114494199";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.lang.Error::class)] = "java.lang.Error/1331973429";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.lang.Exception::class)] = "java.lang.Exception/1920171873";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.lang.IllegalArgumentException::class)] = "java.lang.IllegalArgumentException/1755012560";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.lang.IllegalStateException::class)] = "java.lang.IllegalStateException/1972187323";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.lang.IndexOutOfBoundsException::class)] = "java.lang.IndexOutOfBoundsException/2489527753";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.lang.NegativeArraySizeException::class)] = "java.lang.NegativeArraySizeException/3846860241";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.lang.NoSuchMethodException::class)] = "java.lang.NoSuchMethodException/260969707";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.lang.NullPointerException::class)] = "java.lang.NullPointerException/3618884511";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.lang.NumberFormatException::class)] = "java.lang.NumberFormatException/3305228476";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.lang.RuntimeException::class)] = "java.lang.RuntimeException/515124647";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.lang.SecurityException::class)] = "java.lang.SecurityException/2381737870";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.lang.StackTraceElement::class)] = "java.lang.StackTraceElement/455763907";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.lang.StackTraceElement[]::class)] = "[Ljava.lang.StackTraceElement;/3867167983";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.lang.String::class)] = "java.lang.String/2004016611";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.lang.StringIndexOutOfBoundsException::class)] = "java.lang.StringIndexOutOfBoundsException/500777603";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.lang.Throwable::class)] = "java.lang.Throwable/2953622131";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.lang.UnsupportedOperationException::class)] = "java.lang.UnsupportedOperationException/3744010015";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.lang.annotation.AnnotationFormatError::class)] = "java.lang.annotation.AnnotationFormatError/2257184627";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.lang.annotation.AnnotationTypeMismatchException::class)] = "java.lang.annotation.AnnotationTypeMismatchException/976205828";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.security.DigestException::class)] = "java.security.DigestException/629316798";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.security.GeneralSecurityException::class)] = "java.security.GeneralSecurityException/2669239907";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.security.NoSuchAlgorithmException::class)] = "java.security.NoSuchAlgorithmException/2892037213";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.util.Collections.EmptySet::class)] = "java.util.Collections$EmptySet/3523698179";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.util.ConcurrentModificationException::class)] = "java.util.ConcurrentModificationException/2717383897";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.util.EmptyStackException::class)] = "java.util.EmptyStackException/89438517";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.util.HashSet::class)] = "java.util.HashSet/3273092938";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.util.LinkedHashSet::class)] = "java.util.LinkedHashSet/95640124";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.util.NoSuchElementException::class)] = "java.util.NoSuchElementException/1559248883";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.util.TooManyListenersException::class)] = "java.util.TooManyListenersException/2023078032";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.util.TreeMap::class)] = "java.util.TreeMap/1493889780";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.util.TreeSet::class)] = "java.util.TreeSet/4043497002";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.util.logging.Level::class)] = "java.util.logging.Level/2839552483";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@java.util.logging.LogRecord::class)] = "java.util.logging.LogRecord/2492345967";
    result[@javaemul.internal.HashCodes::getObjectIdentityHashCode(*)(@junit.framework.AssertionFailedError::class)] = "junit.framework.AssertionFailedError/3756236039";
    return result;
  }-*/;
  
  public RemoteLoggingService_TypeSerializer() {
    super(null, methodMapNative, null, signatureMapNative);
  }
  
}
