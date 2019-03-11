package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import java.lang.Boolean;
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
 * Class that builds {@link WriteTransactionsInputBuilder} instances.
 * 
 * @see WriteTransactionsInputBuilder
 *
 */
public class WriteTransactionsInputBuilder implements Builder<WriteTransactionsInput> {

    private String _id;
    private Long _seconds;
    private Long _transactionsPerSecond;
    private Boolean _chainedTransactions;


    Map<Class<? extends Augmentation<WriteTransactionsInput>>, Augmentation<WriteTransactionsInput>> augmentation = Collections.emptyMap();

    public WriteTransactionsInputBuilder() {
    }
    public WriteTransactionsInputBuilder(org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.TransactionsParams arg) {
        this._seconds = arg.getSeconds();
        this._transactionsPerSecond = arg.getTransactionsPerSecond();
    }
    public WriteTransactionsInputBuilder(org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.IdGrouping arg) {
        this._id = arg.getId();
    }

    public WriteTransactionsInputBuilder(WriteTransactionsInput base) {
        this._id = base.getId();
        this._seconds = base.getSeconds();
        this._transactionsPerSecond = base.getTransactionsPerSecond();
        this._chainedTransactions = base.isChainedTransactions();
        if (base instanceof WriteTransactionsInputImpl) {
            WriteTransactionsInputImpl impl = (WriteTransactionsInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<WriteTransactionsInput>>, Augmentation<WriteTransactionsInput>> aug =((AugmentationHolder<WriteTransactionsInput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.IdGrouping</li>
     * <li>org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.TransactionsParams</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.IdGrouping) {
            this._id = ((org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.IdGrouping)arg).getId();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.TransactionsParams) {
            this._seconds = ((org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.TransactionsParams)arg).getSeconds();
            this._transactionsPerSecond = ((org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.TransactionsParams)arg).getTransactionsPerSecond();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.IdGrouping, org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.TransactionsParams]");
    }

    public String getId() {
        return _id;
    }
    
    public Long getSeconds() {
        return _seconds;
    }
    
    public Long getTransactionsPerSecond() {
        return _transactionsPerSecond;
    }
    
    public Boolean isChainedTransactions() {
        return _chainedTransactions;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<WriteTransactionsInput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public WriteTransactionsInputBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    private static void checkSecondsRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public WriteTransactionsInputBuilder setSeconds(final Long value) {
    if (value != null) {
        checkSecondsRange(value);
        
    }
        this._seconds = value;
        return this;
    }
    private static void checkTransactionsPerSecondRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public WriteTransactionsInputBuilder setTransactionsPerSecond(final Long value) {
    if (value != null) {
        checkTransactionsPerSecondRange(value);
        
    }
        this._transactionsPerSecond = value;
        return this;
    }
    
    public WriteTransactionsInputBuilder setChainedTransactions(final Boolean value) {
        this._chainedTransactions = value;
        return this;
    }
    
    public WriteTransactionsInputBuilder addAugmentation(Class<? extends Augmentation<WriteTransactionsInput>> augmentationType, Augmentation<WriteTransactionsInput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public WriteTransactionsInputBuilder removeAugmentation(Class<? extends Augmentation<WriteTransactionsInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public WriteTransactionsInput build() {
        return new WriteTransactionsInputImpl(this);
    }

    private static final class WriteTransactionsInputImpl implements WriteTransactionsInput {
    
        private final String _id;
        private final Long _seconds;
        private final Long _transactionsPerSecond;
        private final Boolean _chainedTransactions;
    
        private Map<Class<? extends Augmentation<WriteTransactionsInput>>, Augmentation<WriteTransactionsInput>> augmentation = Collections.emptyMap();
    
        WriteTransactionsInputImpl(WriteTransactionsInputBuilder base) {
            this._id = base.getId();
            this._seconds = base.getSeconds();
            this._transactionsPerSecond = base.getTransactionsPerSecond();
            this._chainedTransactions = base.isChainedTransactions();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<WriteTransactionsInput> getImplementedInterface() {
            return WriteTransactionsInput.class;
        }
    
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public Long getSeconds() {
            return _seconds;
        }
        
        @Override
        public Long getTransactionsPerSecond() {
            return _transactionsPerSecond;
        }
        
        @Override
        public Boolean isChainedTransactions() {
            return _chainedTransactions;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<WriteTransactionsInput>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_seconds);
            result = prime * result + Objects.hashCode(_transactionsPerSecond);
            result = prime * result + Objects.hashCode(_chainedTransactions);
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
            if (!WriteTransactionsInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            WriteTransactionsInput other = (WriteTransactionsInput)obj;
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_seconds, other.getSeconds())) {
                return false;
            }
            if (!Objects.equals(_transactionsPerSecond, other.getTransactionsPerSecond())) {
                return false;
            }
            if (!Objects.equals(_chainedTransactions, other.isChainedTransactions())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                WriteTransactionsInputImpl otherImpl = (WriteTransactionsInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<WriteTransactionsInput>>, Augmentation<WriteTransactionsInput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("WriteTransactionsInput");
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_seconds", _seconds);
            CodeHelpers.appendValue(helper, "_transactionsPerSecond", _transactionsPerSecond);
            CodeHelpers.appendValue(helper, "_chainedTransactions", _chainedTransactions);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
