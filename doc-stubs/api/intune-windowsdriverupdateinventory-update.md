---
title: "Update windowsDriverUpdateInventory"
description: "Update the properties of a windowsDriverUpdateInventory object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update windowsDriverUpdateInventory
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [windowsDriverUpdateInventory](../resources/intune-windowsdriverupdateinventory.md) object.

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
PATCH /deviceManagement/windowsDriverUpdateProfiles/{windowsDriverUpdateProfileId}/driverInventories/{windowsDriverUpdateInventoryId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsDriverUpdateInventory](../resources/intune-windowsdriverupdateinventory.md) object.

The following table shows the properties that are required when you update the [windowsDriverUpdateInventory](../resources/intune-windowsdriverupdateinventory.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|name|String|**TODO: Add Description**|
|version|String|**TODO: Add Description**|
|manufacturer|String|**TODO: Add Description**|
|releaseDateTime|DateTimeOffset|**TODO: Add Description**|
|driverClass|String|**TODO: Add Description**|
|applicableDeviceCount|Int32|**TODO: Add Description**|
|approvalStatus|driverApprovalStatus|**TODO: Add Description**. Possible values are: `needsReview`, `declined`, `approved`, `suspended`.|
|category|driverCategory|**TODO: Add Description**. Possible values are: `recommended`, `previouslyApproved`, `other`.|
|deployDateTime|DateTimeOffset|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [windowsDriverUpdateInventory](../resources/intune-windowsdriverupdateinventory.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_windowsdriverupdateinventory"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/deviceManagement/windowsDriverUpdateProfiles/{windowsDriverUpdateProfileId}/driverInventories/{windowsDriverUpdateInventoryId}
Content-Type: application/json
Content-length: 354

{
  "@odata.type": "#microsoft.graph.windowsDriverUpdateInventory",
  "name": "String",
  "version": "String",
  "manufacturer": "String",
  "releaseDateTime": "String (timestamp)",
  "driverClass": "String",
  "applicableDeviceCount": "Integer",
  "approvalStatus": "String",
  "category": "String",
  "deployDateTime": "String (timestamp)"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.windowsDriverUpdateInventory",
  "id": "2176b0c5-b0c5-2176-c5b0-7621c5b07621",
  "name": "String",
  "version": "String",
  "manufacturer": "String",
  "releaseDateTime": "String (timestamp)",
  "driverClass": "String",
  "applicableDeviceCount": "Integer",
  "approvalStatus": "String",
  "category": "String",
  "deployDateTime": "String (timestamp)"
}
```

