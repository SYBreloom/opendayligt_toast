package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215;
import com.google.common.util.concurrent.ListenableFuture;
import javax.annotation.CheckReturnValue;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;

/**
 * Interface for implementing the following YANG RPCs defined in module <b>odl-mdsal-lowlevel-control</b>
 * <pre>
 * rpc unregister-flapping-singleton {
 *   output {
 *     leaf flap-count {
 *       type int64;
 *     }
 *   }
 *   input;
 * }
 * rpc unregister-constant {
 *   input;
 *   output;
 * }
 * rpc register-bound-constant {
 *   input {
 *     uses llc:context-grouping;
 *     uses llc:constant-grouping;
 *   }
 *   output;
 * }
 * rpc subscribe-ddtl {
 *   input;
 *   output;
 * }
 * rpc add-shard-replica {
 *   input {
 *     leaf shard-name {
 *       type string;
 *     }
 *   }
 *   output;
 * }
 * rpc shutdown-prefix-shard-replica {
 *   input {
 *     leaf prefix {
 *       type instance-identifier;
 *     }
 *   }
 *   output;
 * }
 * rpc register-flapping-singleton {
 *   input;
 *   output;
 * }
 * rpc unsubscribe-dtcl {
 *   output {
 *     leaf copy-matches {
 *       type boolean;
 *     }
 *   }
 *   input;
 * }
 * rpc start-publish-notifications {
 *   input {
 *     uses llc:id-grouping;
 *     leaf seconds {
 *       type uint32;
 *     }
 *     leaf notifications-per-second {
 *       type uint32;
 *     }
 *   }
 *   output;
 * }
 * rpc create-prefix-shard {
 *   input {
 *     leaf prefix {
 *       type instance-identifier;
 *     }
 *     leaf-list replicas {
 *       min-elements 1;
 *       type string;
 *     }
 *   }
 *   output;
 * }
 * rpc deconfigure-id-ints-shard {
 *   input;
 *   output;
 * }
 * rpc unsubscribe-ynl {
 *   input {
 *     uses llc:id-grouping;
 *   }
 *   output {
 *     leaf all-not {
 *       type int64;
 *     }
 *     leaf id-not {
 *       type int64;
 *     }
 *     leaf err-not {
 *       type int64;
 *     }
 *     leaf local-number {
 *       type int64;
 *     }
 *   }
 * }
 * rpc produce-transactions {
 *   input {
 *     uses llc:id-grouping;
 *     uses transactions-params;
 *     leaf isolated-transactions {
 *       type boolean;
 *     }
 *   }
 *   output {
 *     uses transactions-result;
 *   }
 * }
 * rpc check-publish-notifications {
 *   input {
 *     uses llc:id-grouping;
 *   }
 *   output {
 *     leaf active {
 *       type boolean;
 *     }
 *     leaf publish-count {
 *       mandatory false;
 *       type int64;
 *     }
 *     leaf last-error {
 *       mandatory false;
 *       type string;
 *     }
 *   }
 * }
 * rpc shutdown-shard-replica {
 *   input {
 *     leaf shard-name {
 *       type string;
 *     }
 *   }
 *   output;
 * }
 * rpc register-constant {
 *   input {
 *     uses llc:constant-grouping;
 *   }
 *   output;
 * }
 * rpc unregister-default-constant {
 *   input;
 *   output;
 * }
 * rpc unsubscribe-ddtl {
 *   output {
 *     leaf copy-matches {
 *       type boolean;
 *     }
 *   }
 *   input;
 * }
 * rpc unregister-singleton-constant {
 *   input;
 *   output;
 * }
 * rpc subscribe-dtcl {
 *   input;
 *   output;
 * }
 * rpc write-transactions {
 *   input {
 *     uses llc:id-grouping;
 *     uses transactions-params;
 *     leaf chained-transactions {
 *       type boolean;
 *     }
 *   }
 *   output {
 *     uses transactions-result;
 *   }
 * }
 * rpc is-client-aborted {
 *   output {
 *     leaf aborted {
 *       type boolean;
 *     }
 *   }
 *   input;
 * }
 * rpc become-prefix-leader {
 *   input {
 *     leaf prefix {
 *       type instance-identifier;
 *     }
 *   }
 *   output;
 * }
 * rpc remove-shard-replica {
 *   input {
 *     leaf shard-name {
 *       type string;
 *     }
 *   }
 *   output;
 * }
 * rpc subscribe-ynl {
 *   input {
 *     uses llc:id-grouping;
 *   }
 *   output;
 * }
 * rpc register-singleton-constant {
 *   input {
 *     uses llc:constant-grouping;
 *   }
 *   output;
 * }
 * rpc remove-prefix-shard {
 *   input {
 *     leaf prefix {
 *       type instance-identifier;
 *     }
 *   }
 *   output;
 * }
 * rpc register-default-constant {
 *   input {
 *     uses llc:constant-grouping;
 *   }
 *   output;
 * }
 * rpc unregister-bound-constant {
 *   input {
 *     uses llc:context-grouping;
 *   }
 *   output;
 * }
 * </pre>
 *
 */
