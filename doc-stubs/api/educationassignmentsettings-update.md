---
title: "Update educationAssignmentSettings"
description: "Update the properties of an educationAssignmentSettings object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update educationAssignmentSettings
Namespace: microsoft.graph



Update the properties of an [educationAssignmentSettings](../resources/educationassignmentsettings.md) object.

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
PATCH /education/classes/{educationClassId}/assignmentSettings
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [educationAssignmentSettings](../resources/educationassignmentsettings.md) object.

The following table shows the properties that are required when you update the [educationAssignmentSettings](../resources/educationassignmentsettings.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|submissionAnimationDisabled|Boolean|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [educationAssignmentSettings](../resources/educationassignmentsettings.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_educationassignmentsettings"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/education/classes/{educationClassId}/assignmentSettings
Content-Type: application/json
Content-length: 114

{
  "@odata.type": "#microsoft.graph.educationAssignmentSettings",
  "submissionAnimationDisabled": "Boolean"
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
  "@odata.type": "#microsoft.graph.educationAssignmentSettings",
  "id": "72f85a43-5a43-72f8-435a-f872435af872",
  "submissionAnimationDisabled": "Boolean"
}
```

