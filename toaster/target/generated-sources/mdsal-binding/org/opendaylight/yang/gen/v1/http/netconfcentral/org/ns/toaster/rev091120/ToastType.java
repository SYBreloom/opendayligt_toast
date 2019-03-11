package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
import org.opendaylight.yangtools.yang.binding.BaseIdentity;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Base for all bread types supported by the toaster. New bread types not listed 
 * here nay be added in the future.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>toaster</b>
 * <pre>
 * identity toast-type {
 * }
 * </pre>The schema path to identify an instance is
 * <i>toaster/toast-type</i>
 *
 */
public interface ToastType
    extends
    BaseIdentity
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("toast-type");


}

