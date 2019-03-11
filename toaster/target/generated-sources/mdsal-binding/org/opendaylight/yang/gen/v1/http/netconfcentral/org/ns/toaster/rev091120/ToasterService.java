package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
import com.google.common.util.concurrent.ListenableFuture;
import javax.annotation.CheckReturnValue;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;

/**
 * Interface for implementing the following YANG RPCs defined in module <b>toaster</b>
 * <pre>
 * rpc make-toast {
 *   input {
 *     leaf toasterDoneness {
 *       type uint32 {
 *         range "1 .. 10";
 *       }
 *       default 5;
 *     }
 *     leaf toasterToastType {
 *       type identityref {
 *         base toast:toast-type;
 *       }
 *       default wheat-bread;
 *     }
 *   }
 *   output;
 * }
 * rpc cancel-toast {
 *   input;
 *   output;
 * }
 * rpc restock-toaster {
 *   input {
 *     leaf amountOfBreadToStock {
 *       type uint32;
 *     }
 *   }
 *   output;
 * }
 * </pre>
 *
 */
public interface ToasterService
    extends
    RpcService
{




    /**
     * Make some toast. The toastDone notification will be sent when the toast is 
     * finished. An 'in-use' error will be returned if toast is already being made. A 
     * 'resource-denied' error will be returned if the toaster service is disabled.
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<MakeToastOutput>> makeToast(MakeToastInput input);
    
    /**
     * Stop making toast, if any is being made. A 'resource-denied' error will be 
     * returned if the toaster service is disabled.
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<CancelToastOutput>> cancelToast(CancelToastInput input);
    
    /**
     * Restocks the toaster with the amount of bread specified.
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<RestockToasterOutput>> restockToaster(RestockToasterInput input);

}

