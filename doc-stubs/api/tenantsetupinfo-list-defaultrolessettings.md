---
title: "List privilegedRoleSettings"
description: "Get the privilegedRoleSettings resources from the defaultRolesSettings navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List privilegedRoleSettings
Namespace: microsoft.graph



Get the privilegedRoleSettings resources from the defaultRolesSettings navigation property.

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

If successful, this method returns a `200 OK` response code and a collection of [privilegedRoleSettings](../resources/privilegedrolesettings.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_privilegedrolesettings"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/tenantSetupInfo/defaultRolesSettings
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.privilegedRoleSettings)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
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
  ]
}
```

