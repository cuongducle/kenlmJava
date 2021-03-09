/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.jbaiter.kenlm.jni;

public class Config {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Config(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Config obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        KenLMJNI.delete_Config(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setShow_progress(boolean value) {
    KenLMJNI.Config_show_progress_set(swigCPtr, this, value);
  }

  public boolean getShow_progress() {
    return KenLMJNI.Config_show_progress_get(swigCPtr, this);
  }

  public void setUnknown_missing_logprob(float value) {
    KenLMJNI.Config_unknown_missing_logprob_set(swigCPtr, this, value);
  }

  public float getUnknown_missing_logprob() {
    return KenLMJNI.Config_unknown_missing_logprob_get(swigCPtr, this);
  }

  public void setProbing_multiplier(float value) {
    KenLMJNI.Config_probing_multiplier_set(swigCPtr, this, value);
  }

  public float getProbing_multiplier() {
    return KenLMJNI.Config_probing_multiplier_get(swigCPtr, this);
  }

  public void setBuilding_memory(long value) {
    KenLMJNI.Config_building_memory_set(swigCPtr, this, value);
  }

  public long getBuilding_memory() {
    return KenLMJNI.Config_building_memory_get(swigCPtr, this);
  }

  public void setMessages(SWIGTYPE_p_std__ostream value) {
    KenLMJNI.Config_messages_set(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(value));
  }

  public SWIGTYPE_p_std__ostream getMessages() {
    long cPtr = KenLMJNI.Config_messages_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__ostream(cPtr, false);
  }

  public void setTemporary_directory_prefix(String value) {
    KenLMJNI.Config_temporary_directory_prefix_set(swigCPtr, this, value);
  }

  public String getTemporary_directory_prefix() {
    return KenLMJNI.Config_temporary_directory_prefix_get(swigCPtr, this);
  }

  public void setLoad_method(LoadMethod value) {
    KenLMJNI.Config_load_method_set(swigCPtr, this, value.swigValue());
  }

  public LoadMethod getLoad_method() {
    return LoadMethod.swigToEnum(KenLMJNI.Config_load_method_get(swigCPtr, this));
  }

  public Config() {
    this(KenLMJNI.new_Config(), true);
  }

}
