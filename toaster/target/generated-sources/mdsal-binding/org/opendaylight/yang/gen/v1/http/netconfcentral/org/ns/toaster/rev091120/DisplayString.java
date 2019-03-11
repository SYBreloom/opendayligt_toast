package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
import com.google.common.base.MoreObjects;
import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;

public class DisplayString
 implements Serializable {
    private static final long serialVersionUID = -5323910593144881832L;
    private final String _value;

    private static void check_valueLength(final String value) {
        final int length = value.length();
        if (length >= 0 && length <= 255) {
            return;
        }
        CodeHelpers.throwInvalidLength("[[0..255]]", value);
    }

    @ConstructorProperties("value")
    public DisplayString(String _value) {
        if (_value != null) {
            check_valueLength(_value);
        }
    
        Objects.requireNonNull(_value, "Supplied value may not be null");
    
        this._value = _value;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public DisplayString(DisplayString source) {
        this._value = source._value;
    }

    public static DisplayString getDefaultInstance(String defaultValue) {
        return new DisplayString(defaultValue);
    }

    public String getValue() {
        return _value;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_value);
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
        DisplayString other = (DisplayString) obj;
        if (!Objects.equals(_value, other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(DisplayString.class);
        CodeHelpers.appendValue(helper, "_value", _value);
        return helper.toString();
    }
}

