---
title: "managedApp resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# managedApp resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [mobileApp](../resources/mobileapp.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List managedApps](../api/managedapp-list.md)|[managedApp](../resources/managedapp.md) collection|Get a list of the [managedApp](../resources/managedapp.md) objects and their properties.|
|[Create managedApp](../api/managedapp-create.md)|[managedApp](../resources/managedapp.md)|Create a new [managedApp](../resources/managedapp.md) object.|
|[Get managedApp](../api/managedapp-get.md)|[managedApp](../resources/managedapp.md)|Read the properties and relationships of a [managedApp](../resources/managedapp.md) object.|
|[Update managedApp](../api/managedapp-update.md)|[managedApp](../resources/managedapp.md)|Update the properties of a [managedApp](../resources/managedapp.md) object.|
|[Delete managedApp](../api/managedapp-delete.md)|None|Deletes a [managedApp](../resources/managedapp.md) object.|
|[assign](../api/managedapp-assign.md)|None|**TODO: Add Description**|
|[updateRelationships](../api/managedapp-updaterelationships.md)|None|**TODO: Add Description**|
|[getRelatedAppStates](../api/managedapp-getrelatedappstates.md)|[mobileAppRelationshipState](../resources/intune-mobileapprelationshipstate.md) collection|**TODO: Add Description**|
|[List assignments](../api/managedapp-list-assignments.md)|[mobileAppAssignment](../resources/intune-mobileappassignment.md) collection|Get the mobileAppAssignment resources from the assignments navigation property.|
|[Create assignments](../api/managedapp-post-assignments.md)|[mobileAppAssignment](../resources/intune-mobileappassignment.md)|Create a new mobileAppAssignment object.|
|[Get assignments](../api/managedapp-get-mobileappassignment.md)|[mobileAppAssignment](../resources/intune-mobileappassignment.md)|Read the properties and relationships of a [mobileAppAssignment](../resources/intune-mobileappassignment.md) object.|
|[Update assignments](../api/managedapp-update-assignments.md)|[mobileAppAssignment](../resources/intune-mobileappassignment.md)|Update the properties of an assignments object.|
|[Delete assignments](../api/managedapp-delete-assignments.md)|None|Delete a [mobileAppAssignment](../resources/intune-mobileappassignment.md) object.|
|[List categories](../api/managedapp-list-categories.md)|[mobileAppCategory](../resources/intune-mobileappcategory.md) collection|Get the mobileAppCategory resources from the categories navigation property.|
|[Add categories](../api/managedapp-post-categories.md)|[mobileAppCategory](../resources/intune-mobileappcategory.md)|Add categories by posting to the categories collection.|
|[Remove categories](../api/managedapp-delete-categories.md)|None|Remove a [mobileAppCategory](../resources/intune-mobileappcategory.md) object.|
|[List deviceStatuses](../api/managedapp-list-devicestatuses.md)|[mobileAppInstallStatus](../resources/intune-mobileappinstallstatus.md) collection|Get the mobileAppInstallStatus resources from the deviceStatuses navigation property.|
|[Create deviceStatuses](../api/managedapp-post-devicestatuses.md)|[mobileAppInstallStatus](../resources/intune-mobileappinstallstatus.md)|Create a new mobileAppInstallStatus object.|
|[Get deviceStatuses](../api/managedapp-get-mobileappinstallstatus.md)|[mobileAppInstallStatus](../resources/intune-mobileappinstallstatus.md)|Read the properties and relationships of a [mobileAppInstallStatus](../resources/intune-mobileappinstallstatus.md) object.|
|[Update deviceStatuses](../api/managedapp-update-devicestatuses.md)|[mobileAppInstallStatus](../resources/intune-mobileappinstallstatus.md)|Update the properties of a deviceStatuses object.|
|[Delete deviceStatuses](../api/managedapp-delete-devicestatuses.md)|None|Delete a [mobileAppInstallStatus](../resources/intune-mobileappinstallstatus.md) object.|
|[List installSummary](../api/managedapp-list-installsummary.md)|[mobileAppInstallSummary](../resources/intune-mobileappinstallsummary.md) collection|Get the mobileAppInstallSummary resources from the installSummary navigation property.|
|[Create installSummary](../api/managedapp-post-installsummary.md)|[mobileAppInstallSummary](../resources/intune-mobileappinstallsummary.md)|Create a new mobileAppInstallSummary object.|
|[Get installSummary](../api/managedapp-get-mobileappinstallsummary.md)|[mobileAppInstallSummary](../resources/intune-mobileappinstallsummary.md)|Read the properties and relationships of a [mobileAppInstallSummary](../resources/intune-mobileappinstallsummary.md) object.|
|[Update installSummary](../api/managedapp-update-installsummary.md)|[mobileAppInstallSummary](../resources/intune-mobileappinstallsummary.md)|Update the properties of an installSummary object.|
|[Delete installSummary](../api/managedapp-delete-installsummary.md)|None|Delete a [mobileAppInstallSummary](../resources/intune-mobileappinstallsummary.md) object.|
|[List relationships](../api/managedapp-list-relationships.md)|[mobileAppRelationship](../resources/intune-mobileapprelationship.md) collection|Get the mobileAppRelationship resources from the relationships navigation property.|
|[Create relationships](../api/managedapp-post-relationships.md)|[mobileAppRelationship](../resources/intune-mobileapprelationship.md)|Create a new mobileAppRelationship object.|
|[Get relationships](../api/managedapp-get-mobileapprelationship.md)|[mobileAppRelationship](../resources/intune-mobileapprelationship.md)|Read the properties and relationships of a [mobileAppRelationship](../resources/intune-mobileapprelationship.md) object.|
|[Update relationships](../api/managedapp-update-relationships.md)|[mobileAppRelationship](../resources/intune-mobileapprelationship.md)|Update the properties of a relationships object.|
|[Delete relationships](../api/managedapp-delete-relationships.md)|None|Delete a [mobileAppRelationship](../resources/intune-mobileapprelationship.md) object.|
|[List userStatuses](../api/managedapp-list-userstatuses.md)|[userAppInstallStatus](../resources/intune-userappinstallstatus.md) collection|Get the userAppInstallStatus resources from the userStatuses navigation property.|
|[Create userStatuses](../api/managedapp-post-userstatuses.md)|[userAppInstallStatus](../resources/intune-userappinstallstatus.md)|Create a new userAppInstallStatus object.|
|[Get userStatuses](../api/managedapp-get-userappinstallstatus.md)|[userAppInstallStatus](../resources/intune-userappinstallstatus.md)|Read the properties and relationships of a [userAppInstallStatus](../resources/intune-userappinstallstatus.md) object.|
|[Update userStatuses](../api/managedapp-update-userstatuses.md)|[userAppInstallStatus](../resources/intune-userappinstallstatus.md)|Update the properties of a userStatuses object.|
|[Delete userStatuses](../api/managedapp-delete-userstatuses.md)|None|Delete a [userAppInstallStatus](../resources/intune-userappinstallstatus.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appAvailability|managedAppAvailability|**TODO: Add Description**. Possible values are: `global`, `lineOfBusiness`.|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|dependentAppCount|Int32|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|description|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|developer|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|displayName|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|informationUrl|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|isAssigned|Boolean|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|isFeatured|Boolean|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|largeIcon|[mimeContent](../resources/intune-mimecontent.md)|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|notes|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|owner|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|privacyInformationUrl|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|publisher|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|publishingState|mobileAppPublishingState|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md). Possible values are: `notPublished`, `processing`, `published`.|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|supersededAppCount|Int32|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|supersedingAppCount|Int32|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|uploadState|Int32|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|version|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[mobileAppAssignment](../resources/intune-mobileappassignment.md) collection|**TODO: Add Description** Inherited from [mobileApp](../resources/mobileapp.md)|
|categories|[mobileAppCategory](../resources/intune-mobileappcategory.md) collection|**TODO: Add Description** Inherited from [mobileApp](../resources/mobileapp.md)|
|deviceStatuses|[mobileAppInstallStatus](../resources/intune-mobileappinstallstatus.md) collection|**TODO: Add Description** Inherited from [mobileApp](../resources/mobileapp.md)|
|installSummary|[mobileAppInstallSummary](../resources/intune-mobileappinstallsummary.md)|**TODO: Add Description** Inherited from [mobileApp](../resources/mobileapp.md)|
|relationships|[mobileAppRelationship](../resources/intune-mobileapprelationship.md) collection|**TODO: Add Description** Inherited from [mobileApp](../resources/mobileapp.md)|
|userStatuses|[userAppInstallStatus](../resources/intune-userappinstallstatus.md) collection|**TODO: Add Description** Inherited from [mobileApp](../resources/mobileapp.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.managedApp",
  "baseType": "microsoft.graph.mobileApp",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.managedApp",
  "id": "String (identifier)",
  "displayName": "String",
  "description": "String",
  "publisher": "String",
  "largeIcon": {
    "@odata.type": "microsoft.graph.mimeContent"
  },
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "isFeatured": "Boolean",
  "privacyInformationUrl": "String",
  "informationUrl": "String",
  "owner": "String",
  "developer": "String",
  "notes": "String",
  "uploadState": "Integer",
  "publishingState": "String",
  "isAssigned": "Boolean",
  "roleScopeTagIds": [
    "String"
  ],
  "dependentAppCount": "Integer",
  "supersedingAppCount": "Integer",
  "supersededAppCount": "Integer",
  "appAvailability": "String",
  "version": "String"
}
```

