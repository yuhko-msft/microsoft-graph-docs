---
title: "userExperienceAnalyticsDeviceWithoutCloudIdentity resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsDeviceWithoutCloudIdentity resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsDeviceWithoutCloudIdentities](../api/intune-userexperienceanalyticsdevicewithoutcloudidentity-list.md)|[userExperienceAnalyticsDeviceWithoutCloudIdentity](../resources/intune-userexperienceanalyticsdevicewithoutcloudidentity.md) collection|Get a list of the [userExperienceAnalyticsDeviceWithoutCloudIdentity](../resources/userexperienceanalyticsdevicewithoutcloudidentity.md) objects and their properties.|
|[Create userExperienceAnalyticsDeviceWithoutCloudIdentity](../api/intune-userexperienceanalyticsdevicewithoutcloudidentity-create.md)|[userExperienceAnalyticsDeviceWithoutCloudIdentity](../resources/intune-userexperienceanalyticsdevicewithoutcloudidentity.md)|Create a new [userExperienceAnalyticsDeviceWithoutCloudIdentity](../resources/intune-userexperienceanalyticsdevicewithoutcloudidentity.md) object.|
|[Get userExperienceAnalyticsDeviceWithoutCloudIdentity](../api/intune-userexperienceanalyticsdevicewithoutcloudidentity-get.md)|[userExperienceAnalyticsDeviceWithoutCloudIdentity](../resources/intune-userexperienceanalyticsdevicewithoutcloudidentity.md)|Read the properties and relationships of a [userExperienceAnalyticsDeviceWithoutCloudIdentity](../resources/intune-userexperienceanalyticsdevicewithoutcloudidentity.md) object.|
|[Update userExperienceAnalyticsDeviceWithoutCloudIdentity](../api/intune-userexperienceanalyticsdevicewithoutcloudidentity-update.md)|[userExperienceAnalyticsDeviceWithoutCloudIdentity](../resources/intune-userexperienceanalyticsdevicewithoutcloudidentity.md)|Update the properties of a [userExperienceAnalyticsDeviceWithoutCloudIdentity](../resources/intune-userexperienceanalyticsdevicewithoutcloudidentity.md) object.|
|[Delete userExperienceAnalyticsDeviceWithoutCloudIdentity](../api/intune-userexperienceanalyticsdevicewithoutcloudidentity-delete.md)|None|Deletes a [userExperienceAnalyticsDeviceWithoutCloudIdentity](../resources/intune-userexperienceanalyticsdevicewithoutcloudidentity.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|azureAdDeviceId|String|**TODO: Add Description**|
|deviceName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsDeviceWithoutCloudIdentity",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsDeviceWithoutCloudIdentity",
  "id": "String (identifier)",
  "deviceName": "String",
  "azureAdDeviceId": "String"
}
```

