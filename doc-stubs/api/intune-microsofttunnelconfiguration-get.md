---
title: "Get microsoftTunnelConfiguration"
description: "Read the properties and relationships of a microsoftTunnelConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get microsoftTunnelConfiguration
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of a [microsoftTunnelConfiguration](../resources/intune-microsofttunnelconfiguration.md) object.

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
GET /deviceManagement/microsoftTunnelConfigurations/{microsoftTunnelConfigurationId}
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

If successful, this method returns a `200 OK` response code and a [microsoftTunnelConfiguration](../resources/intune-microsofttunnelconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_microsofttunnelconfiguration"
}
-->
``` http
GET https://graph.microsoft.com/beta/deviceManagement/microsoftTunnelConfigurations/{microsoftTunnelConfigurationId}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.management.services.api.microsoftTunnelConfiguration"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.management.services.api.microsoftTunnelConfiguration",
    "id": "d37c61c4-61c4-d37c-c461-7cd3c4617cd3",
    "displayName": "String",
    "description": "String",
    "network": "String",
    "dnsServers": [
      "String"
    ],
    "defaultDomainSuffix": "String",
    "routesInclude": [
      "String"
    ],
    "routesExclude": [
      "String"
    ],
    "splitDNS": [
      "String"
    ],
    "listenPort": "Integer",
    "advancedSettings": [
      {
        "@odata.type": "microsoft.graph.keyValuePair"
      }
    ],
    "lastUpdateDateTime": "String (timestamp)",
    "roleScopeTagIds": [
      "String"
    ]
  }
}
```

