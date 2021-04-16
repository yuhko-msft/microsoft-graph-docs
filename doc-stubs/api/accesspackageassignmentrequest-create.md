---
title: "Create accessPackageAssignmentRequest"
description: "Create a new accessPackageAssignmentRequest object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create accessPackageAssignmentRequest
Namespace: microsoft.graph



Create a new [accessPackageAssignmentRequest](../resources/accesspackageassignmentrequest.md) object.

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
POST /identityGovernance/entitlementManagement/accessPackageAssignmentRequests
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [accessPackageAssignmentRequest](../resources/accesspackageassignmentrequest.md) object.

The following table shows the properties that are required when you create the [accessPackageAssignmentRequest](../resources/accesspackageassignmentrequest.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|answers|[accessPackageAnswer](../resources/accesspackageanswer.md) collection|**TODO: Add Description**|
|completedDate|DateTimeOffset|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|expirationDateTime|DateTimeOffset|**TODO: Add Description**|
|isValidationOnly|Boolean|**TODO: Add Description**|
|justification|String|**TODO: Add Description**|
|requestState|String|**TODO: Add Description**|
|requestStatus|String|**TODO: Add Description**|
|requestType|String|**TODO: Add Description**|
|schedule|[requestSchedule](../resources/requestschedule.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [accessPackageAssignmentRequest](../resources/accesspackageassignmentrequest.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_accesspackageassignmentrequest_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/identityGovernance/entitlementManagement/accessPackageAssignmentRequests
Content-Type: application/json
Content-length: 491

{
  "@odata.type": "#microsoft.graph.accessPackageAssignmentRequest",
  "answers": [
    {
      "@odata.type": "microsoft.graph.accessPackageAnswerString"
    }
  ],
  "completedDate": "String (timestamp)",
  "expirationDateTime": "String (timestamp)",
  "isValidationOnly": "Boolean",
  "justification": "String",
  "requestState": "String",
  "requestStatus": "String",
  "requestType": "String",
  "schedule": {
    "@odata.type": "microsoft.graph.requestSchedule"
  }
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.accessPackageAssignmentRequest"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.accessPackageAssignmentRequest",
  "id": "3dc65d77-5d77-3dc6-775d-c63d775dc63d",
  "answers": [
    {
      "@odata.type": "microsoft.graph.accessPackageAnswerString"
    }
  ],
  "completedDate": "String (timestamp)",
  "createdDateTime": "String (timestamp)",
  "expirationDateTime": "String (timestamp)",
  "isValidationOnly": "Boolean",
  "justification": "String",
  "requestState": "String",
  "requestStatus": "String",
  "requestType": "String",
  "schedule": {
    "@odata.type": "microsoft.graph.requestSchedule"
  }
}
```

