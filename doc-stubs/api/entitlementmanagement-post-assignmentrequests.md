---
title: "Create accessPackageAssignmentRequest"
description: "Create a new accessPackageAssignmentRequest object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create accessPackageAssignmentRequest
Namespace: microsoft.graph



Create a new accessPackageAssignmentRequest object.

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
POST /entitlementManagement/assignmentRequests
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
|id|String|**TODO: Add Description**|
|requestType|accessPackageRequestType|**TODO: Add Description**. The possible values are: `notSpecified`, `userAdd`, `userUpdate`, `userRemove`, `adminAdd`, `adminUpdate`, `adminRemove`, `systemAdd`, `systemUpdate`, `systemRemove`, `onBehalfAdd`, `unknownFutureValue`.|
|state|accessPackageRequestState|**TODO: Add Description**. The possible values are: `submitted`, `pendingApproval`, `delivering`, `delivered`, `deliveryFailed`, `denied`, `scheduled`, `canceled`, `partiallyDelivered`, `unknownFutureValue`.|
|status|String|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|completedDate|DateTimeOffset|**TODO: Add Description**|
|schedule|[Microsoft.IGAELM.EC.FrontEnd.ExternalModel.entitlementManagementSchedule](../resources/entitlementmanagementschedule.md)|**TODO: Add Description**|



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
POST https://graph.microsoft.com/v1.0/entitlementManagement/assignmentRequests
Content-Type: application/json
Content-length: 305

{
  "@odata.type": "#Microsoft.IGAELM.EC.FrontEnd.ExternalModel.accessPackageAssignmentRequest",
  "requestType": "String",
  "state": "String",
  "status": "String",
  "completedDate": "String (timestamp)",
  "schedule": {
    "@odata.type": "microsoft.graph.entitlementManagementSchedule"
  }
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.IGAELM.EC.FrontEnd.ExternalModel.accessPackageAssignmentRequest"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#Microsoft.IGAELM.EC.FrontEnd.ExternalModel.accessPackageAssignmentRequest",
  "id": "c01c09d6-09d6-c01c-d609-1cc0d6091cc0",
  "requestType": "String",
  "state": "String",
  "status": "String",
  "createdDateTime": "String (timestamp)",
  "completedDate": "String (timestamp)",
  "schedule": {
    "@odata.type": "microsoft.graph.entitlementManagementSchedule"
  }
}
```

