---
title: "ExecutionEmployeeGraphQLResponse resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# ExecutionEmployeeGraphQLResponse resource type

Namespace: microsoft.graph.linkedIn

**TODO: Add Description**


Inherits from [EmployeeGraphQLResponse](../resources/employeegraphqlresponse.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List ExecutionEmployeeGraphQLResponses](../api/executionemployeegraphqlresponse-list.md)|[ExecutionEmployeeGraphQLResponse](../resources/linkedin-executionemployeegraphqlresponse.md) collection|Get a list of the [ExecutionEmployeeGraphQLResponse](../resources/executionemployeegraphqlresponse.md) objects and their properties.|
|[Create ExecutionEmployeeGraphQLResponse](../api/linkedin-executionemployeegraphqlresponse-post-execute.md)|[ExecutionEmployeeGraphQLResponse](../resources/linkedin-executionemployeegraphqlresponse.md)|Create a new [ExecutionEmployeeGraphQLResponse](../resources/linkedin-executionemployeegraphqlresponse.md) object.|
|[Get ExecutionEmployeeGraphQLResponse](../api/linkedin-executionemployeegraphqlresponse-get.md)|[ExecutionEmployeeGraphQLResponse](../resources/linkedin-executionemployeegraphqlresponse.md)|Read the properties and relationships of an [ExecutionEmployeeGraphQLResponse](../resources/linkedin-executionemployeegraphqlresponse.md) object.|
|[Update ExecutionEmployeeGraphQLResponse](../api/linkedin-executionemployeegraphqlresponse-update.md)|[ExecutionEmployeeGraphQLResponse](../resources/linkedin-executionemployeegraphqlresponse.md)|Update the properties of an [ExecutionEmployeeGraphQLResponse](../resources/linkedin-executionemployeegraphqlresponse.md) object.|
|[Delete ExecutionEmployeeGraphQLResponse](../api/linkedin-executionemployeegraphqlresponse-delete.md)|None|Deletes an [ExecutionEmployeeGraphQLResponse](../resources/linkedin-executionemployeegraphqlresponse.md) object.|

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
  "@odata.type": "microsoft.graph.linkedIn.ExecutionEmployeeGraphQLResponse",
  "baseType": "microsoft.graph.linkedIn.EmployeeGraphQLResponse",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.linkedIn.ExecutionEmployeeGraphQLResponse",
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

