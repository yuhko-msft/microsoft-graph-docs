---
title: "Create privilegedRoleSettings"
description: "Create a new privilegedRoleSettings object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create privilegedRoleSettings
Namespace: microsoft.graph



Create a new privilegedRoleSettings object.

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
POST /privilegedRoles/{privilegedRolesId}/settings
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [privilegedRoleSettings](../resources/privilegedrolesettings.md) object.

The following table shows the properties that are required when you create the [privilegedRoleSettings](../resources/privilegedrolesettings.md).

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

If successful, this method returns a `201 Created` response code and a [privilegedRoleSettings](../resources/privilegedrolesettings.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_privilegedrolesettings_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/privilegedRoles/{privilegedRolesId}/settings
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
  "truncated": true,
  "@odata.type": "microsoft.graph.privilegedRoleSettings"
}
-->
``` http
HTTP/1.1 201 Created
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

