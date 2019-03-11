package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.toaster.app.config.rev160503;
import java.lang.Integer;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.DisplayString;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>toaster-app-config</b>
 * <pre>
 * container toaster-app-config {
 *   leaf manufacturer {
 *     type toaster:DisplayString;
 *     default Opendaylight;
 *   }
 *   leaf model-number {
 *     type toaster:DisplayString;
 *     default "Model 1 - Binding Aware";
 *   }
 *   leaf max-make-toast-tries {
 *     type uint16;
 *     default 2;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>toaster-app-config/toaster-app-config</i>
 * 
 * <p>To create instances of this class use {@link ToasterAppConfigBuilder}.
 * @see ToasterAppConfigBuilder
 *
 */
public interface ToasterAppConfig
    extends
    ChildOf<ToasterAppConfigData>,
    Augmentable<ToasterAppConfig>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("toaster-app-config");

    /**
     * @return <code>org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.DisplayString</code> <code>manufacturer</code>, or <code>null</code> if not present
     */
    @Nullable DisplayString getManufacturer();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.DisplayString</code> <code>modelNumber</code>, or <code>null</code> if not present
     */
    @Nullable DisplayString getModelNumber();
    
    /**
     * @return <code>java.lang.Integer</code> <code>maxMakeToastTries</code>, or <code>null</code> if not present
     */
    @Nullable Integer getMaxMakeToastTries();

}

