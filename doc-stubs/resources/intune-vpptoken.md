---
title: "vppToken resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# vppToken resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List vppTokens](../api/intune-vpptoken-list.md)|[vppToken](../resources/intune-vpptoken.md) collection|Get a list of the [vppToken](../resources/vpptoken.md) objects and their properties.|
|[Create vppToken](../api/intune-vpptoken-create.md)|[vppToken](../resources/intune-vpptoken.md)|Create a new [vppToken](../resources/intune-vpptoken.md) object.|
|[Get vppToken](../api/intune-vpptoken-get.md)|[vppToken](../resources/intune-vpptoken.md)|Read the properties and relationships of a [vppToken](../resources/intune-vpptoken.md) object.|
|[Update vppToken](../api/intune-vpptoken-update.md)|[vppToken](../resources/intune-vpptoken.md)|Update the properties of a [vppToken](../resources/intune-vpptoken.md) object.|
|[Delete vppToken](../api/intune-vpptoken-delete.md)|None|Deletes a [vppToken](../resources/intune-vpptoken.md) object.|
|[syncLicenseCounts](../api/intune-vpptoken-synclicensecounts.md)|None|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appleId|String|**TODO: Add Description**|
|automaticallyUpdateApps|Boolean|**TODO: Add Description**|
|claimTokenManagementFromExternalMdm|Boolean|**TODO: Add Description**|
|countryOrRegion|String|**TODO: Add Description**|
|dataSharingConsentGranted|Boolean|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|expirationDateTime|DateTimeOffset|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|lastSyncDateTime|DateTimeOffset|**TODO: Add Description**|
|lastSyncStatus|vppTokenSyncStatus|**TODO: Add Description**. Possible values are: `none`, `inProgress`, `completed`, `failed`.|
|locationName|String|**TODO: Add Description**|
|organizationName|String|**TODO: Add Description**|
|roleScopeTagIds|String collection|**TODO: Add Description**|
|state|vppTokenState|**TODO: Add Description**. Possible values are: `unknown`, `valid`, `expired`, `invalid`, `assignedToExternalMDM`, `duplicateLocationId`.|
|token|String|**TODO: Add Description**|
|tokenActionResults|[vppTokenActionResult](../resources/intune-vpptokenactionresult.md) collection|**TODO: Add Description**|
|vppTokenAccountType|vppTokenAccountType|**TODO: Add Description**. Possible values are: `business`, `education`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.vppToken",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.vppToken",
  "id": "String (identifier)",
  "organizationName": "String",
  "vppTokenAccountType": "String",
  "appleId": "String",
  "expirationDateTime": "String (timestamp)",
  "lastSyncDateTime": "String (timestamp)",
  "token": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "state": "String",
  "tokenActionResults": [
    {
      "@odata.type": "microsoft.graph.vppTokenActionResult"
    }
  ],
  "lastSyncStatus": "String",
  "automaticallyUpdateApps": "Boolean",
  "countryOrRegion": "String",
  "dataSharingConsentGranted": "Boolean",
  "displayName": "String",
  "locationName": "String",
  "claimTokenManagementFromExternalMdm": "Boolean",
  "roleScopeTagIds": [
    "String"
  ]
}
```

