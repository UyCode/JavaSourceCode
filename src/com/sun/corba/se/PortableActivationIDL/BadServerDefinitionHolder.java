package com.sun.corba.se.PortableActivationIDL;

/**
* com/sun/corba/se/PortableActivationIDL/BadServerDefinitionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/jenkins/workspace/8-2-build-windows-amd64-cygwin/jdk8u251/737/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Thursday, March 12, 2020 6:33:10 AM UTC
*/

public final class BadServerDefinitionHolder implements org.omg.CORBA.portable.Streamable
{
  public com.sun.corba.se.PortableActivationIDL.BadServerDefinition value = null;

  public BadServerDefinitionHolder ()
  {
  }

  public BadServerDefinitionHolder (com.sun.corba.se.PortableActivationIDL.BadServerDefinition initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.PortableActivationIDL.BadServerDefinitionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.PortableActivationIDL.BadServerDefinitionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.PortableActivationIDL.BadServerDefinitionHelper.type ();
  }

}
