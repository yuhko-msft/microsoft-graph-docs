---
title: "meetingRegistrant resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# meetingRegistrant resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List meetingRegistrants](../api/meetingregistrant-list.md)|[meetingRegistrant](../resources/meetingregistrant.md) collection|Get a list of the [meetingRegistrant](../resources/meetingregistrant.md) objects and their properties.|
|[Create meetingRegistrant](../api/meetingregistration-post-registrants.md)|[meetingRegistrant](../resources/meetingregistrant.md)|Create a new [meetingRegistrant](../resources/meetingregistrant.md) object.|
|[Get meetingRegistrant](../api/meetingregistrant-get.md)|[meetingRegistrant](../resources/meetingregistrant.md)|Read the properties and relationships of a [meetingRegistrant](../resources/meetingregistrant.md) object.|
|[Update meetingRegistrant](../api/meetingregistrant-update.md)|[meetingRegistrant](../resources/meetingregistrant.md)|Update the properties of a [meetingRegistrant](../resources/meetingregistrant.md) object.|
|[Delete meetingRegistrant](../api/meetingregistrant-delete.md)|None|Deletes a [meetingRegistrant](../resources/meetingregistrant.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|customQuestionAnswers|[customQuestionAnswer](../resources/customquestionanswer.md) collection|**TODO: Add Description**|
|email|String|**TODO: Add Description**|
|firstName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|joinWebUrl|String|**TODO: Add Description**|
|lastName|String|**TODO: Add Description**|
|registrationDateTime|DateTimeOffset|**TODO: Add Description**|
|status|meetingRegistrantStatus|**TODO: Add Description**. The possible values are: `registered`, `canceled`, `processing`, `unknownFutureValue`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.meetingRegistrant",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.meetingRegistrant",
  "id": "String (identifier)",
  "registrationDateTime": "String (timestamp)",
  "joinWebUrl": "String",
  "firstName": "String",
  "lastName": "String",
  "email": "String",
  "status": "String",
  "customQuestionAnswers": [
    {
      "@odata.type": "microsoft.graph.customQuestionAnswer"
    }
  ]
}
```

