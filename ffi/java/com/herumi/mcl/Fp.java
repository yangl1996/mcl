/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.herumi.mcl;

public class Fp {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Fp(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Fp obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        MclJNI.delete_Fp(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Fp() {
    this(MclJNI.new_Fp__SWIG_0(), true);
  }

  public Fp(Fp rhs) {
    this(MclJNI.new_Fp__SWIG_1(Fp.getCPtr(rhs), rhs), true);
  }

  public Fp(int x) {
    this(MclJNI.new_Fp__SWIG_2(x), true);
  }

  public Fp(String str, int base) {
    this(MclJNI.new_Fp__SWIG_3(str, base), true);
  }

  public Fp(String str) {
    this(MclJNI.new_Fp__SWIG_4(str), true);
  }

  public boolean equals(Fp rhs) {
    return MclJNI.Fp_equals(swigCPtr, this, Fp.getCPtr(rhs), rhs);
  }

  public void setStr(String str, int base) {
    MclJNI.Fp_setStr__SWIG_0(swigCPtr, this, str, base);
  }

  public void setStr(String str) {
    MclJNI.Fp_setStr__SWIG_1(swigCPtr, this, str);
  }

  public void setInt(int x) {
    MclJNI.Fp_setInt(swigCPtr, this, x);
  }

  public void clear() {
    MclJNI.Fp_clear(swigCPtr, this);
  }

  public void setByCSPRNG() {
    MclJNI.Fp_setByCSPRNG(swigCPtr, this);
  }

  public String toString(int base) {
    return MclJNI.Fp_toString__SWIG_0(swigCPtr, this, base);
  }

  public String toString() {
    return MclJNI.Fp_toString__SWIG_1(swigCPtr, this);
  }

  public void deserialize(byte[] cbuf) {
    MclJNI.Fp_deserialize(swigCPtr, this, cbuf);
  }

}