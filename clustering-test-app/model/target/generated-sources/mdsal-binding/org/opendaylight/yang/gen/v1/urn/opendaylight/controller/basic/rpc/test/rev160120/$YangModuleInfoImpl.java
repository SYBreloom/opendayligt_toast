package org.opendaylight.yang.gen.v1.urn.opendaylight.controller.basic.rpc.test.rev160120;

import org.opendaylight.yangtools.yang.binding.ResourceYangModuleInfo;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.YangModuleInfo;
import java.util.Set;
import java.util.Collections;

public final class $YangModuleInfoImpl extends ResourceYangModuleInfo {
    private static final QName NAME = QName.create("urn:opendaylight:controller:basic-rpc-test", "2016-01-20", "basic-rpc-test").intern();
    private static final YangModuleInfo INSTANCE = new $YangModuleInfoImpl();

    private final Set<YangModuleInfo> importedModules;

    public static YangModuleInfo getInstance() {
        return INSTANCE;
    }

    public static QName qnameOf(final java.lang.String localName) {
        return QName.create(NAME, localName).intern();
    }

    private $YangModuleInfoImpl() {
        importedModules = Collections.emptySet();
    }
    
    @java.lang.Override
    public QName getName() {
        return NAME;
    }
    
    @java.lang.Override
    protected java.lang.String resourceName() {
        return "/META-INF/yang/basic-rpc-test@2016-01-20.yang";
    }
    
    @java.lang.Override
    public Set<YangModuleInfo> getImportedModules() {
        return importedModules;
    }
    
    
}
