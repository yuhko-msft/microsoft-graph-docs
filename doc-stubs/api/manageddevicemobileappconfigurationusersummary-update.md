---
title: "Update managedDeviceMobileAppConfigurationUserSummary"
description: "Update the properties of a managedDeviceMobileAppConfigurationUserSummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update managedDeviceMobileAppConfigurationUserSummary
Namespace: microsoft.graph



Update the properties of a [managedDeviceMobileAppConfigurationUserSummary](../resources/manageddevicemobileappconfigurationusersummary.md) object.

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
PATCH /deviceAppManagement/mobileAppConfigurations/{managedDeviceMobileAppConfigurationId}/userStatusSummary
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [managedDeviceMobileAppConfigurationUserSummary](../resources/manageddevicemobileappconfigurationusersummary.md) object.

The following table shows the properties that are required when you update the [managedDeviceMobileAppConfigurationUserSummary](../resources/manageddevicemobileappconfigurationusersummary.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|configurationVersion|Int32|Version of the policy for that overview|
|conflictCount|Int32|Number of users in conflict|
|errorCount|Int32|Number of error Users|
|failedCount|Int32|Number of failed Users|
|lastUpdateDateTime|DateTimeOffset|Last update time|
|notApplicableCount|Int32|Number of not applicable users|
|pendingCount|Int32|Number of pending Users|
|successCount|Int32|Number of succeeded Users|



## Response

If successful, this method returns a `200 OK` response code and an updated [managedDeviceMobileAppConfigurationUserSummary](../resources/manageddevicemobileappconfigurationusersummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_manageddevicemobileappconfigurationusersummary"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceAppManagement/mobileAppConfigurations/{managedDeviceMobileAppConfigurationId}/userStatusSummary
Content-Type: application/json
Content-length: 357

{
  "@odata.type": "#microsoft.graph.managedDeviceMobileAppConfigurationUserSummary",
  "configurationVersion": "Integer",
  "conflictCount": "Integer",
  "errorCount": "Integer",
  "failedCount": "Integer",
  "lastUpdateDateTime": "String (timestamp)",
  "notApplicableCount": "Integer",
  "pendingCount": "Integer",
  "successCount": "Integer"
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
  "@odata.type": "#microsoft.graph.managedDeviceMobileAppConfigurationUserSummary",
  "id": "f4b133a8-33a8-f4b1-a833-b1f4a833b1f4",
  "configurationVersion": "Integer",
  "conflictCount": "Integer",
  "errorCount": "Integer",
  "failedCount": "Integer",
  "lastUpdateDateTime": "String (timestamp)",
  "notApplicableCount": "Integer",
  "pendingCount": "Integer",
  "successCount": "Integer"
}
```

