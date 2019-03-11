package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818;
import java.lang.Long;
import java.lang.String;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Describes the contents of a car entry - Details of the car manufacturer, model 
 * etc
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>car</b>
 * <pre>
 * grouping car-entry {
 *   leaf id {
 *     type car-id;
 *   }
 *   leaf model {
 *     type string;
 *   }
 *   leaf manufacturer {
 *     type string;
 *   }
 *   leaf year {
 *     type uint32;
 *   }
 *   leaf category {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>car/car-entry</i>
 *
 */
public interface CarEntry
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("car-entry");

    /**
     * identifier of single list of entries.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818.CarId</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable CarId getId();
    
    /**
     * @return <code>java.lang.String</code> <code>model</code>, or <code>null</code> if not present
     */
    @Nullable String getModel();
    
    /**
     * @return <code>java.lang.String</code> <code>manufacturer</code>, or <code>null</code> if not present
     */
    @Nullable String getManufacturer();
    
    /**
     * @return <code>java.lang.Long</code> <code>year</code>, or <code>null</code> if not present
     */
    @Nullable Long getYear();
    
    /**
     * @return <code>java.lang.String</code> <code>category</code>, or <code>null</code> if not present
     */
    @Nullable String getCategory();

}

