// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.networkcloud.NetworkCloudManager;
import com.azure.resourcemanager.networkcloud.models.ClusterMetricsConfiguration;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class MetricsConfigurationsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"extendedLocation\":{\"name\":\"ecominxojjluxxd\",\"type\":\"ilz\"},\"properties\":{\"collectionInterval\":7508237639605054575,\"detailedStatus\":\"Error\",\"detailedStatusMessage\":\"mueza\",\"disabledMetrics\":[\"ribqlotokh\",\"vwta\",\"nkcqwwxwjyofgw\"],\"enabledMetrics\":[\"btlwljssmcts\",\"ldkpwolgisu\",\"xbteogfgfiijryk\"],\"provisioningState\":\"Canceled\"},\"location\":\"k\",\"tags\":{\"luyqqaiossscyvai\":\"ceazfpxgnmqvz\",\"fxtjdhsoym\":\"ppuacvfyeowp\",\"tkfvvdshx\":\"pvtyqfttehdpbouj\"},\"id\":\"dedsuenygnxcgjtf\",\"name\":\"nquktrfnslnlrxs\",\"type\":\"ylt\"}";

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

        NetworkCloudManager manager =
            NetworkCloudManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        ClusterMetricsConfiguration response =
            manager
                .metricsConfigurations()
                .getWithResponse("nq", "gdxwbsfpyxx", "jlf", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("k", response.location());
        Assertions.assertEquals("ceazfpxgnmqvz", response.tags().get("luyqqaiossscyvai"));
        Assertions.assertEquals("ecominxojjluxxd", response.extendedLocation().name());
        Assertions.assertEquals("ilz", response.extendedLocation().type());
        Assertions.assertEquals(7508237639605054575L, response.collectionInterval());
        Assertions.assertEquals("btlwljssmcts", response.enabledMetrics().get(0));
    }
}
