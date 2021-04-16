---
title: "accessPackageTextInputQuestion resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# accessPackageTextInputQuestion resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [accessPackageQuestion](../resources/accesspackagequestion.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [accessPackageQuestion](../resources/accesspackagequestion.md)|
|isRequired|Boolean|**TODO: Add Description** Inherited from [accessPackageQuestion](../resources/accesspackagequestion.md)|
|isSingleLineQuestion|Boolean|**TODO: Add Description**|
|sequence|Int32|**TODO: Add Description** Inherited from [accessPackageQuestion](../resources/accesspackagequestion.md)|
|text|[accessPackageLocalizedContent](../resources/accesspackagelocalizedcontent.md)|**TODO: Add Description** Inherited from [accessPackageQuestion](../resources/accesspackagequestion.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.accessPackageTextInputQuestion"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.accessPackageTextInputQuestion",
  "id": "String (identifier)",
  "isRequired": "Boolean",
  "sequence": "Integer",
  "text": {
    "@odata.type": "microsoft.graph.accessPackageLocalizedContent"
  },
  "isSingleLineQuestion": "Boolean"
}
```

