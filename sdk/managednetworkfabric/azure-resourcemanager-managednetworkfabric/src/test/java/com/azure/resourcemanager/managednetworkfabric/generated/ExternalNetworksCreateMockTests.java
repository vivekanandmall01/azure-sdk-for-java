// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager;
import com.azure.resourcemanager.managednetworkfabric.models.ExternalNetwork;
import com.azure.resourcemanager.managednetworkfabric.models.ExternalNetworkPropertiesOptionAProperties;
import com.azure.resourcemanager.managednetworkfabric.models.OptionBProperties;
import com.azure.resourcemanager.managednetworkfabric.models.PeeringOption;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ExternalNetworksCreateMockTests {
    @Test
    public void testCreate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"networkToNetworkInterconnectId\":\"klxesl\",\"disabledOnResources\":[\"ustcpoq\",\"avnwqj\",\"g\",\"knlejjjkxybwfd\"],\"administrativeState\":\"Enabled\",\"provisioningState\":\"Succeeded\",\"peeringOption\":\"OptionB\",\"optionBProperties\":{\"importRouteTargets\":[],\"exportRouteTargets\":[]},\"optionAProperties\":{\"mtu\":880729716,\"vlanId\":1891353200,\"fabricASN\":1541050102,\"peerASN\":605317874,\"primaryIpv4Prefix\":\"xfwush\",\"primaryIpv6Prefix\":\"pkupnq\",\"secondaryIpv4Prefix\":\"gjfbpkuwxeoi\",\"secondaryIpv6Prefix\":\"fiz\"},\"importRoutePolicyId\":\"vkjzwfbcyaykm\",\"exportRoutePolicyId\":\"zs\",\"annotation\":\"wxrzxmdewsrsxkrp\"},\"id\":\"jazejwwviyoyp\",\"name\":\"uhbrnnhjxsq\",\"type\":\"jhqkbiwetpozy\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        ManagedNetworkFabricManager manager =
            ManagedNetworkFabricManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        ExternalNetwork response =
            manager
                .externalNetworks()
                .define("qyv")
                .withExistingL3IsolationDomain("kva", "blhtjq")
                .withPeeringOption(PeeringOption.OPTIONA)
                .withOptionBProperties(
                    new OptionBProperties()
                        .withImportRouteTargets(Arrays.asList())
                        .withExportRouteTargets(Arrays.asList()))
                .withOptionAProperties(
                    new ExternalNetworkPropertiesOptionAProperties()
                        .withPrimaryIpv4Prefix("wigsyeipqdsm")
                        .withPrimaryIpv6Prefix("grq")
                        .withSecondaryIpv4Prefix("gkkileplkcsmkn")
                        .withSecondaryIpv6Prefix("tbbaedorvvmqf")
                        .withMtu(1536025500)
                        .withVlanId(861452083)
                        .withPeerAsn(296202390))
                .withImportRoutePolicyId("ygbdgwumgxdgdhpa")
                .withExportRoutePolicyId("dexjddvjs")
                .withAnnotation("wotmmwllcolsrsxa")
                .create();

        Assertions.assertEquals(PeeringOption.OPTIONB, response.peeringOption());
        Assertions.assertEquals("xfwush", response.optionAProperties().primaryIpv4Prefix());
        Assertions.assertEquals("pkupnq", response.optionAProperties().primaryIpv6Prefix());
        Assertions.assertEquals("gjfbpkuwxeoi", response.optionAProperties().secondaryIpv4Prefix());
        Assertions.assertEquals("fiz", response.optionAProperties().secondaryIpv6Prefix());
        Assertions.assertEquals(880729716, response.optionAProperties().mtu());
        Assertions.assertEquals(1891353200, response.optionAProperties().vlanId());
        Assertions.assertEquals(605317874, response.optionAProperties().peerAsn());
        Assertions.assertEquals("vkjzwfbcyaykm", response.importRoutePolicyId());
        Assertions.assertEquals("zs", response.exportRoutePolicyId());
        Assertions.assertEquals("wxrzxmdewsrsxkrp", response.annotation());
    }
}
