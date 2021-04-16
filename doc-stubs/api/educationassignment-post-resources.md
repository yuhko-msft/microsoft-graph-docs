---
title: "Create educationAssignmentResource"
description: "Create a new educationAssignmentResource object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create educationAssignmentResource
Namespace: microsoft.graph



Create a new educationAssignmentResource object.

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
POST /education/classes/{educationClassId}/assignments/{educationAssignmentId}/resources
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [educationAssignmentResource](../resources/educationassignmentresource.md) object.

The following table shows the properties that are required when you create the [educationAssignmentResource](../resources/educationassignmentresource.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|distributeForStudentWork|Boolean|**TODO: Add Description**|
|resource|[educationResource](../resources/educationresource.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [educationAssignmentResource](../resources/educationassignmentresource.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_educationassignmentresource_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/education/classes/{educationClassId}/assignments/{educationAssignmentId}/resources
Content-Type: application/json
Content-length: 190

{
  "@odata.type": "#microsoft.graph.educationAssignmentResource",
  "distributeForStudentWork": "Boolean",
  "resource": {
    "@odata.type": "microsoft.graph.educationResource"
  }
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.educationAssignmentResource"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.educationAssignmentResource",
  "id": "26ac65e0-65e0-26ac-e065-ac26e065ac26",
  "distributeForStudentWork": "Boolean",
  "resource": {
    "@odata.type": "microsoft.graph.educationResource"
  }
}
```

