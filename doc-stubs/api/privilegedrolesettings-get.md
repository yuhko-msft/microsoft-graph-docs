---
title: "Get privilegedRoleSettings"
description: "Read the properties and relationships of a privilegedRoleSettings object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get privilegedRoleSettings
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of a [privilegedRoleSettings](../resources/privilegedrolesettings.md) object.

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
GET /tenantSetupInfo/defaultRolesSettings
GET /privilegedRoles/{privilegedRolesId}/settings
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a [privilegedRoleSettings](../resources/privilegedrolesettings.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_privilegedrolesettings"
}
-->
``` http
GET https://graph.microsoft.com/beta/tenantSetupInfo/defaultRolesSettings
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.privilegedRoleSettings"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.privilegedRoleSettings",
    "id": "30bde58e-e58e-30bd-8ee5-bd308ee5bd30",
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
}
```

