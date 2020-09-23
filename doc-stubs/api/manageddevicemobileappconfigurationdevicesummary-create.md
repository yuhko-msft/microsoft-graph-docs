---
title: "Create managedDeviceMobileAppConfigurationDeviceSummary"
description: "Create a new managedDeviceMobileAppConfigurationDeviceSummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create managedDeviceMobileAppConfigurationDeviceSummary
Namespace: microsoft.graph

Create a new [managedDeviceMobileAppConfigurationDeviceSummary](../resources/manageddevicemobileappconfigurationdevicesummary.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
POST ** Collection URI for microsoft.management.services.api.managedDeviceMobileAppConfigurationDeviceSummary not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [managedDeviceMobileAppConfigurationDeviceSummary](../resources/manageddevicemobileappconfigurationdevicesummary.md) object.

The following table shows the properties that are required when you create the [managedDeviceMobileAppConfigurationDeviceSummary](../resources/manageddevicemobileappconfigurationdevicesummary.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|Key of the entity.|
|pendingCount|Int32|Number of pending devices|
|notApplicableCount|Int32|Number of not applicable devices|
|notApplicablePlatformCount|Int32|Number of not applicable devices due to mismatch platform and policy|
|successCount|Int32|Number of succeeded devices|
|errorCount|Int32|Number of error devices|
|failedCount|Int32|Number of failed devices|
|conflictCount|Int32|Number of devices in conflict|
|lastUpdateDateTime|DateTimeOffset|Last update time|
|configurationVersion|Int32|Version of the policy for that overview|



## Response

If successful, this method returns a `201 Created` response code and a [managedDeviceMobileAppConfigurationDeviceSummary](../resources/manageddevicemobileappconfigurationdevicesummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_manageddevicemobileappconfigurationdevicesummary_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.management.services.api.managedDeviceMobileAppConfigurationDeviceSummary not found
Content-Type: application/json
Content-length: 421

{
  "@odata.type": "#microsoft.management.services.api.managedDeviceMobileAppConfigurationDeviceSummary",
  "pendingCount": "Integer",
  "notApplicableCount": "Integer",
  "notApplicablePlatformCount": "Integer",
  "successCount": "Integer",
  "errorCount": "Integer",
  "failedCount": "Integer",
  "conflictCount": "Integer",
  "lastUpdateDateTime": "String (timestamp)",
  "configurationVersion": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.management.services.api.managedDeviceMobileAppConfigurationDeviceSummary"
}
-->
``` http
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#microsoft.management.services.api.managedDeviceMobileAppConfigurationDeviceSummary",
  "id": "643d5c49-5c49-643d-495c-3d64495c3d64",
  "pendingCount": "Integer",
  "notApplicableCount": "Integer",
  "notApplicablePlatformCount": "Integer",
  "successCount": "Integer",
  "errorCount": "Integer",
  "failedCount": "Integer",
  "conflictCount": "Integer",
  "lastUpdateDateTime": "String (timestamp)",
  "configurationVersion": "Integer"
}
```

