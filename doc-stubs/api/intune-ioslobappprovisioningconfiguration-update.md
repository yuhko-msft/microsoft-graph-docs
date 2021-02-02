---
title: "Update iosLobAppProvisioningConfiguration"
description: "Update the properties of an iosLobAppProvisioningConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update iosLobAppProvisioningConfiguration
Namespace: microsoft.graph

Update the properties of an [iosLobAppProvisioningConfiguration](../resources/intune-ioslobappprovisioningconfiguration.md) object.

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
PATCH /deviceAppManagement/iosLobAppProvisioningConfigurations/{iosLobAppProvisioningConfigurationId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [iosLobAppProvisioningConfiguration](../resources/intune-ioslobappprovisioningconfiguration.md) object.

The following table shows the properties that are required when you update the [iosLobAppProvisioningConfiguration](../resources/intune-ioslobappprovisioningconfiguration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|expirationDateTime|DateTimeOffset|**TODO: Add Description**|
|payloadFileName|String|**TODO: Add Description**|
|payload|Binary|**TODO: Add Description**|
|roleScopeTagIds|String collection|**TODO: Add Description**|
|associatedMobileApps|String collection|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|version|Int32|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [iosLobAppProvisioningConfiguration](../resources/intune-ioslobappprovisioningconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_ioslobappprovisioningconfiguration"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/deviceAppManagement/iosLobAppProvisioningConfigurations/{iosLobAppProvisioningConfigurationId}
Content-Type: application/json
Content-length: 353

{
  "@odata.type": "#microsoft.graph.iosLobAppProvisioningConfiguration",
  "expirationDateTime": "String (timestamp)",
  "payloadFileName": "String",
  "payload": "Binary",
  "roleScopeTagIds": [
    "String"
  ],
  "associatedMobileApps": [
    "String"
  ],
  "description": "String",
  "displayName": "String",
  "version": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.iosLobAppProvisioningConfiguration",
  "id": "186a432a-432a-186a-2a43-6a182a436a18",
  "expirationDateTime": "String (timestamp)",
  "payloadFileName": "String",
  "payload": "Binary",
  "roleScopeTagIds": [
    "String"
  ],
  "associatedMobileApps": [
    "String"
  ],
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "displayName": "String",
  "version": "Integer"
}
```

