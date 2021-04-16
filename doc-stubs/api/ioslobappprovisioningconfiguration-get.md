---
title: "Get iosLobAppProvisioningConfiguration"
description: "Read the properties and relationships of an iosLobAppProvisioningConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get iosLobAppProvisioningConfiguration
Namespace: microsoft.graph



Read the properties and relationships of an [iosLobAppProvisioningConfiguration](../resources/ioslobappprovisioningconfiguration.md) object.

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
GET /deviceAppManagement/iosLobAppProvisioningConfigurations/{iosLobAppProvisioningConfigurationId}
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

If successful, this method returns a `200 OK` response code and an [iosLobAppProvisioningConfiguration](../resources/ioslobappprovisioningconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_ioslobappprovisioningconfiguration"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceAppManagement/iosLobAppProvisioningConfigurations/{iosLobAppProvisioningConfigurationId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.iosLobAppProvisioningConfiguration"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.iosLobAppProvisioningConfiguration",
    "id": "4f6c8c9f-8c9f-4f6c-9f8c-6c4f9f8c6c4f",
    "createdDateTime": "String (timestamp)",
    "description": "String",
    "displayName": "String",
    "expirationDateTime": "String (timestamp)",
    "lastModifiedDateTime": "String (timestamp)",
    "payload": "Binary",
    "payloadFileName": "String",
    "roleScopeTagIds": [
      "String"
    ],
    "version": "Integer"
  }
}
```

