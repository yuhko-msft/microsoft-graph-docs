---
title: "groupPolicyUploadedLanguageFile resource type"
description: "The entity represents an ADML (Administrative Template language) XML file uploaded by Administrator."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# groupPolicyUploadedLanguageFile resource type

Namespace: microsoft.graph



The entity represents an ADML (Administrative Template language) XML file uploaded by Administrator.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|content|Binary|The contents of the uploaded ADML file.|
|fileName|String|The file name of the uploaded ADML file.|
|id|String|Key of the entity.|
|languageCode|String|The language code of the uploaded ADML file.|
|lastModifiedDateTime|DateTimeOffset|The date and time the entity was last modified.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.groupPolicyUploadedLanguageFile"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.groupPolicyUploadedLanguageFile",
  "content": "Binary",
  "fileName": "String",
  "id": "String (identifier)",
  "languageCode": "String",
  "lastModifiedDateTime": "String (timestamp)"
}
```

