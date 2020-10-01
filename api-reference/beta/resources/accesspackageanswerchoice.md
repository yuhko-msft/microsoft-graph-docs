---
title: "accessPackageAnswerChoice resource type"
description: "A selected answer to an accessPackageMultipleChoiceQuestion."
author: "markwahl-msft"
localization_priority: Normal
ms.prod: "microsoft-identity-platform"
doc_type: resourcePageType
---

# accessPackageAnswerChoice resource type

Namespace: microsoft.graph

Indicates the selected answer choice for an [accessPackageMultipleChoiceQuestion](../resources/accesspackagemultiplechoicequestion.md). Stored on an [accessPackageAssignmentRequest](../resources/accesspackageassignmentrequest.md).

Inherits from [accessPackageAnswer](../resources/accesspackageanswer.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|actualValue|String|The values that are stored.|
|displayValue|[accessPackageLocalizedContent](../resources/accesspackagelocalizedcontent.md)|The localized display values shown to the requestor and approvers.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.accessPackageAnswerChoice"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.accessPackageAnswerChoice",
  "actualValue": "String",
  "displayValue": {
    "@odata.type": "microsoft.graph.accessPackageLocalizedContent"
  }
}
```

