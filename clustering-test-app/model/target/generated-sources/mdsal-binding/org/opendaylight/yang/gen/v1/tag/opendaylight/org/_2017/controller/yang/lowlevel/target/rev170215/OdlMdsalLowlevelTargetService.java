package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215;
import com.google.common.util.concurrent.ListenableFuture;
import javax.annotation.CheckReturnValue;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;

/**
 * Interface for implementing the following YANG RPCs defined in module <b>odl-mdsal-lowlevel-target</b>
 * <pre>
 * rpc get-constant {
 *   output {
 *     uses llc:constant-grouping;
 *   }
 *   input;
 * }
 * rpc get-singleton-constant {
 *   output {
 *     uses llc:constant-grouping;
 *   }
 *   input;
 * }
 * rpc get-contexted-constant {
 *   input {
 *     uses llc:context-grouping;
 *   }
 *   output {
 *     uses llc:constant-grouping;
 *   }
 * }
 * </pre>
 *
 */
public interface OdlMdsalLowlevelTargetService
    extends
    RpcService
{




    /**
     * Return the constant string provided by the previously registered 
     * implementation.Propagate appropriate error if no, unreachable, or failing 
     * implementation is found.
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<GetConstantOutput>> getConstant(GetConstantInput input);
    
    /**
     * Return the constant string provided by the previously registered 
     * implementation.Propagate appropriate error if no, unreachable, or failing 
     * implementation is found.This is basically the same as get-constant, but it can 
     * have a differentimplementation registered, thus allowing to track both 
     * implementations in longevity jobs.
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<GetSingletonConstantOutput>> getSingletonConstant(GetSingletonConstantInput input);
    
    /**
     * Return the constant corresponding to a registered implementation (either bound 
     * or default).Propagate appropriate error if no, unreachable, or failing 
     * implementation is found.
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<GetContextedConstantOutput>> getContextedConstant(GetContextedConstantInput input);

}

