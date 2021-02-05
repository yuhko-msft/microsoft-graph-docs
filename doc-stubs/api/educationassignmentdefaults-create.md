---
title: "Create educationAssignmentDefaults"
description: "Create a new educationAssignmentDefaults object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create educationAssignmentDefaults
Namespace: microsoft.graph

Create a new [educationAssignmentDefaults](../resources/educationassignmentdefaults.md) object.

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
POST ** Collection URI for microsoft.education.assignments.api.educationAssignmentDefaults not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [educationAssignmentDefaults](../resources/educationassignmentdefaults.md) object.

The following table shows the properties that are required when you create the [educationAssignmentDefaults](../resources/educationassignmentdefaults.md).

|Property|Type|Description|
|:---|:---|:---|
|addedStudentAction|educationAddedStudentAction|**TODO: Add Description**. Possible values are: `none`, `assignIfOpen`, `unknownFutureValue`.|
|dueTime|TimeOfDay|**TODO: Add Description**|
|notificationChannelUrl|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [educationAssignmentDefaults](../resources/educationassignmentdefaults.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_educationassignmentdefaults_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.education.assignments.api.educationAssignmentDefaults not found
Content-Type: application/json
Content-length: 201

{
  "@odata.type": "#microsoft.education.assignments.api.educationAssignmentDefaults",
  "addedStudentAction": "String",
  "dueTime": "String (time of day)",
  "notificationChannelUrl": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.education.assignments.api.educationAssignmentDefaults"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.education.assignments.api.educationAssignmentDefaults",
  "addedStudentAction": "String",
  "dueTime": "String (time of day)",
  "notificationChannelUrl": "String"
}
```

