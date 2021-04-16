---
title: "List settingStates"
description: "Get the securityBaselineSettingState resources from the settingStates navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List settingStates
Namespace: microsoft.graph



Get the securityBaselineSettingState resources from the settingStates navigation property.

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
GET /users/{usersId}/managedDevices/{managedDeviceId}/securityBaselineStates/{securityBaselineStateId}/settingStates
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

If successful, this method returns a `200 OK` response code and a collection of [securityBaselineSettingState](../resources/securitybaselinesettingstate.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_securitybaselinesettingstate"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/users/{usersId}/managedDevices/{managedDeviceId}/securityBaselineStates/{securityBaselineStateId}/settingStates
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.securityBaselineSettingState)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.securityBaselineSettingState",
      "id": "46b39876-9876-46b3-7698-b3467698b346",
      "contributingPolicies": [
        {
          "@odata.type": "microsoft.graph.securityBaselineContributingPolicy"
        }
      ],
      "errorCode": "String",
      "settingCategoryId": "String",
      "settingCategoryName": "String",
      "settingId": "String",
      "settingName": "String",
      "sourcePolicies": [
        {
          "@odata.type": "microsoft.graph.settingSource"
        }
      ],
      "state": "String"
    }
  ]
}
```

