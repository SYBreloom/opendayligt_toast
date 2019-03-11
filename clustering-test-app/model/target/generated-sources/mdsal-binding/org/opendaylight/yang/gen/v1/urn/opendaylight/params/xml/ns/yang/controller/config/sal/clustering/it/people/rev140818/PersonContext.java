package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818;
import org.opendaylight.yangtools.yang.binding.BaseIdentity;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * A person-context is a classifier for person elements which allows an RPC to 
 * provide a service on behalf of a particular element in the data tree.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>people</b>
 * <pre>
 * identity person-context {
 * }
 * </pre>The schema path to identify an instance is
 * <i>people/person-context</i>
 *
 */
public interface PersonContext
    extends
    BaseIdentity
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("person-context");


}

