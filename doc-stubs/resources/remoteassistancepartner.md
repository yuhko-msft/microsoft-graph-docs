---
title: "remoteAssistancePartner resource type"
description: "RemoteAssistPartner resources represent the metadata and status of a given Remote Assistance partner service."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# remoteAssistancePartner resource type

Namespace: microsoft.graph



RemoteAssistPartner resources represent the metadata and status of a given Remote Assistance partner service.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List remoteAssistancePartners](../api/remoteassistancepartner-list.md)|[remoteAssistancePartner](../resources/remoteassistancepartner.md) collection|Get a list of the [remoteAssistancePartner](../resources/remoteassistancepartner.md) objects and their properties.|
|[Create remoteAssistancePartner](../api/remoteassistancepartner-create.md)|[remoteAssistancePartner](../resources/remoteassistancepartner.md)|Create a new [remoteAssistancePartner](../resources/remoteassistancepartner.md) object.|
|[Get remoteAssistancePartner](../api/remoteassistancepartner-get.md)|[remoteAssistancePartner](../resources/remoteassistancepartner.md)|Read the properties and relationships of a [remoteAssistancePartner](../resources/remoteassistancepartner.md) object.|
|[Update remoteAssistancePartner](../api/remoteassistancepartner-update.md)|[remoteAssistancePartner](../resources/remoteassistancepartner.md)|Update the properties of a [remoteAssistancePartner](../resources/remoteassistancepartner.md) object.|
|[Delete remoteAssistancePartner](../api/remoteassistancepartner-delete.md)|None|Deletes a [remoteAssistancePartner](../resources/remoteassistancepartner.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|Display name of the partner.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastConnectionDateTime|DateTimeOffset|Timestamp of the last request sent to Intune by the TEM partner.|
|onboardingRequestExpiryDateTime|DateTimeOffset|When the OnboardingStatus is Onboarding, This is the date time when the onboarding request expires.|
|onboardingStatus|remoteAssistanceOnboardingStatus|A friendly description of the current TeamViewer connector status. Possible values are: `notOnboarded`, `onboarding`, `onboarded`.|
|onboardingUrl|String|URL of the partner's onboarding portal, where an administrator can configure their Remote Assistance service.|

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
  "lastConnectionDateTime": "String (timestamp)",
  "onboardingRequestExpiryDateTime": "String (timestamp)",
  "onboardingStatus": "String",
  "onboardingUrl": "String"
}
```

