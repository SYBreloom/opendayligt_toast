package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
import java.lang.Class;
import java.lang.Long;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.RpcInput;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>toaster</b>
 * <pre>
 * input {
 *   leaf toasterDoneness {
 *     type uint32 {
 *       range "1 .. 10";
 *     }
 *     default 5;
 *   }
 *   leaf toasterToastType {
 *     type identityref {
 *       base toast:toast-type;
 *     }
 *     default wheat-bread;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>toaster/make-toast/input</i>
 * 
 * <p>To create instances of this class use {@link MakeToastInputBuilder}.
 * @see MakeToastInputBuilder
 *
 */
public interface MakeToastInput
    extends
    RpcInput,
    Augmentable<MakeToastInput>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("input");

    /**
     * This variable controls how well-done is the ensuing toast. It should be on a 
     * scale of 1 to 10. Toast made at 10 generally is considered unfit for human 
     * consumption; toast made at 1 is warmed lightly.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>toasterDoneness</code>, or <code>null</code> if not present
     */
    @Nullable Long getToasterDoneness();
    
    /**
     * This variable informs the toaster of the type of material that is being toasted.
     * The toaster uses this information, combined with toasterDoneness, to compute for
     * how long the material must be toasted to achieve the required doneness.
     *
     *
     *
     * @return <code>java.lang.Class</code> <code>toasterToastType</code>, or <code>null</code> if not present
     */
    @Nullable Class<? extends ToastType> getToasterToastType();

}

