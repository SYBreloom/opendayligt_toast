package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.RpcOutput;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>people</b>
 * <pre>
 * output;
 * </pre>The schema path to identify an instance is
 * <i>people/add-person/output</i>
 * 
 * <p>To create instances of this class use {@link AddPersonOutputBuilder}.
 * @see AddPersonOutputBuilder
 *
 */
public interface AddPersonOutput
    extends
    RpcOutput,
    Augmentable<AddPersonOutput>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("output");


}

