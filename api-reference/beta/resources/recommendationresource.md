---
title: "recommendationResource resource type"
description: "Represents a directory object associated with a recommendation"
author: "hafowler"
ms.localizationpriority: medium
ms.prod: "directory-management"
doc_type: resourcePageType
---

# recommendationResource resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Represents a directory object associated with a [recommendation](../resources/recommendation.md).


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List recommendationResources](../api/recommendationresource-list.md)|[recommendationResource](../resources/recommendationresource.md) collection|Get a list of the [recommendationResource](../resources/recommendationresource.md) objects and their properties.|
|[Get recommendationResource](../api/recommendationresource-get.md)|[recommendationResource](../resources/recommendationresource.md)|Read the properties and relationships of a [recommendationResource](../resources/recommendationresource.md) object.|
|[Update recommendationResource](../api/recommendationresource-update.md)|[recommendationResource](../resources/recommendationresource.md)|Update the properties of a [recommendationResource](../resources/recommendationresource.md) object.|
|[Postpone recommendationResource](../api/recommendationresource-postpone.md)|[recommendationResource](../resources/recommendationresource.md)|Marks a [recommendationResource](../resources/recommendationresource.md) status as `postponed` to a specified date and time.|
|[Dismiss recommendationResource](../api/recommendationresource-dismiss.md)|[recommendationResource](../resources/recommendationresource.md)|Marks a [recommendationResource](../resources/recommendationresource.md) status as `dismissed`.|
|[Complete recommendationResource](../api/recommendationresource-complete.md)|[recommendationResource](../resources/recommendationresource.md)|Marks a [recommendationResource](../resources/recommendationresource.md) status as `completedByUser`.|
|[Reactivate recommendationResource](../api/recommendationresource-reactivate.md)|[recommendationResource](../resources/recommendationresource.md)|Marks a [recommendationResource](../resources/recommendationresource.md) status as `active`.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|addedDateTime|DateTimeOffset|The date and time the [recommendationResource](../resources/recommendationresource.md) was initally associated with a [recommendation](../resources/recommendation.md).|
|additionalDetails|[keyValue](../resources/intune-keyvalue.md) collection|Additional information unique per [recommendation](../resources/recommendation.md) to help complete the recommendation.|
|apiUrl|String|The URL link to the corresponding directory object.|
|displayName|String|Friendly name of the directory object.|
|id|String|The unique identifier of the resource. Inherited from [entity](../resources/entity.md).|
|owner|String|The user responsible for the resource.|
|portalUrl|String|URL link to the corresponding Azure AD portal page of the resource.|
|rank|Int32|Indicates the importance of the resource.|
|recommendationId|String|The unique identifier of the [recommendation](../resources/recommendation.md) that the resource is associated with.|
|resourceType|String|Indicates the type of directory object. Examples include `user`, `application`, etc.|
|status|recommendationStatus|Indicates whether a [recommendation](../resources/recommendation.md) needs to be addressed. The possible values are: `active`, `completedBySystem`, `completedByUser`, `dismissed`, `postponed`, `unknownFutureValue`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.recommendationResource",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.recommendationResource",
  "id": "String (identifier)",
  "recommendationId": "String",
  "addedDateTime": "String (timestamp)",
  "portalUrl": "String",
  "apiUrl": "String",
  "displayName": "String",
  "resourceType": "String",
  "owner": "String",
  "rank": "Integer",
  "status": "String",
  "additionalDetails": [
    {
      "@odata.type": "microsoft.graph.keyValue"
    }
  ]
}
```

