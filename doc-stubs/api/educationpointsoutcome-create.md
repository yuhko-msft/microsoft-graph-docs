---
title: "Create educationPointsOutcome"
description: "Create a new educationPointsOutcome object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create educationPointsOutcome
Namespace: microsoft.graph



Create a new [educationPointsOutcome](../resources/educationpointsoutcome.md) object.

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
POST ** Collection URI for microsoft.graph.educationPointsOutcome not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [educationPointsOutcome](../resources/educationpointsoutcome.md) object.

The following table shows the properties that are required when you create the [educationPointsOutcome](../resources/educationpointsoutcome.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [educationOutcome](../resources/educationoutcome.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [educationOutcome](../resources/educationoutcome.md)|
|points|[educationAssignmentPointsGrade](../resources/educationassignmentpointsgrade.md)|**TODO: Add Description**|
|publishedPoints|[educationAssignmentPointsGrade](../resources/educationassignmentpointsgrade.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [educationPointsOutcome](../resources/educationpointsoutcome.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_educationpointsoutcome_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.educationPointsOutcome not found
Content-Type: application/json
Content-length: 253

{
  "@odata.type": "#microsoft.graph.educationPointsOutcome",
  "points": {
    "@odata.type": "microsoft.graph.educationAssignmentPointsGrade"
  },
  "publishedPoints": {
    "@odata.type": "microsoft.graph.educationAssignmentPointsGrade"
  }
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.educationPointsOutcome"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.educationPointsOutcome",
  "id": "11896cb4-6cb4-1189-b46c-8911b46c8911",
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "points": {
    "@odata.type": "microsoft.graph.educationAssignmentPointsGrade"
  },
  "publishedPoints": {
    "@odata.type": "microsoft.graph.educationAssignmentPointsGrade"
  }
}
```

