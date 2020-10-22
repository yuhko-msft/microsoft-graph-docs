---
title: "Get windowsAutopilotDeploymentProfilePolicySetItem"
description: "Read the properties and relationships of a windowsAutopilotDeploymentProfilePolicySetItem object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get windowsAutopilotDeploymentProfilePolicySetItem
Namespace: microsoft.graph

Read the properties and relationships of a [windowsAutopilotDeploymentProfilePolicySetItem](../resources/intune-windowsautopilotdeploymentprofilepolicysetitem.md) object.

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
GET /windowsAutopilotDeploymentProfilePolicySetItem
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

If successful, this method returns a `200 OK` response code and a [windowsAutopilotDeploymentProfilePolicySetItem](../resources/intune-windowsautopilotdeploymentprofilepolicysetitem.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_windowsautopilotdeploymentprofilepolicysetitem"
}
-->
``` http
GET https://graph.microsoft.com/beta/windowsAutopilotDeploymentProfilePolicySetItem
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windowsAutopilotDeploymentProfilePolicySetItem"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": {
    "@odata.type": "#microsoft.graph.windowsAutopilotDeploymentProfilePolicySetItem",
    "id": "bb9deb15-eb15-bb9d-15eb-9dbb15eb9dbb",
    "createdDateTime": "String (timestamp)",
    "lastModifiedDateTime": "String (timestamp)",
    "payloadId": "String",
    "itemType": "String",
    "displayName": "String",
    "status": "String",
    "errorCode": "String",
    "guidedDeploymentTags": [
      "String"
    ]
  }
}
```

