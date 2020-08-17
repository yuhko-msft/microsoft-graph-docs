---
title: "remoteAssistancePartner resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# remoteAssistancePartner resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List remoteAssistancePartners](../api/intune-remoteassistancepartner-list.md)|[remoteAssistancePartner](../resources/intune-remoteassistancepartner.md) collection|Get a list of the [remoteAssistancePartner](../resources/remoteassistancepartner.md) objects and their properties.|
|[Create remoteAssistancePartner](../api/intune-remoteassistancepartner-create.md)|[remoteAssistancePartner](../resources/intune-remoteassistancepartner.md)|Create a new [remoteAssistancePartner](../resources/intune-remoteassistancepartner.md) object.|
|[Get remoteAssistancePartner](../api/intune-remoteassistancepartner-get.md)|[remoteAssistancePartner](../resources/intune-remoteassistancepartner.md)|Read the properties and relationships of a [remoteAssistancePartner](../resources/intune-remoteassistancepartner.md) object.|
|[Update remoteAssistancePartner](../api/intune-remoteassistancepartner-update.md)|[remoteAssistancePartner](../resources/intune-remoteassistancepartner.md)|Update the properties of a [remoteAssistancePartner](../resources/intune-remoteassistancepartner.md) object.|
|[Delete remoteAssistancePartner](../api/intune-remoteassistancepartner-delete.md)|None|Deletes a [remoteAssistancePartner](../resources/intune-remoteassistancepartner.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastConnectionDateTime|DateTimeOffset|**TODO: Add Description**|
|onboardingRequestExpiryDateTime|DateTimeOffset|**TODO: Add Description**|
|onboardingStatus|remoteAssistanceOnboardingStatus|**TODO: Add Description**. Possible values are: `notOnboarded`, `onboarding`, `onboarded`.|
|onboardingUrl|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.remoteAssistancePartner",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.remoteAssistancePartner",
  "id": "String (identifier)",
  "displayName": "String",
  "onboardingUrl": "String",
  "onboardingStatus": "String",
  "lastConnectionDateTime": "String (timestamp)",
  "onboardingRequestExpiryDateTime": "String (timestamp)"
}
```

