---
title: "Create cloudPcOverview"
description: "Create a new cloudPcOverview object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create cloudPcOverview
Namespace: microsoft.graph.managedTenants

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [cloudPcOverview](../resources/managedtenants-cloudpcoverview.md) object.

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
POST /tenantRelationships/managedTenants/cloudPcsOverview
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [cloudPcOverview](../resources/managedtenants-cloudpcoverview.md) object.

The following table shows the properties that are required when you create the [cloudPcOverview](../resources/managedtenants-cloudpcoverview.md).

|Property|Type|Description|
|:---|:---|:---|
|lastRefreshedDateTime|DateTimeOffset|**TODO: Add Description**|
|numberOfCloudPcConnectionStatusFailed|Int32|**TODO: Add Description**|
|numberOfCloudPcConnectionStatusPassed|Int32|**TODO: Add Description**|
|numberOfCloudPcConnectionStatusPending|Int32|**TODO: Add Description**|
|numberOfCloudPcConnectionStatusRunning|Int32|**TODO: Add Description**|
|numberOfCloudPcConnectionStatusUnkownFutureValue|Int32|**TODO: Add Description**|
|numberOfCloudPcStatusDeprovisioning|Int32|**TODO: Add Description**|
|numberOfCloudPcStatusFailed|Int32|**TODO: Add Description**|
|numberOfCloudPcStatusInGracePeriod|Int32|**TODO: Add Description**|
|numberOfCloudPcStatusNotProvisioned|Int32|**TODO: Add Description**|
|numberOfCloudPcStatusProvisioned|Int32|**TODO: Add Description**|
|numberOfCloudPcStatusProvisioning|Int32|**TODO: Add Description**|
|numberOfCloudPcStatusUnknown|Int32|**TODO: Add Description**|
|numberOfCloudPcStatusUpgrading|Int32|**TODO: Add Description**|
|tenantDisplayName|String|**TODO: Add Description**|
|tenantId|String|**TODO: Add Description**|
|totalCloudPcConnectionStatus|Int32|**TODO: Add Description**|
|totalCloudPcStatus|Int32|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [cloudPcOverview](../resources/managedtenants-cloudpcoverview.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_cloudpcoverview_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/tenantRelationships/managedTenants/cloudPcsOverview
Content-Type: application/json
Content-length: 949

{
  "@odata.type": "#microsoft.graph.managedTenants.cloudPcOverview",
  "lastRefreshedDateTime": "String (timestamp)",
  "numberOfCloudPcConnectionStatusFailed": "Integer",
  "numberOfCloudPcConnectionStatusPassed": "Integer",
  "numberOfCloudPcConnectionStatusPending": "Integer",
  "numberOfCloudPcConnectionStatusRunning": "Integer",
  "numberOfCloudPcConnectionStatusUnkownFutureValue": "Integer",
  "numberOfCloudPcStatusDeprovisioning": "Integer",
  "numberOfCloudPcStatusFailed": "Integer",
  "numberOfCloudPcStatusInGracePeriod": "Integer",
  "numberOfCloudPcStatusNotProvisioned": "Integer",
  "numberOfCloudPcStatusProvisioned": "Integer",
  "numberOfCloudPcStatusProvisioning": "Integer",
  "numberOfCloudPcStatusUnknown": "Integer",
  "numberOfCloudPcStatusUpgrading": "Integer",
  "tenantDisplayName": "String",
  "tenantId": "String",
  "totalCloudPcConnectionStatus": "Integer",
  "totalCloudPcStatus": "Integer"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.managedTenants.cloudPcOverview"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.managedTenants.cloudPcOverview",
  "lastRefreshedDateTime": "String (timestamp)",
  "numberOfCloudPcConnectionStatusFailed": "Integer",
  "numberOfCloudPcConnectionStatusPassed": "Integer",
  "numberOfCloudPcConnectionStatusPending": "Integer",
  "numberOfCloudPcConnectionStatusRunning": "Integer",
  "numberOfCloudPcConnectionStatusUnkownFutureValue": "Integer",
  "numberOfCloudPcStatusDeprovisioning": "Integer",
  "numberOfCloudPcStatusFailed": "Integer",
  "numberOfCloudPcStatusInGracePeriod": "Integer",
  "numberOfCloudPcStatusNotProvisioned": "Integer",
  "numberOfCloudPcStatusProvisioned": "Integer",
  "numberOfCloudPcStatusProvisioning": "Integer",
  "numberOfCloudPcStatusUnknown": "Integer",
  "numberOfCloudPcStatusUpgrading": "Integer",
  "tenantDisplayName": "String",
  "tenantId": "String",
  "totalCloudPcConnectionStatus": "Integer",
  "totalCloudPcStatus": "Integer"
}
```

