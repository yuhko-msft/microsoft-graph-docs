---
title: "Update privilegedRoleSettings"
description: "Update the properties of a privilegedRoleSettings object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update privilegedRoleSettings
Namespace: microsoft.graph



Update the properties of a [privilegedRoleSettings](../resources/privilegedrolesettings.md) object.

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
PATCH /tenantSetupInfo/defaultRolesSettings
PATCH /privilegedRoles/{privilegedRolesId}/settings
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [privilegedRoleSettings](../resources/privilegedrolesettings.md) object.

The following table shows the properties that are required when you update the [privilegedRoleSettings](../resources/privilegedrolesettings.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|approvalOnElevation|Boolean|**TODO: Add Description**|
|approverIds|String collection|**TODO: Add Description**|
|elevationDuration|Duration|**TODO: Add Description**|
|isMfaOnElevationConfigurable|Boolean|**TODO: Add Description**|
|lastGlobalAdmin|Boolean|**TODO: Add Description**|
|maxElavationDuration|Duration|**TODO: Add Description**|
|mfaOnElevation|Boolean|**TODO: Add Description**|
|minElevationDuration|Duration|**TODO: Add Description**|
|notificationToUserOnElevation|Boolean|**TODO: Add Description**|
|ticketingInfoOnElevation|Boolean|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [privilegedRoleSettings](../resources/privilegedrolesettings.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_privilegedrolesettings"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/tenantSetupInfo/defaultRolesSettings
Content-Type: application/json
Content-length: 482

{
  "@odata.type": "#microsoft.graph.privilegedRoleSettings",
  "approvalOnElevation": "Boolean",
  "approverIds": [
    "String"
  ],
  "elevationDuration": "String (duration)",
  "isMfaOnElevationConfigurable": "Boolean",
  "lastGlobalAdmin": "Boolean",
  "maxElavationDuration": "String (duration)",
  "mfaOnElevation": "Boolean",
  "minElevationDuration": "String (duration)",
  "notificationToUserOnElevation": "Boolean",
  "ticketingInfoOnElevation": "Boolean"
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
  "@odata.type": "#microsoft.graph.privilegedRoleSettings",
  "id": "3548e619-e619-3548-19e6-483519e64835",
  "approvalOnElevation": "Boolean",
  "approverIds": [
    "String"
  ],
  "elevationDuration": "String (duration)",
  "isMfaOnElevationConfigurable": "Boolean",
  "lastGlobalAdmin": "Boolean",
  "maxElavationDuration": "String (duration)",
  "mfaOnElevation": "Boolean",
  "minElevationDuration": "String (duration)",
  "notificationToUserOnElevation": "Boolean",
  "ticketingInfoOnElevation": "Boolean"
}
```

