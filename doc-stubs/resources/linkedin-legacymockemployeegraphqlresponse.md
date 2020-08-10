---
title: "LegacyMockEmployeeGraphQLResponse resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# LegacyMockEmployeeGraphQLResponse resource type

Namespace: microsoft.graph.linkedIn

**TODO: Add Description**


Inherits from [EmployeeGraphQLResponse](../resources/employeegraphqlresponse.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List LegacyMockEmployeeGraphQLResponses](../api/legacymockemployeegraphqlresponse-list.md)|[LegacyMockEmployeeGraphQLResponse](../resources/linkedin-legacymockemployeegraphqlresponse.md) collection|Get a list of the [LegacyMockEmployeeGraphQLResponse](../resources/legacymockemployeegraphqlresponse.md) objects and their properties.|
|[Create LegacyMockEmployeeGraphQLResponse](../api/linkedin-legacymockemployeegraphqlresponse-post-graphsandbox.md)|[LegacyMockEmployeeGraphQLResponse](../resources/linkedin-legacymockemployeegraphqlresponse.md)|Create a new [LegacyMockEmployeeGraphQLResponse](../resources/linkedin-legacymockemployeegraphqlresponse.md) object.|
|[Get LegacyMockEmployeeGraphQLResponse](../api/linkedin-legacymockemployeegraphqlresponse-get.md)|[LegacyMockEmployeeGraphQLResponse](../resources/linkedin-legacymockemployeegraphqlresponse.md)|Read the properties and relationships of a [LegacyMockEmployeeGraphQLResponse](../resources/linkedin-legacymockemployeegraphqlresponse.md) object.|
|[Update LegacyMockEmployeeGraphQLResponse](../api/linkedin-legacymockemployeegraphqlresponse-update.md)|[LegacyMockEmployeeGraphQLResponse](../resources/linkedin-legacymockemployeegraphqlresponse.md)|Update the properties of a [LegacyMockEmployeeGraphQLResponse](../resources/linkedin-legacymockemployeegraphqlresponse.md) object.|
|[Delete LegacyMockEmployeeGraphQLResponse](../api/linkedin-legacymockemployeegraphqlresponse-delete.md)|None|Deletes a [LegacyMockEmployeeGraphQLResponse](../resources/linkedin-legacymockemployeegraphqlresponse.md) object.|

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
  "@odata.type": "microsoft.graph.linkedIn.LegacyMockEmployeeGraphQLResponse",
  "baseType": "microsoft.graph.linkedIn.EmployeeGraphQLResponse",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.linkedIn.LegacyMockEmployeeGraphQLResponse",
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

