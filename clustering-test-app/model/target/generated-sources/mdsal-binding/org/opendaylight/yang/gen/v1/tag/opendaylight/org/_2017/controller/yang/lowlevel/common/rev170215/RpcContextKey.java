package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class RpcContextKey
 implements Identifier<RpcContext> {
    private static final long serialVersionUID = 6479899203065667003L;
    private final String _identifier;


    public RpcContextKey(String _identifier) {
    
    
        this._identifier = _identifier;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public RpcContextKey(RpcContextKey source) {
        this._identifier = source._identifier;
    }


    public String getIdentifier() {
        return _identifier;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_identifier);
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        RpcContextKey other = (RpcContextKey) obj;
        if (!Objects.equals(_identifier, other._identifier)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(RpcContextKey.class);
        CodeHelpers.appendValue(helper, "_identifier", _identifier);
        return helper.toString();
    }
}

