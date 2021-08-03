---
title: "accessPackageAssignmentRequest: My"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# accessPackageAssignmentRequest: My
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

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
GET /accessPackageAssignmentRequests/My
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this function returns a `200 OK` response code and a [accessPackageAssignmentRequest](../resources/accesspackageassignmentrequest.md) collection in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "accesspackageassignmentrequest_my"
}
-->
``` http
GET https://graph.microsoft.com/beta/accessPackageAssignmentRequests/My
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(Microsoft.IGAELM.EC.FrontEnd.ExternalModel.accessPackageAssignmentRequest)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#Microsoft.IGAELM.EC.FrontEnd.ExternalModel.accessPackageAssignmentRequest",
      "answers": [
        {
          "@odata.type": "microsoft.graph.accessPackageAnswerString"
        }
      ],
      "completedDate": "String (timestamp)",
      "createdDateTime": "String (timestamp)",
      "expirationDateTime": "String (timestamp)",
      "id": "String (identifier)",
      "isValidationOnly": "Boolean",
      "justification": "String",
      "requestState": "String",
      "requestStatus": "String",
      "requestType": "String",
      "schedule": {
        "@odata.type": "microsoft.graph.requestSchedule"
      }
    }
  ]
}
```

