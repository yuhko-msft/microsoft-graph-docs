---
title: "recommendationResource resource type"
description: "Represents an Azure AD resource in your tenant that's associated with an Azure AD recommendation."
author: "hafowler"
ms.localizationpriority: medium
ms.prod: "directory-management"
doc_type: resourcePageType
---

# recommendationResource resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Represents an Azure AD resource in your tenant that's associated with an Azure AD [recommendation](../resources/recommendation.md).

Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List impactedResources](../api/recommendation-list-impactedresources.md)|[recommendationResource](../resources/recommendationresource.md) collection|Get a list of the [recommendationResource](../resources/recommendationresource.md) objects and their properties.|
|[Get recommendationResource](../api/recommendationresource-get.md)|[recommendationResource](../resources/recommendationresource.md)|Read the properties and relationships of a [recommendationResource](../resources/recommendationresource.md) object.|
|[Postpone](../api/recommendationresource-postpone.md)|[recommendationResource](../resources/recommendationresource.md)|Mark the **status** of a [recommendationResource](../resources/recommendationresource.md) object as `postponed` to a specified date and time.|
|[Dismiss](../api/recommendationresource-dismiss.md)|[recommendationResource](../resources/recommendationresource.md)|Mark the **status** of a [recommendationResource](../resources/recommendationresource.md) object as `dismissed`.|
|[Complete](../api/recommendationresource-complete.md)|[recommendationResource](../resources/recommendationresource.md)|Mark the **status** of a [recommendationResource](../resources/recommendationresource.md) object as `completedByUser`.|
|[Reactivate](../api/recommendationresource-reactivate.md)|[recommendationResource](../resources/recommendationresource.md)|Mark the **status** of a [recommendationResource](../resources/recommendationresource.md) object as `active`.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|addedDateTime|DateTimeOffset|The date and time when the [recommendationResource](../resources/recommendationresource.md) object was initially associated with a [recommendation](../resources/recommendation.md).|
|additionalDetails|[keyValue](../resources/keyvalue.md) collection|Additional information unique to the [recommendationResource](../resources/recommendationresource.md) to help contextualize the recommendation. |
|apiUrl|String|The URL link to the corresponding Azure AD resource.|
|displayName|String|Friendly name of the Azure AD resource.|
|id|String|A unique identifier of the impacted Azure AD resource. Inherited from [entity](../resources/entity.md).|
|owner|String|The user responsible for maintaining the resource.|
|portalUrl|String|The URL link to the corresponding Azure AD portal page of the resource.|
|rank|Int32|Indicates the importance of the resource. A resource with a rank equal to 1 is of the highest importance.|
|recommendationId|String|The unique identifier of the [recommendation](../resources/recommendation.md) that the resource is associated with.|
|resourceType|String|Indicates the type of Azure AD resource. Examples include `user`, `application`.|
|status|recommendationStatus|Indicates whether a [resource](../resources/recommendationresource.md) needs to be addressed. The possible values are: `active`, `completedBySystem`, `completedByUser`, `dismissed`, `postponed`, `unknownFutureValue`. By default, a recommendation's status is set to `active` when the recommendation is first generated. Status is set to `completedBySystem` when our service detects that a resource which was once `active` no longer applies.|

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

