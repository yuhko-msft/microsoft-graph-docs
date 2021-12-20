---
title: "meetingRegistration resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# meetingRegistration resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List meetingRegistrations](../api/meetingregistration-list.md)|[meetingRegistration](../resources/meetingregistration.md) collection|Get a list of the [meetingRegistration](../resources/meetingregistration.md) objects and their properties.|
|[Create meetingRegistration](../api/onlinemeeting-post-registration.md)|[meetingRegistration](../resources/meetingregistration.md)|Create a new [meetingRegistration](../resources/meetingregistration.md) object.|
|[Get meetingRegistration](../api/meetingregistration-get.md)|[meetingRegistration](../resources/meetingregistration.md)|Read the properties and relationships of a [meetingRegistration](../resources/meetingregistration.md) object.|
|[Update meetingRegistration](../api/meetingregistration-update.md)|[meetingRegistration](../resources/meetingregistration.md)|Update the properties of a [meetingRegistration](../resources/meetingregistration.md) object.|
|[Delete meetingRegistration](../api/meetingregistration-delete.md)|None|Deletes a [meetingRegistration](../resources/meetingregistration.md) object.|
|[List registrants](../api/meetingregistration-list-registrants.md)|[meetingRegistrant](../resources/meetingregistrant.md) collection|Get the meetingRegistrant resources from the registrants navigation property.|
|[Create meetingRegistrant](../api/meetingregistration-post-registrants.md)|[meetingRegistrant](../resources/meetingregistrant.md)|Create a new meetingRegistrant object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|allowedRegistrant|meetingAudience|**TODO: Add Description**. The possible values are: `everyone`, `organization`, `unknownFutureValue`.|
|description|String|**TODO: Add Description**|
|endDateTime|DateTimeOffset|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|registrationPageViewCount|Int32|**TODO: Add Description**|
|registrationPageWebUrl|String|**TODO: Add Description**|
|speakers|[meetingSpeaker](../resources/meetingspeaker.md) collection|**TODO: Add Description**|
|startDateTime|DateTimeOffset|**TODO: Add Description**|
|subject|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|customQuestions|[meetingRegistrationQuestion](../resources/meetingregistrationquestion.md) collection|**TODO: Add Description**|
|registrants|[meetingRegistrant](../resources/meetingregistrant.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.meetingRegistration",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.meetingRegistration",
  "id": "String (identifier)",
  "registrationPageWebUrl": "String",
  "allowedRegistrant": "String",
  "subject": "String",
  "description": "String",
  "startDateTime": "String (timestamp)",
  "endDateTime": "String (timestamp)",
  "registrationPageViewCount": "Integer",
  "speakers": [
    {
      "@odata.type": "microsoft.graph.meetingSpeaker"
    }
  ]
}
```

