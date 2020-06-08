package org.omg.IOP;


/**
* org/omg/IOP/TAG_MULTIPLE_COMPONENTS.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON/workspace/8-2-build-linux-amd64/jdk8u72/5732/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Tuesday, December 22, 2015 10:00:45 PM PST
*/

public interface TAG_MULTIPLE_COMPONENTS
{

  /** 
       * Indicates that the value encapsulated is of type 
       * <code>MultipleComponentProfile</code>. In this case, the profile 
       * consists of a list of protocol components, the use of which must 
       * be specified by the protocol using this profile. This profile may 
       * be used to carry IOR components.  
       * <p>
       * The <code>profile_data</code> for the 
       * <code>TAG_MULTIPLE_COMPONENTS</code> profile is a CDR encapsulation 
       * of the <code>MultipleComponentProfile</code> type shown above.
       */
  public static final int value = (int)(1L);
}
