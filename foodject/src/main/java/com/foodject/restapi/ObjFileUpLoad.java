package com.foodject.restapi;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openstack4j.api.OSClient.OSClientV3;
import org.openstack4j.api.storage.ObjectStorageObjectService;
import org.openstack4j.model.common.Identifier;
import org.openstack4j.model.common.Payloads;
import org.openstack4j.model.identity.v3.Token;
import org.openstack4j.model.storage.object.options.ObjectPutOptions;
import org.openstack4j.openstack.OSFactory;
import org.springframework.beans.factory.annotation.Value;

import ch.qos.logback.core.net.SyslogOutputStream;

public class ObjFileUpLoad {
    @Value("${NaverAccessKey}")
    String user;

    @Value("${NaverSecretKey}")
    String password;

    final String endpoint = "https://kr.archive.ncloudstorage.com:5000/v3";
    
    
    final String domainId = "DOMAIN_ID";
    final String projectId = "PROJECT_ID";

    public void upLoad() {
    	Token token = OSFactory.builderV3()
                .endpoint(endpoint)
                .credentials(user, password, Identifier.byId(domainId))
                .scopeToProject(Identifier.byId(projectId), Identifier.byId(domainId))
                .authenticate().getToken();

        OSClientV3 client = OSFactory.clientFromToken(token);

        ObjectStorageObjectService objectService = client.objectStorage().objects();

        String containerName = "sample-container";
        String objectName = "sample-object.txt";
        String contentType = "text/plain";

        File file = new File("/tmp/sample-object.txt");

        // with metadata
        // X-Object-Meta-Test-Meta-Key : test-meta-value
        Map<String, String> metadata1 = new HashMap<>();
        metadata1.put("test-meta-key", "test-meta-value");
        

        String etag = objectService.put(containerName, objectName, Payloads.create(file),
            ObjectPutOptions.create().contentType(contentType).metadata(metadata1));
        
        System.out.println(etag);
    }
    
    
}
