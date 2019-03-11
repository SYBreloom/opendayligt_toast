package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Enumeration;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Top-level container for all toaster database objects.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>toaster</b>
 * <pre>
 * container toaster {
 *   presence "Indicates the toaster service is available";
 *   leaf toasterManufacturer {
 *     type DisplayString;
 *     config false;
 *   }
 *   leaf toasterModelNumber {
 *     type DisplayString;
 *     config false;
 *   }
 *   leaf toasterStatus {
 *     type enumeration {
 *       enum up {
 *         value 1;
 *       }
 *       enum down {
 *         value 2;
 *       }
 *     }
 *     config false;
 *   }
 *   leaf darknessFactor {
 *     type uint32;
 *     default 1000;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>toaster/toaster</i>
 * 
 * <p>To create instances of this class use {@link ToasterBuilder}.
 * @see ToasterBuilder
 *
 */
public interface Toaster
    extends
    ChildOf<ToasterData>,
    Augmentable<Toaster>
{


    public enum ToasterStatus implements Enumeration {
        /**
         * The toaster knob position is up. No toast is being made now.
         *
         */
        Up(1, "up"),
        
        /**
         * The toaster knob position is down. Toast is being made now.
         *
         */
        Down(2, "down")
        ;
    
        private static final Map<String, ToasterStatus> NAME_MAP;
        private static final Map<Integer, ToasterStatus> VALUE_MAP;
    
        static {
            final Builder<String, ToasterStatus> nb = ImmutableMap.builder();
            final Builder<Integer, ToasterStatus> vb = ImmutableMap.builder();
            for (ToasterStatus enumItem : ToasterStatus.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private ToasterStatus(int value, String name) {
            this.value = value;
            this.name = name;
        }
    
        @Override
        public String getName() {
            return name;
        }
    
        @Override
        public int getIntValue() {
            return value;
        }
    
        /**
         * Return the enumeration member whose {@link #getName()} matches specified value.
         *
         * @param name YANG assigned name
         * @return corresponding ToasterStatus item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<ToasterStatus> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding ToasterStatus item, or null if no such item exists
         */
        public static ToasterStatus forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("toaster");

    /**
     * The name of the toaster's manufacturer. For instance, Microsoft Toaster.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.DisplayString</code> <code>toasterManufacturer</code>, or <code>null</code> if not present
     */
    @Nullable DisplayString getToasterManufacturer();
    
    /**
     * The name of the toaster's model. For instance, Radiant Automatic.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.DisplayString</code> <code>toasterModelNumber</code>, or <code>null</code> if not present
     */
    @Nullable DisplayString getToasterModelNumber();
    
    /**
     * This variable indicates the current state of the toaster.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster.ToasterStatus</code> <code>toasterStatus</code>, or <code>null</code> if not present
     */
    @Nullable ToasterStatus getToasterStatus();
    
    /**
     * The darkness factor. Basically, the number of ms to multiple the doneness value 
     * by.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>darknessFactor</code>, or <code>null</code> if not present
     */
    @Nullable Long getDarknessFactor();

}

