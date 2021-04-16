---
title: "Create iosLobAppProvisioningConfiguration"
description: "Create a new iosLobAppProvisioningConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create iosLobAppProvisioningConfiguration
Namespace: microsoft.graph



Create a new [iosLobAppProvisioningConfiguration](../resources/ioslobappprovisioningconfiguration.md) object.

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
POST /deviceAppManagement/iosLobAppProvisioningConfigurations
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [iosLobAppProvisioningConfiguration](../resources/ioslobappprovisioningconfiguration.md) object.

The following table shows the properties that are required when you create the [iosLobAppProvisioningConfiguration](../resources/ioslobappprovisioningconfiguration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|DateTime the object was created.|
|description|String|Admin provided description of the Device Configuration.|
|displayName|String|Admin provided name of the device configuration.|
|expirationDateTime|DateTimeOffset|Optional profile expiration date and time.|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified.|
|payload|Binary|Payload. (UTF8 encoded byte array)|
|payloadFileName|String|Payload file name (*.mobileprovision | *.xml).|
|roleScopeTagIds|String collection|List of Scope Tags for this iOS LOB app provisioning configuration entity.|
|version|Int32|Version of the device configuration.|



## Response

If successful, this method returns a `201 Created` response code and an [iosLobAppProvisioningConfiguration](../resources/ioslobappprovisioningconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_ioslobappprovisioningconfiguration_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceAppManagement/iosLobAppProvisioningConfigurations
Content-Type: application/json
Content-length: 304

{
  "@odata.type": "#microsoft.graph.iosLobAppProvisioningConfiguration",
  "description": "String",
  "displayName": "String",
  "expirationDateTime": "String (timestamp)",
  "payload": "Binary",
  "payloadFileName": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "Integer"
}
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
HTTP/1.1 201 Created
Content-Type: application/json

{
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
```

