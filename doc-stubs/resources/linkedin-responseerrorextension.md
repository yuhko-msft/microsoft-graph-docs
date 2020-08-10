---
title: "ResponseErrorExtension resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# ResponseErrorExtension resource type

Namespace: microsoft.graph.linkedIn

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|code|String|**TODO: Add Description**|
|errorDetail|[ErrorDetail](../resources/linkedin-errordetail.md)|**TODO: Add Description**|
|errorDetailType|String|**TODO: Add Description**|
|stackTrace|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.linkedIn.ResponseErrorExtension"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.linkedIn.ResponseErrorExtension",
  "stackTrace": "String",
  "errorDetailType": "String",
  "code": "String",
  "errorDetail": {
    "@odata.type": "microsoft.graph.linkedIn.ErrorDetail"
  }
}
```

