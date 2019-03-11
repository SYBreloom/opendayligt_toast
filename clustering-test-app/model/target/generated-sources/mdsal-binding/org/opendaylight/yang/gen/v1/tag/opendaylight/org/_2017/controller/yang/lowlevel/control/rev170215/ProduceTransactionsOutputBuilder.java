package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import java.lang.Class;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link ProduceTransactionsOutputBuilder} instances.
 * 
 * @see ProduceTransactionsOutputBuilder
 *
 */
public class ProduceTransactionsOutputBuilder implements Builder<ProduceTransactionsOutput> {

    private Long _allTx;
    private Long _deleteTx;
    private Long _insertTx;


    Map<Class<? extends Augmentation<ProduceTransactionsOutput>>, Augmentation<ProduceTransactionsOutput>> augmentation = Collections.emptyMap();

    public ProduceTransactionsOutputBuilder() {
    }
    public ProduceTransactionsOutputBuilder(org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.TransactionsResult arg) {
        this._allTx = arg.getAllTx();
        this._insertTx = arg.getInsertTx();
        this._deleteTx = arg.getDeleteTx();
    }

    public ProduceTransactionsOutputBuilder(ProduceTransactionsOutput base) {
        this._allTx = base.getAllTx();
        this._deleteTx = base.getDeleteTx();
        this._insertTx = base.getInsertTx();
        if (base instanceof ProduceTransactionsOutputImpl) {
            ProduceTransactionsOutputImpl impl = (ProduceTransactionsOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<ProduceTransactionsOutput>>, Augmentation<ProduceTransactionsOutput>> aug =((AugmentationHolder<ProduceTransactionsOutput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.TransactionsResult</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.TransactionsResult) {
            this._allTx = ((org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.TransactionsResult)arg).getAllTx();
            this._insertTx = ((org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.TransactionsResult)arg).getInsertTx();
            this._deleteTx = ((org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.TransactionsResult)arg).getDeleteTx();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.TransactionsResult]");
    }

    public Long getAllTx() {
        return _allTx;
    }
    
    public Long getDeleteTx() {
        return _deleteTx;
    }
    
    public Long getInsertTx() {
        return _insertTx;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ProduceTransactionsOutput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public ProduceTransactionsOutputBuilder setAllTx(final Long value) {
        this._allTx = value;
        return this;
    }
    
    public ProduceTransactionsOutputBuilder setDeleteTx(final Long value) {
        this._deleteTx = value;
        return this;
    }
    
    public ProduceTransactionsOutputBuilder setInsertTx(final Long value) {
        this._insertTx = value;
        return this;
    }
    
    public ProduceTransactionsOutputBuilder addAugmentation(Class<? extends Augmentation<ProduceTransactionsOutput>> augmentationType, Augmentation<ProduceTransactionsOutput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ProduceTransactionsOutputBuilder removeAugmentation(Class<? extends Augmentation<ProduceTransactionsOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ProduceTransactionsOutput build() {
        return new ProduceTransactionsOutputImpl(this);
    }

    private static final class ProduceTransactionsOutputImpl implements ProduceTransactionsOutput {
    
        private final Long _allTx;
        private final Long _deleteTx;
        private final Long _insertTx;
    
        private Map<Class<? extends Augmentation<ProduceTransactionsOutput>>, Augmentation<ProduceTransactionsOutput>> augmentation = Collections.emptyMap();
    
        ProduceTransactionsOutputImpl(ProduceTransactionsOutputBuilder base) {
            this._allTx = base.getAllTx();
            this._deleteTx = base.getDeleteTx();
            this._insertTx = base.getInsertTx();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<ProduceTransactionsOutput> getImplementedInterface() {
            return ProduceTransactionsOutput.class;
        }
    
        @Override
        public Long getAllTx() {
            return _allTx;
        }
        
        @Override
        public Long getDeleteTx() {
            return _deleteTx;
        }
        
        @Override
        public Long getInsertTx() {
            return _insertTx;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ProduceTransactionsOutput>> E augmentation(Class<E> augmentationType) {
            return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
        }
    
        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + Objects.hashCode(_allTx);
            result = prime * result + Objects.hashCode(_deleteTx);
            result = prime * result + Objects.hashCode(_insertTx);
            result = prime * result + Objects.hashCode(augmentation);
        
            hash = result;
            hashValid = true;
            return result;
        }
    
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!ProduceTransactionsOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ProduceTransactionsOutput other = (ProduceTransactionsOutput)obj;
            if (!Objects.equals(_allTx, other.getAllTx())) {
                return false;
            }
            if (!Objects.equals(_deleteTx, other.getDeleteTx())) {
                return false;
            }
            if (!Objects.equals(_insertTx, other.getInsertTx())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ProduceTransactionsOutputImpl otherImpl = (ProduceTransactionsOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ProduceTransactionsOutput>>, Augmentation<ProduceTransactionsOutput>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.augmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }
    
        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ProduceTransactionsOutput");
            CodeHelpers.appendValue(helper, "_allTx", _allTx);
            CodeHelpers.appendValue(helper, "_deleteTx", _deleteTx);
            CodeHelpers.appendValue(helper, "_insertTx", _insertTx);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
