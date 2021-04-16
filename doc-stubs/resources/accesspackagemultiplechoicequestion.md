---
title: "accessPackageMultipleChoiceQuestion resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# accessPackageMultipleChoiceQuestion resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [accessPackageQuestion](../resources/accesspackagequestion.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|allowsMultipleSelection|Boolean|**TODO: Add Description**|
|choices|[accessPackageAnswerChoice](../resources/accesspackageanswerchoice.md) collection|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [accessPackageQuestion](../resources/accesspackagequestion.md)|
|isRequired|Boolean|**TODO: Add Description** Inherited from [accessPackageQuestion](../resources/accesspackagequestion.md)|
|sequence|Int32|**TODO: Add Description** Inherited from [accessPackageQuestion](../resources/accesspackagequestion.md)|
|text|[accessPackageLocalizedContent](../resources/accesspackagelocalizedcontent.md)|**TODO: Add Description** Inherited from [accessPackageQuestion](../resources/accesspackagequestion.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.accessPackageMultipleChoiceQuestion"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.accessPackageMultipleChoiceQuestion",
  "id": "String (identifier)",
  "isRequired": "Boolean",
  "sequence": "Integer",
  "text": {
    "@odata.type": "microsoft.graph.accessPackageLocalizedContent"
  },
  "allowsMultipleSelection": "Boolean",
  "choices": [
    {
      "@odata.type": "microsoft.graph.accessPackageAnswerChoice"
    }
  ]
}
```

