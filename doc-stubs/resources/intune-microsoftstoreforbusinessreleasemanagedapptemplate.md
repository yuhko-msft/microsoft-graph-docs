---
title: "microsoftStoreForBusinessReleaseManagedAppTemplate resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# microsoftStoreForBusinessReleaseManagedAppTemplate resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List microsoftStoreForBusinessReleaseManagedAppTemplates](../api/intune-microsoftstoreforbusinessreleasemanagedapptemplate-list.md)|[microsoftStoreForBusinessReleaseManagedAppTemplate](../resources/intune-microsoftstoreforbusinessreleasemanagedapptemplate.md) collection|Get a list of the [microsoftStoreForBusinessReleaseManagedAppTemplate](../resources/microsoftstoreforbusinessreleasemanagedapptemplate.md) objects and their properties.|
|[Create microsoftStoreForBusinessReleaseManagedAppTemplate](../api/intune-microsoftstoreforbusinessreleasemanagedapptemplate-create.md)|[microsoftStoreForBusinessReleaseManagedAppTemplate](../resources/intune-microsoftstoreforbusinessreleasemanagedapptemplate.md)|Create a new [microsoftStoreForBusinessReleaseManagedAppTemplate](../resources/intune-microsoftstoreforbusinessreleasemanagedapptemplate.md) object.|
|[Get microsoftStoreForBusinessReleaseManagedAppTemplate](../api/intune-microsoftstoreforbusinessreleasemanagedapptemplate-get.md)|[microsoftStoreForBusinessReleaseManagedAppTemplate](../resources/intune-microsoftstoreforbusinessreleasemanagedapptemplate.md)|Read the properties and relationships of a [microsoftStoreForBusinessReleaseManagedAppTemplate](../resources/intune-microsoftstoreforbusinessreleasemanagedapptemplate.md) object.|
|[Update microsoftStoreForBusinessReleaseManagedAppTemplate](../api/intune-microsoftstoreforbusinessreleasemanagedapptemplate-update.md)|[microsoftStoreForBusinessReleaseManagedAppTemplate](../resources/intune-microsoftstoreforbusinessreleasemanagedapptemplate.md)|Update the properties of a [microsoftStoreForBusinessReleaseManagedAppTemplate](../resources/intune-microsoftstoreforbusinessreleasemanagedapptemplate.md) object.|
|[Delete microsoftStoreForBusinessReleaseManagedAppTemplate](../api/intune-microsoftstoreforbusinessreleasemanagedapptemplate-delete.md)|None|Deletes a [microsoftStoreForBusinessReleaseManagedAppTemplate](../resources/intune-microsoftstoreforbusinessreleasemanagedapptemplate.md) object.|
|[List channelsAndReleases](../api/intune-microsoftstoreforbusinessreleasemanagedapptemplate-list-channelsandreleases.md)|[microsoftStoreForBusinessChannelAndRelease](../resources/intune-microsoftstoreforbusinesschannelandrelease.md) collection|Get the microsoftStoreForBusinessChannelAndRelease resources from the channelsAndReleases navigation property.|
|[Create microsoftStoreForBusinessChannelAndRelease](../api/intune-microsoftstoreforbusinessreleasemanagedapptemplate-post-channelsandreleases.md)|[microsoftStoreForBusinessChannelAndRelease](../resources/intune-microsoftstoreforbusinesschannelandrelease.md)|Create a new microsoftStoreForBusinessChannelAndRelease object.|
|[List packages](../api/intune-microsoftstoreforbusinessreleasemanagedapptemplate-list-packages.md)|[microsoftStoreForBusinessPackage](../resources/intune-microsoftstoreforbusinesspackage.md) collection|Get the microsoftStoreForBusinessPackage resources from the packages navigation property.|
|[Create microsoftStoreForBusinessPackage](../api/intune-microsoftstoreforbusinessreleasemanagedapptemplate-post-packages.md)|[microsoftStoreForBusinessPackage](../resources/intune-microsoftstoreforbusinesspackage.md)|Create a new microsoftStoreForBusinessPackage object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|largeIcon|[mimeContent](../resources/intune-mimecontent.md)|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|publisher|String|**TODO: Add Description**|
|totalLicenseCount|Int32|**TODO: Add Description**|
|usedLicenseCount|Int32|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|channelsAndReleases|[microsoftStoreForBusinessChannelAndRelease](../resources/intune-microsoftstoreforbusinesschannelandrelease.md) collection|**TODO: Add Description**|
|packages|[microsoftStoreForBusinessPackage](../resources/intune-microsoftstoreforbusinesspackage.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.microsoftStoreForBusinessReleaseManagedAppTemplate",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.microsoftStoreForBusinessReleaseManagedAppTemplate",
  "id": "String (identifier)",
  "displayName": "String",
  "description": "String",
  "publisher": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "usedLicenseCount": "Integer",
  "totalLicenseCount": "Integer",
  "largeIcon": {
    "@odata.type": "microsoft.graph.mimeContent"
  }
}
```

