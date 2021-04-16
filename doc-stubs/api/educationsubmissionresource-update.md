---
title: "Update educationSubmissionResource"
description: "Update the properties of an educationSubmissionResource object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update educationSubmissionResource
Namespace: microsoft.graph



Update the properties of an [educationSubmissionResource](../resources/educationsubmissionresource.md) object.

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
PATCH /education/classes/{educationClassId}/assignments/{educationAssignmentId}/submissions/{educationSubmissionId}/resources/{educationSubmissionResourceId}
PATCH /education/classes/{educationClassId}/assignments/{educationAssignmentId}/submissions/{educationSubmissionId}/submittedResources/{educationSubmissionResourceId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [educationSubmissionResource](../resources/educationsubmissionresource.md) object.

The following table shows the properties that are required when you update the [educationSubmissionResource](../resources/educationsubmissionresource.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|assignmentResourceUrl|String|**TODO: Add Description**|
|resource|[educationResource](../resources/educationresource.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [educationSubmissionResource](../resources/educationsubmissionresource.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_educationsubmissionresource"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/education/classes/{educationClassId}/assignments/{educationAssignmentId}/submissions/{educationSubmissionId}/resources/{educationSubmissionResourceId}
Content-Type: application/json
Content-length: 186

{
  "@odata.type": "#microsoft.graph.educationSubmissionResource",
  "assignmentResourceUrl": "String",
  "resource": {
    "@odata.type": "microsoft.graph.educationResource"
  }
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
  "@odata.type": "#microsoft.graph.educationSubmissionResource",
  "id": "ec85933f-933f-ec85-3f93-85ec3f9385ec",
  "assignmentResourceUrl": "String",
  "resource": {
    "@odata.type": "microsoft.graph.educationResource"
  }
}
```

