---
title: "List iosikEv2VpnConfiguration"
description: "Get a list of the iosikEv2VpnConfiguration objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List iosikEv2VpnConfiguration
Namespace: microsoft.graph



Get a list of the [iosikEv2VpnConfiguration](../resources/iosikev2vpnconfiguration.md) objects and their properties.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
GET ** Collection URI for microsoft.graph.iosikEv2VpnConfiguration not found
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a collection of [iosikEv2VpnConfiguration](../resources/iosikev2vpnconfiguration.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_iosikev2vpnconfiguration"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.iosikEv2VpnConfiguration not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.iosikEv2VpnConfiguration)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.iosikEv2VpnConfiguration",
      "id": "a2a737e4-37e4-a2a7-e437-a7a2e437a7a2",
      "createdDateTime": "String (timestamp)",
      "description": "String",
      "deviceManagementApplicabilityRuleDeviceMode": {
        "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleDeviceMode"
      },
      "deviceManagementApplicabilityRuleOsEdition": {
        "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsEdition"
      },
      "deviceManagementApplicabilityRuleOsVersion": {
        "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsVersion"
      },
      "displayName": "String",
      "lastModifiedDateTime": "String (timestamp)",
      "roleScopeTagIds": [
        "String"
      ],
      "supportsScopeTags": "Boolean",
      "version": "Integer",
      "associatedDomains": [
        "String"
      ],
      "authenticationMethod": "String",
      "connectionName": "String",
      "connectionType": "String",
      "customData": [
        {
          "@odata.type": "microsoft.graph.keyValue"
        }
      ],
      "customKeyValueData": [
        {
          "@odata.type": "microsoft.graph.keyValuePair"
        }
      ],
      "disableOnDemandUserOverride": "Boolean",
      "enablePerApp": "Boolean",
      "enableSplitTunneling": "Boolean",
      "excludedDomains": [
        "String"
      ],
      "identifier": "String",
      "loginGroupOrDomain": "String",
      "onDemandRules": [
        {
          "@odata.type": "microsoft.graph.vpnOnDemandRule"
        }
      ],
      "optInToDeviceIdSharing": "Boolean",
      "providerType": "String",
      "proxyServer": {
        "@odata.type": "microsoft.graph.vpnProxyServer"
      },
      "realm": "String",
      "role": "String",
      "safariDomains": [
        "String"
      ],
      "server": {
        "@odata.type": "microsoft.graph.vpnServer"
      },
      "cloudName": "String",
      "excludeList": [
        "String"
      ],
      "microsoftTunnelSiteId": "String",
      "strictEnforcement": "Boolean",
      "targetedMobileApps": [
        {
          "@odata.type": "microsoft.graph.appListItem"
        }
      ],
      "userDomain": "String",
      "allowDefaultChildSecurityAssociationParameters": "Boolean",
      "allowDefaultSecurityAssociationParameters": "Boolean",
      "alwaysOnConfiguration": {
        "@odata.type": "microsoft.graph.appleVpnAlwaysOnConfiguration"
      },
      "childSecurityAssociationParameters": {
        "@odata.type": "microsoft.graph.iosVpnSecurityAssociationParameters"
      },
      "clientAuthenticationType": "String",
      "deadPeerDetectionRate": "String",
      "disableMobilityAndMultihoming": "Boolean",
      "disableRedirect": "Boolean",
      "enableAlwaysOnConfiguration": "Boolean",
      "enableCertificateRevocationCheck": "Boolean",
      "enableEAP": "Boolean",
      "enablePerfectForwardSecrecy": "Boolean",
      "enableUseInternalSubnetAttributes": "Boolean",
      "localIdentifier": "String",
      "mtuSizeInBytes": "Integer",
      "remoteIdentifier": "String",
      "securityAssociationParameters": {
        "@odata.type": "microsoft.graph.iosVpnSecurityAssociationParameters"
      },
      "serverCertificateCommonName": "String",
      "serverCertificateIssuerCommonName": "String",
      "serverCertificateType": "String",
      "sharedSecret": "String",
      "tlsMaximumVersion": "String",
      "tlsMinimumVersion": "String"
    }
  ]
}
```

