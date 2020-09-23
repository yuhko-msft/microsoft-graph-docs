---
title: "Create userStatusSummary"
description: "Create a new managedDeviceMobileAppConfigurationUserSummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create userStatusSummary
Namespace: microsoft.graph

Create a new managedDeviceMobileAppConfigurationUserSummary object.

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
POST ** Collection URI for microsoft.management.services.api.managedDeviceMobileAppConfigurationUserSummary not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [managedDeviceMobileAppConfigurationUserSummary](../resources/manageddevicemobileappconfigurationusersummary.md) object.

The following table shows the properties that are required when you create the [managedDeviceMobileAppConfigurationUserSummary](../resources/manageddevicemobileappconfigurationusersummary.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|Key of the entity.|
|pendingCount|Int32|Number of pending Users|
|notApplicableCount|Int32|Number of not applicable users|
|successCount|Int32|Number of succeeded Users|
|errorCount|Int32|Number of error Users|
|failedCount|Int32|Number of failed Users|
|conflictCount|Int32|Number of users in conflict|
|lastUpdateDateTime|DateTimeOffset|Last update time|
|configurationVersion|Int32|Version of the policy for that overview|



## Response

If successful, this method returns a `201 Created` response code and a [managedDeviceMobileAppConfigurationUserSummary](../resources/manageddevicemobileappconfigurationusersummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_manageddevicemobileappconfigurationusersummary_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.management.services.api.managedDeviceMobileAppConfigurationUserSummary not found
Content-Type: application/json
Content-length: 375

{
  "@odata.type": "#microsoft.management.services.api.managedDeviceMobileAppConfigurationUserSummary",
  "pendingCount": "Integer",
  "notApplicableCount": "Integer",
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
  "@odata.type": "microsoft.management.services.api.managedDeviceMobileAppConfigurationUserSummary"
}
-->
``` http
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#microsoft.management.services.api.managedDeviceMobileAppConfigurationUserSummary",
  "id": "80e92c06-2c06-80e9-062c-e980062ce980",
  "pendingCount": "Integer",
  "notApplicableCount": "Integer",
  "successCount": "Integer",
  "errorCount": "Integer",
  "failedCount": "Integer",
  "conflictCount": "Integer",
  "lastUpdateDateTime": "String (timestamp)",
  "configurationVersion": "Integer"
}
```

