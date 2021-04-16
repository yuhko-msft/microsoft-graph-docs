---
title: "userExperienceAnalyticsDeviceWithoutCloudIdentity resource type"
description: "The user experience analytics Device without Cloud Identity."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsDeviceWithoutCloudIdentity resource type

Namespace: microsoft.graph



The user experience analytics Device without Cloud Identity.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsDeviceWithoutCloudIdentities](../api/userexperienceanalyticsdevicewithoutcloudidentity-list.md)|[userExperienceAnalyticsDeviceWithoutCloudIdentity](../resources/userexperienceanalyticsdevicewithoutcloudidentity.md) collection|Get a list of the [userExperienceAnalyticsDeviceWithoutCloudIdentity](../resources/userexperienceanalyticsdevicewithoutcloudidentity.md) objects and their properties.|
|[Create userExperienceAnalyticsDeviceWithoutCloudIdentity](../api/userexperienceanalyticsdevicewithoutcloudidentity-create.md)|[userExperienceAnalyticsDeviceWithoutCloudIdentity](../resources/userexperienceanalyticsdevicewithoutcloudidentity.md)|Create a new [userExperienceAnalyticsDeviceWithoutCloudIdentity](../resources/userexperienceanalyticsdevicewithoutcloudidentity.md) object.|
|[Get userExperienceAnalyticsDeviceWithoutCloudIdentity](../api/userexperienceanalyticsdevicewithoutcloudidentity-get.md)|[userExperienceAnalyticsDeviceWithoutCloudIdentity](../resources/userexperienceanalyticsdevicewithoutcloudidentity.md)|Read the properties and relationships of a [userExperienceAnalyticsDeviceWithoutCloudIdentity](../resources/userexperienceanalyticsdevicewithoutcloudidentity.md) object.|
|[Update userExperienceAnalyticsDeviceWithoutCloudIdentity](../api/userexperienceanalyticsdevicewithoutcloudidentity-update.md)|[userExperienceAnalyticsDeviceWithoutCloudIdentity](../resources/userexperienceanalyticsdevicewithoutcloudidentity.md)|Update the properties of a [userExperienceAnalyticsDeviceWithoutCloudIdentity](../resources/userexperienceanalyticsdevicewithoutcloudidentity.md) object.|
|[Delete userExperienceAnalyticsDeviceWithoutCloudIdentity](../api/userexperienceanalyticsdevicewithoutcloudidentity-delete.md)|None|Deletes a [userExperienceAnalyticsDeviceWithoutCloudIdentity](../resources/userexperienceanalyticsdevicewithoutcloudidentity.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|azureAdDeviceId|String|Azure Active Directory Device Id|
|deviceName|String|The tenant attach device's name.|
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
  "azureAdDeviceId": "String",
  "deviceName": "String"
}
```

