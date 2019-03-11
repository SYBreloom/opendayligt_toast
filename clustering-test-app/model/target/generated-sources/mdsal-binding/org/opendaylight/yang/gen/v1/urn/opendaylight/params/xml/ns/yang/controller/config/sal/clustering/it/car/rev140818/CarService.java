package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818;
import com.google.common.util.concurrent.ListenableFuture;
import javax.annotation.CheckReturnValue;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;

/**
 * Interface for implementing the following YANG RPCs defined in module <b>car</b>
 * <pre>
 * rpc register-ownership {
 *   input {
 *     leaf car-id {
 *       type string;
 *     }
 *   }
 *   output;
 * }
 * rpc unregister-commit-cohort {
 *   input;
 *   output;
 * }
 * rpc stop-stress-test {
 *   output {
 *     leaf success-count {
 *       type uint32;
 *       default 0;
 *     }
 *     leaf failure-count {
 *       type uint32;
 *       default 0;
 *     }
 *   }
 *   input;
 * }
 * rpc register-logging-dtcl {
 *   input;
 *   output;
 * }
 * rpc register-commit-cohort {
 *   input;
 *   output;
 * }
 * rpc unregister-logging-dtcls {
 *   input;
 *   output;
 * }
 * rpc stress-test {
 *   input {
 *     leaf rate {
 *       type uint16;
 *     }
 *     leaf count {
 *       type uint32;
 *       default 0;
 *     }
 *   }
 *   output;
 * }
 * rpc unregister-ownership {
 *   input {
 *     leaf car-id {
 *       type string;
 *     }
 *   }
 *   output;
 * }
 * </pre>
 *
 */
public interface CarService
    extends
    RpcService
{




    @CheckReturnValue
    ListenableFuture<RpcResult<RegisterOwnershipOutput>> registerOwnership(RegisterOwnershipInput input);
    
    /**
     * Unregisters the sample commit cohort.
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<UnregisterCommitCohortOutput>> unregisterCommitCohort(UnregisterCommitCohortInput input);
    
    @CheckReturnValue
    ListenableFuture<RpcResult<StopStressTestOutput>> stopStressTest(StopStressTestInput input);
    
    /**
     * Registers a basic logging DTCL on the cars container. This is useful for 
     * analyzing the effects of DTCL on a long, flat list.
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<RegisterLoggingDtclOutput>> registerLoggingDtcl(RegisterLoggingDtclInput input);
    
    /**
     * Registers a sample commit cohort that validates car entry input.
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<RegisterCommitCohortOutput>> registerCommitCohort(RegisterCommitCohortInput input);
    
    /**
     * Unregisters the logging DTCL(s) for the cars container.
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<UnregisterLoggingDtclsOutput>> unregisterLoggingDtcls(UnregisterLoggingDtclsInput input);
    
    @CheckReturnValue
    ListenableFuture<RpcResult<StressTestOutput>> stressTest(StressTestInput input);
    
    @CheckReturnValue
    ListenableFuture<RpcResult<UnregisterOwnershipOutput>> unregisterOwnership(UnregisterOwnershipInput input);

}

