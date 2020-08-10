---
title: "MockEmployeeGraphQLResponse resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# MockEmployeeGraphQLResponse resource type

Namespace: microsoft.graph.linkedIn

**TODO: Add Description**


Inherits from [EmployeeGraphQLResponse](../resources/employeegraphqlresponse.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List MockEmployeeGraphQLResponses](../api/mockemployeegraphqlresponse-list.md)|[MockEmployeeGraphQLResponse](../resources/linkedin-mockemployeegraphqlresponse.md) collection|Get a list of the [MockEmployeeGraphQLResponse](../resources/mockemployeegraphqlresponse.md) objects and their properties.|
|[Create MockEmployeeGraphQLResponse](../api/linkedin-mockemployeegraphqlresponse-post-discover.md)|[MockEmployeeGraphQLResponse](../resources/linkedin-mockemployeegraphqlresponse.md)|Create a new [MockEmployeeGraphQLResponse](../resources/linkedin-mockemployeegraphqlresponse.md) object.|
|[Get MockEmployeeGraphQLResponse](../api/linkedin-mockemployeegraphqlresponse-get.md)|[MockEmployeeGraphQLResponse](../resources/linkedin-mockemployeegraphqlresponse.md)|Read the properties and relationships of a [MockEmployeeGraphQLResponse](../resources/linkedin-mockemployeegraphqlresponse.md) object.|
|[Update MockEmployeeGraphQLResponse](../api/linkedin-mockemployeegraphqlresponse-update.md)|[MockEmployeeGraphQLResponse](../resources/linkedin-mockemployeegraphqlresponse.md)|Update the properties of a [MockEmployeeGraphQLResponse](../resources/linkedin-mockemployeegraphqlresponse.md) object.|
|[Delete MockEmployeeGraphQLResponse](../api/linkedin-mockemployeegraphqlresponse-delete.md)|None|Deletes a [MockEmployeeGraphQLResponse](../resources/linkedin-mockemployeegraphqlresponse.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|data|[EmployeeResponseData](../resources/linkedin-employeeresponsedata.md)|**TODO: Add Description** Inherited from [EmployeeGraphQLResponse](../resources/linkedin-employeegraphqlresponse.md)|
|errors|[ResponseError](../resources/linkedin-responseerror.md) collection|**TODO: Add Description** Inherited from [EmployeeGraphQLResponse](../resources/linkedin-employeegraphqlresponse.md)|
|extensions|[ResponseExtensions](../resources/linkedin-responseextensions.md)|**TODO: Add Description** Inherited from [EmployeeGraphQLResponse](../resources/linkedin-employeegraphqlresponse.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/linkedin-entity.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.linkedIn.MockEmployeeGraphQLResponse",
  "baseType": "microsoft.graph.linkedIn.EmployeeGraphQLResponse",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.linkedIn.MockEmployeeGraphQLResponse",
  "id": "String (identifier)",
  "data": {
    "@odata.type": "microsoft.graph.linkedIn.EmployeeResponseData"
  },
  "errors": [
    {
      "@odata.type": "microsoft.graph.linkedIn.ResponseError"
    }
  ],
  "extensions": {
    "@odata.type": "microsoft.graph.linkedIn.ResponseExtensions"
  }
}
```

