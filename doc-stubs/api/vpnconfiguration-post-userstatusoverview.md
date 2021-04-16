---
title: "Create deviceConfigurationUserOverview"
description: "Create a new deviceConfigurationUserOverview object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceConfigurationUserOverview
Namespace: microsoft.graph



Create a new deviceConfigurationUserOverview object.

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
POST /deviceManagement/deviceConfigurations/{deviceConfigurationId}/userStatusOverview
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md) object.

The following table shows the properties that are required when you create the [deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md).

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

If successful, this method returns a `201 Created` response code and a [deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_deviceconfigurationuseroverview_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/deviceConfigurations/{deviceConfigurationId}/userStatusOverview
Content-Type: application/json
Content-length: 342

{
  "@odata.type": "#microsoft.graph.deviceConfigurationUserOverview",
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
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceConfigurationUserOverview"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceConfigurationUserOverview",
  "id": "ee32d09d-d09d-ee32-9dd0-32ee9dd032ee",
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

