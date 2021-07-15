---
title: "Create managedDeviceCompliance"
description: "Create a new managedDeviceCompliance object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create managedDeviceCompliance
Namespace: microsoft.graph.managedTenants

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new managedDeviceCompliance object.

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
POST /tenantRelationships/managedTenants/managedDeviceCompliances
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [managedDeviceCompliance](../resources/managedtenants-manageddevicecompliance.md) object.

The following table shows the properties that are required when you create the [managedDeviceCompliance](../resources/managedtenants-manageddevicecompliance.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/managedtenants-entity.md)|
|complianceStatus|String|**TODO: Add Description**|
|deviceType|String|**TODO: Add Description**|
|inGracePeriodUntilDateTime|DateTimeOffset|**TODO: Add Description**|
|lastRefreshedDateTime|DateTimeOffset|**TODO: Add Description**|
|lastSyncDateTime|DateTimeOffset|**TODO: Add Description**|
|managedDeviceId|String|**TODO: Add Description**|
|managedDeviceName|String|**TODO: Add Description**|
|manufacturer|String|**TODO: Add Description**|
|model|String|**TODO: Add Description**|
|osDescription|String|**TODO: Add Description**|
|osVersion|String|**TODO: Add Description**|
|ownerType|String|**TODO: Add Description**|
|tenantDisplayName|String|**TODO: Add Description**|
|tenantId|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [managedDeviceCompliance](../resources/managedtenants-manageddevicecompliance.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_manageddevicecompliance_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/tenantRelationships/managedTenants/managedDeviceCompliances
Content-Type: application/json
Content-length: 548

{
  "@odata.type": "#microsoft.graph.managedTenants.managedDeviceCompliance",
  "complianceStatus": "String",
  "deviceType": "String",
  "inGracePeriodUntilDateTime": "String (timestamp)",
  "lastRefreshedDateTime": "String (timestamp)",
  "lastSyncDateTime": "String (timestamp)",
  "managedDeviceId": "String",
  "managedDeviceName": "String",
  "manufacturer": "String",
  "model": "String",
  "osDescription": "String",
  "osVersion": "String",
  "ownerType": "String",
  "tenantDisplayName": "String",
  "tenantId": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.managedTenants.managedDeviceCompliance"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.managedTenants.managedDeviceCompliance",
  "id": "f712a1c4-a1c4-f712-c4a1-12f7c4a112f7",
  "complianceStatus": "String",
  "deviceType": "String",
  "inGracePeriodUntilDateTime": "String (timestamp)",
  "lastRefreshedDateTime": "String (timestamp)",
  "lastSyncDateTime": "String (timestamp)",
  "managedDeviceId": "String",
  "managedDeviceName": "String",
  "manufacturer": "String",
  "model": "String",
  "osDescription": "String",
  "osVersion": "String",
  "ownerType": "String",
  "tenantDisplayName": "String",
  "tenantId": "String"
}
```

