package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.toaster.app.config.rev160503;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataRoot;

/**
 * Configuration for the Opendaylight toaster application.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>toaster-app-config</b>
 * <pre>
 * module toaster-app-config {
 *   yang-version 1;
 *   namespace urn:opendaylight:params:xml:ns:yang:controller:toaster-app-config;
 *   prefix toaster-app-config;
 *   import toaster {
 *     prefix toaster;
 *     revision-date 2009-11-20;
 *   }
 *   revision 2016-05-03 {
 *   }
 *   container toaster-app-config {
 *     leaf manufacturer {
 *       type toaster:DisplayString;
 *       default Opendaylight;
 *     }
 *     leaf model-number {
 *       type toaster:DisplayString;
 *       default "Model 1 - Binding Aware";
 *     }
 *     leaf max-make-toast-tries {
 *       type uint16;
 *       default 2;
 *     }
 *   }
 * }
 * </pre>
 *
 */
public interface ToasterAppConfigData
    extends
    DataRoot
{




    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.toaster.app.config.rev160503.ToasterAppConfig</code> <code>toasterAppConfig</code>, or <code>null</code> if not present
     */
    @Nullable ToasterAppConfig getToasterAppConfig();

}

