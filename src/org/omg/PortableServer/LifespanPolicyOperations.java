package org.omg.PortableServer;


/**
* org/omg/PortableServer/LifespanPolicyOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/jenkins/workspace/8-2-build-windows-amd64-cygwin/jdk8u251/737/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Thursday, March 12, 2020 6:33:11 AM UTC
*/


/**
	 * The LifespanPolicy specifies the lifespan of the 
	 * objects implemented in the created POA. The default 
	 * is TRANSIENT.
	 */
public interface LifespanPolicyOperations  extends org.omg.CORBA.PolicyOperations
{

  /**
	 * specifies the policy value
	 */
  org.omg.PortableServer.LifespanPolicyValue value ();
} // interface LifespanPolicyOperations
