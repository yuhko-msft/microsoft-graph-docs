---
title: "Create microsoftTunnelConfiguration"
description: "Create a new microsoftTunnelConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create microsoftTunnelConfiguration
Namespace: microsoft.graph



Create a new microsoftTunnelConfiguration object.

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
POST /deviceManagement/microsoftTunnelConfigurations
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [microsoftTunnelConfiguration](../resources/microsofttunnelconfiguration.md) object.

The following table shows the properties that are required when you create the [microsoftTunnelConfiguration](../resources/microsofttunnelconfiguration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|advancedSettings|[keyValuePair](../resources/keyvaluepair.md) collection|Additional settings that may be applied to the server|
|defaultDomainSuffix|String|The Default Domain appendix that will be used by the clients|
|description|String|The MicrosoftTunnelConfiguration's description|
|displayName|String|The MicrosoftTunnelConfiguration's display name|
|dnsServers|String collection|The DNS servers that will be used by the clients|
|lastUpdateDateTime|DateTimeOffset|When the MicrosoftTunnelConfiguration was last updated|
|listenPort|Int32|The port that both TCP and UPD will listen over on the server|
|network|String|The subnet that will be used to allocate virtual address for the clients|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance.|
|routesExclude|String collection|Subsets of the routes that will not be routed by the server|
|routesInclude|String collection|The routs that will be routed by the server|
|splitDNS|String collection|The domains that will be resolved using the provided dns servers|



## Response

If successful, this method returns a `201 Created` response code and a [microsoftTunnelConfiguration](../resources/microsofttunnelconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_microsofttunnelconfiguration_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/microsoftTunnelConfigurations
Content-Type: application/json
Content-length: 563

{
  "@odata.type": "#microsoft.graph.microsoftTunnelConfiguration",
  "advancedSettings": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ],
  "defaultDomainSuffix": "String",
  "description": "String",
  "displayName": "String",
  "dnsServers": [
    "String"
  ],
  "lastUpdateDateTime": "String (timestamp)",
  "listenPort": "Integer",
  "network": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "routesExclude": [
    "String"
  ],
  "routesInclude": [
    "String"
  ],
  "splitDNS": [
    "String"
  ]
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.microsoftTunnelConfiguration"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.microsoftTunnelConfiguration",
  "id": "68a71be8-1be8-68a7-e81b-a768e81ba768",
  "advancedSettings": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ],
  "defaultDomainSuffix": "String",
  "description": "String",
  "displayName": "String",
  "dnsServers": [
    "String"
  ],
  "lastUpdateDateTime": "String (timestamp)",
  "listenPort": "Integer",
  "network": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "routesExclude": [
    "String"
  ],
  "routesInclude": [
    "String"
  ],
  "splitDNS": [
    "String"
  ]
}
```