public interface OdlMdsalLowlevelControlService
    extends
    RpcService
{




    /**
     * Upon receiving this, the member checks whether it has createda flapping 
     * application, and fails if no. If yes, the member shallset the active flag to 
     * false and return the current flap-count value.
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<UnregisterFlappingSingletonOutput>> unregisterFlappingSingleton(UnregisterFlappingSingletonInput input);
    
    /**
     * Upon receiving this, the member has to unregisterany llt:get-constant 
     * implementations it has registered.If no implementation has been registered, do 
     * nothing.
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<UnregisterConstantOutput>> unregisterConstant(UnregisterConstantInput input);
    
    /**
     * Upon receiving this, the member has to create and registera bound 
     * llt:get-contexted-constant implementation (routed RPC).If the registration fails
     * for any reason, propagate the corresponding error.
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<RegisterBoundConstantOutput>> registerBoundConstant(RegisterBoundConstantInput input);
    
    /**
     * Upon receiving this, the member checks whether it has already subscribedand 
     * fails if yes. If no, the member subscribes a DOMDataTreeListenerto listen for 
     * changes on whole llt:id-ints, and storesthe state from the initial notification 
     * to a local variable (called the local copy).Each Data Tree Change from further 
     * notifications shall be appliedto the local copy if it is compatible(the old 
     * state from notification is equal to the local copy state).If a notification is 
     * not compatible, it shall be ignored.
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<SubscribeDdtlOutput>> subscribeDdtl(SubscribeDdtlInput input);
    
    /**
     * A specialised copy of cluster-admin:add-shard-replica.FIXME: Is this really 
     * needed for prefix shards, or even module shards(or is the cluster-admin RPC 
     * sufficient)?
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<AddShardReplicaOutput>> addShardReplica(AddShardReplicaInput input);
    
    /**
     * Upon receiving this, the member will try to gracefully shutdown local 
     * configurationdata store prefix-based shard replica.
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<ShutdownPrefixShardReplicaOutput>> shutdownPrefixShardReplica(ShutdownPrefixShardReplicaInput input);
    
    /**
     * Upon receiving this, the member checks whether it has already createda 
     * 'flapping' application implementation and 'active' flag is set, and fails if 
     * yes.If no, the member (creates a flapping application implementation,)sets the 
     * active flag, initializes local variable flap-count to 0,and registers the 
     * implementation as a singleton application.If the registration fails for any 
     * reason, propagate the corresponding error.If the application is instantiated, it
     * immediatelly un-registers itself.When the application instance is closed, it 
     * increments flap-countand if active flag is set, re-registers the application 
     * implementation as a singleton.If either un-registration or re-registration 
     * fails, 'active' flag is unset,flap-count is set to negative of its previous 
     * value (minus one in case of un-registration)to signal a failure has happened.
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<RegisterFlappingSingletonOutput>> registerFlappingSingleton(RegisterFlappingSingletonInput input);
    
    /**
     * Upon receiving this, the member checks whether it has currently subscribeda Data
     * Tree Change Listener for llt:id-ints changes, and fails if no. If yes, the 
     * membershall unsubscribe the listener, read state of id-ints, compare thatto the 
     * local copy, and return whether the local copy is the same.
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<UnsubscribeDtclOutput>> unsubscribeDtcl(UnsubscribeDtclInput input);
    
    /**
     * Upon receiving this, the member checks whether it is already in the middle of 
     * publishing,for this id, and fails if yes. If no, the member shall clear any 
     * state tracking data possibly presentfrom the previous call wth this id, and 
     * start publishing llt:id-sequencenotifications with the given id and sequence 
     * numbers increasing from 1.The RPC shall return immediatelly before the first 
     * notification is published.The publishing task stops on first error of after the 
     * given time.
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<StartPublishNotificationsOutput>> startPublishNotifications(StartPublishNotificationsInput input);
    
    /**
     * Upon receiving this, the member creates a prefix shard at the 
     * instance-identifier, with replicason the required members.
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<CreatePrefixShardOutput>> createPrefixShard(CreatePrefixShardInput input);
    
    /**
     * Upon receiving this, the member shall ask the appropriate APIto remove the 
     * llt:id-ints shard (presumably created by produce-transactions)and return 
     * immediatelly.It is expected the data would move to the root prefix shard 
     * seamlessly.TODO: Make shard name configurable by input?
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<DeconfigureIdIntsShardOutput>> deconfigureIdIntsShard(DeconfigureIdIntsShardInput input);
    
    /**
     * Upon receiving this, the member checks whether it has currently subscribeda yang
     * listener for the given id, and fails if no. If yes, the membershall unsubscribe 
     * the listener and return values of the local variables.
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<UnsubscribeYnlOutput>> unsubscribeYnl(UnsubscribeYnlInput input);
    
    /**
     * Upon receiving this, the member shall make sure the outer list itemof 
     * llt:in-ints exists for the given id, make sure a shard forthe whole (config) 
     * id-ints is created (by creating and closing producerfor the whole id-ints), and 
     * create a DOMDataTreeProducer for that item (using that shard).FIXME: Is the 
     * above the normal way of creating prefix-based chards?Then start creating (one by
     * one) and submitting transactionsto randomly add or delete items on the inner 
     * list for that id.To ensure balanced number of deletes, the first write can 
     * createa random set of random numbers. Other writes shall be one per number.The 
     * writes shall use DOMDataTreeProducer API, as opposed to transaction 
     * (chains)created directly on datastore..get with a timeout on currently earliest 
     * non-complete Future (from .submit)shall be used as the primary wait method to 
     * throttle the submission rate.This RPC shall not return until all transactions 
     * are confirmed successful,or an exception is raised (the exception should 
     * propagate to restconf response).OptimisticLockException is always considered an 
     * error.In either case, the producer should be closed before returning,but the 
     * shard and the whole id item shall be kept as they are.
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<ProduceTransactionsOutput>> produceTransactions(ProduceTransactionsInput input);
    
    /**
     * Upon receiving this, the member shall immediatelly returnthe current tracking 
     * data related to the current (or previous) taskstarted by 
     * start-publish-notifications with this id.
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<CheckPublishNotificationsOutput>> checkPublishNotifications(CheckPublishNotificationsInput input);
    
    /**
     * Upon receiving this, the member will try to gracefully shutdown local 
     * configurationdata store module-based shard replica.
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<ShutdownShardReplicaOutput>> shutdownShardReplica(ShutdownShardReplicaInput input);
    
    /**
     * Upon receiving this, the member has to create llt:get-constantimplementation 
     * (global RPC). If the registration fails for any reason,propagate the 
     * corresponding error.
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<RegisterConstantOutput>> registerConstant(RegisterConstantInput input);
    
    /**
     * Upon receiving this, the member has to unregisterany llt:get-contexted-constant 
     * default implementations it has registered.If no default implementation has been 
     * registered, do nothing.
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<UnregisterDefaultConstantOutput>> unregisterDefaultConstant(UnregisterDefaultConstantInput input);
    
    /**
     * Upon receiving this, the member checks whether it has currently subscribeda 
     * DOMDataTreeListener for llt:id-ints changes, and fails if no. If yes, the 
     * membershall unsubscribe the listener, read state of id-ints (by briefly 
     * subscribingand ubsubscribing again), compare that to the local copy,and return 
     * whether the local copy is the same.
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<UnsubscribeDdtlOutput>> unsubscribeDdtl(UnsubscribeDdtlInput input);
    
    /**
     * Upon receiving this, the member checks whether it has currently registereda 
     * singleton application, and fails if no. If yes, the member shall unregisterthe 
     * application, presumably causing application instantiation on other member,and 
     * closing of the local application instance (unregistering 
     * llt:get-singleton-constant).If the unregistration fails for any reason, 
     * propagate the corresponding error.
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<UnregisterSingletonConstantOutput>> unregisterSingletonConstant(UnregisterSingletonConstantInput input);
    
    /**
     * Upon receiving this, the member checks whether it has already subscribedand 
     * fails if yes. If no, the member subscribes a Data Tree Change Listenerto listen 
     * for changes on whole llt:id-ints. The first notification received is stored 
     * immediately.Every notification received after the first one has the 
     * data(getDataBefore()) compared with thelast stored notification(called local 
     * copy), if they match the local copy is overwritten withthis notifications 
     * data(getDataAfter()). If they don't match the new notification is ignored.
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<SubscribeDtclOutput>> subscribeDtcl(SubscribeDtclInput input);
    
    /**
     * Upon receiving this, the member shall make sure the outer list itemof 
     * llt:id-ints exists for the given id, and then start creating (one by one)and 
     * submitting transactions to randomly add or delete items on the inner list for 
     * that id.The randomness should avoid creating conflicting writes (at least for 
     * non-chainedtransactions). The recommended way is to require the random numberhas
     * low significant bits different than the past ~100k numbers.To ensure balanced 
     * number of deletes, the first write can createa random set of numbers. Other 
     * writes shall be one per number.The writes shall use the old API, transaction 
     * (chains) created directly on datastore(as opposed to DOMDataTreeProducer)..get 
     * with a timeout on currently earliest non-complete Future (from .submit)shall be 
     * used as the primary wait method to throttle the submission rate.This RPC shall 
     * not return until all transactions are confirmed successful,or an exception is 
     * raised (the exception should propagate to restconf 
     * response).OptimisticLockException is always considered an error.
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<WriteTransactionsOutput>> writeTransactions(WriteTransactionsInput input);
    
    /**
     * Return state of cds-access-client.FIXME: Is an input needed?
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<IsClientAbortedOutput>> isClientAborted(IsClientAbortedInput input);
    
    /**
     * Upon receiving this, the member shall ask the appropriate APIto become Leader of
     * the given shard (presumably the llt:list-ints one,created by 
     * produce-transactions) and return immediatelly.
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<BecomePrefixLeaderOutput>> becomePrefixLeader(BecomePrefixLeaderInput input);
    
    /**
     * A specialised copy of cluster-admin:remove-shard-replica.FIXME: Is this really 
     * needed for prefix shards, or even module shards(or is the cluster-admin RPC 
     * sufficient)?
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<RemoveShardReplicaOutput>> removeShardReplica(RemoveShardReplicaInput input);
    
    /**
     * Upon receiving this, the member checks whether it has already subscribeda yang 
     * listener for the given id, and fails if yes.If no, the member subscribes a Yang 
     * notification listener to listen forllt:id-sequence notifications. The member 
     * also creates a local variable(called local-number) for the sequence number and 
     * initialize that to 0.Also three local counters are initialized to 0: all-not, 
     * id-not, err-not.Upon receiving any id-sequence notification, all-not is 
     * incremented.Each id-sequence notification of matching id shall increment 
     * id-not.If local-number was one less than the sequence number (from a 
     * notification matching id),increment local-number, else increment err-not.
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<SubscribeYnlOutput>> subscribeYnl(SubscribeYnlInput input);
    
    /**
     * Upon receiving this, the member checks whether it has already registereda 
     * singleton application, and fails if yes. If no, the member createsan application
     * implementation based on the given constantand registers the implementation as a 
     * singleton application.If the registration fails for any reason, propagate the 
     * corresponding error.If the application is instantiated, it creates and 
     * registersa llt:get-singleton-constant implementation, which returns the given 
     * costant.When the application instance is closed, it unregisters 
     * thatllt:get-singleton-constant implementation.
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<RegisterSingletonConstantOutput>> registerSingletonConstant(RegisterSingletonConstantInput input);
    
    /**
     * Upon receiving this, the member removes the prefix based shard identifier by 
     * this prefix.This must be called from the same node that created the shard.
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<RemovePrefixShardOutput>> removePrefixShard(RemovePrefixShardInput input);
    
    /**
     * Upon receiving this, the member has to create and registera default 
     * llt:get-contexted-constant implementation (routed RPC).If the registration fails
     * for any reason, propagate the corresponding error.
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<RegisterDefaultConstantOutput>> registerDefaultConstant(RegisterDefaultConstantInput input);
    
    /**
     * Upon receiving this, the member has to unregisterany llt:get-contexted-constant 
     * implementations bound to the context.If no bound implementation for the context 
     * has been registered, do nothing.
     *
     */
    @CheckReturnValue
    ListenableFuture<RpcResult<UnregisterBoundConstantOutput>> unregisterBoundConstant(UnregisterBoundConstantInput input);

}

