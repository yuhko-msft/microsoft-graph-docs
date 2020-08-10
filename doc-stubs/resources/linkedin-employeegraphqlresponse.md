---
title: "EmployeeGraphQLResponse resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# EmployeeGraphQLResponse resource type

Namespace: microsoft.graph.linkedIn

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List EmployeeGraphQLResponses](../api/employeegraphqlresponse-list.md)|[EmployeeGraphQLResponse](../resources/linkedin-employeegraphqlresponse.md) collection|Get a list of the [EmployeeGraphQLResponse](../resources/employeegraphqlresponse.md) objects and their properties.|
|[Create EmployeeGraphQLResponse](../api/linkedin-employeegraphqlresponse-create.md)|[EmployeeGraphQLResponse](../resources/linkedin-employeegraphqlresponse.md)|Create a new [EmployeeGraphQLResponse](../resources/linkedin-employeegraphqlresponse.md) object.|
|[Get EmployeeGraphQLResponse](../api/linkedin-employeegraphqlresponse-get.md)|[EmployeeGraphQLResponse](../resources/linkedin-employeegraphqlresponse.md)|Read the properties and relationships of an [EmployeeGraphQLResponse](../resources/linkedin-employeegraphqlresponse.md) object.|
|[Update EmployeeGraphQLResponse](../api/linkedin-employeegraphqlresponse-update.md)|[EmployeeGraphQLResponse](../resources/linkedin-employeegraphqlresponse.md)|Update the properties of an [EmployeeGraphQLResponse](../resources/linkedin-employeegraphqlresponse.md) object.|
|[Delete EmployeeGraphQLResponse](../api/linkedin-employeegraphqlresponse-delete.md)|None|Deletes an [EmployeeGraphQLResponse](../resources/linkedin-employeegraphqlresponse.md) object.|
|[discovery](../api/linkedin-employeegraphqlresponse-discovery.md)|[EmployeeGraphQLResponse](../resources/linkedin-employeegraphqlresponse.md)|**TODO: Add Description**|
|[whoplus](../api/linkedin-employeegraphqlresponse-whoplus.md)|[EmployeeGraphQLResponse](../resources/linkedin-employeegraphqlresponse.md)|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|data|[EmployeeResponseData](../resources/linkedin-employeeresponsedata.md)|**TODO: Add Description**|
|errors|[ResponseError](../resources/linkedin-responseerror.md) collection|**TODO: Add Description**|
|extensions|[ResponseExtensions](../resources/linkedin-responseextensions.md)|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/linkedin-entity.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.linkedIn.EmployeeGraphQLResponse",
  "baseType": "microsoft.graph.entity",
  "openType": true
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.linkedIn.EmployeeGraphQLResponse",
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

